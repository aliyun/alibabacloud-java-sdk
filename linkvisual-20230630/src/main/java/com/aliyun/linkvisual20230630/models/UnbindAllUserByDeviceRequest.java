// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UnbindAllUserByDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("UnbindSubDevice")
    public Boolean unbindSubDevice;

    public static UnbindAllUserByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAllUserByDeviceRequest self = new UnbindAllUserByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAllUserByDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UnbindAllUserByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UnbindAllUserByDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnbindAllUserByDeviceRequest setUnbindSubDevice(Boolean unbindSubDevice) {
        this.unbindSubDevice = unbindSubDevice;
        return this;
    }
    public Boolean getUnbindSubDevice() {
        return this.unbindSubDevice;
    }

}
