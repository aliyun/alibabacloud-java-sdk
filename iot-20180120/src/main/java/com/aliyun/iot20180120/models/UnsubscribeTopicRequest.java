// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnsubscribeTopicRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Topic")
    public java.util.List<String> topic;

    public static UnsubscribeTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeTopicRequest self = new UnsubscribeTopicRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeTopicRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UnsubscribeTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UnsubscribeTopicRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnsubscribeTopicRequest setTopic(java.util.List<String> topic) {
        this.topic = topic;
        return this;
    }
    public java.util.List<String> getTopic() {
        return this.topic;
    }

}
