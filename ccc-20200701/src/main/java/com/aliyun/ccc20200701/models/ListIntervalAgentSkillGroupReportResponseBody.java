// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentSkillGroupReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListIntervalAgentSkillGroupReportResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListIntervalAgentSkillGroupReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentSkillGroupReportResponseBody self = new ListIntervalAgentSkillGroupReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentSkillGroupReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntervalAgentSkillGroupReportResponseBody setData(java.util.List<ListIntervalAgentSkillGroupReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntervalAgentSkillGroupReportResponseBodyData> getData() {
        return this.data;
    }

    public ListIntervalAgentSkillGroupReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntervalAgentSkillGroupReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntervalAgentSkillGroupReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back extends TeaModel {
        @NameInMap("AgentAnswerRate")
        public Float agentAnswerRate;

        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        @NameInMap("CallsCustomerHandled")
        public Long callsCustomerHandled;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        @NameInMap("CustomerHandleRate")
        public Float customerHandleRate;

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

        public static ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back self = new ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAgentAnswerRate(Float agentAnswerRate) {
            this.agentAnswerRate = agentAnswerRate;
            return this;
        }
        public Float getAgentAnswerRate() {
            return this.agentAnswerRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAgentHandleRate(Float agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAverageCustomerRingTime(Float averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCallsAgentHandled(Long callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCallsCustomerAnswered(Long callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCallsCustomerHandled(Long callsCustomerHandled) {
            this.callsCustomerHandled = callsCustomerHandled;
            return this;
        }
        public Long getCallsCustomerHandled() {
            return this.callsCustomerHandled;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCustomerAnswerRate(Float customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setCustomerHandleRate(Float customerHandleRate) {
            this.customerHandleRate = customerHandleRate;
            return this;
        }
        public Float getCustomerHandleRate() {
            return this.customerHandleRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setMaxCustomerRingTime(Long maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setTotalCustomerRingTime(Long totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataInbound extends TeaModel {
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

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalAgentSkillGroupReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataInbound self = new ListIntervalAgentSkillGroupReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataInternal extends TeaModel {
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

        @NameInMap("CallsTalk")
        public Long callsTalk;

        @NameInMap("CallsTalked")
        public Long callsTalked;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListIntervalAgentSkillGroupReportResponseBodyDataInternal build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataInternal self = new ListIntervalAgentSkillGroupReportResponseBodyDataInternal();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsTalk(Long callsTalk) {
            this.callsTalk = callsTalk;
            return this;
        }
        public Long getCallsTalk() {
            return this.callsTalk;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setCallsTalked(Long callsTalked) {
            this.callsTalked = callsTalked;
            return this;
        }
        public Long getCallsTalked() {
            return this.callsTalked;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataOutbound extends TeaModel {
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

        public static ListIntervalAgentSkillGroupReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataOutbound self = new ListIntervalAgentSkillGroupReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Duration")
        public Long duration;

        public static ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList self = new ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyDataOverall extends TeaModel {
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
        public java.util.List<ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList;

        @NameInMap("FirstCheckInTime")
        public Long firstCheckInTime;

        @NameInMap("LastCheckOutTime")
        public Long lastCheckOutTime;

        @NameInMap("LastCheckoutTime")
        public Long lastCheckoutTime;

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
        public String totalOffSiteLoggedInTime;

        @NameInMap("TotalOfficePhoneLoggedInTime")
        public String totalOfficePhoneLoggedInTime;

        @NameInMap("TotalOnSiteLoggedInTime")
        public String totalOnSiteLoggedInTime;

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

        public static ListIntervalAgentSkillGroupReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyDataOverall self = new ListIntervalAgentSkillGroupReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setBreakCodeDetailList(java.util.List<ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListIntervalAgentSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setFirstCheckInTime(Long firstCheckInTime) {
            this.firstCheckInTime = firstCheckInTime;
            return this;
        }
        public Long getFirstCheckInTime() {
            return this.firstCheckInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setLastCheckOutTime(Long lastCheckOutTime) {
            this.lastCheckOutTime = lastCheckOutTime;
            return this;
        }
        public Long getLastCheckOutTime() {
            return this.lastCheckOutTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setLastCheckoutTime(Long lastCheckoutTime) {
            this.lastCheckoutTime = lastCheckoutTime;
            return this;
        }
        public Long getLastCheckoutTime() {
            return this.lastCheckoutTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOffSiteLoggedInTime(String totalOffSiteLoggedInTime) {
            this.totalOffSiteLoggedInTime = totalOffSiteLoggedInTime;
            return this;
        }
        public String getTotalOffSiteLoggedInTime() {
            return this.totalOffSiteLoggedInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOfficePhoneLoggedInTime(String totalOfficePhoneLoggedInTime) {
            this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
            return this;
        }
        public String getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOnSiteLoggedInTime(String totalOnSiteLoggedInTime) {
            this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
            return this;
        }
        public String getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
            this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
            return this;
        }
        public Long getTotalOutboundScenarioLoggedInTime() {
            return this.totalOutboundScenarioLoggedInTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
            this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
            return this;
        }
        public Long getTotalOutboundScenarioReadyTime() {
            return this.totalOutboundScenarioReadyTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalOutboundScenarioTime(Long totalOutboundScenarioTime) {
            this.totalOutboundScenarioTime = totalOutboundScenarioTime;
            return this;
        }
        public Long getTotalOutboundScenarioTime() {
            return this.totalOutboundScenarioTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentSkillGroupReportResponseBodyData extends TeaModel {
        @NameInMap("Back2Back")
        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back back2Back;

        @NameInMap("Inbound")
        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound inbound;

        @NameInMap("Internal")
        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal internal;

        @NameInMap("Outbound")
        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound outbound;

        @NameInMap("Overall")
        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall overall;

        @NameInMap("StatsTime")
        public Long statsTime;

        public static ListIntervalAgentSkillGroupReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentSkillGroupReportResponseBodyData self = new ListIntervalAgentSkillGroupReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setBack2Back(ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListIntervalAgentSkillGroupReportResponseBodyDataBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setInbound(ListIntervalAgentSkillGroupReportResponseBodyDataInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListIntervalAgentSkillGroupReportResponseBodyDataInbound getInbound() {
            return this.inbound;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setInternal(ListIntervalAgentSkillGroupReportResponseBodyDataInternal internal) {
            this.internal = internal;
            return this;
        }
        public ListIntervalAgentSkillGroupReportResponseBodyDataInternal getInternal() {
            return this.internal;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setOutbound(ListIntervalAgentSkillGroupReportResponseBodyDataOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListIntervalAgentSkillGroupReportResponseBodyDataOutbound getOutbound() {
            return this.outbound;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setOverall(ListIntervalAgentSkillGroupReportResponseBodyDataOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListIntervalAgentSkillGroupReportResponseBodyDataOverall getOverall() {
            return this.overall;
        }

        public ListIntervalAgentSkillGroupReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

    }

}
