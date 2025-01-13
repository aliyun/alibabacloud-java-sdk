// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverResponseBody extends TeaModel {
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
     * <p>5F0467E1-19F2-1757-B6D0-B79917BA2E81</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelScreenSaverResponseBodyResult result;

    public static GetHotelScreenSaverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverResponseBody self = new GetHotelScreenSaverResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHotelScreenSaverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelScreenSaverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelScreenSaverResponseBody setResult(GetHotelScreenSaverResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelScreenSaverResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetHotelScreenSaverResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/platform/3d4fe6d66ec49d9789635f66627f0339/welcome_audios/976210a6532150f49c2677a8b7dbc105/l6fspbhd.jpg">https://ailabs.alibabausercontent.com/platform/3d4fe6d66ec49d9789635f66627f0339/welcome_audios/976210a6532150f49c2677a8b7dbc105/l6fspbhd.jpg</a></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        /**
         * <strong>example:</strong>
         * <p>common-weather</p>
         */
        @NameInMap("StyleCode")
        public String styleCode;

        public static GetHotelScreenSaverResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelScreenSaverResponseBodyResult self = new GetHotelScreenSaverResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelScreenSaverResponseBodyResult setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetHotelScreenSaverResponseBodyResult setStyleCode(String styleCode) {
            this.styleCode = styleCode;
            return this;
        }
        public String getStyleCode() {
            return this.styleCode;
        }

    }

}
