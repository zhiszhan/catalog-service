package com.polarbookshop.catalogservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.polarbookshop.catalogservice.config.PolarProperties;

@RestController
public class HomeController {

    @Value("${polar.greeting}")
    private String greeting;
    //private final PolarProperties polarProperties;

    // public HomeController(PolarProperties polarProperties){
    //     this.polarProperties = polarProperties;
    // }

    @GetMapping("/")
    public String welcome() {
        //return "Welcome to the book catalog";
        return this.greeting;
        //return polarProperties.getGreeting();
    }
}