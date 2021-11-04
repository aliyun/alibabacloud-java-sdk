// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("OptimizeDetail")
    public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail optimizeDetail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSQLReviewOptimizeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewOptimizeDetailResponseBody self = new GetSQLReviewOptimizeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewOptimizeDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSQLReviewOptimizeDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSQLReviewOptimizeDetailResponseBody setOptimizeDetail(GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail optimizeDetail) {
        this.optimizeDetail = optimizeDetail;
        return this;
    }
    public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail getOptimizeDetail() {
        return this.optimizeDetail;
    }

    public GetSQLReviewOptimizeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSQLReviewOptimizeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("TableName")
        public String tableName;

        public static GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts self = new GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("Messages")
        public java.util.List<String> messages;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Scripts")
        public java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts> scripts;

        public static GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults self = new GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setMessages(java.util.List<String> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<String> getMessages() {
            return this.messages;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults setScripts(java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts> scripts) {
            this.scripts = scripts;
            return this;
        }
        public java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResultsScripts> getScripts() {
            return this.scripts;
        }

    }

    public static class GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("OccurError")
        public Boolean occurError;

        @NameInMap("Results")
        public java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults> results;

        public static GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult self = new GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult setOccurError(Boolean occurError) {
            this.occurError = occurError;
            return this;
        }
        public Boolean getOccurError() {
            return this.occurError;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult setResults(java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResultResults> getResults() {
            return this.results;
        }

    }

    public static class GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail extends TeaModel {
        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("QualityResult")
        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult qualityResult;

        @NameInMap("QueryKey")
        public String queryKey;

        @NameInMap("SqlType")
        public String sqlType;

        public static GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail self = new GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail setQualityResult(GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult qualityResult) {
            this.qualityResult = qualityResult;
            return this;
        }
        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult getQualityResult() {
            return this.qualityResult;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail setQueryKey(String queryKey) {
            this.queryKey = queryKey;
            return this;
        }
        public String getQueryKey() {
            return this.queryKey;
        }

        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
