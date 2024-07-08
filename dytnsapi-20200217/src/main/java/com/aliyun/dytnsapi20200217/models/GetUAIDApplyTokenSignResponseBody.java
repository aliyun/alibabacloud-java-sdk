// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class GetUAIDApplyTokenSignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUAIDApplyTokenSignResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUAIDApplyTokenSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUAIDApplyTokenSignResponseBody self = new GetUAIDApplyTokenSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUAIDApplyTokenSignResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetUAIDApplyTokenSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUAIDApplyTokenSignResponseBody setData(GetUAIDApplyTokenSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUAIDApplyTokenSignResponseBodyData getData() {
        return this.data;
    }

    public GetUAIDApplyTokenSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUAIDApplyTokenSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUAIDApplyTokenSignResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <strong>example:</strong>
         * <p>b8b5b3a*******0b9893484fdf412c99</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <strong>example:</strong>
         * <p>D2E204D74EEB373E468632********23F592C4C9</p>
         */
        @NameInMap("Sign")
        public String sign;

        public static GetUAIDApplyTokenSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUAIDApplyTokenSignResponseBodyData self = new GetUAIDApplyTokenSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUAIDApplyTokenSignResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public GetUAIDApplyTokenSignResponseBodyData setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public GetUAIDApplyTokenSignResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
