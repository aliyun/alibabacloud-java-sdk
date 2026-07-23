// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestResultsResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ListDataAgentAccuracyTestResultsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>no use</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>no use</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataAgentAccuracyTestResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestResultsResponseBody self = new ListDataAgentAccuracyTestResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestResultsResponseBody setData(ListDataAgentAccuracyTestResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentAccuracyTestResultsResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentAccuracyTestResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataAgentAccuracyTestResultsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The ID of the accuracy test task.</p>
         * 
         * <strong>example:</strong>
         * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestTaskId")
        public String accuracyTestTaskId;

        /**
         * <p>The actual answer from the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>在公司历史职位记录中，共有97,750名员工曾拥有Senior Engineer头衔。</p>
         */
        @NameInMap("AgentResult")
        public String agentResult;

        @NameInMap("AgentSql")
        public String agentSql;

        /**
         * <p>The expected answer.</p>
         * 
         * <strong>example:</strong>
         * <p>97750</p>
         */
        @NameInMap("AnswerResult")
        public String answerResult;

        /**
         * <p>The expected SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT COUNT(*) FROM titles WHERE title = \&quot;Senior Engineer\&quot;;</p>
         */
        @NameInMap("AnswerSql")
        public String answerSql;

        /**
         * <p>The AI evaluation result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTrue")
        public Boolean isTrue;

        /**
         * <p>The test question.</p>
         * 
         * <strong>example:</strong>
         * <p>拥有Senior Engineer头衔的员工有多少人？</p>
         */
        @NameInMap("Question")
        public String question;

        /**
         * <p>The error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL 中不应该使用COUNT(DISTINCT)</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The improvement suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>在问题中描述清楚是否需去重</p>
         */
        @NameInMap("Recommendation")
        public String recommendation;

        /**
         * <p>The result ID.</p>
         * 
         * <strong>example:</strong>
         * <p>at-emhnbwewfngrxxxxxxxxxx</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f1eb8728-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        @NameInMap("SubtaskId")
        public String subtaskId;

        public static ListDataAgentAccuracyTestResultsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentAccuracyTestResultsResponseBodyDataContent self = new ListDataAgentAccuracyTestResultsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setAccuracyTestTaskId(String accuracyTestTaskId) {
            this.accuracyTestTaskId = accuracyTestTaskId;
            return this;
        }
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setAgentResult(String agentResult) {
            this.agentResult = agentResult;
            return this;
        }
        public String getAgentResult() {
            return this.agentResult;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setAgentSql(String agentSql) {
            this.agentSql = agentSql;
            return this;
        }
        public String getAgentSql() {
            return this.agentSql;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setAnswerResult(String answerResult) {
            this.answerResult = answerResult;
            return this;
        }
        public String getAnswerResult() {
            return this.answerResult;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setAnswerSql(String answerSql) {
            this.answerSql = answerSql;
            return this;
        }
        public String getAnswerSql() {
            return this.answerSql;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setIsTrue(Boolean isTrue) {
            this.isTrue = isTrue;
            return this;
        }
        public Boolean getIsTrue() {
            return this.isTrue;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setRecommendation(String recommendation) {
            this.recommendation = recommendation;
            return this;
        }
        public String getRecommendation() {
            return this.recommendation;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyDataContent setSubtaskId(String subtaskId) {
            this.subtaskId = subtaskId;
            return this;
        }
        public String getSubtaskId() {
            return this.subtaskId;
        }

    }

    public static class ListDataAgentAccuracyTestResultsResponseBodyData extends TeaModel {
        /**
         * <p>The accuracy rate.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("AccuracyRate")
        public Double accuracyRate;

        /**
         * <p>The ID of the accuracy test task.</p>
         * 
         * <strong>example:</strong>
         * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestTaskId")
        public String accuracyTestTaskId;

        /**
         * <p>The data content.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListDataAgentAccuracyTestResultsResponseBodyDataContent> content;

        /**
         * <p>The number of test cases that passed evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("CorrectCount")
        public Long correctCount;

        @NameInMap("FailedCount")
        public String failedCount;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PendingCount")
        public String pendingCount;

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalElements")
        public Integer totalElements;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListDataAgentAccuracyTestResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentAccuracyTestResultsResponseBodyData self = new ListDataAgentAccuracyTestResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setAccuracyRate(Double accuracyRate) {
            this.accuracyRate = accuracyRate;
            return this;
        }
        public Double getAccuracyRate() {
            return this.accuracyRate;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setAccuracyTestTaskId(String accuracyTestTaskId) {
            this.accuracyTestTaskId = accuracyTestTaskId;
            return this;
        }
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setContent(java.util.List<ListDataAgentAccuracyTestResultsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDataAgentAccuracyTestResultsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setCorrectCount(Long correctCount) {
            this.correctCount = correctCount;
            return this;
        }
        public Long getCorrectCount() {
            return this.correctCount;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setPendingCount(String pendingCount) {
            this.pendingCount = pendingCount;
            return this;
        }
        public String getPendingCount() {
            return this.pendingCount;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public ListDataAgentAccuracyTestResultsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
