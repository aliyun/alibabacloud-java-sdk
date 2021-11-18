// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedSkillGroupSummaryReport")
    public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupSummaryReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsResponseBody self = new ListSkillGroupSummaryReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupSummaryReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupSummaryReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupSummaryReportsResponseBody setPagedSkillGroupSummaryReport(ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
        this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
        return this;
    }
    public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
        return this.pagedSkillGroupSummaryReport;
    }

    public ListSkillGroupSummaryReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupSummaryReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound extends TeaModel {
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

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
            this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
            return this;
        }
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
            this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
            return this;
        }
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
            this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
            this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
            this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
            return this;
        }
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
            this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
            return this;
        }
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
            this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
            return this;
        }
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
            this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
            return this;
        }
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
            this.queueWaitTimeDuration = queueWaitTimeDuration;
            return this;
        }
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound extends TeaModel {
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

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall extends TeaModel {
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

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport extends TeaModel {
        @NameInMap("Inbound")
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Outbound")
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound outbound;

        @NameInMap("Overall")
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall overall;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setInbound(ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportInbound getInbound() {
            return this.inbound;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setOutbound(ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOutbound getOutbound() {
            return this.outbound;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setOverall(ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReportOverall getOverall() {
            return this.overall;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList extends TeaModel {
        @NameInMap("SkillGroupSummaryReport")
        public java.util.List<ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> skillGroupSummaryReport;

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList setSkillGroupSummaryReport(java.util.List<ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> skillGroupSummaryReport) {
            this.skillGroupSummaryReport = skillGroupSummaryReport;
            return this;
        }
        public java.util.List<ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportListSkillGroupSummaryReport> getSkillGroupSummaryReport() {
            return this.skillGroupSummaryReport;
        }

    }

    public static class ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport extends TeaModel {
        @NameInMap("List")
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport setList(ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList list) {
            this.list = list;
            return this;
        }
        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReportList getList() {
            return this.list;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupSummaryReportsResponseBodyPagedSkillGroupSummaryReport setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
