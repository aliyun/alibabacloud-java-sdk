// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("IotId")
    public java.util.List<String> iotId;

    public static BatchGetDeviceStateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateRequest self = new BatchGetDeviceStateRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchGetDeviceStateRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetDeviceStateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BatchGetDeviceStateRequest setIotId(java.util.List<String> iotId) {
        this.iotId = iotId;
        return this;
    }
    public java.util.List<String> getIotId() {
        return this.iotId;
    }

}
