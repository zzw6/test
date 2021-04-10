package com.javalei.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: zzw
 * Date: 2021-04-11-1:41
 * Description:
 */
@RestController
public class terst {

    @RequestMapping("/test")
    public String  test(){
        return "test";
    }
}
