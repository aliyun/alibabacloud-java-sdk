// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateIpcDeviceRequest extends TeaModel {
    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("BitRate")
    public String bitRate;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("DeviceName")
    public String deviceName;

    public static UpdateIpcDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpcDeviceRequest self = new UpdateIpcDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpcDeviceRequest setDeviceSite(String deviceSite) {
        this.deviceSite = deviceSite;
        return this;
    }
    public String getDeviceSite() {
        return this.deviceSite;
    }

    public UpdateIpcDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateIpcDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public UpdateIpcDeviceRequest setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public UpdateIpcDeviceRequest setDeviceDirection(String deviceDirection) {
        this.deviceDirection = deviceDirection;
        return this;
    }
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    public UpdateIpcDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public UpdateIpcDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public UpdateIpcDeviceRequest setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
        return this;
    }
    public String getDeviceResolution() {
        return this.deviceResolution;
    }

    public UpdateIpcDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public UpdateIpcDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
