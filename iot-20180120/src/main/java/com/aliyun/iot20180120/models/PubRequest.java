// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubRequest extends TeaModel {
    /**
     * <p>The content type of the message when you use MQTT 5.0 for communication.</p>
     * <p>The content type is usually MIME, such as text or plain********.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The related data in the request/response communication mode when you use MQTT 5.0. You can specify this parameter as needed.</p>
     * <p>A message recipient can process the request based on the data.</p>
     * <blockquote>
     * <p> You must convert the related data into binary data and perform Base64 encoding to generate a value of the string type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8****</p>
     */
    @NameInMap("CorrelationData")
    public String correlationData;

    /**
     * <p>The name of the MQTT cloud gateway.</p>
     * <blockquote>
     * <p>When you publish a message to an MQTT cloud gateway, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or the instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
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
     * <p>The body of the message that you want to publish.</p>
     * <p>To generate a message body, you must convert the raw message into binary data and perform Base64 encoding.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0ZXN0IjoidGFzayBwdWIgYnJvYWRjYXN0In0=</p>
     */
    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("MessageExpiryInterval")
    public Long messageExpiryInterval;

    /**
     * <p>The payload identifier of the message when you use MQTT 5.0 for communication. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The message is unknown byte data.</li>
     * <li><strong>1</strong>: The payload of the message is UTF-8 encoded character data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayloadFormatIndicator")
    public Integer payloadFormatIndicator;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device that receives the message belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Q5XoY****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The quality of service (QoS) level of the message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The message is published at most once.</li>
     * <li><strong>1</strong>: The message is published at least once. If a PUBACK response is not returned after you publish a QoS 1 message, the message is pushed to the device again when the device reconnects to IoT Platform.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * <p>For more information about message communication, see <a href="https://help.aliyun.com/document_detail/30527.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Qos")
    public Integer qos;

    /**
     * <p>The response topic in the request/response communication mode when you use MQTT 5.0. For more information, see <a href="https://help.aliyun.com/document_detail/30540.html">MQTT 5.0</a>.</p>
     */
    @NameInMap("ResponseTopic")
    public String responseTopic;

    @NameInMap("Retained")
    public Boolean retained;

    @NameInMap("TopicAlias")
    public Integer topicAlias;

    /**
     * <p>The custom topic for the device that receives the message.</p>
     * <ul>
     * <li>Topic format: <code>/${productKey}/${deviceName}/user/${TopicShortName}</code>.</li>
     * <li>You must specify the <strong>Subscribe</strong> permission, or <strong>Publish and Subscribe</strong> permissions for the topic.</li>
     * </ul>
     * <blockquote>
     * <p>Make sure that the device subscribes to the topic before you call the Pub operation. Otherwise, the device cannot receive the message.</p>
     * </blockquote>
     * <p>You can view the custom topics of a product on the <strong>Topic Categories</strong> tab of the <strong>Product Details</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation. You can view the topics to which the device subscribes on the <strong>Topic List</strong> tab of the <strong>Device Details</strong> page.</p>
     * <p>This parameter is required.</p>
     */
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

    public PubRequest setMessageExpiryInterval(Long messageExpiryInterval) {
        this.messageExpiryInterval = messageExpiryInterval;
        return this;
    }
    public Long getMessageExpiryInterval() {
        return this.messageExpiryInterval;
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

    public PubRequest setRetained(Boolean retained) {
        this.retained = retained;
        return this;
    }
    public Boolean getRetained() {
        return this.retained;
    }

    public PubRequest setTopicAlias(Integer topicAlias) {
        this.topicAlias = topicAlias;
        return this;
    }
    public Integer getTopicAlias() {
        return this.topicAlias;
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
        /**
         * <p>The custom property key that is specified when you use MQTT 5.0 for communication.</p>
         * <p>This parameter must be used together with the <strong>UserProp.N.Value</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The custom property value that is specified when you use MQTT 5.0 for communication.</p>
         * <p>This parameter must be used together with the <strong>UserProp.N.Key</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
