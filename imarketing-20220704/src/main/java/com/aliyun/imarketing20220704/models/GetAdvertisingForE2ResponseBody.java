// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetAdvertisingForE2ResponseBody extends TeaModel {
    /**
     * <p>errorCode</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>errorMsg</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>header</p>
     */
    @NameInMap("Header")
    public GetAdvertisingForE2ResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAdvertisingForE2ResponseBodyResult result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAdvertisingForE2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvertisingForE2ResponseBody self = new GetAdvertisingForE2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvertisingForE2ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAdvertisingForE2ResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetAdvertisingForE2ResponseBody setHeader(GetAdvertisingForE2ResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetAdvertisingForE2ResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetAdvertisingForE2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvertisingForE2ResponseBody setResult(GetAdvertisingForE2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAdvertisingForE2ResponseBodyResult getResult() {
        return this.result;
    }

    public GetAdvertisingForE2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAdvertisingForE2ResponseBodyHeader extends TeaModel {
        /**
         * <p>costTime</p>
         */
        @NameInMap("CostTime")
        public Long costTime;

        /**
         * <p>innerErrorCode</p>
         */
        @NameInMap("InnerErrorCode")
        public String innerErrorCode;

        /**
         * <p>innerErrorMsg</p>
         */
        @NameInMap("InnerErrorMsg")
        public String innerErrorMsg;

        /**
         * <p>rpcId</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>traceId</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>version</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAdvertisingForE2ResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetAdvertisingForE2ResponseBodyHeader self = new GetAdvertisingForE2ResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetAdvertisingForE2ResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetAdvertisingForE2ResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public GetAdvertisingForE2ResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public GetAdvertisingForE2ResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetAdvertisingForE2ResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetAdvertisingForE2ResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAdvertisingForE2ResponseBodyResult extends TeaModel {
        @NameInMap("ImgUrl")
        public String imgUrl;

        @NameInMap("TargetUrl")
        public String targetUrl;

        public static GetAdvertisingForE2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdvertisingForE2ResponseBodyResult self = new GetAdvertisingForE2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAdvertisingForE2ResponseBodyResult setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
            return this;
        }
        public String getImgUrl() {
            return this.imgUrl;
        }

        public GetAdvertisingForE2ResponseBodyResult setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

    }

}
