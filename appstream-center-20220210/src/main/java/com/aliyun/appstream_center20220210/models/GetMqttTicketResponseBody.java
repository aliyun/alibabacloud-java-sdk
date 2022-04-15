// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20220210.models;

import com.aliyun.tea.*;

public class GetMqttTicketResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExpireTimeStamp")
    public String expireTimeStamp;

    @NameInMap("Message")
    public String message;

    @NameInMap("MqttEndpoint")
    public String mqttEndpoint;

    @NameInMap("MqttGroupId")
    public String mqttGroupId;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("MqttPassword")
    public String mqttPassword;

    @NameInMap("MqttUsername")
    public String mqttUsername;

    @NameInMap("MqttVPCEndpoint")
    public String mqttVPCEndpoint;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TopicList")
    public String topicList;

    public static GetMqttTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTicketResponseBody self = new GetMqttTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqttTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMqttTicketResponseBody setExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }
    public String getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public GetMqttTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMqttTicketResponseBody setMqttEndpoint(String mqttEndpoint) {
        this.mqttEndpoint = mqttEndpoint;
        return this;
    }
    public String getMqttEndpoint() {
        return this.mqttEndpoint;
    }

    public GetMqttTicketResponseBody setMqttGroupId(String mqttGroupId) {
        this.mqttGroupId = mqttGroupId;
        return this;
    }
    public String getMqttGroupId() {
        return this.mqttGroupId;
    }

    public GetMqttTicketResponseBody setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public GetMqttTicketResponseBody setMqttPassword(String mqttPassword) {
        this.mqttPassword = mqttPassword;
        return this;
    }
    public String getMqttPassword() {
        return this.mqttPassword;
    }

    public GetMqttTicketResponseBody setMqttUsername(String mqttUsername) {
        this.mqttUsername = mqttUsername;
        return this;
    }
    public String getMqttUsername() {
        return this.mqttUsername;
    }

    public GetMqttTicketResponseBody setMqttVPCEndpoint(String mqttVPCEndpoint) {
        this.mqttVPCEndpoint = mqttVPCEndpoint;
        return this;
    }
    public String getMqttVPCEndpoint() {
        return this.mqttVPCEndpoint;
    }

    public GetMqttTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqttTicketResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetMqttTicketResponseBody setTopicList(String topicList) {
        this.topicList = topicList;
        return this;
    }
    public String getTopicList() {
        return this.topicList;
    }

}
