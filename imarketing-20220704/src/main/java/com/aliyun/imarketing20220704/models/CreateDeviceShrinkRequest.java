// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class CreateDeviceShrinkRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("City")
    public String city;

    @NameInMap("DeviceModelNumber")
    public String deviceModelNumber;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("District")
    public String district;

    @NameInMap("ExtraMap")
    public String extraMapShrink;

    @NameInMap("FirstScene")
    public String firstScene;

    @NameInMap("Floor")
    public String floor;

    @NameInMap("LocationName")
    public String locationName;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OuterCode")
    public String outerCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("SecondScene")
    public String secondScene;

    public static CreateDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceShrinkRequest self = new CreateDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateDeviceShrinkRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateDeviceShrinkRequest setDeviceModelNumber(String deviceModelNumber) {
        this.deviceModelNumber = deviceModelNumber;
        return this;
    }
    public String getDeviceModelNumber() {
        return this.deviceModelNumber;
    }

    public CreateDeviceShrinkRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDeviceShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateDeviceShrinkRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public CreateDeviceShrinkRequest setExtraMapShrink(String extraMapShrink) {
        this.extraMapShrink = extraMapShrink;
        return this;
    }
    public String getExtraMapShrink() {
        return this.extraMapShrink;
    }

    public CreateDeviceShrinkRequest setFirstScene(String firstScene) {
        this.firstScene = firstScene;
        return this;
    }
    public String getFirstScene() {
        return this.firstScene;
    }

    public CreateDeviceShrinkRequest setFloor(String floor) {
        this.floor = floor;
        return this;
    }
    public String getFloor() {
        return this.floor;
    }

    public CreateDeviceShrinkRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public CreateDeviceShrinkRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateDeviceShrinkRequest setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

    public CreateDeviceShrinkRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreateDeviceShrinkRequest setSecondScene(String secondScene) {
        this.secondScene = secondScene;
        return this;
    }
    public String getSecondScene() {
        return this.secondScene;
    }

}
