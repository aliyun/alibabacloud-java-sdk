// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateScreenSaverRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7a3***013</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>xxx.png</p>
         */
        @NameInMap("ScreenSaverPicUrl")
        public String screenSaverPicUrl;

        /**
         * <strong>example:</strong>
         * <p>common-weather</p>
         */
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
