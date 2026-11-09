// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetMqttTicketResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the request fails. For example, <code>Client.Forbidden</code> indicates that the client is forbidden from establishing a connection.</p>
     * 
     * <strong>example:</strong>
     * <p>Client.Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The expiration time of the MQTT connection password. It is returned as a string representing a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1794278400000</p>
     */
    @NameInMap("ExpireTimeStamp")
    public String expireTimeStamp;

    /**
     * <p>The error message returned when the request fails, which corresponds to the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Client forbidden connect</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The access endpoint for the MQTT client. Use the endpoint returned by this operation to establish a connection.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt.example.com</p>
     */
    @NameInMap("MqttEndpoint")
    public String mqttEndpoint;

    /**
     * <p>The MQTT group ID, used to concatenate the MQTT ClientId.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_EXAMPLE</p>
     */
    @NameInMap("MqttGroupId")
    public String mqttGroupId;

    /**
     * <p>The MQTT instance ID, used for token authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2****</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>The password used to establish an MQTT connection. It consists of publish and subscribe tokens in the format of <code>W|PublishToken|R|SubscribeToken</code>. Use the complete password returned by the operation. The desensitized examples in the documentation cannot be used for connections.</p>
     * 
     * <strong>example:</strong>
     * <p>W|pubTokenExample****|R|subTokenExample****</p>
     */
    @NameInMap("MqttPassword")
    public String mqttPassword;

    /**
     * <p>The username used to establish an MQTT connection. The format is <code>Token|AccessKeyId|InstanceId</code>. AccessKeyId and InstanceId are identifiers used by the server to generate credentials. Use the complete username returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Token|LTAI5tExample****|post-cn-7mz2****</p>
     */
    @NameInMap("MqttUsername")
    public String mqttUsername;

    /**
     * <p>The VPC access endpoint for MQTT, used by clients that meet the VPC network access requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-vpc.example.com</p>
     */
    @NameInMap("MqttVPCEndpoint")
    public String mqttVPCEndpoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B9E3F7B2-5B13-4A7B-8C36-6D1B0A8F0000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The topic list. Each list element contains <code>topic</code> (the topic name), <code>type</code> (the topic type), and <code>permission</code> (the permission). The list returned by this operation includes topics for publishing, tenant subscription, device subscription, and system subscription. The publish permission is <code>W</code>, and the subscribe permission is <code>R</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;topic&quot;:&quot;pub/550e8400-e29b-41d4-a716-446655440000&quot;,&quot;type&quot;:&quot;pub&quot;,&quot;permission&quot;:&quot;W&quot;},{&quot;topic&quot;:&quot;sub/ten/123456789012****&quot;,&quot;type&quot;:&quot;sub-ten&quot;,&quot;permission&quot;:&quot;R&quot;},{&quot;topic&quot;:&quot;sub/uuid/550e8400-e29b-41d4-a716-446655440000&quot;,&quot;type&quot;:&quot;sub-uuid&quot;,&quot;permission&quot;:&quot;R&quot;},{&quot;topic&quot;:&quot;sub/sys&quot;,&quot;type&quot;:&quot;sub-sys&quot;,&quot;permission&quot;:&quot;R&quot;}]</p>
     */
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
