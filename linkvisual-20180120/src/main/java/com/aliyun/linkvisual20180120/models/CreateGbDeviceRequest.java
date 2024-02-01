// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateGbDeviceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public Integer deviceType;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MediaNetProtocol")
    public String mediaNetProtocol;

    @NameInMap("Password")
    public String password;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SubProductKey")
    public String subProductKey;

    public static CreateGbDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGbDeviceRequest self = new CreateGbDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGbDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGbDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateGbDeviceRequest setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public Integer getDeviceType() {
        return this.deviceType;
    }

    public CreateGbDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateGbDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateGbDeviceRequest setMediaNetProtocol(String mediaNetProtocol) {
        this.mediaNetProtocol = mediaNetProtocol;
        return this;
    }
    public String getMediaNetProtocol() {
        return this.mediaNetProtocol;
    }

    public CreateGbDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGbDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateGbDeviceRequest setSubProductKey(String subProductKey) {
        this.subProductKey = subProductKey;
        return this;
    }
    public String getSubProductKey() {
        return this.subProductKey;
    }

}
