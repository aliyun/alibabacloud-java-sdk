// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetWelcomeTextAndMusicResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetWelcomeTextAndMusicResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetWelcomeTextAndMusicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWelcomeTextAndMusicResponseBody self = new GetWelcomeTextAndMusicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWelcomeTextAndMusicResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public GetWelcomeTextAndMusicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWelcomeTextAndMusicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWelcomeTextAndMusicResponseBody setResult(GetWelcomeTextAndMusicResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWelcomeTextAndMusicResponseBodyResult getResult() {
        return this.result;
    }

    public GetWelcomeTextAndMusicResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetWelcomeTextAndMusicResponseBodyResult extends TeaModel {
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("MusicUrl")
        public String musicUrl;

        @NameInMap("Text")
        public String text;

        public static GetWelcomeTextAndMusicResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWelcomeTextAndMusicResponseBodyResult self = new GetWelcomeTextAndMusicResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWelcomeTextAndMusicResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetWelcomeTextAndMusicResponseBodyResult setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

        public GetWelcomeTextAndMusicResponseBodyResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
