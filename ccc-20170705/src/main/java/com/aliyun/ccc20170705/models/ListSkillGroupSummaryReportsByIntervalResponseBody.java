// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsByIntervalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedSkillGroupSummaryReport")
    public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupSummaryReportsByIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsByIntervalResponseBody self = new ListSkillGroupSummaryReportsByIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setPagedSkillGroupSummaryReport(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
        this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
        return this;
    }
    public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
        return this.pagedSkillGroupSummaryReport;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupSummaryReportsByIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound extends TeaModel {
        @NameInMap("AbandonedInQueueOfQueueCount")
        public Long abandonedInQueueOfQueueCount;

        @NameInMap("AnsweredByAgentOfQueueCount")
        public Long answeredByAgentOfQueueCount;

        @NameInMap("AnsweredByAgentOfQueueMaxWaitTimeDuration")
        public Long answeredByAgentOfQueueMaxWaitTimeDuration;

        @NameInMap("AnsweredByAgentOfQueueWaitTimeDuration")
        public Long answeredByAgentOfQueueWaitTimeDuration;

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

        @NameInMap("GiveUpByAgentOfQueueCount")
        public Long giveUpByAgentOfQueueCount;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("InComingQueueOfQueueCount")
        public Long inComingQueueOfQueueCount;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("OverFlowInQueueOfQueueCount")
        public Long overFlowInQueueOfQueueCount;

        @NameInMap("QueueMaxWaitTimeDuration")
        public Long queueMaxWaitTimeDuration;

        @NameInMap("QueueWaitTimeDuration")
        public Long queueWaitTimeDuration;

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

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
            this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
            return this;
        }
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
            this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
            return this;
        }
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
            this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
            this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
            this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
            return this;
        }
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
            this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
            return this;
        }
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
            this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
            return this;
        }
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
            this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
            return this;
        }
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
            this.queueWaitTimeDuration = queueWaitTimeDuration;
            return this;
        }
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound extends TeaModel {
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

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
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

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall extends TeaModel {
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

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
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

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
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

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport extends TeaModel {
        @NameInMap("Inbound")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Outbound")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall overall;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setInbound(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setOutbound(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setOverall(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalListSkillGroupSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
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
        @NameInMap("IntervalList")
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList intervalList;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport self = new ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport setIntervalList(ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList intervalList) {
            this.intervalList = intervalList;
            return this;
        }
        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReportIntervalList getIntervalList() {
            return this.intervalList;
        }

        public ListSkillGroupSummaryReportsByIntervalResponseBodyPagedSkillGroupSummaryReportListSkillGroupTimeIntervalReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
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
