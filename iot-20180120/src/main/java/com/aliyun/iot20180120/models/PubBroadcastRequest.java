// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubBroadcastRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TopicFullName")
    public String topicFullName;

    public static PubBroadcastRequest build(java.util.Map<String, ?> map) throws Exception {
        PubBroadcastRequest self = new PubBroadcastRequest();
        return TeaModel.build(map, self);
    }

    public PubBroadcastRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PubBroadcastRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public PubBroadcastRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PubBroadcastRequest setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }
    public String getTopicFullName() {
        return this.topicFullName;
    }

}
