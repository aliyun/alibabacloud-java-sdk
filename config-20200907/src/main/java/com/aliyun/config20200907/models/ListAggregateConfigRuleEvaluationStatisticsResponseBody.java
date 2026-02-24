// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    @NameInMap("EvaluationResults")
    public java.util.List<ListAggregateConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults;

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
        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("NonCompliantResourceCnt")
        public Integer nonCompliantResourceCnt;

        @NameInMap("NonCompliantRuleCnt")
        public Integer nonCompliantRuleCnt;

        @NameInMap("StatisticDate")
        public String statisticDate;

        @NameInMap("TotalResourceCnt")
        public Integer totalResourceCnt;

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
