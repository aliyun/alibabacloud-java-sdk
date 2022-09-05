// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetUserFinishedAdResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public GetUserFinishedAdResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetUserFinishedAdResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserFinishedAdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserFinishedAdResponseBody self = new GetUserFinishedAdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserFinishedAdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserFinishedAdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserFinishedAdResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public GetUserFinishedAdResponseBody setHeader(GetUserFinishedAdResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetUserFinishedAdResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetUserFinishedAdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserFinishedAdResponseBody setResult(GetUserFinishedAdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserFinishedAdResponseBodyResult getResult() {
        return this.result;
    }

    public GetUserFinishedAdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserFinishedAdResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetUserFinishedAdResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetUserFinishedAdResponseBodyHeader self = new GetUserFinishedAdResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetUserFinishedAdResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetUserFinishedAdResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetUserFinishedAdResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetUserFinishedAdResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetUserFinishedAdResponseBodyResult extends TeaModel {
        @NameInMap("Commission")
        public String commission;

        @NameInMap("Id")
        public String id;

        @NameInMap("MarketingType")
        public String marketingType;

        @NameInMap("Objective")
        public String objective;

        @NameInMap("Success")
        public Boolean success;

        public static GetUserFinishedAdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserFinishedAdResponseBodyResult self = new GetUserFinishedAdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserFinishedAdResponseBodyResult setCommission(String commission) {
            this.commission = commission;
            return this;
        }
        public String getCommission() {
            return this.commission;
        }

        public GetUserFinishedAdResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserFinishedAdResponseBodyResult setMarketingType(String marketingType) {
            this.marketingType = marketingType;
            return this;
        }
        public String getMarketingType() {
            return this.marketingType;
        }

        public GetUserFinishedAdResponseBodyResult setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public GetUserFinishedAdResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
