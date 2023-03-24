package com.example.backuptest06.vm.common;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.6.0</version>
</dependency>
*/

/**
 * @author
 * @Description
 * @time 202209281:18
 */

@RestController
public class DescribeInstancesController {
    @GetMapping(value = "/backup/vm")
    public  String hello() {

        DefaultProfile profile = DefaultProfile.getProfile("cn-beijing", "LTAI5tN9MbN6rDuvJxZMRTzZ", "4o88kaOkDjc0pJ1HzOUxfwP92PH4yv");
        /** use STS Token
         DefaultProfile profile = DefaultProfile.getProfile(
         "<your-region-id>",           // The region ID
         "<your-access-key-id>",       // The AccessKey ID of the RAM account
         "<your-access-key-secret>",   // The AccessKey Secret of the RAM account
         "<your-sts-token>");          // STS Token
         **/

        IAcsClient client = new DefaultAcsClient(profile);

        DescribeInstancesRequest request = new DescribeInstancesRequest();

        try {
            DescribeInstancesResponse response = client.getAcsResponse(request);
            // System.out.println(new Gson().toJson(response));
            System.out.println(new Gson().toJson( response.getInstances()));
            return "hello";
        } catch (ServerException e) {
            e.printStackTrace();
            return "error";
        } catch (ClientException e) {
//            System.out.println("ErrCode:" + e.getErrCode());
//            System.out.println("ErrMsg:" + e.getErrMsg());
//            System.out.println("RequestId:" + e.getRequestId());
            System.out.println(3);
            return "error";
        }

    }
}
