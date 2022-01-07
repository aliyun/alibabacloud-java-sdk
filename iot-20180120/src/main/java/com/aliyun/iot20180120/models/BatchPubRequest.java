// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchPubRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("TopicShortName")
    public String topicShortName;

    public static BatchPubRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPubRequest self = new BatchPubRequest();
        return TeaModel.build(map, self);
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

    public BatchPubRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

}
