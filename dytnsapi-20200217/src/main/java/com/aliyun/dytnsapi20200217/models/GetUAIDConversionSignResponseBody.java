// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class GetUAIDConversionSignResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUAIDConversionSignResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUAIDConversionSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUAIDConversionSignResponseBody self = new GetUAIDConversionSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUAIDConversionSignResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetUAIDConversionSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUAIDConversionSignResponseBody setData(GetUAIDConversionSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUAIDConversionSignResponseBodyData getData() {
        return this.data;
    }

    public GetUAIDConversionSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUAIDConversionSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUAIDConversionSignResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Sign")
        public String sign;

        public static GetUAIDConversionSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUAIDConversionSignResponseBodyData self = new GetUAIDConversionSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUAIDConversionSignResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public GetUAIDConversionSignResponseBodyData setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public GetUAIDConversionSignResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
