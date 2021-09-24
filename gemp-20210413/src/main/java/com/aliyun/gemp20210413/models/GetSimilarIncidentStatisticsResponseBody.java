// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsResponseBody extends TeaModel {
    // id of the request
    @NameInMap("requestId")
    public String requestId;

    // data
    @NameInMap("data")
    public GetSimilarIncidentStatisticsResponseBodyData data;

    public static GetSimilarIncidentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarIncidentStatisticsResponseBody self = new GetSimilarIncidentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimilarIncidentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSimilarIncidentStatisticsResponseBody setData(GetSimilarIncidentStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSimilarIncidentStatisticsResponseBodyData getData() {
        return this.data;
    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents extends TeaModel {
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

        // 触发原因
        @NameInMap("finishReason")
        public Long finishReason;

        // 触发原因描述
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        // 解决方案
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        // 解决方案描述
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        // 触发时间
        @NameInMap("createTime")
        public String createTime;

        // 分派人id
        @NameInMap("assignUserId")
        public String assignUserId;

        // 分派人
        @NameInMap("assignUserName")
        public String assignUserName;

        // 持续时间
        @NameInMap("durationTime")
        public Long durationTime;

        public static GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents();
            return TeaModel.build(map, self);
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

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setIncidentFinishSolution(Long incidentFinishSolution) {
            this.incidentFinishSolution = incidentFinishSolution;
            return this;
        }
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setFinishSolutionDescription(String finishSolutionDescription) {
            this.finishSolutionDescription = finishSolutionDescription;
            return this;
        }
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents extends TeaModel {
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

        // 触发原因
        @NameInMap("finishReason")
        public Long finishReason;

        // 触发原因描述
        @NameInMap("finishReasonDescription")
        public String finishReasonDescription;

        // 解决方案
        @NameInMap("incidentFinishSolution")
        public Long incidentFinishSolution;

        // 解决方案描述
        @NameInMap("finishSolutionDescription")
        public String finishSolutionDescription;

        // 触发时间
        @NameInMap("createTime")
        public String createTime;

        // 分派人
        @NameInMap("assignUserName")
        public String assignUserName;

        // 分派人id
        @NameInMap("assignUserId")
        public Long assignUserId;

        // 持续时间
        @NameInMap("durationTime")
        public Long durationTime;

        public static GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents();
            return TeaModel.build(map, self);
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

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setIncidentFinishSolution(Long incidentFinishSolution) {
            this.incidentFinishSolution = incidentFinishSolution;
            return this;
        }
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setFinishSolutionDescription(String finishSolutionDescription) {
            this.finishSolutionDescription = finishSolutionDescription;
            return this;
        }
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents extends TeaModel {
        // 日期
        @NameInMap("date")
        public String date;

        // 数量
        @NameInMap("commitment")
        public Long commitment;

        // 月份
        @NameInMap("month")
        public Long month;

        // 周
        @NameInMap("week")
        public String week;

        // 星期几
        @NameInMap("day")
        public Long day;

        // 相似事件列表
        @NameInMap("similarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents;

        public static GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents self = new GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setCommitment(Long commitment) {
            this.commitment = commitment;
            return this;
        }
        public Long getCommitment() {
            return this.commitment;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setMonth(Long month) {
            this.month = month;
            return this;
        }
        public Long getMonth() {
            return this.month;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setWeek(String week) {
            this.week = week;
            return this;
        }
        public String getWeek() {
            return this.week;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setDay(Long day) {
            this.day = day;
            return this;
        }
        public Long getDay() {
            return this.day;
        }

        public GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents setSimilarIncidents(java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> similarIncidents) {
            this.similarIncidents = similarIncidents;
            return this;
        }
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidentsSimilarIncidents> getSimilarIncidents() {
            return this.similarIncidents;
        }

    }

    public static class GetSimilarIncidentStatisticsResponseBodyData extends TeaModel {
        // topFiveIncidents
        @NameInMap("topFiveIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> topFiveIncidents;

        // 6月内相似事件数量
        @NameInMap("countInSixMonths")
        public Long countInSixMonths;

        // 7天内相似事件数量
        @NameInMap("countInSevenDays")
        public Long countInSevenDays;

        // 根据日期分类
        @NameInMap("dailySimilarIncidents")
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataDailySimilarIncidents> dailySimilarIncidents;

        // id of the request
        @NameInMap("requestId")
        public String requestId;

        public static GetSimilarIncidentStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarIncidentStatisticsResponseBodyData self = new GetSimilarIncidentStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSimilarIncidentStatisticsResponseBodyData setTopFiveIncidents(java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> topFiveIncidents) {
            this.topFiveIncidents = topFiveIncidents;
            return this;
        }
        public java.util.List<GetSimilarIncidentStatisticsResponseBodyDataTopFiveIncidents> getTopFiveIncidents() {
            return this.topFiveIncidents;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setCountInSixMonths(Long countInSixMonths) {
            this.countInSixMonths = countInSixMonths;
            return this;
        }
        public Long getCountInSixMonths() {
            return this.countInSixMonths;
        }

        public GetSimilarIncidentStatisticsResponseBodyData setCountInSevenDays(Long countInSevenDays) {
            this.countInSevenDays = countInSevenDays;
            return this;
        }
        public Long getCountInSevenDays() {
            return this.countInSevenDays;
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

    }

}
