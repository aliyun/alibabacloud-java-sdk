// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ConnectAssistDeviceRequest extends TeaModel {
    @NameInMap("HardwareId")
    public String hardwareId;

    @NameInMap("AllowCommandExtension")
    public Boolean allowCommandExtension;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("VIN")
    public String VIN;

    @NameInMap("UUID")
    public String UUID;

    @NameInMap("ProjectId")
    public String projectId;

    public static ConnectAssistDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectAssistDeviceRequest self = new ConnectAssistDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ConnectAssistDeviceRequest setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }
    public String getHardwareId() {
        return this.hardwareId;
    }

    public ConnectAssistDeviceRequest setAllowCommandExtension(Boolean allowCommandExtension) {
        this.allowCommandExtension = allowCommandExtension;
        return this;
    }
    public Boolean getAllowCommandExtension() {
        return this.allowCommandExtension;
    }

    public ConnectAssistDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ConnectAssistDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ConnectAssistDeviceRequest setVIN(String VIN) {
        this.VIN = VIN;
        return this;
    }
    public String getVIN() {
        return this.VIN;
    }

    public ConnectAssistDeviceRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

    public ConnectAssistDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
