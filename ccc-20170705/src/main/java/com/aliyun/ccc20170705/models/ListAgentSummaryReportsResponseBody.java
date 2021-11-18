// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedAgentSummaryReport")
    public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentSummaryReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsResponseBody self = new ListAgentSummaryReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentSummaryReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentSummaryReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentSummaryReportsResponseBody setPagedAgentSummaryReport(ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport) {
        this.pagedAgentSummaryReport = pagedAgentSummaryReport;
        return this;
    }
    public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport getPagedAgentSummaryReport() {
        return this.pagedAgentSummaryReport;
    }

    public ListAgentSummaryReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentSummaryReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound extends TeaModel {
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

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound extends TeaModel {
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

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxWorkTime(String maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public String getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall extends TeaModel {
        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("FirstLogInTime")
        public String firstLogInTime;

        @NameInMap("LastLogOutTime")
        public String lastLogOutTime;

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

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setFirstLogInTime(String firstLogInTime) {
            this.firstLogInTime = firstLogInTime;
            return this;
        }
        public String getFirstLogInTime() {
            return this.firstLogInTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setLastLogOutTime(String lastLogOutTime) {
            this.lastLogOutTime = lastLogOutTime;
            return this;
        }
        public String getLastLogOutTime() {
            return this.lastLogOutTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setOneTransferCalls(Long oneTransferCalls) {
            this.oneTransferCalls = oneTransferCalls;
            return this;
        }
        public Long getOneTransferCalls() {
            return this.oneTransferCalls;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("Inbound")
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Outbound")
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall overall;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setInbound(ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setOutbound(ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setOverall(ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList extends TeaModel {
        @NameInMap("AgentSummaryReport")
        public java.util.List<ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport> agentSummaryReport;

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList setAgentSummaryReport(java.util.List<ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport> agentSummaryReport) {
            this.agentSummaryReport = agentSummaryReport;
            return this;
        }
        public java.util.List<ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportListAgentSummaryReport> getAgentSummaryReport() {
            return this.agentSummaryReport;
        }

    }

    public static class ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport self = new ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport setList(ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReportList getList() {
            return this.list;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentSummaryReportsResponseBodyPagedAgentSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
