// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsSinceMidnightResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagedSkillGroupSummaryReport")
    public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

    /**
     * <strong>example:</strong>
     * <p>2B36CEBC-6D11-5451-9E6B-C6D1927841C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonedInQueueOfQueueCount")
        public Long abandonedInQueueOfQueueCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnsweredByAgentOfQueueCount")
        public Long answeredByAgentOfQueueCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnsweredByAgentOfQueueMaxWaitTimeDuration")
        public Long answeredByAgentOfQueueMaxWaitTimeDuration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnsweredByAgentOfQueueWaitTimeDuration")
        public Long answeredByAgentOfQueueWaitTimeDuration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsOverflow")
        public String callsOverflow;

        @NameInMap("CallsQueuingCanceled")
        public String callsQueuingCanceled;

        @NameInMap("CallsQueuingFailure")
        public String callsQueuingFailure;

        @NameInMap("CallsQueuingRerouted")
        public String callsQueuingRerouted;

        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsServiceLevel10")
        public Long callsServiceLevel10;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsServiceLevel20")
        public Long callsServiceLevel20;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsServiceLevel30")
        public Long callsServiceLevel30;

        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GiveUpByAgentOfQueueCount")
        public Long giveUpByAgentOfQueueCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InComingQueueOfQueueCount")
        public Long inComingQueueOfQueueCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public String maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OverFlowInQueueOfQueueCount")
        public Long overFlowInQueueOfQueueCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueueMaxWaitTimeDuration")
        public Long queueMaxWaitTimeDuration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueueWaitTimeDuration")
        public Long queueWaitTimeDuration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAbandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
            this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
            return this;
        }
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAnsweredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
            this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
            return this;
        }
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAnsweredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
            this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAnsweredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
            this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
            return this;
        }
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsOverflow(String callsOverflow) {
            this.callsOverflow = callsOverflow;
            return this;
        }
        public String getCallsOverflow() {
            return this.callsOverflow;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsQueuingCanceled(String callsQueuingCanceled) {
            this.callsQueuingCanceled = callsQueuingCanceled;
            return this;
        }
        public String getCallsQueuingCanceled() {
            return this.callsQueuingCanceled;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsQueuingFailure(String callsQueuingFailure) {
            this.callsQueuingFailure = callsQueuingFailure;
            return this;
        }
        public String getCallsQueuingFailure() {
            return this.callsQueuingFailure;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsQueuingRerouted(String callsQueuingRerouted) {
            this.callsQueuingRerouted = callsQueuingRerouted;
            return this;
        }
        public String getCallsQueuingRerouted() {
            return this.callsQueuingRerouted;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsServiceLevel10(Long callsServiceLevel10) {
            this.callsServiceLevel10 = callsServiceLevel10;
            return this;
        }
        public Long getCallsServiceLevel10() {
            return this.callsServiceLevel10;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsServiceLevel20(Long callsServiceLevel20) {
            this.callsServiceLevel20 = callsServiceLevel20;
            return this;
        }
        public Long getCallsServiceLevel20() {
            return this.callsServiceLevel20;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsServiceLevel30(Long callsServiceLevel30) {
            this.callsServiceLevel30 = callsServiceLevel30;
            return this;
        }
        public Long getCallsServiceLevel30() {
            return this.callsServiceLevel30;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setCallsTimeout(Long callsTimeout) {
            this.callsTimeout = callsTimeout;
            return this;
        }
        public Long getCallsTimeout() {
            return this.callsTimeout;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setGiveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
            this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
            return this;
        }
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setInComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
            this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
            return this;
        }
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setOverFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
            this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
            return this;
        }
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setQueueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
            this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
            return this;
        }
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setQueueWaitTimeDuration(Long queueWaitTimeDuration) {
            this.queueWaitTimeDuration = queueWaitTimeDuration;
            return this;
        }
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageDialingTime")
        public Long averageDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsQueuingCancelled")
        public Long callsQueuingCancelled;

        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        @NameInMap("CallsQueuingFailure")
        public Long callsQueuingFailure;

        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        @NameInMap("CallsQueuingRerouted")
        public Long callsQueuingRerouted;

        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsServiceLevel30")
        public String callsServiceLevel30;

        @NameInMap("CallsServiceLevel30V2")
        public Long callsServiceLevel30V2;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsAgentHandled(Long callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingCancelled(Long callsQueuingCancelled) {
            this.callsQueuingCancelled = callsQueuingCancelled;
            return this;
        }
        public Long getCallsQueuingCancelled() {
            return this.callsQueuingCancelled;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingFailed(Long callsQueuingFailed) {
            this.callsQueuingFailed = callsQueuingFailed;
            return this;
        }
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingFailure(Long callsQueuingFailure) {
            this.callsQueuingFailure = callsQueuingFailure;
            return this;
        }
        public Long getCallsQueuingFailure() {
            return this.callsQueuingFailure;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingOverflow(Long callsQueuingOverflow) {
            this.callsQueuingOverflow = callsQueuingOverflow;
            return this;
        }
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingRerouted(Long callsQueuingRerouted) {
            this.callsQueuingRerouted = callsQueuingRerouted;
            return this;
        }
        public Long getCallsQueuingRerouted() {
            return this.callsQueuingRerouted;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsServiceLevel30(String callsServiceLevel30) {
            this.callsServiceLevel30 = callsServiceLevel30;
            return this;
        }
        public String getCallsServiceLevel30() {
            return this.callsServiceLevel30;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setCallsServiceLevel30V2(Long callsServiceLevel30V2) {
            this.callsServiceLevel30V2 = callsServiceLevel30V2;
            return this;
        }
        public Long getCallsServiceLevel30V2() {
            return this.callsServiceLevel30V2;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList extends TeaModel {
        @NameInMap("Inbound")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound inbound;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Outbound")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound outbound;

        @NameInMap("Overall")
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall overall;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        /**
         * <strong>example:</strong>
         * <p>2018-09-13 00:00:00</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setInbound(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListInbound getInbound() {
            return this.inbound;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setOutbound(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOutbound getOutbound() {
            return this.outbound;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setOverall(ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportListOverall getOverall() {
            return this.overall;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport self = new ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReport setList(java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillGroupSummaryReportsSinceMidnightResponseBodyPagedSkillGroupSummaryReportList> getList() {
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
