// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateHotelSettingShrinkRequest extends TeaModel {
    @NameInMap("HotelDeviceModeList")
    public String hotelDeviceModeListShrink;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("HotelScreenSaver")
    public String hotelScreenSaverShrink;

    @NameInMap("NightMode")
    public String nightModeShrink;

    @NameInMap("SettingType")
    public String settingType;

    @NameInMap("Value")
    public String value;

    public static AddOrUpdateHotelSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateHotelSettingShrinkRequest self = new AddOrUpdateHotelSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateHotelSettingShrinkRequest setHotelDeviceModeListShrink(String hotelDeviceModeListShrink) {
        this.hotelDeviceModeListShrink = hotelDeviceModeListShrink;
        return this;
    }
    public String getHotelDeviceModeListShrink() {
        return this.hotelDeviceModeListShrink;
    }

    public AddOrUpdateHotelSettingShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateHotelSettingShrinkRequest setHotelScreenSaverShrink(String hotelScreenSaverShrink) {
        this.hotelScreenSaverShrink = hotelScreenSaverShrink;
        return this;
    }
    public String getHotelScreenSaverShrink() {
        return this.hotelScreenSaverShrink;
    }

    public AddOrUpdateHotelSettingShrinkRequest setNightModeShrink(String nightModeShrink) {
        this.nightModeShrink = nightModeShrink;
        return this;
    }
    public String getNightModeShrink() {
        return this.nightModeShrink;
    }

    public AddOrUpdateHotelSettingShrinkRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

    public AddOrUpdateHotelSettingShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
