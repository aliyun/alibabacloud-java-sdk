// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySharePromotionActivityAuditResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speech.InvalidIotInstanceId</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySharePromotionActivityAuditResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid instance ID.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
