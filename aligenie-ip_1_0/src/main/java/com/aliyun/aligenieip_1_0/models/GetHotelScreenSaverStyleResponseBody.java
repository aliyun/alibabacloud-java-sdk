// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverStyleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73C67**6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetHotelScreenSaverStyleResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelScreenSaverStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverStyleResponseBody self = new GetHotelScreenSaverStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverStyleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelScreenSaverStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelScreenSaverStyleResponseBody setResult(java.util.List<GetHotelScreenSaverStyleResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetHotelScreenSaverStyleResponseBodyResult> getResult() {
        return this.result;
    }

    public GetHotelScreenSaverStyleResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelScreenSaverStyleResponseBodyResult extends TeaModel {
        @NameInMap("CnName")
        public String cnName;

        /**
         * <strong>example:</strong>
         * <p>common-weather</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>common-weather</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.***.png">https://img.***.png</a></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        public static GetHotelScreenSaverStyleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelScreenSaverStyleResponseBodyResult self = new GetHotelScreenSaverStyleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelScreenSaverStyleResponseBodyResult setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetHotelScreenSaverStyleResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHotelScreenSaverStyleResponseBodyResult setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetHotelScreenSaverStyleResponseBodyResult setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

    }

}
