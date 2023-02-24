// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeV2ResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelNoticeV2ResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelNoticeV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeV2ResponseBody self = new GetHotelNoticeV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelNoticeV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelNoticeV2ResponseBody setResult(GetHotelNoticeV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelNoticeV2ResponseBodyResult getResult() {
        return this.result;
    }

    public GetHotelNoticeV2ResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelNoticeV2ResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("Title")
        public String title;

        public static GetHotelNoticeV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelNoticeV2ResponseBodyResult self = new GetHotelNoticeV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelNoticeV2ResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetHotelNoticeV2ResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelNoticeV2ResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
