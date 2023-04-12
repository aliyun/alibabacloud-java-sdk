// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SyncDeviceStatusWithAkRequest extends TeaModel {
    @NameInMap("CategoryCnName")
    public String categoryCnName;

    @NameInMap("CategoryEnName")
    public String categoryEnName;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Location")
    public String location;

    @NameInMap("LocationCnName")
    public String locationCnName;

    @NameInMap("Number")
    public String number;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("Switch")
    public Integer _switch;

    @NameInMap("fanSpeed")
    public String fanSpeed;

    @NameInMap("mode")
    public String mode;

    @NameInMap("roomTemperature")
    public String roomTemperature;

    @NameInMap("temperature")
    public String temperature;

    @NameInMap("value")
    public Integer value;

    public static SyncDeviceStatusWithAkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceStatusWithAkRequest self = new SyncDeviceStatusWithAkRequest();
        return TeaModel.build(map, self);
    }

    public SyncDeviceStatusWithAkRequest setCategoryCnName(String categoryCnName) {
        this.categoryCnName = categoryCnName;
        return this;
    }
    public String getCategoryCnName() {
        return this.categoryCnName;
    }

    public SyncDeviceStatusWithAkRequest setCategoryEnName(String categoryEnName) {
        this.categoryEnName = categoryEnName;
        return this;
    }
    public String getCategoryEnName() {
        return this.categoryEnName;
    }

    public SyncDeviceStatusWithAkRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SyncDeviceStatusWithAkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public SyncDeviceStatusWithAkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public SyncDeviceStatusWithAkRequest setLocationCnName(String locationCnName) {
        this.locationCnName = locationCnName;
        return this;
    }
    public String getLocationCnName() {
        return this.locationCnName;
    }

    public SyncDeviceStatusWithAkRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public SyncDeviceStatusWithAkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public SyncDeviceStatusWithAkRequest set_switch(Integer _switch) {
        this._switch = _switch;
        return this;
    }
    public Integer get_switch() {
        return this._switch;
    }

    public SyncDeviceStatusWithAkRequest setFanSpeed(String fanSpeed) {
        this.fanSpeed = fanSpeed;
        return this;
    }
    public String getFanSpeed() {
        return this.fanSpeed;
    }

    public SyncDeviceStatusWithAkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SyncDeviceStatusWithAkRequest setRoomTemperature(String roomTemperature) {
        this.roomTemperature = roomTemperature;
        return this;
    }
    public String getRoomTemperature() {
        return this.roomTemperature;
    }

    public SyncDeviceStatusWithAkRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public SyncDeviceStatusWithAkRequest setValue(Integer value) {
        this.value = value;
        return this;
    }
    public Integer getValue() {
        return this.value;
    }

}
