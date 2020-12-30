// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportSinceMidnightResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceSummaryReport")
    public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport instanceSummaryReport;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceSummaryReportSinceMidnightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportSinceMidnightResponseBody self = new GetInstanceSummaryReportSinceMidnightResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setInstanceSummaryReport(GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport instanceSummaryReport) {
        this.instanceSummaryReport = instanceSummaryReport;
        return this;
    }
    public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport getInstanceSummaryReport() {
        return this.instanceSummaryReport;
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSummaryReportSinceMidnightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall extends TeaModel {
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

        public static GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall self = new GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound extends TeaModel {
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

        public static GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound self = new GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsIncomingLine(Long callsIncomingLine) {
            this.callsIncomingLine = callsIncomingLine;
            return this;
        }
        public Long getCallsIncomingLine() {
            return this.callsIncomingLine;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setAverageWaitTime(Long averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Long getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsIncomingQueue(Long callsIncomingQueue) {
            this.callsIncomingQueue = callsIncomingQueue;
            return this;
        }
        public Long getCallsIncomingQueue() {
            return this.callsIncomingQueue;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsIncomingIVR(Long callsIncomingIVR) {
            this.callsIncomingIVR = callsIncomingIVR;
            return this;
        }
        public Long getCallsIncomingIVR() {
            return this.callsIncomingIVR;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

    }

    public static class GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound extends TeaModel {
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

        public static GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound self = new GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport extends TeaModel {
        @NameInMap("Overall")
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall overall;

        @NameInMap("Inbound")
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound inbound;

        @NameInMap("Outbound")
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound outbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport self = new GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport setOverall(GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOverall getOverall() {
            return this.overall;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport setInbound(GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport setOutbound(GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceSummaryReportSinceMidnightResponseBodyInstanceSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
