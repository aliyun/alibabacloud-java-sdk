// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleShippedResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public ConfirmSampleShippedResponseBodyHeader header;

    @NameInMap("Result")
    public ConfirmSampleShippedResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ConfirmSampleShippedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleShippedResponseBody self = new ConfirmSampleShippedResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleShippedResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConfirmSampleShippedResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ConfirmSampleShippedResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public ConfirmSampleShippedResponseBody setHeader(ConfirmSampleShippedResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ConfirmSampleShippedResponseBodyHeader getHeader() {
        return this.header;
    }

    public ConfirmSampleShippedResponseBody setResult(ConfirmSampleShippedResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ConfirmSampleShippedResponseBodyResult getResult() {
        return this.result;
    }

    public ConfirmSampleShippedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfirmSampleShippedResponseBodyHeader extends TeaModel {
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

        public static ConfirmSampleShippedResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ConfirmSampleShippedResponseBodyHeader self = new ConfirmSampleShippedResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ConfirmSampleShippedResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ConfirmSampleShippedResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public ConfirmSampleShippedResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public ConfirmSampleShippedResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ConfirmSampleShippedResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ConfirmSampleShippedResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ConfirmSampleShippedResponseBodyResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static ConfirmSampleShippedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ConfirmSampleShippedResponseBodyResult self = new ConfirmSampleShippedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ConfirmSampleShippedResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ConfirmSampleShippedResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
