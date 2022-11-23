// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportImpressionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public ReportImpressionResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ReportImpressionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ReportImpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportImpressionResponseBody self = new ReportImpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportImpressionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReportImpressionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReportImpressionResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public ReportImpressionResponseBody setHeader(ReportImpressionResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ReportImpressionResponseBodyHeader getHeader() {
        return this.header;
    }

    public ReportImpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportImpressionResponseBody setResult(ReportImpressionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReportImpressionResponseBodyResult getResult() {
        return this.result;
    }

    public ReportImpressionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReportImpressionResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static ReportImpressionResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ReportImpressionResponseBodyHeader self = new ReportImpressionResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ReportImpressionResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ReportImpressionResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ReportImpressionResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ReportImpressionResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReportImpressionResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        @NameInMap("Success")
        public Boolean success;

        public static ReportImpressionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReportImpressionResponseBodyResult self = new ReportImpressionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReportImpressionResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public ReportImpressionResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
