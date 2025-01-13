// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelHomeBackImageAndModesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>394450FC-9035-1B7C-8829-BC88832473FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelHomeBackImageAndModesResponseBodyResult result;

    public static GetHotelHomeBackImageAndModesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelHomeBackImageAndModesResponseBody self = new GetHotelHomeBackImageAndModesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelHomeBackImageAndModesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHotelHomeBackImageAndModesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelHomeBackImageAndModesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelHomeBackImageAndModesResponseBody setResult(GetHotelHomeBackImageAndModesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelHomeBackImageAndModesResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetHotelHomeBackImageAndModesResponseBodyResultModeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>浪漫模式</p>
         */
        @NameInMap("CnName")
        public String cnName;

        /**
         * <strong>example:</strong>
         * <p>romantic</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/langman.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/langman.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        public static GetHotelHomeBackImageAndModesResponseBodyResultModeList build(java.util.Map<String, ?> map) throws Exception {
            GetHotelHomeBackImageAndModesResponseBodyResultModeList self = new GetHotelHomeBackImageAndModesResponseBodyResultModeList();
            return TeaModel.build(map, self);
        }

        public GetHotelHomeBackImageAndModesResponseBodyResultModeList setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetHotelHomeBackImageAndModesResponseBodyResultModeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHotelHomeBackImageAndModesResponseBodyResultModeList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

    }

    public static class GetHotelHomeBackImageAndModesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/platform/3d4fe6d66ec49d9789635f66627f0339/welcome_audios/976210a6532150f49c2677a8b7dbc105/l6fspbhn.jpg">https://ailabs.alibabausercontent.com/platform/3d4fe6d66ec49d9789635f66627f0339/welcome_audios/976210a6532150f49c2677a8b7dbc105/l6fspbhn.jpg</a></p>
         */
        @NameInMap("BackgroundImage")
        public String backgroundImage;

        /**
         * <strong>example:</strong>
         * <p>宣雍测试橙蜂酒店</p>
         */
        @NameInMap("HotelName")
        public String hotelName;

        @NameInMap("ModeList")
        public java.util.List<GetHotelHomeBackImageAndModesResponseBodyResultModeList> modeList;

        public static GetHotelHomeBackImageAndModesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelHomeBackImageAndModesResponseBodyResult self = new GetHotelHomeBackImageAndModesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelHomeBackImageAndModesResponseBodyResult setBackgroundImage(String backgroundImage) {
            this.backgroundImage = backgroundImage;
            return this;
        }
        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        public GetHotelHomeBackImageAndModesResponseBodyResult setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public GetHotelHomeBackImageAndModesResponseBodyResult setModeList(java.util.List<GetHotelHomeBackImageAndModesResponseBodyResultModeList> modeList) {
            this.modeList = modeList;
            return this;
        }
        public java.util.List<GetHotelHomeBackImageAndModesResponseBodyResultModeList> getModeList() {
            return this.modeList;
        }

    }

}
