// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportTranslateResponseBody extends TeaModel {
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
    public ReportTranslateResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ReportTranslateResponseBodyResult result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReportTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportTranslateResponseBody self = new ReportTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportTranslateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReportTranslateResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReportTranslateResponseBody setHeader(ReportTranslateResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ReportTranslateResponseBodyHeader getHeader() {
        return this.header;
    }

    public ReportTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportTranslateResponseBody setResult(ReportTranslateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReportTranslateResponseBodyResult getResult() {
        return this.result;
    }

    public ReportTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReportTranslateResponseBodyHeader extends TeaModel {
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

        public static ReportTranslateResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ReportTranslateResponseBodyHeader self = new ReportTranslateResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ReportTranslateResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ReportTranslateResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public ReportTranslateResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public ReportTranslateResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ReportTranslateResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ReportTranslateResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReportTranslateResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        /**
         * <p>success</p>
         */
        @NameInMap("Success")
        public String success;

        public static ReportTranslateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReportTranslateResponseBodyResult self = new ReportTranslateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReportTranslateResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public ReportTranslateResponseBodyResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
