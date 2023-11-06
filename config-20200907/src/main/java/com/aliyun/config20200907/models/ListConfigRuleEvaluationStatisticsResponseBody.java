// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of compliance evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public java.util.List<ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigRuleEvaluationStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleEvaluationStatisticsResponseBody self = new ListConfigRuleEvaluationStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleEvaluationStatisticsResponseBody setEvaluationResults(java.util.List<ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public java.util.List<ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListConfigRuleEvaluationStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The number of resources that are evaluated as non-compliant.</p>
         */
        @NameInMap("NonCompliantResourceCnt")
        public Integer nonCompliantResourceCnt;

        /**
         * <p>The number of rules based on which resources are evaluated as non-compliant.</p>
         */
        @NameInMap("NonCompliantRuleCnt")
        public Integer nonCompliantRuleCnt;

        /**
         * <p>The date on which the statistics are obtained.</p>
         */
        @NameInMap("StatisticDate")
        public String statisticDate;

        /**
         * <p>The total number of resources.</p>
         */
        @NameInMap("TotalResourceCnt")
        public Integer totalResourceCnt;

        /**
         * <p>The total number of rules.</p>
         */
        @NameInMap("TotalRuleCnt")
        public Integer totalRuleCnt;

        public static ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults self = new ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setNonCompliantResourceCnt(Integer nonCompliantResourceCnt) {
            this.nonCompliantResourceCnt = nonCompliantResourceCnt;
            return this;
        }
        public Integer getNonCompliantResourceCnt() {
            return this.nonCompliantResourceCnt;
        }

        public ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setNonCompliantRuleCnt(Integer nonCompliantRuleCnt) {
            this.nonCompliantRuleCnt = nonCompliantRuleCnt;
            return this;
        }
        public Integer getNonCompliantRuleCnt() {
            return this.nonCompliantRuleCnt;
        }

        public ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setTotalResourceCnt(Integer totalResourceCnt) {
            this.totalResourceCnt = totalResourceCnt;
            return this;
        }
        public Integer getTotalResourceCnt() {
            return this.totalResourceCnt;
        }

        public ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setTotalRuleCnt(Integer totalRuleCnt) {
            this.totalRuleCnt = totalRuleCnt;
            return this;
        }
        public Integer getTotalRuleCnt() {
            return this.totalRuleCnt;
        }

    }

}
