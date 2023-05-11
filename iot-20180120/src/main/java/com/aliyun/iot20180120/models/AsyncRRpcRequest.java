// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AsyncRRpcRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TopicFullName")
    public String topicFullName;

    public static AsyncRRpcRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncRRpcRequest self = new AsyncRRpcRequest();
        return TeaModel.build(map, self);
    }

    public AsyncRRpcRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public AsyncRRpcRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public AsyncRRpcRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AsyncRRpcRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public AsyncRRpcRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public AsyncRRpcRequest setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }
    public String getTopicFullName() {
        return this.topicFullName;
    }

}
