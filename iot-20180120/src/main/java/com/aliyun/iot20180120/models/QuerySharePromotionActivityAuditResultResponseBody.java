// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySharePromotionActivityAuditResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySharePromotionActivityAuditResultResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySharePromotionActivityAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySharePromotionActivityAuditResultResponseBody self = new QuerySharePromotionActivityAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySharePromotionActivityAuditResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySharePromotionActivityAuditResultResponseBody setData(QuerySharePromotionActivityAuditResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySharePromotionActivityAuditResultResponseBodyData getData() {
        return this.data;
    }

    public QuerySharePromotionActivityAuditResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySharePromotionActivityAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySharePromotionActivityAuditResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySharePromotionActivityAuditResultResponseBodyData extends TeaModel {
        @NameInMap("AuditResult")
        public Integer auditResult;

        public static QuerySharePromotionActivityAuditResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySharePromotionActivityAuditResultResponseBodyData self = new QuerySharePromotionActivityAuditResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySharePromotionActivityAuditResultResponseBodyData setAuditResult(Integer auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public Integer getAuditResult() {
            return this.auditResult;
        }

    }

}
