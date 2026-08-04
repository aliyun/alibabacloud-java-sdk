// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgRelationCountAndQuotaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAgRelationCountAndQuotaResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("NullObject")
    public Boolean nullObject;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAgRelationCountAndQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgRelationCountAndQuotaResponseBody self = new QueryAgRelationCountAndQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgRelationCountAndQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgRelationCountAndQuotaResponseBody setData(QueryAgRelationCountAndQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAgRelationCountAndQuotaResponseBodyData getData() {
        return this.data;
    }

    public QueryAgRelationCountAndQuotaResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryAgRelationCountAndQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgRelationCountAndQuotaResponseBody setNullObject(Boolean nullObject) {
        this.nullObject = nullObject;
        return this;
    }
    public Boolean getNullObject() {
        return this.nullObject;
    }

    public QueryAgRelationCountAndQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgRelationCountAndQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAgRelationCountAndQuotaResponseBodyData extends TeaModel {
        @NameInMap("AccountCount")
        public Long accountCount;

        @NameInMap("Mpk")
        public String mpk;

        @NameInMap("NullObject")
        public Boolean nullObject;

        @NameInMap("Quota")
        public Integer quota;

        public static QueryAgRelationCountAndQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAgRelationCountAndQuotaResponseBodyData self = new QueryAgRelationCountAndQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAgRelationCountAndQuotaResponseBodyData setAccountCount(Long accountCount) {
            this.accountCount = accountCount;
            return this;
        }
        public Long getAccountCount() {
            return this.accountCount;
        }

        public QueryAgRelationCountAndQuotaResponseBodyData setMpk(String mpk) {
            this.mpk = mpk;
            return this;
        }
        public String getMpk() {
            return this.mpk;
        }

        public QueryAgRelationCountAndQuotaResponseBodyData setNullObject(Boolean nullObject) {
            this.nullObject = nullObject;
            return this;
        }
        public Boolean getNullObject() {
            return this.nullObject;
        }

        public QueryAgRelationCountAndQuotaResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

    }

}
