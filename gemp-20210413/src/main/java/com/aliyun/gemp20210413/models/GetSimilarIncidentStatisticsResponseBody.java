// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetSimilarIncidentStatisticsResponseBodyData data;

    // id of the request
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
        // 分派人id
        @NameInMap("assignUserId")
        public Long assignUserId;

        // 分派人
        @NameInMap("assignUserName")
        public String assignUserName;

        // 触发时间
        @NameInMap("createTime")
        public String createTime;

        // 持续时间
        @NameInMap("durationTime")
        public Long durationTime;

        // 触发原因
        @NameInMap("finishReason")
        public Long finishReason;

        // 触发原因描述
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        // 解决方案描述
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        // 解决方案
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        // 事件id
        @NameInMap("incidentId")
        public Long incidentId;

        // 事件编号
        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 事件名称
        @NameInMap("incidentTitle")
        public String incidentTitle;

        // 流转规则id
        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        // 流转规则名称
        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

        // 相似度
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
        // 数量
        @NameInMap("commitment")
        public Long commitment;

        // 日期
        @NameInMap("date")
        public String date;

        // 星期几
        @NameInMap("day")
        public Long day;

        // 月份
        @NameInMap("month")
        public Long month;

        // 相似事件列表
        @NameInMap("similarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents;

        // 周
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
        // 分派人id
        @NameInMap("assignUserId")
        public String assignUserId;

        // 分派人
        @NameInMap("assignUserName")
        public String assignUserName;

        // 触发时间
        @NameInMap("createTime")
        public String createTime;

        // 持续时间
        @NameInMap("durationTime")
        public Long durationTime;

        // 触发原因
        @NameInMap("finishReason")
        public Long finishReason;

        // 触发原因描述
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        // 解决方案描述
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        // 解决方案
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        // 事件id
        @NameInMap("incidentId")
        public Long incidentId;

        // 事件编号
        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 事件标题
        @NameInMap("incidentTitle")
        public String incidentTitle;

        // 流转规则id
        @NameInMap("relatedRouteRuleId")
        public Long relatedRouteRuleId;

        // 流转规则名称
        @NameInMap("relatedRouteRuleName")
        public String relatedRouteRuleName;

        // 相似度
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
        // 7天内相似事件数量
        @NameInMap("countInSevenDays")
        public Long countInSevenDays;

        // 6月内相似事件数量
        @NameInMap("countInSixMonths")
        public Long countInSixMonths;

        // 根据日期分类
        @NameInMap("dailySimilarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> dailySimilarIncidents;

        // id of the request
        @NameInMap("requestId")
        public String requestId;

        // topFiveIncidents
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
