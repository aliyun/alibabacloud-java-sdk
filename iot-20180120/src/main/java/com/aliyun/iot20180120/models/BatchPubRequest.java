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
     * 
     * <strong>example:</strong>
     * <p>newdevice1</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
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
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The quality of service (QoS) level of the message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The message is published at most once.</li>
     * <li><strong>1</strong>: The message is published at least once.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * <blockquote>
     * <p> IoT Platform stores QoS 1 messages for up to 7 days. IoT Platform does not store QoS 0 messages.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("ResponseTopicTemplateName")
    public String responseTopicTemplateName;

    @NameInMap("Retained")
    public Boolean retained;

    /**
     * <p>The suffix of the custom topic.</p>
     * <p>A custom topic is in the following format: <code>/${productKey}/${deviceName}/user/${TopicShortName}</code>. ${TopicShortName} specifies the suffix.</p>
     * <blockquote>
     * <p> You must specify the Subscribe permission, or Publish and Subscribe permissions for the topic. Make sure that all devices subscribe to the topic.</p>
     * </blockquote>
     * <p>You can use the following methods to view custom topics:</p>
     * <ul>
     * <li>On the <strong>Topic Categories</strong> tab of the Product Details page, view the custom topics of the product.</li>
     * <li>On the <strong>Topic List</strong> tab of the Device Details page, view the custom topics to which the device has subscribed.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to query the custom topics of the product.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>get</p>
     */
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
