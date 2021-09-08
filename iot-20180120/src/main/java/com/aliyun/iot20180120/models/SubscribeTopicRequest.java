// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SubscribeTopicRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("DeviceName")
    @Validation(required = true)
    public String deviceName;

    @NameInMap("Topic")
    @Validation(required = true)
    public java.util.List<String> topic;

    public static SubscribeTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeTopicRequest self = new SubscribeTopicRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SubscribeTopicRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SubscribeTopicRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SubscribeTopicRequest setTopic(java.util.List<String> topic) {
        this.topic = topic;
        return this;
    }
    public java.util.List<String> getTopic() {
        return this.topic;
    }

}
