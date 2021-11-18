// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

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

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound extends TeaModel {
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

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound extends TeaModel {
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

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setMaxWorkTime(String maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public String getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall extends TeaModel {
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

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setOneTransferCalls(Long oneTransferCalls) {
            this.oneTransferCalls = oneTransferCalls;
            return this;
        }
        public Long getOneTransferCalls() {
            return this.oneTransferCalls;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("Inbound")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Outbound")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall overall;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setInbound(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setOutbound(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setOverall(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList extends TeaModel {
        @NameInMap("AgentSummaryReport")
        public java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport> agentSummaryReport;

        public static ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList self = new ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList setAgentSummaryReport(java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport> agentSummaryReport) {
            this.agentSummaryReport = agentSummaryReport;
            return this;
        }
        public java.util.List<ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportListAgentSummaryReport> getAgentSummaryReport() {
            return this.agentSummaryReport;
        }

    }

    public static class ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList list;

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

        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReport setList(ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListAgentSummaryReportsSinceMidnightResponseBodyPagedAgentSummaryReportList getList() {
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
