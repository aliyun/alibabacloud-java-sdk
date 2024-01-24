// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryFinanceUserInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public QueryFinanceUserInfoResponseBodyHeader header;

    @NameInMap("Result")
    public QueryFinanceUserInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFinanceUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFinanceUserInfoResponseBody self = new QueryFinanceUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFinanceUserInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryFinanceUserInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryFinanceUserInfoResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public QueryFinanceUserInfoResponseBody setHeader(QueryFinanceUserInfoResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public QueryFinanceUserInfoResponseBodyHeader getHeader() {
        return this.header;
    }

    public QueryFinanceUserInfoResponseBody setResult(QueryFinanceUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryFinanceUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryFinanceUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFinanceUserInfoResponseBodyHeader extends TeaModel {
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

        public static QueryFinanceUserInfoResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            QueryFinanceUserInfoResponseBodyHeader self = new QueryFinanceUserInfoResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public QueryFinanceUserInfoResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public QueryFinanceUserInfoResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public QueryFinanceUserInfoResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public QueryFinanceUserInfoResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public QueryFinanceUserInfoResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public QueryFinanceUserInfoResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryFinanceUserInfoResponseBodyResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalIncomeAmount")
        public Long totalIncomeAmount;

        @NameInMap("UserPageType")
        public String userPageType;

        @NameInMap("YesterdayIncomeAmount")
        public Long yesterdayIncomeAmount;

        public static QueryFinanceUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryFinanceUserInfoResponseBodyResult self = new QueryFinanceUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryFinanceUserInfoResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryFinanceUserInfoResponseBodyResult setTotalIncomeAmount(Long totalIncomeAmount) {
            this.totalIncomeAmount = totalIncomeAmount;
            return this;
        }
        public Long getTotalIncomeAmount() {
            return this.totalIncomeAmount;
        }

        public QueryFinanceUserInfoResponseBodyResult setUserPageType(String userPageType) {
            this.userPageType = userPageType;
            return this;
        }
        public String getUserPageType() {
            return this.userPageType;
        }

        public QueryFinanceUserInfoResponseBodyResult setYesterdayIncomeAmount(Long yesterdayIncomeAmount) {
            this.yesterdayIncomeAmount = yesterdayIncomeAmount;
            return this;
        }
        public Long getYesterdayIncomeAmount() {
            return this.yesterdayIncomeAmount;
        }

    }

}
