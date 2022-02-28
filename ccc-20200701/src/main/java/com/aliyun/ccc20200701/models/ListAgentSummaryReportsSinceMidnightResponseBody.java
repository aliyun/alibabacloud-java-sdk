// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsSinceMidnightResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedAgentSummaryReport")
    public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentSummaryReportsSinceMidnightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsSinceMidnightResponseBody self = new ListAgentSummaryReportsSinceMidnightResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setPagedAgentSummaryReport(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport) {
        this.pagedAgentSummaryReport = pagedAgentSummaryReport;
        return this;
    }
    public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport getPagedAgentSummaryReport() {
        return this.pagedAgentSummaryReport;
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentSummaryReportsSinceMidnightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound extends TeaModel {
        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound extends TeaModel {
        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("AverageDialingTime")
        public Long averageDialingTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public String maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setMaxWorkTime(String maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public String getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall extends TeaModel {
        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        @NameInMap("OneTransferCalls")
        public Long oneTransferCalls;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setOneTransferCalls(Long oneTransferCalls) {
            this.oneTransferCalls = oneTransferCalls;
            return this;
        }
        public Long getOneTransferCalls() {
            return this.oneTransferCalls;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("Inbound")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Outbound")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound outbound;

        @NameInMap("Overall")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall overall;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setInbound(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListInbound getInbound() {
            return this.inbound;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setOutbound(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOutbound getOutbound() {
            return this.outbound;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setOverall(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListOverall getOverall() {
            return this.overall;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport setList(java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList> getList() {
            return this.list;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
