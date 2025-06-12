// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B08AAA14-AD93-51F6-82AE-82AFAE9375B6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponseBody self = new GetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenResponseBody setData(GetTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenResponseBodyData getData() {
        return this.data;
    }

    public GetTokenResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetTokenResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>b79d692c315d6bfb28312edf15</p>
         */
        @NameInMap("nonce")
        public String nonce;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("requestIp")
        public String requestIp;

        /**
         * <strong>example:</strong>
         * <p>1748413248360</p>
         */
        @NameInMap("responseTime")
        public String responseTime;

        /**
         * <strong>example:</strong>
         * <p>N1faAjFhhaRNFaZNC8woRpQyAzEfBaIoWQEgDfds/Fwm7nIyEDLlSK3Ttx2OFebiHZ/MpHRr/3MnI/jpVWB/xNYIQxm6sccHJENHNAz6gaW+itU5wUrh+46EpqySABV8kc2pQ0HmYlbePfjjOK6lCfQjEGpekSAgQ6tDhG1lXWfKdtggq58Ut5bImMxMhk4R/PFUWrJe4CDuFu072C+foI0JlUV9TnGtVQ58oz8VRndrGXyauS/xqg8iGSZn6FyprUf5p+0ow20E</p>
         */
        @NameInMap("signature")
        public String signature;

        public static GetTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenResponseBodyData self = new GetTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetTokenResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetTokenResponseBodyData setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public GetTokenResponseBodyData setRequestIp(String requestIp) {
            this.requestIp = requestIp;
            return this;
        }
        public String getRequestIp() {
            return this.requestIp;
        }

        public GetTokenResponseBodyData setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

        public GetTokenResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
