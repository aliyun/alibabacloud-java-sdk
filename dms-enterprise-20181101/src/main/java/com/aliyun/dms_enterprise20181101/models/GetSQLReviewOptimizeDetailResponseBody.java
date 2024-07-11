// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of optimization suggestions for SQL statements.</p>
     */
    @NameInMap("OptimizeDetail")
    public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetail optimizeDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The content of the SQL script.</p>
         * 
         * <strong>example:</strong>
         * <p>alter table xxx add index idx_xx(yyy);</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The purpose of the SQL script. The value is set to AddIndex.</p>
         * 
         * <strong>example:</strong>
         * <p>AddIndex</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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
        /**
         * <p>The comment that is specified when you create the SQL review rule. For more information, see <a href="https://help.aliyun.com/document_detail/194114.html">SQL review optimization</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx business rule: the query must have a where condition.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The optimization suggestion for the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>MUST_IMPROVE</strong>: The SQL statement must be improved.</li>
         * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statement contains potential issues.</li>
         * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you improve the SQL statement.</li>
         * <li><strong>USEDMSTOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
         * <li><strong>USEDMSDML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
         * <li><strong>TABLEINDEXSUGGEST</strong>: We recommend that you use SQL statements that use indexes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MUST_IMPROVE</p>
         */
        @NameInMap("Feedback")
        public String feedback;

        /**
         * <p>The review results.</p>
         */
        @NameInMap("Messages")
        public java.util.List<String> messages;

        /**
         * <p>The name of the rule. For more information, see <a href="https://help.aliyun.com/document_detail/194114.html">SQL review optimization</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT_SUGGEST_ASSIGN_WHERE</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the SQL review rule. Valid values:</p>
         * <ul>
         * <li><strong>REVIEW</strong>: a rule that is used to review SQL statements based on standards.</li>
         * <li><strong>OPTIMIZE</strong>: a rule that is used to provide optimization suggestions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REVIEW</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The SQL script for data changes.</p>
         */
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
        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>syntax error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether an error occurs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: An error occurs.</li>
         * <li><strong>false</strong>: No error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OccurError")
        public Boolean occurError;

        /**
         * <p>The review results based on rules.</p>
         */
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
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <p>The ID of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("InstanceId")
        public Integer instanceId;

        /**
         * <p>The quality of the SQL statement.</p>
         */
        @NameInMap("QualityResult")
        public GetSQLReviewOptimizeDetailResponseBodyOptimizeDetailQualityResult qualityResult;

        /**
         * <p>The key that is used to query the details of optimization suggestions.</p>
         * 
         * <strong>example:</strong>
         * <p>a57e54ec5433475ea3082d882fdb****</p>
         */
        @NameInMap("QueryKey")
        public String queryKey;

        /**
         * <p>The type of the SQL statement. Valid values: DELETE, UPDATE, and ALTER_TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
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
