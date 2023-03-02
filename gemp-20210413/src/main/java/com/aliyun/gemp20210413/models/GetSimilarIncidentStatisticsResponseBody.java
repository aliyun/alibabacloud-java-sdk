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
        @NameInMap("assignUserId")
        public Long assignUserId;

        @NameInMap("assignUserName")
        public String assignUserName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("durationTime")
        public Long durationTime;

        @NameInMap("finishReason")
        public Long finishReason;

        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        @NameInMap("incidentId")
        public Long incidentId;

        @NameInMap("incidentNumber")
        public String incidentNumber;

        @NameInMap("incidentTitle")
        public String incidentTitle;

        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

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
        @NameInMap("commitment")
        public Long commitment;

        @NameInMap("date")
        public String date;

        @NameInMap("day")
        public Long day;

        @NameInMap("month")
        public Long month;

        @NameInMap("similarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents;

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
        @NameInMap("assignUserId")
        public String assignUserId;

        @NameInMap("assignUserName")
        public String assignUserName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("durationTime")
        public Long durationTime;

        @NameInMap("finishReason")
        public Long finishReason;

        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        @NameInMap("incidentId")
        public Long incidentId;

        @NameInMap("incidentNumber")
        public String incidentNumber;

        @NameInMap("incidentTitle")
        public String incidentTitle;

        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

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
        @NameInMap("countInSevenDays")
        public Long countInSevenDays;

        @NameInMap("countInSixMonths")
        public Long countInSixMonths;

        @NameInMap("dailySimilarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> dailySimilarIncidents;

        /**
         * <p>id of the request</p>
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
