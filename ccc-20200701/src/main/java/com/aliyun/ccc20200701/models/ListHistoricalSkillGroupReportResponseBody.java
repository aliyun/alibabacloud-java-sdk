// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListHistoricalSkillGroupReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoricalSkillGroupReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalSkillGroupReportResponseBody self = new ListHistoricalSkillGroupReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoricalSkillGroupReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHistoricalSkillGroupReportResponseBody setData(ListHistoricalSkillGroupReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHistoricalSkillGroupReportResponseBodyData getData() {
        return this.data;
    }

    public ListHistoricalSkillGroupReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHistoricalSkillGroupReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoricalSkillGroupReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListBack2Back extends TeaModel {
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        @NameInMap("MaxCustomerRingTime")
        public Long maxCustomerRingTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalCustomerRingTime")
        public Long totalCustomerRingTime;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListHistoricalSkillGroupReportResponseBodyDataListBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListBack2Back self = new ListHistoricalSkillGroupReportResponseBodyDataListBack2Back();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setAgentHandleRate(Float agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setAverageCustomerRingTime(Float averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setCallsCustomerAnswered(Long callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setCustomerAnswerRate(Float customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setMaxCustomerRingTime(Long maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setTotalCustomerRingTime(Long totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails extends TeaModel {
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        public static ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails self = new ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListInbound extends TeaModel {
        @NameInMap("AbandonRate")
        public Float abandonRate;

        @NameInMap("AccessChannelTypeDetails")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails;

        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        @NameInMap("AverageAbandonedInRingTime")
        public Float averageAbandonedInRingTime;

        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsHold")
        public Long callsHold;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsOverflow")
        public Long callsOverflow;

        @NameInMap("CallsQueued")
        public Long callsQueued;

        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        @NameInMap("CallsRinged")
        public Long callsRinged;

        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("ServiceLevel15")
        public Float serviceLevel15;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("ServiceLevel30")
        public Float serviceLevel30;

        @NameInMap("TotalAbandonTime")
        public Long totalAbandonTime;

        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalSkillGroupReportResponseBodyDataListInbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListInbound self = new ListHistoricalSkillGroupReportResponseBodyDataListInbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAbandonRate(Float abandonRate) {
            this.abandonRate = abandonRate;
            return this;
        }
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAccessChannelTypeDetails(java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails) {
            this.accessChannelTypeDetails = accessChannelTypeDetails;
            return this;
        }
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails> getAccessChannelTypeDetails() {
            return this.accessChannelTypeDetails;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageAbandonTime(Float averageAbandonTime) {
            this.averageAbandonTime = averageAbandonTime;
            return this;
        }
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
            this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
            return this;
        }
        public Float getAverageAbandonedInQueueTime() {
            return this.averageAbandonedInQueueTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
            this.averageAbandonedInRingTime = averageAbandonedInRingTime;
            return this;
        }
        public Float getAverageAbandonedInRingTime() {
            return this.averageAbandonedInRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageWaitTime(Float averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Float getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsAbandonedInRing(Long callsAbandonedInRing) {
            this.callsAbandonedInRing = callsAbandonedInRing;
            return this;
        }
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsOverflow(Long callsOverflow) {
            this.callsOverflow = callsOverflow;
            return this;
        }
        public Long getCallsOverflow() {
            return this.callsOverflow;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsQueued(Long callsQueued) {
            this.callsQueued = callsQueued;
            return this;
        }
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsQueuingFailed(Long callsQueuingFailed) {
            this.callsQueuingFailed = callsQueuingFailed;
            return this;
        }
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsQueuingOverflow(Long callsQueuingOverflow) {
            this.callsQueuingOverflow = callsQueuingOverflow;
            return this;
        }
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setCallsTimeout(Long callsTimeout) {
            this.callsTimeout = callsTimeout;
            return this;
        }
        public Long getCallsTimeout() {
            return this.callsTimeout;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxAbandonTime(Long maxAbandonTime) {
            this.maxAbandonTime = maxAbandonTime;
            return this;
        }
        public Long getMaxAbandonTime() {
            return this.maxAbandonTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
            this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
            return this;
        }
        public Long getMaxAbandonedInQueueTime() {
            return this.maxAbandonedInQueueTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
            this.maxAbandonedInRingTime = maxAbandonedInRingTime;
            return this;
        }
        public Long getMaxAbandonedInRingTime() {
            return this.maxAbandonedInRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setServiceLevel15(Float serviceLevel15) {
            this.serviceLevel15 = serviceLevel15;
            return this;
        }
        public Float getServiceLevel15() {
            return this.serviceLevel15;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setServiceLevel30(Float serviceLevel30) {
            this.serviceLevel30 = serviceLevel30;
            return this;
        }
        public Float getServiceLevel30() {
            return this.serviceLevel30;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalAbandonTime(Long totalAbandonTime) {
            this.totalAbandonTime = totalAbandonTime;
            return this;
        }
        public Long getTotalAbandonTime() {
            return this.totalAbandonTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
            this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
            return this;
        }
        public Long getTotalAbandonedInQueueTime() {
            return this.totalAbandonedInQueueTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
            this.totalAbandonedInRingTime = totalAbandonedInRingTime;
            return this;
        }
        public Long getTotalAbandonedInRingTime() {
            return this.totalAbandonedInRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListOutbound extends TeaModel {
        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsHold")
        public Long callsHold;

        @NameInMap("CallsRinged")
        public Long callsRinged;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalSkillGroupReportResponseBodyDataListOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListOutbound self = new ListHistoricalSkillGroupReportResponseBodyDataListOutbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Duration")
        public Long duration;

        public static ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList self = new ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataListOverall extends TeaModel {
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList;

        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

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

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalSkillGroupReportResponseBodyDataListOverall build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataListOverall self = new ListHistoricalSkillGroupReportResponseBodyDataListOverall();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setBreakCodeDetailList(java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyDataList extends TeaModel {
        @NameInMap("Back2Back")
        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back back2Back;

        @NameInMap("Inbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListInbound inbound;

        @NameInMap("Outbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound outbound;

        @NameInMap("Overall")
        public ListHistoricalSkillGroupReportResponseBodyDataListOverall overall;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListHistoricalSkillGroupReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyDataList self = new ListHistoricalSkillGroupReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setBack2Back(ListHistoricalSkillGroupReportResponseBodyDataListBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setInbound(ListHistoricalSkillGroupReportResponseBodyDataListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListHistoricalSkillGroupReportResponseBodyDataListInbound getInbound() {
            return this.inbound;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setOutbound(ListHistoricalSkillGroupReportResponseBodyDataListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound getOutbound() {
            return this.outbound;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setOverall(ListHistoricalSkillGroupReportResponseBodyDataListOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListHistoricalSkillGroupReportResponseBodyDataListOverall getOverall() {
            return this.overall;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListHistoricalSkillGroupReportResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListHistoricalSkillGroupReportResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHistoricalSkillGroupReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalSkillGroupReportResponseBodyData self = new ListHistoricalSkillGroupReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHistoricalSkillGroupReportResponseBodyData setList(java.util.List<ListHistoricalSkillGroupReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataList> getList() {
            return this.list;
        }

        public ListHistoricalSkillGroupReportResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHistoricalSkillGroupReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHistoricalSkillGroupReportResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
