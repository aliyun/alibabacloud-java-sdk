// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportByIntervalResponseBody extends TeaModel {
    @NameInMap("InstanceTimeIntervalReport")
    public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport instanceTimeIntervalReport;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceSummaryReportByIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportByIntervalResponseBody self = new GetInstanceSummaryReportByIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportByIntervalResponseBody setInstanceTimeIntervalReport(GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport instanceTimeIntervalReport) {
        this.instanceTimeIntervalReport = instanceTimeIntervalReport;
        return this;
    }
    public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport getInstanceTimeIntervalReport() {
        return this.instanceTimeIntervalReport;
    }

    public GetInstanceSummaryReportByIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSummaryReportByIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSummaryReportByIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceSummaryReportByIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSummaryReportByIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

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

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound extends TeaModel {
        @NameInMap("CallsIncomingLine")
        public Long callsIncomingLine;

        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageWaitTime")
        public Long averageWaitTime;

        @NameInMap("CallsIncomingQueue")
        public Long callsIncomingQueue;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("MaxTalkTime")
        public String maxTalkTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("CallsIncomingIVR")
        public Long callsIncomingIVR;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsIncomingLine(Long callsIncomingLine) {
            this.callsIncomingLine = callsIncomingLine;
            return this;
        }
        public Long getCallsIncomingLine() {
            return this.callsIncomingLine;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setAverageWaitTime(Long averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Long getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsIncomingQueue(Long callsIncomingQueue) {
            this.callsIncomingQueue = callsIncomingQueue;
            return this;
        }
        public Long getCallsIncomingQueue() {
            return this.callsIncomingQueue;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsIncomingIVR(Long callsIncomingIVR) {
            this.callsIncomingIVR = callsIncomingIVR;
            return this;
        }
        public Long getCallsIncomingIVR() {
            return this.callsIncomingIVR;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound extends TeaModel {
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

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport extends TeaModel {
        @NameInMap("Overall")
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall overall;

        @NameInMap("Inbound")
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound inbound;

        @NameInMap("Outbound")
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound outbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport setOverall(GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOverall getOverall() {
            return this.overall;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport setInbound(GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport setOutbound(GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList extends TeaModel {
        @NameInMap("InstanceSummaryReport")
        public java.util.List<GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport> instanceSummaryReport;

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList setInstanceSummaryReport(java.util.List<GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport> instanceSummaryReport) {
            this.instanceSummaryReport = instanceSummaryReport;
            return this;
        }
        public java.util.List<GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalListInstanceSummaryReport> getInstanceSummaryReport() {
            return this.instanceSummaryReport;
        }

    }

    public static class GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntervalList")
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList intervalList;

        public static GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport self = new GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReport setIntervalList(GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList intervalList) {
            this.intervalList = intervalList;
            return this;
        }
        public GetInstanceSummaryReportByIntervalResponseBodyInstanceTimeIntervalReportIntervalList getIntervalList() {
            return this.intervalList;
        }

    }

}
