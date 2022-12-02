// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubRequest extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("CorrelationData")
    public String correlationData;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("PayloadFormatIndicator")
    public Integer payloadFormatIndicator;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("ResponseTopic")
    public String responseTopic;

    @NameInMap("TopicFullName")
    public String topicFullName;

    @NameInMap("UserProp")
    public java.util.List<PubRequestUserProp> userProp;

    public static PubRequest build(java.util.Map<String, ?> map) throws Exception {
        PubRequest self = new PubRequest();
        return TeaModel.build(map, self);
    }

    public PubRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public PubRequest setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }
    public String getCorrelationData() {
        return this.correlationData;
    }

    public PubRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public PubRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PubRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public PubRequest setPayloadFormatIndicator(Integer payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator;
        return this;
    }
    public Integer getPayloadFormatIndicator() {
        return this.payloadFormatIndicator;
    }

    public PubRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PubRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

    public PubRequest setResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
        return this;
    }
    public String getResponseTopic() {
        return this.responseTopic;
    }

    public PubRequest setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }
    public String getTopicFullName() {
        return this.topicFullName;
    }

    public PubRequest setUserProp(java.util.List<PubRequestUserProp> userProp) {
        this.userProp = userProp;
        return this;
    }
    public java.util.List<PubRequestUserProp> getUserProp() {
        return this.userProp;
    }

    public static class PubRequestUserProp extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PubRequestUserProp build(java.util.Map<String, ?> map) throws Exception {
            PubRequestUserProp self = new PubRequestUserProp();
            return TeaModel.build(map, self);
        }

        public PubRequestUserProp setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PubRequestUserProp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
