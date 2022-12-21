// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The details of optimization suggestions for SQL statements.
    @NameInMap("OptimizeDetail")
    public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail optimizeDetail;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
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
        // The content of the SQL script.
        @NameInMap("Content")
        public String content;

        // The purpose of the SQL script. The value is set to AddIndex.
        @NameInMap("OpType")
        public String opType;

        // The name of the table.
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
        // The comment that is specified when you create the SQL review rule. For more information, see [SQL review optimization](~~194114~~).
        @NameInMap("Comments")
        public String comments;

        // The optimization suggestion for the SQL statement. Valid values:
        // 
        // *   **MUST_IMPROVE**: The SQL statement must be improved.
        // *   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.
        // *   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.
        // *   **USEDMSTOOLKIT**: We recommend that you change schemas without locking tables.
        // *   **USEDMSDML_UNLOCK**: We recommend that you change data without locking tables.
        // *   **TABLEINDEXSUGGEST**: We recommend that you use SQL statements that use indexes.
        @NameInMap("Feedback")
        public String feedback;

        // The review results.
        @NameInMap("Messages")
        public java.util.List<String> messages;

        // The name of the rule. For more information, see [SQL review optimization](~~194114~~).
        @NameInMap("RuleName")
        public String ruleName;

        // The type of the SQL review rule. Valid values:
        // 
        // *   **REVIEW**: a rule that is used to review SQL statements based on standards.
        // *   **OPTIMIZE**: a rule that is used to provide optimization suggestions.
        @NameInMap("RuleType")
        public String ruleType;

        // The SQL script for data changes.
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
        // The error message returned.
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // Indicates whether an error occurs. Valid values:
        // 
        // *   **true**: An error occurs.
        // *   **false**: No error occurs.
        @NameInMap("OccurError")
        public Boolean occurError;

        // The review results based on rules.
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
        // The ID of the database.
        @NameInMap("DbId")
        public Integer dbId;

        // The ID of the instance to which the database belongs.
        @NameInMap("InstanceId")
        public Integer instanceId;

        // The quality of the SQL statement.
        @NameInMap("QualityResult")
        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult qualityResult;

        // The key that is used to query the details of optimization suggestions.
        @NameInMap("QueryKey")
        public String queryKey;

        // The type of the SQL statement. Valid values: DELETE, UPDATE, and ALTER_TABLE.
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
