// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceSummaryReport")
    public GetInstanceSummaryReportResponseBodyInstanceSummaryReport instanceSummaryReport;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceSummaryReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportResponseBody self = new GetInstanceSummaryReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSummaryReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceSummaryReportResponseBody setInstanceSummaryReport(GetInstanceSummaryReportResponseBodyInstanceSummaryReport instanceSummaryReport) {
        this.instanceSummaryReport = instanceSummaryReport;
        return this;
    }
    public GetInstanceSummaryReportResponseBodyInstanceSummaryReport getInstanceSummaryReport() {
        return this.instanceSummaryReport;
    }

    public GetInstanceSummaryReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSummaryReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSummaryReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound extends TeaModel {
        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWaitTime")
        public Long averageWaitTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsIncomingIVR")
        public Long callsIncomingIVR;

        @NameInMap("CallsIncomingLine")
        public Long callsIncomingLine;

        @NameInMap("CallsIncomingQueue")
        public Long callsIncomingQueue;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public String maxTalkTime;

        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

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

        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageWaitTime(Long averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Long getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingIVR(Long callsIncomingIVR) {
            this.callsIncomingIVR = callsIncomingIVR;
            return this;
        }
        public Long getCallsIncomingIVR() {
            return this.callsIncomingIVR;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingLine(Long callsIncomingLine) {
            this.callsIncomingLine = callsIncomingLine;
            return this;
        }
        public Long getCallsIncomingLine() {
            return this.callsIncomingLine;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingQueue(Long callsIncomingQueue) {
            this.callsIncomingQueue = callsIncomingQueue;
            return this;
        }
        public Long getCallsIncomingQueue() {
            return this.callsIncomingQueue;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound extends TeaModel {
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
        public Long maxWorkTime;

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

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall extends TeaModel {
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

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReport extends TeaModel {
        @NameInMap("Inbound")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Outbound")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall overall;

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReport self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setInbound(GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setOutbound(GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setOverall(GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall getOverall() {
            return this.overall;
        }

    }

}
