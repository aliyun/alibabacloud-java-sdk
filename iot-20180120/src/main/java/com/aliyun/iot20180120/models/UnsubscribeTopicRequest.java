// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnsubscribeTopicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     */
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
