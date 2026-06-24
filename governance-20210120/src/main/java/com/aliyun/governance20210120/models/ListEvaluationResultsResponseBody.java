// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>Member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD57329E-131A-59F4-8746-E1CD8D7B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Evaluation results, including overall evaluation status and sub-item evaluation results.</p>
     */
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

    public static class ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary extends TeaModel {
        /**
         * <p>Number of non-compliant accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NonCompliant")
        public Integer nonCompliant;

        public static ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary self = new ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary setNonCompliant(Integer nonCompliant) {
            this.nonCompliant = nonCompliant;
            return this;
        }
        public Integer getNonCompliant() {
            return this.nonCompliant;
        }

    }

    public static class ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation extends TeaModel {
        /**
         * <p>Remediation template ID.</p>
         */
        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        public static ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation self = new ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation setRemediationTemplateId(String remediationTemplateId) {
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

    }

    public static class ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsInsightEnableFailed</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Unable to enable ECS Insight due to a server error.</p>
         */
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
         * <p>Number of non-compliant resources.</p>
         * 
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
        /**
         * <p>Evaluation item account assessment summary.</p>
         */
        @NameInMap("AccountSummary")
        public ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary accountSummary;

        /**
         * <p>List of available remediations.</p>
         */
        @NameInMap("AvailableRemediation")
        public java.util.List<ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation> availableRemediation;

        /**
         * <p>Error information.</p>
         * <blockquote>
         * <p>This error information is returned when <code>Status</code> is <code>Failed</code>.</p>
         * </blockquote>
         */
        @NameInMap("ErrorInfo")
        public ListEvaluationResultsResponseBodyResultsMetricResultsErrorInfo errorInfo;

        /**
         * <p>Individual evaluation item end time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-13T03:34:02Z</p>
         */
        @NameInMap("EvaluationTime")
        public String evaluationTime;

        /**
         * <p>Evaluation item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r7xdcu****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Potential score increase.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("PotentialScoreIncrease")
        public Double potentialScoreIncrease;

        /**
         * <p>Evaluation item resource assessment summary.</p>
         */
        @NameInMap("ResourcesSummary")
        public ListEvaluationResultsResponseBodyResultsMetricResultsResourcesSummary resourcesSummary;

        /**
         * <p>Evaluation item resource compliance rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.67</p>
         */
        @NameInMap("Result")
        public Double result;

        /**
         * <p>Evaluation risk level. Valid values:</p>
         * <ul>
         * <li>Error: High risk.</li>
         * <li>Warning: Medium risk.</li>
         * <li>None: No risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <p>Individual evaluation item status. Valid values:</p>
         * <ul>
         * <li>Running: Evaluation in progress.</li>
         * <li>Finished: Evaluation completed.</li>
         * <li>Failed: Evaluation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEvaluationResultsResponseBodyResultsMetricResults build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsResponseBodyResultsMetricResults self = new ListEvaluationResultsResponseBodyResultsMetricResults();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setAccountSummary(ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary accountSummary) {
            this.accountSummary = accountSummary;
            return this;
        }
        public ListEvaluationResultsResponseBodyResultsMetricResultsAccountSummary getAccountSummary() {
            return this.accountSummary;
        }

        public ListEvaluationResultsResponseBodyResultsMetricResults setAvailableRemediation(java.util.List<ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation> availableRemediation) {
            this.availableRemediation = availableRemediation;
            return this;
        }
        public java.util.List<ListEvaluationResultsResponseBodyResultsMetricResultsAvailableRemediation> getAvailableRemediation() {
            return this.availableRemediation;
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

        public ListEvaluationResultsResponseBodyResultsMetricResults setPotentialScoreIncrease(Double potentialScoreIncrease) {
            this.potentialScoreIncrease = potentialScoreIncrease;
            return this;
        }
        public Double getPotentialScoreIncrease() {
            return this.potentialScoreIncrease;
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
         * <p>Overall evaluation end time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-13T03:35:00Z</p>
         */
        @NameInMap("EvaluationTime")
        public String evaluationTime;

        /**
         * <p>Evaluation results.</p>
         */
        @NameInMap("MetricResults")
        public java.util.List<ListEvaluationResultsResponseBodyResultsMetricResults> metricResults;

        /**
         * <p>Overall evaluation status. Valid values:</p>
         * <ul>
         * <li>Running: Evaluation in progress.</li>
         * <li>Finished: Evaluation completed.</li>
         * <li>Failed: Evaluation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Overall score.</p>
         * 
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
