// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceSummaryReport")
    public GetInstanceSummaryReportResponseBodyInstanceSummaryReport instanceSummaryReport;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceSummaryReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportResponseBody self = new GetInstanceSummaryReportResponseBody();
        return TeaModel.build(map, self);
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

    public GetInstanceSummaryReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSummaryReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall extends TeaModel {
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

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
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

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound extends TeaModel {
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

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingLine(Long callsIncomingLine) {
            this.callsIncomingLine = callsIncomingLine;
            return this;
        }
        public Long getCallsIncomingLine() {
            return this.callsIncomingLine;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageWaitTime(Long averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Long getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingQueue(Long callsIncomingQueue) {
            this.callsIncomingQueue = callsIncomingQueue;
            return this;
        }
        public Long getCallsIncomingQueue() {
            return this.callsIncomingQueue;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsIncomingIVR(Long callsIncomingIVR) {
            this.callsIncomingIVR = callsIncomingIVR;
            return this;
        }
        public Long getCallsIncomingIVR() {
            return this.callsIncomingIVR;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound extends TeaModel {
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

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
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

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GetInstanceSummaryReportResponseBodyInstanceSummaryReport extends TeaModel {
        @NameInMap("Overall")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall overall;

        @NameInMap("Inbound")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound inbound;

        @NameInMap("Outbound")
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound outbound;

        @NameInMap("InstanceId")
        public String instanceId;

        public static GetInstanceSummaryReportResponseBodyInstanceSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryReportResponseBodyInstanceSummaryReport self = new GetInstanceSummaryReportResponseBodyInstanceSummaryReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setOverall(GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOverall getOverall() {
            return this.overall;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setInbound(GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setOutbound(GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetInstanceSummaryReportResponseBodyInstanceSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public GetInstanceSummaryReportResponseBodyInstanceSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
