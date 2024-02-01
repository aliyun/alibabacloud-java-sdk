// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class EnableGbSubDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SubDeviceId")
    public String subDeviceId;

    public static EnableGbSubDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableGbSubDeviceRequest self = new EnableGbSubDeviceRequest();
        return TeaModel.build(map, self);
    }

    public EnableGbSubDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public EnableGbSubDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public EnableGbSubDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public EnableGbSubDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public EnableGbSubDeviceRequest setSubDeviceId(String subDeviceId) {
        this.subDeviceId = subDeviceId;
        return this;
    }
    public String getSubDeviceId() {
        return this.subDeviceId;
    }

}
