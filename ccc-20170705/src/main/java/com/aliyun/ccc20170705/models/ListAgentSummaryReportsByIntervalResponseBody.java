// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsByIntervalResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PagedAgentSummaryReport")
    public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentSummaryReportsByIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsByIntervalResponseBody self = new ListAgentSummaryReportsByIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsByIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentSummaryReportsByIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentSummaryReportsByIntervalResponseBody setPagedAgentSummaryReport(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport pagedAgentSummaryReport) {
        this.pagedAgentSummaryReport = pagedAgentSummaryReport;
        return this;
    }
    public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport getPagedAgentSummaryReport() {
        return this.pagedAgentSummaryReport;
    }

    public ListAgentSummaryReportsByIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentSummaryReportsByIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentSummaryReportsByIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall extends TeaModel {
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        @NameInMap("LastLogOutTime")
        public String lastLogOutTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("FirstLogInTime")
        public String firstLogInTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("OneTransferCalls")
        public Long oneTransferCalls;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setLastLogOutTime(String lastLogOutTime) {
            this.lastLogOutTime = lastLogOutTime;
            return this;
        }
        public String getLastLogOutTime() {
            return this.lastLogOutTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setFirstLogInTime(String firstLogInTime) {
            this.firstLogInTime = firstLogInTime;
            return this;
        }
        public String getFirstLogInTime() {
            return this.firstLogInTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setOneTransferCalls(Long oneTransferCalls) {
            this.oneTransferCalls = oneTransferCalls;
            return this;
        }
        public Long getOneTransferCalls() {
            return this.oneTransferCalls;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("AverageDialingTime")
        public Long averageDialingTime;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport extends TeaModel {
        @NameInMap("Overall")
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall overall;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("Inbound")
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound inbound;

        @NameInMap("Outbound")
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound outbound;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setOverall(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setInbound(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setOutbound(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList extends TeaModel {
        @NameInMap("AgentSummaryReport")
        public java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport> agentSummaryReport;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList setAgentSummaryReport(java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport> agentSummaryReport) {
            this.agentSummaryReport = agentSummaryReport;
            return this;
        }
        public java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalListAgentSummaryReport> getAgentSummaryReport() {
            return this.agentSummaryReport;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("IntervalList")
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList intervalList;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport setIntervalList(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList intervalList) {
            this.intervalList = intervalList;
            return this;
        }
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReportIntervalList getIntervalList() {
            return this.intervalList;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList extends TeaModel {
        @NameInMap("AgentTimeIntervalReport")
        public java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport> agentTimeIntervalReport;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList setAgentTimeIntervalReport(java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport> agentTimeIntervalReport) {
            this.agentTimeIntervalReport = agentTimeIntervalReport;
            return this;
        }
        public java.util.List<ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportListAgentTimeIntervalReport> getAgentTimeIntervalReport() {
            return this.agentTimeIntervalReport;
        }

    }

    public static class ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport self = new ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport setList(ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReportList getList() {
            return this.list;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentSummaryReportsByIntervalResponseBodyPagedAgentSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
