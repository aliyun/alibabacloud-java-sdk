// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <strong>example:</strong>
     * <p>BD57329E-131A-59F4-8746-E1CD8D7B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public ListEvaluationResultsResponseBodyResults results;

    public static ListEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationResultsResponseBody self = new ListEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationResultsResponseBody setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluationResultsResponseBody setResults(ListEvaluationResultsResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public ListEvaluationResultsResponseBodyResults getResults() {
        return this.results;
    }

    public static class ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo self = new ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NonCompliant")
        public Integer nonCompliant;

        public static ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary self = new ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary setNonCompliant(Integer nonCompliant) {
            this.nonCompliant = nonCompliant;
            return this;
        }
        public Integer getNonCompliant() {
            return this.nonCompliant;
        }

    }

    public static class ListEvaluationResultsResponseBodyResultsMetricResults extends TeaModel {
        @NameInMap("ErrorInfo")
        public ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo errorInfo;

        /**
         * <strong>example:</strong>
         * <p>2023-12-13T03:34:02Z</p>
         */
        @NameInMap("EvaluationTime")
        public String evaluationTime;

        /**
         * <strong>example:</strong>
         * <p>r7xdcu****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("ResourcesSummary")
        public ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary resourcesSummary;

        /**
         * <strong>example:</strong>
         * <p>0.67</p>
         */
        @NameInMap("Result")
        public Double result;

        /**
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEvaluationResultsResponseBodyResultsMetricResults build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResults self = new ListEvaluationResultsResponseBodyResultsMetricResults();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setErrorInfo(ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setEvaluationTime(String evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setResourcesSummary(ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary resourcesSummary) {
            this.resourcesSummary = resourcesSummary;
            return this;
        }
        public ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary getResourcesSummary() {
            return this.resourcesSummary;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setResult(Double result) {
            this.result = result;
            return this;
        }
        public Double getResult() {
            return this.result;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListEvaluationResultsResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-12-13T03:35:00Z</p>
         */
        @NameInMap("EvaluationTime")
        public String evaluationTime;

        @NameInMap("MetricResults")
        public java.util.List<ListEvaluationResultsResponseBodyResultsMetricResults> metricResults;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>0.6453</p>
         */
        @NameInMap("TotalScore")
        public Double totalScore;

        public static ListEvaluationResultsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResults self = new ListEvaluationResultsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResults setEvaluationTime(String evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        public ListEvaluationResultsResponseBodyResults setMetricResults(java.util.List<ListEvaluationResultsResponseBodyResultsMetricResults> metricResults) {
            this.metricResults = metricResults;
            return this;
        }
        public java.util.List<ListEvaluationResultsResponseBodyResultsMetricResults> getMetricResults() {
            return this.metricResults;
        }

        public ListEvaluationResultsResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEvaluationResultsResponseBodyResults setTotalScore(Double totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Double getTotalScore() {
            return this.totalScore;
        }

    }

}
