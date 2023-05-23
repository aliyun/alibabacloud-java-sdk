// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSettingResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelSettingResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSettingResponseBody self = new GetHotelSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelSettingResponseBody setResult(GetHotelSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelSettingResponseBodyResult getResult() {
        return this.result;
    }

    public GetHotelSettingResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelSettingResponseBodyResultHotelScreenSaver extends TeaModel {
        @NameInMap("ScreenSaverPicUrl")
        public String screenSaverPicUrl;

        @NameInMap("ScreenSaverStyle")
        public String screenSaverStyle;

        public static GetHotelSettingResponseBodyResultHotelScreenSaver build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSettingResponseBodyResultHotelScreenSaver self = new GetHotelSettingResponseBodyResultHotelScreenSaver();
            return TeaModel.build(map, self);
        }

        public GetHotelSettingResponseBodyResultHotelScreenSaver setScreenSaverPicUrl(String screenSaverPicUrl) {
            this.screenSaverPicUrl = screenSaverPicUrl;
            return this;
        }
        public String getScreenSaverPicUrl() {
            return this.screenSaverPicUrl;
        }

        public GetHotelSettingResponseBodyResultHotelScreenSaver setScreenSaverStyle(String screenSaverStyle) {
            this.screenSaverStyle = screenSaverStyle;
            return this;
        }
        public String getScreenSaverStyle() {
            return this.screenSaverStyle;
        }

    }

    public static class GetHotelSettingResponseBodyResultNightMode extends TeaModel {
        /**
         * <p>夜间模式下的默认亮度</p>
         */
        @NameInMap("DefaultBright")
        public String defaultBright;

        /**
         * <p>夜间模式下的默认音量</p>
         */
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

        public static GetHotelSettingResponseBodyResultNightMode build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSettingResponseBodyResultNightMode self = new GetHotelSettingResponseBodyResultNightMode();
            return TeaModel.build(map, self);
        }

        public GetHotelSettingResponseBodyResultNightMode setDefaultBright(String defaultBright) {
            this.defaultBright = defaultBright;
            return this;
        }
        public String getDefaultBright() {
            return this.defaultBright;
        }

        public GetHotelSettingResponseBodyResultNightMode setDefaultVolume(String defaultVolume) {
            this.defaultVolume = defaultVolume;
            return this;
        }
        public String getDefaultVolume() {
            return this.defaultVolume;
        }

        public GetHotelSettingResponseBodyResultNightMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetHotelSettingResponseBodyResultNightMode setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetHotelSettingResponseBodyResultNightMode setStandbyAction(String standbyAction) {
            this.standbyAction = standbyAction;
            return this;
        }
        public String getStandbyAction() {
            return this.standbyAction;
        }

        public GetHotelSettingResponseBodyResultNightMode setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetHotelSettingResponseBodyResult extends TeaModel {
        @NameInMap("DeleteToken")
        public Long deleteToken;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("HotelDeviceModeList")
        public java.util.List<String> hotelDeviceModeList;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelScreenSaver")
        public GetHotelSettingResponseBodyResultHotelScreenSaver hotelScreenSaver;

        @NameInMap("NightMode")
        public GetHotelSettingResponseBodyResultNightMode nightMode;

        @NameInMap("SettingType")
        public String settingType;

        @NameInMap("Value")
        public String value;

        public static GetHotelSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSettingResponseBodyResult self = new GetHotelSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelSettingResponseBodyResult setDeleteToken(Long deleteToken) {
            this.deleteToken = deleteToken;
            return this;
        }
        public Long getDeleteToken() {
            return this.deleteToken;
        }

        public GetHotelSettingResponseBodyResult setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetHotelSettingResponseBodyResult setHotelDeviceModeList(java.util.List<String> hotelDeviceModeList) {
            this.hotelDeviceModeList = hotelDeviceModeList;
            return this;
        }
        public java.util.List<String> getHotelDeviceModeList() {
            return this.hotelDeviceModeList;
        }

        public GetHotelSettingResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelSettingResponseBodyResult setHotelScreenSaver(GetHotelSettingResponseBodyResultHotelScreenSaver hotelScreenSaver) {
            this.hotelScreenSaver = hotelScreenSaver;
            return this;
        }
        public GetHotelSettingResponseBodyResultHotelScreenSaver getHotelScreenSaver() {
            return this.hotelScreenSaver;
        }

        public GetHotelSettingResponseBodyResult setNightMode(GetHotelSettingResponseBodyResultNightMode nightMode) {
            this.nightMode = nightMode;
            return this;
        }
        public GetHotelSettingResponseBodyResultNightMode getNightMode() {
            return this.nightMode;
        }

        public GetHotelSettingResponseBodyResult setSettingType(String settingType) {
            this.settingType = settingType;
            return this;
        }
        public String getSettingType() {
            return this.settingType;
        }

        public GetHotelSettingResponseBodyResult setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
