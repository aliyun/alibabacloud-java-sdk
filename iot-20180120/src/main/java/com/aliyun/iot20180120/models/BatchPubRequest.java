// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchPubRequest extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("CorrelationData")
    public String correlationData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("MessageExpiryInterval")
    public Long messageExpiryInterval;

    @NameInMap("PayloadFormatIndicator")
    public Integer payloadFormatIndicator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("ResponseTopicTemplateName")
    public String responseTopicTemplateName;

    @NameInMap("Retained")
    public Boolean retained;

    @NameInMap("TopicShortName")
    public String topicShortName;

    @NameInMap("TopicTemplateName")
    public String topicTemplateName;

    @NameInMap("UserProp")
    public java.util.List<BatchPubRequestUserProp> userProp;

    public static BatchPubRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPubRequest self = new BatchPubRequest();
        return TeaModel.build(map, self);
    }

    public BatchPubRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public BatchPubRequest setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }
    public String getCorrelationData() {
        return this.correlationData;
    }

    public BatchPubRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchPubRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchPubRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public BatchPubRequest setMessageExpiryInterval(Long messageExpiryInterval) {
        this.messageExpiryInterval = messageExpiryInterval;
        return this;
    }
    public Long getMessageExpiryInterval() {
        return this.messageExpiryInterval;
    }

    public BatchPubRequest setPayloadFormatIndicator(Integer payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator;
        return this;
    }
    public Integer getPayloadFormatIndicator() {
        return this.payloadFormatIndicator;
    }

    public BatchPubRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BatchPubRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

    public BatchPubRequest setResponseTopicTemplateName(String responseTopicTemplateName) {
        this.responseTopicTemplateName = responseTopicTemplateName;
        return this;
    }
    public String getResponseTopicTemplateName() {
        return this.responseTopicTemplateName;
    }

    public BatchPubRequest setRetained(Boolean retained) {
        this.retained = retained;
        return this;
    }
    public Boolean getRetained() {
        return this.retained;
    }

    public BatchPubRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public BatchPubRequest setTopicTemplateName(String topicTemplateName) {
        this.topicTemplateName = topicTemplateName;
        return this;
    }
    public String getTopicTemplateName() {
        return this.topicTemplateName;
    }

    public BatchPubRequest setUserProp(java.util.List<BatchPubRequestUserProp> userProp) {
        this.userProp = userProp;
        return this;
    }
    public java.util.List<BatchPubRequestUserProp> getUserProp() {
        return this.userProp;
    }

    public static class BatchPubRequestUserProp extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static BatchPubRequestUserProp build(java.util.Map<String, ?> map) throws Exception {
            BatchPubRequestUserProp self = new BatchPubRequestUserProp();
            return TeaModel.build(map, self);
        }

        public BatchPubRequestUserProp setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchPubRequestUserProp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
