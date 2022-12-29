// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateScreenSaverRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("HotelScreenSaver")
    public AddOrUpdateScreenSaverRequestHotelScreenSaver hotelScreenSaver;

    public static AddOrUpdateScreenSaverRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateScreenSaverRequest self = new AddOrUpdateScreenSaverRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateScreenSaverRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateScreenSaverRequest setHotelScreenSaver(AddOrUpdateScreenSaverRequestHotelScreenSaver hotelScreenSaver) {
        this.hotelScreenSaver = hotelScreenSaver;
        return this;
    }
    public AddOrUpdateScreenSaverRequestHotelScreenSaver getHotelScreenSaver() {
        return this.hotelScreenSaver;
    }

    public static class AddOrUpdateScreenSaverRequestHotelScreenSaver extends TeaModel {
        @NameInMap("ScreenSaverPicUrl")
        public String screenSaverPicUrl;

        @NameInMap("ScreenSaverStyle")
        public String screenSaverStyle;

        public static AddOrUpdateScreenSaverRequestHotelScreenSaver build(java.util.Map<String, ?> map) throws Exception {
            AddOrUpdateScreenSaverRequestHotelScreenSaver self = new AddOrUpdateScreenSaverRequestHotelScreenSaver();
            return TeaModel.build(map, self);
        }

        public AddOrUpdateScreenSaverRequestHotelScreenSaver setScreenSaverPicUrl(String screenSaverPicUrl) {
            this.screenSaverPicUrl = screenSaverPicUrl;
            return this;
        }
        public String getScreenSaverPicUrl() {
            return this.screenSaverPicUrl;
        }

        public AddOrUpdateScreenSaverRequestHotelScreenSaver setScreenSaverStyle(String screenSaverStyle) {
            this.screenSaverStyle = screenSaverStyle;
            return this;
        }
        public String getScreenSaverStyle() {
            return this.screenSaverStyle;
        }

    }

}
