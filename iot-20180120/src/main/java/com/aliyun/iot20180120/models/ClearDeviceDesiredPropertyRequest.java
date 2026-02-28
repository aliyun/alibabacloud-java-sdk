// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearDeviceDesiredPropertyRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Identifies")
    public java.util.List<String> identifies;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static ClearDeviceDesiredPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearDeviceDesiredPropertyRequest self = new ClearDeviceDesiredPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ClearDeviceDesiredPropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ClearDeviceDesiredPropertyRequest setIdentifies(java.util.List<String> identifies) {
        this.identifies = identifies;
        return this;
    }
    public java.util.List<String> getIdentifies() {
        return this.identifies;
    }

    public ClearDeviceDesiredPropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public ClearDeviceDesiredPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ClearDeviceDesiredPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
