// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsSinceMidnightResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedSkillGroupSummaryReport")
    public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupSummaryReportsSinceMidnightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsSinceMidnightResponseBody self = new ListSkillGroupSummaryReportsSinceMidnightResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setPagedSkillGroupSummaryReport(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
        this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
        return this;
    }
    public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
        return this.pagedSkillGroupSummaryReport;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound extends TeaModel {
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
        public String maxTalkTime;

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

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
            this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
            return this;
        }
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
            this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
            return this;
        }
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
            this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
            this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
            this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
            return this;
        }
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
            this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
            return this;
        }
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
            this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
            return this;
        }
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
            this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
            return this;
        }
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
            this.queueWaitTimeDuration = queueWaitTimeDuration;
            return this;
        }
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound extends TeaModel {
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

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall extends TeaModel {
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

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport extends TeaModel {
        @NameInMap("Inbound")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Outbound")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall overall;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setInbound(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setOutbound(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setOverall(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList extends TeaModel {
        @NameInMap("SkillGroupSummaryReport")
        public java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> skillGroupSummaryReport;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setSkillGroupSummaryReport(java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> skillGroupSummaryReport) {
            this.skillGroupSummaryReport = skillGroupSummaryReport;
            return this;
        }
        public java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> getSkillGroupSummaryReport() {
            return this.skillGroupSummaryReport;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport setList(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList getList() {
            return this.list;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
