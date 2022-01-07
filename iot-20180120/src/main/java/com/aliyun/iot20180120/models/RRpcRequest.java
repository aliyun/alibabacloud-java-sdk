// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RRpcRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RequestBase64Byte")
    public String requestBase64Byte;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("Topic")
    public String topic;

    public static RRpcRequest build(java.util.Map<String, ?> map) throws Exception {
        RRpcRequest self = new RRpcRequest();
        return TeaModel.build(map, self);
    }

    public RRpcRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RRpcRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RRpcRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public RRpcRequest setRequestBase64Byte(String requestBase64Byte) {
        this.requestBase64Byte = requestBase64Byte;
        return this;
    }
    public String getRequestBase64Byte() {
        return this.requestBase64Byte;
    }

    public RRpcRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RRpcRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
