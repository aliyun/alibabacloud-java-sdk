// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetSimilarIncidentStatisticsResponseBodyData data;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7C56D225-7C34-40BB-9624-C8BA449260E6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSimilarIncidentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarIncidentStatisticsResponseBody self = new GetSimilarIncidentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimilarIncidentStatisticsResponseBody setData(GetSimilarIncidentStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSimilarIncidentStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetSimilarIncidentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>433</p>
         */
        @NameInMap("assignUserId")
        public Long assignUserId;

        /**
         * <strong>example:</strong>
         * <p>张老三</p>
         */
        @NameInMap("assignUserName")
        public String assignUserName;

        /**
         * <strong>example:</strong>
         * <p>2021-09-09 09:09:09</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>6789765678</p>
         */
        @NameInMap("durationTime")
        public Long durationTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("finishReason")
        public Long finishReason;

        /**
         * <strong>example:</strong>
         * <p>xx原因</p>
         */
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        /**
         * <strong>example:</strong>
         * <p>xxx方案</p>
         */
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        /**
         * <strong>example:</strong>
         * <p>5435</p>
         */
        @NameInMap("incidentId")
        public Long incidentId;

        /**
         * <strong>example:</strong>
         * <p>I234432</p>
         */
        @NameInMap("incidentNumber")
        public String incidentNumber;

        /**
         * <strong>example:</strong>
         * <p>线性代数发多少</p>
         */
        @NameInMap("incidentTitle")
        public String incidentTitle;

        /**
         * <strong>example:</strong>
         * <p>334</p>
         */
        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        /**
         * <strong>example:</strong>
         * <p>xxx规则</p>
         */
        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

        /**
         * <strong>example:</strong>
         * <p>1003.567</p>
         */
        @NameInMap("similarScore")
        public String similarScore;

        public static GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setFinishReason(Long finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public Long getFinishReason() {
            return this.finishReason;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setFinishReasonDescription(String finishReasonDescription) {
            this.finishReasonDescription = finishReasonDescription;
            return this;
        }
        public String getFinishReasonDescription() {
            return this.finishReasonDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setFinishSolutionDescription(String finishSolutionDescription) {
            this.finishSolutionDescription = finishSolutionDescription;
            return this;
        }
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setIncidentFinishSolution(Long incidentFinishSolution) {
            this.incidentFinishSolution = incidentFinishSolution;
            return this;
        }
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setRelatedRouteRuleId(Long relatedRouteRuleId) {
            this.relatedRouteRuleId = relatedRouteRuleId;
            return this;
        }
        public Long getRelatedRouteRuleId() {
            return this.relatedRouteRuleId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setRelatedRouteRuleName(String relatedRouteRuleName) {
            this.relatedRouteRuleName = relatedRouteRuleName;
            return this;
        }
        public String getRelatedRouteRuleName() {
            return this.relatedRouteRuleName;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setSimilarScore(String similarScore) {
            this.similarScore = similarScore;
            return this;
        }
        public String getSimilarScore() {
            return this.similarScore;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("commitment")
        public Long commitment;

        /**
         * <strong>example:</strong>
         * <p>2021-03-07</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("day")
        public Long day;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("month")
        public Long month;

        @NameInMap("similarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("week")
        public String week;

        public static GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setCommitment(Long commitment) {
            this.commitment = commitment;
            return this;
        }
        public Long getCommitment() {
            return this.commitment;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setDay(Long day) {
            this.day = day;
            return this;
        }
        public Long getDay() {
            return this.day;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setMonth(Long month) {
            this.month = month;
            return this;
        }
        public Long getMonth() {
            return this.month;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setSimilarIncidents(java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents) {
            this.similarIncidents = similarIncidents;
            return this;
        }
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> getSimilarIncidents() {
            return this.similarIncidents;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setWeek(String week) {
            this.week = week;
            return this;
        }
        public String getWeek() {
            return this.week;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("assignUserId")
        public String assignUserId;

        /**
         * <strong>example:</strong>
         * <p>张老三</p>
         */
        @NameInMap("assignUserName")
        public String assignUserName;

        /**
         * <strong>example:</strong>
         * <p>2021-09-09 09:09:09</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>6787678767</p>
         */
        @NameInMap("durationTime")
        public Long durationTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("finishReason")
        public Long finishReason;

        /**
         * <strong>example:</strong>
         * <p>xxxx原因</p>
         */
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        /**
         * <strong>example:</strong>
         * <p>xxx方案</p>
         */
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("incidentId")
        public Long incidentId;

        /**
         * <strong>example:</strong>
         * <p>I34324</p>
         */
        @NameInMap("incidentNumber")
        public String incidentNumber;

        /**
         * <strong>example:</strong>
         * <p>xxx事件</p>
         */
        @NameInMap("incidentTitle")
        public String incidentTitle;

        /**
         * <strong>example:</strong>
         * <p>4343</p>
         */
        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

        /**
         * <strong>example:</strong>
         * <p>1992.21</p>
         */
        @NameInMap("similarScore")
        public String similarScore;

        public static GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setAssignUserId(String assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public String getAssignUserId() {
            return this.assignUserId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setFinishReason(Long finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public Long getFinishReason() {
            return this.finishReason;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setFinishReasonDescription(String finishReasonDescription) {
            this.finishReasonDescription = finishReasonDescription;
            return this;
        }
        public String getFinishReasonDescription() {
            return this.finishReasonDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setFinishSolutionDescription(String finishSolutionDescription) {
            this.finishSolutionDescription = finishSolutionDescription;
            return this;
        }
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setIncidentFinishSolution(Long incidentFinishSolution) {
            this.incidentFinishSolution = incidentFinishSolution;
            return this;
        }
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setRelatedRouteRuleId(Long relatedRouteRuleId) {
            this.relatedRouteRuleId = relatedRouteRuleId;
            return this;
        }
        public Long getRelatedRouteRuleId() {
            return this.relatedRouteRuleId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setRelatedRouteRuleName(String relatedRouteRuleName) {
            this.relatedRouteRuleName = relatedRouteRuleName;
            return this;
        }
        public String getRelatedRouteRuleName() {
            return this.relatedRouteRuleName;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setSimilarScore(String similarScore) {
            this.similarScore = similarScore;
            return this;
        }
        public String getSimilarScore() {
            return this.similarScore;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("countInSevenDays")
        public Long countInSevenDays;

        /**
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("countInSixMonths")
        public Long countInSixMonths;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dailySimilarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> dailySimilarIncidents;

        /**
         * <p>id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>uyihg6789</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>topFiveIncidents</p>
         */
        @NameInMap("topFiveIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> topFiveIncidents;

        public static GetSimilarIncidentStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyData self = new GetSimilarIncidentStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyData setCountInSevenDays(Long countInSevenDays) {
            this.countInSevenDays = countInSevenDays;
            return this;
        }
        public Long getCountInSevenDays() {
            return this.countInSevenDays;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setCountInSixMonths(Long countInSixMonths) {
            this.countInSixMonths = countInSixMonths;
            return this;
        }
        public Long getCountInSixMonths() {
            return this.countInSixMonths;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setDailySimilarIncidents(java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> dailySimilarIncidents) {
            this.dailySimilarIncidents = dailySimilarIncidents;
            return this;
        }
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> getDailySimilarIncidents() {
            return this.dailySimilarIncidents;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setTopFiveIncidents(java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> topFiveIncidents) {
            this.topFiveIncidents = topFiveIncidents;
            return this;
        }
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> getTopFiveIncidents() {
            return this.topFiveIncidents;
        }

    }

}
