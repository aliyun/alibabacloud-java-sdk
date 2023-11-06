// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of compliance evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public java.util.List<ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateConfigRuleEvaluationStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationStatisticsResponseBody self = new ListAggregateConfigRuleEvaluationStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationStatisticsResponseBody setEvaluationResults(java.util.List<ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public java.util.List<ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListAggregateConfigRuleEvaluationStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

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

        public static ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults self = new ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setNonCompliantResourceCnt(Integer nonCompliantResourceCnt) {
            this.nonCompliantResourceCnt = nonCompliantResourceCnt;
            return this;
        }
        public Integer getNonCompliantResourceCnt() {
            return this.nonCompliantResourceCnt;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setNonCompliantRuleCnt(Integer nonCompliantRuleCnt) {
            this.nonCompliantRuleCnt = nonCompliantRuleCnt;
            return this;
        }
        public Integer getNonCompliantRuleCnt() {
            return this.nonCompliantRuleCnt;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setTotalResourceCnt(Integer totalResourceCnt) {
            this.totalResourceCnt = totalResourceCnt;
            return this;
        }
        public Integer getTotalResourceCnt() {
            return this.totalResourceCnt;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults setTotalRuleCnt(Integer totalRuleCnt) {
            this.totalRuleCnt = totalRuleCnt;
            return this;
        }
        public Integer getTotalRuleCnt() {
            return this.totalRuleCnt;
        }

    }

}
