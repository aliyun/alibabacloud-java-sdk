// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListHistoricalAgentReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoricalAgentReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentReportResponseBody self = new ListHistoricalAgentReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHistoricalAgentReportResponseBody setData(ListHistoricalAgentReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHistoricalAgentReportResponseBodyData getData() {
        return this.data;
    }

    public ListHistoricalAgentReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHistoricalAgentReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoricalAgentReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoricalAgentReportResponseBodyDataListBack2Back extends TeaModel {
        @NameInMap("AgentHandleRate")
        public String agentHandleRate;

        @NameInMap("AnswerRate")
        public String answerRate;

        @NameInMap("AverageCustomerRingTime")
        public String averageCustomerRingTime;

        @NameInMap("AverageRingTime")
        public String averageRingTime;

        @NameInMap("AverageTalkTime")
        public String averageTalkTime;

        @NameInMap("CallsAgentHandled")
        public String callsAgentHandled;

        @NameInMap("CallsAnswered")
        public String callsAnswered;

        @NameInMap("CallsCustomerAnswered")
        public String callsCustomerAnswered;

        @NameInMap("CallsDialed")
        public String callsDialed;

        @NameInMap("CustomerAnswerRate")
        public String customerAnswerRate;

        @NameInMap("MaxCustomerRingTime")
        public String maxCustomerRingTime;

        @NameInMap("MaxRingTime")
        public String maxRingTime;

        @NameInMap("MaxTalkTime")
        public String maxTalkTime;

        @NameInMap("TotalCustomerRingTime")
        public String totalCustomerRingTime;

        @NameInMap("TotalRingTime")
        public String totalRingTime;

        @NameInMap("TotalTalkTime")
        public String totalTalkTime;

        public static ListHistoricalAgentReportResponseBodyDataListBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListBack2Back self = new ListHistoricalAgentReportResponseBodyDataListBack2Back();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setAgentHandleRate(String agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public String getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setAnswerRate(String answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public String getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setAverageCustomerRingTime(String averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public String getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setAverageRingTime(String averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public String getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setAverageTalkTime(String averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public String getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setCallsAgentHandled(String callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public String getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setCallsAnswered(String callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public String getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setCallsCustomerAnswered(String callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public String getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setCallsDialed(String callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public String getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setCustomerAnswerRate(String customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public String getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setMaxCustomerRingTime(String maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public String getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setMaxRingTime(String maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public String getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setTotalCustomerRingTime(String totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public String getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setTotalRingTime(String totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public String getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListBack2Back setTotalTalkTime(String totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public String getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails extends TeaModel {
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        public static ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails self = new ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListInbound extends TeaModel {
        @NameInMap("AccessChannelTypeDetails")
        public java.util.List<ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails;

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

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

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

        @NameInMap("CallsRinged")
        public Long callsRinged;

        @NameInMap("HandleRate")
        public Float handleRate;

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

        @NameInMap("ServiceLevel15")
        public Float serviceLevel15;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        @NameInMap("TotalMessagesSentByCustomer")
        public String totalMessagesSentByCustomer;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalAgentReportResponseBodyDataListInbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListInbound self = new ListHistoricalAgentReportResponseBodyDataListInbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAccessChannelTypeDetails(java.util.List<ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails) {
            this.accessChannelTypeDetails = accessChannelTypeDetails;
            return this;
        }
        public java.util.List<ListHistoricalAgentReportResponseBodyDataListInboundAccessChannelTypeDetails> getAccessChannelTypeDetails() {
            return this.accessChannelTypeDetails;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setServiceLevel15(Float serviceLevel15) {
            this.serviceLevel15 = serviceLevel15;
            return this;
        }
        public Float getServiceLevel15() {
            return this.serviceLevel15;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalMessagesSentByCustomer(String totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public String getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListInternal extends TeaModel {
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsTalked")
        public Long callsTalked;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListHistoricalAgentReportResponseBodyDataListInternal build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListInternal self = new ListHistoricalAgentReportResponseBodyDataListInternal();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setCallsTalked(Long callsTalked) {
            this.callsTalked = callsTalked;
            return this;
        }
        public Long getCallsTalked() {
            return this.callsTalked;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListInternal setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListOutbound extends TeaModel {
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

        public static ListHistoricalAgentReportResponseBodyDataListOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListOutbound self = new ListHistoricalAgentReportResponseBodyDataListOutbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Duration")
        public Long duration;

        public static ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList self = new ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataListOverall extends TeaModel {
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
        public java.util.List<ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList;

        @NameInMap("FirstCheckInTime")
        public Long firstCheckInTime;

        @NameInMap("LastCheckOutTime")
        public Long lastCheckOutTime;

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

        @NameInMap("TotalOffSiteLoggedInTime")
        public Long totalOffSiteLoggedInTime;

        @NameInMap("TotalOffSiteOnlineTime")
        public Long totalOffSiteOnlineTime;

        @NameInMap("TotalOfficePhoneLoggedInTime")
        public Long totalOfficePhoneLoggedInTime;

        @NameInMap("TotalOfficePhoneOnlineTime")
        public Long totalOfficePhoneOnlineTime;

        @NameInMap("TotalOnSiteLoggedInTime")
        public Long totalOnSiteLoggedInTime;

        @NameInMap("TotalOnSiteOnlineTime")
        public Long totalOnSiteOnlineTime;

        @NameInMap("TotalOutboundScenarioLoggedInTime")
        public Long totalOutboundScenarioLoggedInTime;

        @NameInMap("TotalOutboundScenarioReadyTime")
        public Long totalOutboundScenarioReadyTime;

        @NameInMap("TotalOutboundScenarioTime")
        public Long totalOutboundScenarioTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalAgentReportResponseBodyDataListOverall build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataListOverall self = new ListHistoricalAgentReportResponseBodyDataListOverall();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setBreakCodeDetailList(java.util.List<ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListHistoricalAgentReportResponseBodyDataListOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setFirstCheckInTime(Long firstCheckInTime) {
            this.firstCheckInTime = firstCheckInTime;
            return this;
        }
        public Long getFirstCheckInTime() {
            return this.firstCheckInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setLastCheckOutTime(Long lastCheckOutTime) {
            this.lastCheckOutTime = lastCheckOutTime;
            return this;
        }
        public Long getLastCheckOutTime() {
            return this.lastCheckOutTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOffSiteLoggedInTime(Long totalOffSiteLoggedInTime) {
            this.totalOffSiteLoggedInTime = totalOffSiteLoggedInTime;
            return this;
        }
        public Long getTotalOffSiteLoggedInTime() {
            return this.totalOffSiteLoggedInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOffSiteOnlineTime(Long totalOffSiteOnlineTime) {
            this.totalOffSiteOnlineTime = totalOffSiteOnlineTime;
            return this;
        }
        public Long getTotalOffSiteOnlineTime() {
            return this.totalOffSiteOnlineTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
            this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
            return this;
        }
        public Long getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOfficePhoneOnlineTime(Long totalOfficePhoneOnlineTime) {
            this.totalOfficePhoneOnlineTime = totalOfficePhoneOnlineTime;
            return this;
        }
        public Long getTotalOfficePhoneOnlineTime() {
            return this.totalOfficePhoneOnlineTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOnSiteLoggedInTime(Long totalOnSiteLoggedInTime) {
            this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
            return this;
        }
        public Long getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOnSiteOnlineTime(Long totalOnSiteOnlineTime) {
            this.totalOnSiteOnlineTime = totalOnSiteOnlineTime;
            return this;
        }
        public Long getTotalOnSiteOnlineTime() {
            return this.totalOnSiteOnlineTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
            this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
            return this;
        }
        public Long getTotalOutboundScenarioLoggedInTime() {
            return this.totalOutboundScenarioLoggedInTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
            this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
            return this;
        }
        public Long getTotalOutboundScenarioReadyTime() {
            return this.totalOutboundScenarioReadyTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalOutboundScenarioTime(Long totalOutboundScenarioTime) {
            this.totalOutboundScenarioTime = totalOutboundScenarioTime;
            return this;
        }
        public Long getTotalOutboundScenarioTime() {
            return this.totalOutboundScenarioTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentReportResponseBodyDataListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyDataList extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("Back2Back")
        public ListHistoricalAgentReportResponseBodyDataListBack2Back back2Back;

        @NameInMap("DisplayId")
        public String displayId;

        @NameInMap("Inbound")
        public ListHistoricalAgentReportResponseBodyDataListInbound inbound;

        @NameInMap("Internal")
        public ListHistoricalAgentReportResponseBodyDataListInternal internal;

        @NameInMap("Outbound")
        public ListHistoricalAgentReportResponseBodyDataListOutbound outbound;

        @NameInMap("Overall")
        public ListHistoricalAgentReportResponseBodyDataListOverall overall;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        public static ListHistoricalAgentReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyDataList self = new ListHistoricalAgentReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListHistoricalAgentReportResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListHistoricalAgentReportResponseBodyDataList setBack2Back(ListHistoricalAgentReportResponseBodyDataListBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListHistoricalAgentReportResponseBodyDataListBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListHistoricalAgentReportResponseBodyDataList setDisplayId(String displayId) {
            this.displayId = displayId;
            return this;
        }
        public String getDisplayId() {
            return this.displayId;
        }

        public ListHistoricalAgentReportResponseBodyDataList setInbound(ListHistoricalAgentReportResponseBodyDataListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListHistoricalAgentReportResponseBodyDataListInbound getInbound() {
            return this.inbound;
        }

        public ListHistoricalAgentReportResponseBodyDataList setInternal(ListHistoricalAgentReportResponseBodyDataListInternal internal) {
            this.internal = internal;
            return this;
        }
        public ListHistoricalAgentReportResponseBodyDataListInternal getInternal() {
            return this.internal;
        }

        public ListHistoricalAgentReportResponseBodyDataList setOutbound(ListHistoricalAgentReportResponseBodyDataListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListHistoricalAgentReportResponseBodyDataListOutbound getOutbound() {
            return this.outbound;
        }

        public ListHistoricalAgentReportResponseBodyDataList setOverall(ListHistoricalAgentReportResponseBodyDataListOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListHistoricalAgentReportResponseBodyDataListOverall getOverall() {
            return this.overall;
        }

        public ListHistoricalAgentReportResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListHistoricalAgentReportResponseBodyDataList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

    }

    public static class ListHistoricalAgentReportResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListHistoricalAgentReportResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHistoricalAgentReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentReportResponseBodyData self = new ListHistoricalAgentReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentReportResponseBodyData setList(java.util.List<ListHistoricalAgentReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListHistoricalAgentReportResponseBodyDataList> getList() {
            return this.list;
        }

        public ListHistoricalAgentReportResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHistoricalAgentReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHistoricalAgentReportResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
