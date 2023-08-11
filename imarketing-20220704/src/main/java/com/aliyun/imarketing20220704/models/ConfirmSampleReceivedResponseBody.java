// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleReceivedResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public ConfirmSampleReceivedResponseBodyHeader header;

    @NameInMap("Result")
    public ConfirmSampleReceivedResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ConfirmSampleReceivedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleReceivedResponseBody self = new ConfirmSampleReceivedResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleReceivedResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConfirmSampleReceivedResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ConfirmSampleReceivedResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public ConfirmSampleReceivedResponseBody setHeader(ConfirmSampleReceivedResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ConfirmSampleReceivedResponseBodyHeader getHeader() {
        return this.header;
    }

    public ConfirmSampleReceivedResponseBody setResult(ConfirmSampleReceivedResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ConfirmSampleReceivedResponseBodyResult getResult() {
        return this.result;
    }

    public ConfirmSampleReceivedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfirmSampleReceivedResponseBodyHeader extends TeaModel {
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

        public static ConfirmSampleReceivedResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ConfirmSampleReceivedResponseBodyHeader self = new ConfirmSampleReceivedResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ConfirmSampleReceivedResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ConfirmSampleReceivedResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public ConfirmSampleReceivedResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public ConfirmSampleReceivedResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ConfirmSampleReceivedResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ConfirmSampleReceivedResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ConfirmSampleReceivedResponseBodyResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static ConfirmSampleReceivedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ConfirmSampleReceivedResponseBodyResult self = new ConfirmSampleReceivedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ConfirmSampleReceivedResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ConfirmSampleReceivedResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
