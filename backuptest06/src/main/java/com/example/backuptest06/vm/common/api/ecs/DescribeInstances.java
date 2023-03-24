package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig;
import com.google.gson.Gson;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

import com.aliyuncs.ecs.model.v20140526.*;
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
 * @time 2022101811:23
 */
public class DescribeInstances {
//        public static void main(String[] args) {
        public String startDescribeInstances(String instanceId){
            IAcsClient client;
//            String instanceId = "i-2zebx148o1inffl6yyms";
            try {
                client = AliyunEcsClientConfig.createClient();
            } catch (Exception e) {
                throw new RuntimeException("无法创建阿里云客户端", e);
            }

            DescribeInstancesRequest request = new DescribeInstancesRequest();
//            request.setInstanceIds("[\"i-2zebx148o1inffl6yyms\"]");
            request.setInstanceIds("[\""+instanceId+"\"]");
            try {
                DescribeInstancesResponse response = client.getAcsResponse(request);
                System.out.println(new Gson().toJson(response));
                return "OK";
            } catch (ServerException e) {
                e.printStackTrace();
                return null;
            } catch (ClientException e) {
                System.out.println("ErrCode:" + e.getErrCode());
                System.out.println("ErrMsg:" + e.getErrMsg());
                System.out.println("RequestId:" + e.getRequestId());
                return null;
            }

        }
    }
