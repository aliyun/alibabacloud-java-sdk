// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("TopicFullName")
    public String topicFullName;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("ResponseTopic")
    public String responseTopic;

    @NameInMap("CorrelationData")
    public String correlationData;

    @NameInMap("UserProp")
    public java.util.List<PubRequestUserProp> userProp;

    public static PubRequest build(java.util.Map<String, ?> map) throws Exception {
        PubRequest self = new PubRequest();
        return TeaModel.build(map, self);
    }

    public PubRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public PubRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public PubRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    public PubRequest setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }
    public String getTopicFullName() {
        return this.topicFullName;
    }

    public PubRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public PubRequest setResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
        return this;
    }
    public String getResponseTopic() {
        return this.responseTopic;
    }

    public PubRequest setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }
    public String getCorrelationData() {
        return this.correlationData;
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
