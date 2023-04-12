// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateHotelSettingRequest extends TeaModel {
    @NameInMap("HotelDeviceModeList")
    public java.util.List<String> hotelDeviceModeList;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("HotelScreenSaver")
    public AddOrUpdateHotelSettingRequestHotelScreenSaver hotelScreenSaver;

    @NameInMap("NightMode")
    public AddOrUpdateHotelSettingRequestNightMode nightMode;

    @NameInMap("SettingType")
    public String settingType;

    @NameInMap("Value")
    public String value;

    public static AddOrUpdateHotelSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateHotelSettingRequest self = new AddOrUpdateHotelSettingRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateHotelSettingRequest setHotelDeviceModeList(java.util.List<String> hotelDeviceModeList) {
        this.hotelDeviceModeList = hotelDeviceModeList;
        return this;
    }
    public java.util.List<String> getHotelDeviceModeList() {
        return this.hotelDeviceModeList;
    }

    public AddOrUpdateHotelSettingRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateHotelSettingRequest setHotelScreenSaver(AddOrUpdateHotelSettingRequestHotelScreenSaver hotelScreenSaver) {
        this.hotelScreenSaver = hotelScreenSaver;
        return this;
    }
    public AddOrUpdateHotelSettingRequestHotelScreenSaver getHotelScreenSaver() {
        return this.hotelScreenSaver;
    }

    public AddOrUpdateHotelSettingRequest setNightMode(AddOrUpdateHotelSettingRequestNightMode nightMode) {
        this.nightMode = nightMode;
        return this;
    }
    public AddOrUpdateHotelSettingRequestNightMode getNightMode() {
        return this.nightMode;
    }

    public AddOrUpdateHotelSettingRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

    public AddOrUpdateHotelSettingRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class AddOrUpdateHotelSettingRequestHotelScreenSaver extends TeaModel {
        @NameInMap("ScreenSaverPicUrl")
        public String screenSaverPicUrl;

        @NameInMap("ScreenSaverStyle")
        public String screenSaverStyle;

        public static AddOrUpdateHotelSettingRequestHotelScreenSaver build(java.util.Map<String, ?> map) throws Exception {
            AddOrUpdateHotelSettingRequestHotelScreenSaver self = new AddOrUpdateHotelSettingRequestHotelScreenSaver();
            return TeaModel.build(map, self);
        }

        public AddOrUpdateHotelSettingRequestHotelScreenSaver setScreenSaverPicUrl(String screenSaverPicUrl) {
            this.screenSaverPicUrl = screenSaverPicUrl;
            return this;
        }
        public String getScreenSaverPicUrl() {
            return this.screenSaverPicUrl;
        }

        public AddOrUpdateHotelSettingRequestHotelScreenSaver setScreenSaverStyle(String screenSaverStyle) {
            this.screenSaverStyle = screenSaverStyle;
            return this;
        }
        public String getScreenSaverStyle() {
            return this.screenSaverStyle;
        }

    }

    public static class AddOrUpdateHotelSettingRequestNightMode extends TeaModel {
        @NameInMap("DefaultBright")
        public String defaultBright;

        @NameInMap("DefaultVolume")
        public String defaultVolume;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("End")
        public String end;

        @NameInMap("StandbyAction")
        public String standbyAction;

        @NameInMap("Start")
        public String start;

        public static AddOrUpdateHotelSettingRequestNightMode build(java.util.Map<String, ?> map) throws Exception {
            AddOrUpdateHotelSettingRequestNightMode self = new AddOrUpdateHotelSettingRequestNightMode();
            return TeaModel.build(map, self);
        }

        public AddOrUpdateHotelSettingRequestNightMode setDefaultBright(String defaultBright) {
            this.defaultBright = defaultBright;
            return this;
        }
        public String getDefaultBright() {
            return this.defaultBright;
        }

        public AddOrUpdateHotelSettingRequestNightMode setDefaultVolume(String defaultVolume) {
            this.defaultVolume = defaultVolume;
            return this;
        }
        public String getDefaultVolume() {
            return this.defaultVolume;
        }

        public AddOrUpdateHotelSettingRequestNightMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public AddOrUpdateHotelSettingRequestNightMode setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public AddOrUpdateHotelSettingRequestNightMode setStandbyAction(String standbyAction) {
            this.standbyAction = standbyAction;
            return this;
        }
        public String getStandbyAction() {
            return this.standbyAction;
        }

        public AddOrUpdateHotelSettingRequestNightMode setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
