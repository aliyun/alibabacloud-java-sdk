// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class CancelOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public CancelOrderResponseBodyHeader header;

    @NameInMap("Result")
    public CancelOrderResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CancelOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponseBody self = new CancelOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CancelOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CancelOrderResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public CancelOrderResponseBody setHeader(CancelOrderResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public CancelOrderResponseBodyHeader getHeader() {
        return this.header;
    }

    public CancelOrderResponseBody setResult(CancelOrderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CancelOrderResponseBodyResult getResult() {
        return this.result;
    }

    public CancelOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelOrderResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("InnerErrorCode")
        public String innerErrorCode;

        @NameInMap("InnerErrorMsg")
        public String innerErrorMsg;

        /**
         * <p>RPC ID</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static CancelOrderResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            CancelOrderResponseBodyHeader self = new CancelOrderResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public CancelOrderResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public CancelOrderResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public CancelOrderResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public CancelOrderResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public CancelOrderResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public CancelOrderResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CancelOrderResponseBodyResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static CancelOrderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CancelOrderResponseBodyResult self = new CancelOrderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CancelOrderResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CancelOrderResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
