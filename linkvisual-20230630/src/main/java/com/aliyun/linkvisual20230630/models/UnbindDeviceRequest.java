// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UnbindDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("OpenId")
    public String openId;

    @NameInMap("OpenIdAppKey")
    public String openIdAppKey;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("UnbindSubDevice")
    public Boolean unbindSubDevice;

    public static UnbindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceRequest self = new UnbindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UnbindDeviceRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public UnbindDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UnbindDeviceRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public UnbindDeviceRequest setOpenIdAppKey(String openIdAppKey) {
        this.openIdAppKey = openIdAppKey;
        return this;
    }
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    public UnbindDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnbindDeviceRequest setUnbindSubDevice(Boolean unbindSubDevice) {
        this.unbindSubDevice = unbindSubDevice;
        return this;
    }
    public Boolean getUnbindSubDevice() {
        return this.unbindSubDevice;
    }

}
