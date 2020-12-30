// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsByIntervalResponseBody extends TeaModel {
    @NameInMap("PagedSkillGroupSummaryReport")
    public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

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

    public static ListSkillGroupSummaryReportsByIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsByIntervalResponseBody self = new ListSkillGroupSummaryReportsByIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setPagedSkillGroupSummaryReport(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
        this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
        return this;
    }
    public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
        return this.pagedSkillGroupSummaryReport;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall extends TeaModel {
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

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound extends TeaModel {
        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("QueueMaxWaitTimeDuration")
        public Long queueMaxWaitTimeDuration;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("AnsweredByAgentOfQueueWaitTimeDuration")
        public Long answeredByAgentOfQueueWaitTimeDuration;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("InComingQueueOfQueueCount")
        public Long inComingQueueOfQueueCount;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("AbandonedInQueueOfQueueCount")
        public Long abandonedInQueueOfQueueCount;

        @NameInMap("OverFlowInQueueOfQueueCount")
        public Long overFlowInQueueOfQueueCount;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("AnsweredByAgentOfQueueMaxWaitTimeDuration")
        public Long answeredByAgentOfQueueMaxWaitTimeDuration;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AnsweredByAgentOfQueueCount")
        public Long answeredByAgentOfQueueCount;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("GiveUpByAgentOfQueueCount")
        public Long giveUpByAgentOfQueueCount;

        @NameInMap("QueueWaitTimeDuration")
        public Long queueWaitTimeDuration;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
            this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
            return this;
        }
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
            this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
            this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
            return this;
        }
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
            this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
            return this;
        }
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
            this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
            return this;
        }
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
            this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
            this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
            return this;
        }
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
            this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
            return this;
        }
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
            this.queueWaitTimeDuration = queueWaitTimeDuration;
            return this;
        }
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound extends TeaModel {
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

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport extends TeaModel {
        @NameInMap("Overall")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall overall;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("Inbound")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound inbound;

        @NameInMap("Outbound")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound outbound;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setOverall(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setInbound(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setOutbound(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList extends TeaModel {
        @NameInMap("SkillGroupSummaryReport")
        public java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport> skillGroupSummaryReport;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList setSkillGroupSummaryReport(java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport> skillGroupSummaryReport) {
            this.skillGroupSummaryReport = skillGroupSummaryReport;
            return this;
        }
        public java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport> getSkillGroupSummaryReport() {
            return this.skillGroupSummaryReport;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("IntervalList")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList intervalList;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport setIntervalList(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList intervalList) {
            this.intervalList = intervalList;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList getIntervalList() {
            return this.intervalList;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList extends TeaModel {
        @NameInMap("SkillGroupTimeIntervalReport")
        public java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport> skillGroupTimeIntervalReport;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList setSkillGroupTimeIntervalReport(java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport> skillGroupTimeIntervalReport) {
            this.skillGroupTimeIntervalReport = skillGroupTimeIntervalReport;
            return this;
        }
        public java.util.List<ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport> getSkillGroupTimeIntervalReport() {
            return this.skillGroupTimeIntervalReport;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport setList(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportList getList() {
            return this.list;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
