// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentSkillGroupReportResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of historical agent skill group data.</p>
     */
    @NameInMap("Data")
    public ListHistoricalAgentSkillGroupReportResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoricalAgentSkillGroupReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentSkillGroupReportResponseBody self = new ListHistoricalAgentSkillGroupReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentSkillGroupReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHistoricalAgentSkillGroupReportResponseBody setData(ListHistoricalAgentSkillGroupReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHistoricalAgentSkillGroupReportResponseBodyData getData() {
        return this.data;
    }

    public ListHistoricalAgentSkillGroupReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHistoricalAgentSkillGroupReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoricalAgentSkillGroupReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back extends TeaModel {
        /**
         * <p>Agent-side answer rate.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用AgentHandleRate代替此参数</p>
         */
        @NameInMap("AgentAnswerRate")
        public Float agentAnswerRate;

        /**
         * <p>Agent handle rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        /**
         * <p>Answer rate. Formula: CallsAnswered/CallsDialed (Because answer events and offered events might fall into different time ranges, the result might sometimes exceed 100%).</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average customer-side ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        /**
         * <p>Average ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        /**
         * <p>Number of calls handled by agents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

        /**
         * <p>Number of calls answered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of calls answered by customers.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        /**
         * <p>Number of customer-side pickups.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用CallsCustomerAnswered代替此参数</p>
         */
        @NameInMap("CallsCustomerHandled")
        public Long callsCustomerHandled;

        /**
         * <p>Number of calls dialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Customer answer rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        /**
         * <p>Customer-side handle rate.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用CustomerAnswerRate代替此参数</p>
         */
        @NameInMap("CustomerHandleRate")
        public Float customerHandleRate;

        /**
         * <p>Maximum customer-side ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCustomerRingTime")
        public Long maxCustomerRingTime;

        /**
         * <p>Maximum ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Total customer-side ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCustomerRingTime")
        public Long totalCustomerRingTime;

        /**
         * <p>Total ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAgentAnswerRate(Float agentAnswerRate) {
            this.agentAnswerRate = agentAnswerRate;
            return this;
        }
        public Float getAgentAnswerRate() {
            return this.agentAnswerRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAgentHandleRate(Float agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAverageCustomerRingTime(Float averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCallsAgentHandled(Long callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCallsCustomerAnswered(Long callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCallsCustomerHandled(Long callsCustomerHandled) {
            this.callsCustomerHandled = callsCustomerHandled;
            return this;
        }
        public Long getCallsCustomerHandled() {
            return this.callsCustomerHandled;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCustomerAnswerRate(Float customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setCustomerHandleRate(Float customerHandleRate) {
            this.customerHandleRate = customerHandleRate;
            return this;
        }
        public Float getCustomerHandleRate() {
            return this.customerHandleRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setMaxCustomerRingTime(Long maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setTotalCustomerRingTime(Long totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound extends TeaModel {
        /**
         * <p>Average first response time in chat sessions, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        /**
         * <p>Average call hold time in seconds. Formula: TotalHoldTime/CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average response time in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>Average ring time in seconds. Formula: TotalRingTime/CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time in seconds. Formula: TotalTalkTime/CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average after-call work time in seconds. Formula: TotalWorkTime/CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Number of attended transfers in. If a call is transferred multiple times to this agent, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Number of attended transfers out. If a call is transferred multiple times to other agents, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Number of blind transfers in. If a call is transferred multiple times to this agent, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Number of blind transfers out. If a call is transferred multiple times to other agents, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Number of calls handled, which is the number of times an agent answered a call.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Number of calls on hold, which is the number of times a call was put on hold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls offered, which is the number of times calls were assigned to this agent, including blind transfers and attended transfers from other agents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Number of calls that rang for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Handle rate. Formula: CallsHandled/CallsOffered (Because answer events and offered events might fall into different time ranges, the result might sometimes exceed 100%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>Maximum call hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average value of the single-digit satisfaction key presses.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Formula: Number of satisfied ratings/Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Total call hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total messages sent in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        /**
         * <p>Total messages sent by agents in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>Total messages sent by customers in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>Total ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal extends TeaModel {
        /**
         * <p>Average talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        /**
         * <p>Number of calls answered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of calls dialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Number of calls handled.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Number of calls offered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Number of calls the agent participated in.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsTalk")
        public Long callsTalk;

        /**
         * <p>Number of calls participated in.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallsTalked")
        public Long callsTalked;

        /**
         * <p>Maximum talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Total talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsTalk(Long callsTalk) {
            this.callsTalk = callsTalk;
            return this;
        }
        public Long getCallsTalk() {
            return this.callsTalk;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setCallsTalked(Long callsTalked) {
            this.callsTalked = callsTalked;
            return this;
        }
        public Long getCallsTalked() {
            return this.callsTalked;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound extends TeaModel {
        /**
         * <p>Answer rate. Formula: CallsAnswered/CallsDialed (Because answer events and offered events might fall into different time ranges, the result might sometimes exceed 100%).</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average dialing time in seconds. Formula: TotalDialingTime/CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        /**
         * <p>Average call hold time in seconds. Formula: TotalHoldTime/CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time in seconds. Formula: TotalTalkTime/CallsAnswered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average after-call work time in seconds. Formula: TotalWorkTime/CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Number of calls answered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of attended transfers in. If a call is transferred multiple times to this agent, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Number of attended transfers out. If a call is transferred multiple times to other agents, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Number of blind transfers in. If a call is transferred multiple times to this agent, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Number of blind transfers out. If a call is transferred multiple times to other agents, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Number of calls dialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Number of calls on hold, which is the number of times a call was put on hold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls that rang for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Maximum dialing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <p>Maximum call hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average value of the single-digit satisfaction key presses.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Formula: Number of satisfied ratings/Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Total dialing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <p>Total call hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total ring time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList extends TeaModel {
        /**
         * <p>Break code.</p>
         * 
         * <strong>example:</strong>
         * <p>开会</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall extends TeaModel {
        /**
         * <p>Average break time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <p>Average call hold time in seconds. Formula: TotalHoldTime/(Inbound CallsHold + Outbound CallsHold).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ready time in seconds. Formula: TotalReadyTime/Number of ready events. The number of ready events is not an API statistical field.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        /**
         * <p>Average talk time in seconds. Formula: TotalTalkTime/(CallsAnswered+CallsHandled).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average after-call work time in seconds. Formula: TotalWorkTime/TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>List of break code details.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>Earliest check-in time. Format is UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1686030515000</p>
         */
        @NameInMap("FirstCheckInTime")
        public Long firstCheckInTime;

        /**
         * <p>Latest check-out time. Format is UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1686030515000</p>
         */
        @NameInMap("LastCheckOutTime")
        public Long lastCheckOutTime;

        /**
         * <p>Maximum break time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        /**
         * <p>Maximum call hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ready time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <p>Maximum talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Agent occupancy rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        /**
         * <p>Satisfaction index, which is the average value of the single-digit satisfaction key presses.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Formula: Number of satisfied ratings/Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Total break time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <p>Total number of calls. Formula: CallsOffered + CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <p>Total hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total logged-in time in seconds.
         * <em>Note: This does not include offline or break time.</em></p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>Total off-site logged-in time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalOffSiteLggedInTime")
        public Long totalOffSiteLggedInTime;

        /**
         * <p>Total office phone logged-in time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalOfficePhoneLoggedInTime")
        public Long totalOfficePhoneLoggedInTime;

        /**
         * <p>Total on-site logged-in time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalOnSiteLoggedInTime")
        public String totalOnSiteLoggedInTime;

        /**
         * <p>Total outbound-only logged-in time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalOutboundScenarioLoggedInTime")
        public Long totalOutboundScenarioLoggedInTime;

        /**
         * <p>Total outbound-only idle time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOutboundScenarioReadyTime")
        public Long totalOutboundScenarioReadyTime;

        /**
         * <p>Total outbound-only online time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOutboundScenarioTime")
        public Long totalOutboundScenarioTime;

        /**
         * <p>Total ready time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <p>Total talk time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total after-call work time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall self = new ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setBreakCodeDetailList(java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setFirstCheckInTime(Long firstCheckInTime) {
            this.firstCheckInTime = firstCheckInTime;
            return this;
        }
        public Long getFirstCheckInTime() {
            return this.firstCheckInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setLastCheckOutTime(Long lastCheckOutTime) {
            this.lastCheckOutTime = lastCheckOutTime;
            return this;
        }
        public Long getLastCheckOutTime() {
            return this.lastCheckOutTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOffSiteLggedInTime(Long totalOffSiteLggedInTime) {
            this.totalOffSiteLggedInTime = totalOffSiteLggedInTime;
            return this;
        }
        public Long getTotalOffSiteLggedInTime() {
            return this.totalOffSiteLggedInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
            this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
            return this;
        }
        public Long getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOnSiteLoggedInTime(String totalOnSiteLoggedInTime) {
            this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
            return this;
        }
        public String getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
            this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
            return this;
        }
        public Long getTotalOutboundScenarioLoggedInTime() {
            return this.totalOutboundScenarioLoggedInTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
            this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
            return this;
        }
        public Long getTotalOutboundScenarioReadyTime() {
            return this.totalOutboundScenarioReadyTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalOutboundScenarioTime(Long totalOutboundScenarioTime) {
            this.totalOutboundScenarioTime = totalOutboundScenarioTime;
            return this;
        }
        public Long getTotalOutboundScenarioTime() {
            return this.totalOutboundScenarioTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyDataList extends TeaModel {
        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent1@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>云呼测试坐席</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>Back-to-back call metrics.</p>
         */
        @NameInMap("Back2Back")
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back back2Back;

        /**
         * <p>Agent\&quot;s employee ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DisplayId")
        public String displayId;

        /**
         * <p>Inbound metrics.</p>
         */
        @NameInMap("Inbound")
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound inbound;

        /**
         * <p>Internal call metrics.</p>
         */
        @NameInMap("Internal")
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal internal;

        /**
         * <p>Outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound outbound;

        /**
         * <p>Overall metrics.</p>
         */
        @NameInMap("Overall")
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall overall;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup1@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>Skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListHistoricalAgentSkillGroupReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyDataList self = new ListHistoricalAgentSkillGroupReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setBack2Back(ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setDisplayId(String displayId) {
            this.displayId = displayId;
            return this;
        }
        public String getDisplayId() {
            return this.displayId;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setInbound(ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInbound getInbound() {
            return this.inbound;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setInternal(ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal internal) {
            this.internal = internal;
            return this;
        }
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListInternal getInternal() {
            return this.internal;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setOutbound(ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOutbound getOutbound() {
            return this.outbound;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setOverall(ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListHistoricalAgentSkillGroupReportResponseBodyDataListOverall getOverall() {
            return this.overall;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListHistoricalAgentSkillGroupReportResponseBodyData extends TeaModel {
        /**
         * <p>List of historical agent skill group data.</p>
         */
        @NameInMap("List")
        public java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataList> list;

        /**
         * <p>Page number. Valid values are 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size. Valid values are 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count. Data is available only when PageNumber is 1. Otherwise, the value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHistoricalAgentSkillGroupReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalAgentSkillGroupReportResponseBodyData self = new ListHistoricalAgentSkillGroupReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyData setList(java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListHistoricalAgentSkillGroupReportResponseBodyDataList> getList() {
            return this.list;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHistoricalAgentSkillGroupReportResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
