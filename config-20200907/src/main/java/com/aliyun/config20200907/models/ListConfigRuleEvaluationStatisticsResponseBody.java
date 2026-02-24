// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    @NameInMap("EvaluationResults")
    public java.util.List<ListConfigRuleEvaluationStatisticsResponseBodyEvaluationResults> evaluationResults;

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
