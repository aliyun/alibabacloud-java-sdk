// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelHomeBackImageAndModesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("CnName")
        public String cnName;

        @NameInMap("Code")
        public String code;

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
        @NameInMap("BackgroundImage")
        public String backgroundImage;

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
