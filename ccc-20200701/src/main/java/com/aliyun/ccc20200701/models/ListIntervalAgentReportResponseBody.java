// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentReportResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of agent segment statistics.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListIntervalAgentReportResponseBodyData> data;

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
     * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIntervalAgentReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentReportResponseBody self = new ListIntervalAgentReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntervalAgentReportResponseBody setData(java.util.List<ListIntervalAgentReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntervalAgentReportResponseBodyData> getData() {
        return this.data;
    }

    public ListIntervalAgentReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntervalAgentReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntervalAgentReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntervalAgentReportResponseBodyDataBack2Back extends TeaModel {
        /**
         * <p>Agent acknowledgement rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because answer events and acknowledgement events may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average customer-side ring duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        /**
         * <p>Average ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Number of calls answered by agents.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

        /**
         * <p>Number of answered calls.</p>
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
         * <p>9</p>
         */
        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        /**
         * <p>Number of dial-up calls.</p>
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
         * <p>0.75</p>
         */
        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        /**
         * <p>Maximum customer-side ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCustomerRingTime")
        public Long maxCustomerRingTime;

        /**
         * <p>Maximum ring duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Total customer-side ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCustomerRingTime")
        public Long totalCustomerRingTime;

        /**
         * <p>Total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        public static ListIntervalAgentReportResponseBodyDataBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataBack2Back self = new ListIntervalAgentReportResponseBodyDataBack2Back();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setAgentHandleRate(Float agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setAverageCustomerRingTime(Float averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setCallsAgentHandled(Long callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setCallsCustomerAnswered(Long callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setCustomerAnswerRate(Float customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setMaxCustomerRingTime(Long maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setTotalCustomerRingTime(Long totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataBack2Back setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails extends TeaModel {
        /**
         * <p>Channel Type.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <p>Number of assigned sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        public static ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails self = new ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataInbound extends TeaModel {
        /**
         * <p>Statistics for each Channel.</p>
         */
        @NameInMap("AccessChannelTypeDetails")
        public java.util.List<ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails> accessChannelTypeDetails;

        /**
         * <p>Average first response time for chat sessions, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        /**
         * <p>Average hold time during calls, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average response time for chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing time, in seconds. Calculation Formula: TotalWorkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Number of attended transfer-ins. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Number of transfer-out calls. If a single call is transferred to other agents multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Number of blind transfer-in calls. If a single call is transferred in to this agent multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Number of blind transfer-out calls. If a single call is transferred out to other agents multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Acknowledgement count, which is the number of times agents answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Number of calls placed on hold, that is, the count of occurrences where a call was held.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Assigned count, which refers to the number of calls assigned to this agent, including calls blindly transferred or consultatively transferred from other agents.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Number of calls that rang to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Acknowledgement rate. Calculation Formula: CallsHandled / CallsOffered (because acknowledgement events and assign events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>Maximum call hold duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction Index, which is the average of the satisfaction rating digits (single-digit numbers) entered by users.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Calculation Formula: Number of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Sending Count of satisfaction surveys.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Response Count of satisfaction surveys.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Service level within 15 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("ServiceLevel15")
        public Float serviceLevel15;

        /**
         * <p>Total hold time during calls, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total number of messages sent in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        /**
         * <p>Total number of messages sent by the agent in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>Total number of messages sent by the Customer in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>Total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalAgentReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataInbound self = new ListIntervalAgentReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAccessChannelTypeDetails(java.util.List<ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails> accessChannelTypeDetails) {
            this.accessChannelTypeDetails = accessChannelTypeDetails;
            return this;
        }
        public java.util.List<ListIntervalAgentReportResponseBodyDataInboundAccessChannelTypeDetails> getAccessChannelTypeDetails() {
            return this.accessChannelTypeDetails;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setServiceLevel15(Float serviceLevel15) {
            this.serviceLevel15 = serviceLevel15;
            return this;
        }
        public Float getServiceLevel15() {
            return this.serviceLevel15;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataInternal extends TeaModel {
        /**
         * <p>Average talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of dial-up calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Number of acknowledgements, which refers to the number of times the agent acknowledged a call.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Number of assigned calls, which refers to the count of calls assigned to this agent, including calls blindly transferred or consultatively transferred from other agents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Number of calls participated in.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("CallsTalked")
        public Long callsTalked;

        public static ListIntervalAgentReportResponseBodyDataInternal build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataInternal self = new ListIntervalAgentReportResponseBodyDataInternal();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataInternal setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataInternal setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentReportResponseBodyDataInternal setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentReportResponseBodyDataInternal setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListIntervalAgentReportResponseBodyDataInternal setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListIntervalAgentReportResponseBodyDataInternal setCallsTalked(Long callsTalked) {
            this.callsTalked = callsTalked;
            return this;
        }
        public Long getCallsTalked() {
            return this.callsTalked;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataOutbound extends TeaModel {
        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because answering events and acknowledgement events may fall into different Time Ranges, the Result may exceed 100% in certain cases.)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average dial-up duration, in seconds. Calculation Formula: TotalDialingTime / CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        /**
         * <p>Average hold duration, in seconds. Calculation formula: TotalHoldTime / CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ring time in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsAnswered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing time in seconds. Calculation Formula: TotalWorkTime / CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Answered call count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of attended transfer-in calls. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Number of transfer-out calls. If a single call is transferred out to other agents multiple times, each transfer-out counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Number of blind transfer-in calls. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Number of blind transfer-out calls. If a single call is transferred to other agents multiple times, each transfer counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Dial-up count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Hold count, which is the number of times call hold occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls that rang for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Maximum dial-up duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <p>Maximum hold time during calls, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average value of the satisfaction key digits (single-digit numbers).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Calculation Formula: Count of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Sending Count of satisfaction surveys.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Count of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Total dial-up duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>148</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <p>Total hold duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalAgentReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataOutbound self = new ListIntervalAgentReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList extends TeaModel {
        /**
         * <p>Break code.</p>
         * 
         * <strong>example:</strong>
         * <p>会议</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

        public static ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList self = new ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListIntervalAgentReportResponseBodyDataOverall extends TeaModel {
        /**
         * <p>Average break duration, in seconds. Calculation Formula: TotalBreakTime / Count of breaks. The count of breaks is not an API statistics field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / (Inbound CallsHold + Outbound CallsHold).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ready time, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is a non-API statistical field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        /**
         * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / (CallsAnswered + CallsHandled).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing duration per call, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>List of break details.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>This field has a value only when the input parameter Interval is Daily, representing the first publish time of the day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FirstCheckInTime")
        public Long firstCheckInTime;

        /**
         * <p>This field has a value only when the input parameter Interval is Daily, representing the last unpublish time of the day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastCheckOutTime")
        public Long lastCheckOutTime;

        /**
         * <p>This value is available only when the input parameter Interval is set to Daily, indicating the last unpublish time on that day.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用LastCheckOutTime代替此参数。</p>
         */
        @NameInMap("LastCheckoutTime")
        public Long lastCheckoutTime;

        /**
         * <p>Maximum break time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        /**
         * <p>Maximum call hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ready time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>435</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <p>Maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Agent occupancy rate. Calculation Formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        /**
         * <p>Satisfaction index, which is the average value of the satisfaction keypress digits (single-digit numbers).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Calculation Formula: Number of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>Sending Count of satisfaction surveys.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>Response Count of satisfaction surveys.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>Total break time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <p>Total call volume. Calculation Formula: CallsOffered + CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <p>Total hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total logon duration, in seconds. Note: Exclude offline and break durations.</p>
         * 
         * <strong>example:</strong>
         * <p>914</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>Total off-site logged-in duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOffSiteLoggedInTime")
        public Long totalOffSiteLoggedInTime;

        /**
         * <p>Total off-site online duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用TotalOffSiteLoggedInTime代替此参数</p>
         */
        @NameInMap("TotalOffSiteOnlineTime")
        public Long totalOffSiteOnlineTime;

        /**
         * <p>Total office phone logged-in time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOfficePhoneLoggedInTime")
        public Long totalOfficePhoneLoggedInTime;

        /**
         * <p>Total office phone online time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用TotalOfficePhoneLoggedInTime代替此参数</p>
         */
        @NameInMap("TotalOfficePhoneOnlineTime")
        public Long totalOfficePhoneOnlineTime;

        /**
         * <p>Total on-site logged-in duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOnSiteLoggedInTime")
        public Long totalOnSiteLoggedInTime;

        /**
         * <p>Total on-site online duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用TotalOnSiteLoggedInTime代替此参数</p>
         */
        @NameInMap("TotalOnSiteOnlineTime")
        public Long totalOnSiteOnlineTime;

        /**
         * <p>Total online time for outbound-only scenarios, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOutboundScenarioLoggedInTime")
        public Long totalOutboundScenarioLoggedInTime;

        /**
         * <p>Total idle time for outbound-only scenarios, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalOutboundScenarioReadyTime")
        public Long totalOutboundScenarioReadyTime;

        /**
         * <p>Total outbound-only scenario duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>已弃用，请使用TotalOutboundScenarioLoggedInTime代替此参数</p>
         */
        @NameInMap("TotalOutboundScenarioTime")
        public Long totalOutboundScenarioTime;

        /**
         * <p>Total ready time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>763</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <p>Total talk duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalAgentReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyDataOverall self = new ListIntervalAgentReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyDataOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setBreakCodeDetailList(java.util.List<ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListIntervalAgentReportResponseBodyDataOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setFirstCheckInTime(Long firstCheckInTime) {
            this.firstCheckInTime = firstCheckInTime;
            return this;
        }
        public Long getFirstCheckInTime() {
            return this.firstCheckInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setLastCheckOutTime(Long lastCheckOutTime) {
            this.lastCheckOutTime = lastCheckOutTime;
            return this;
        }
        public Long getLastCheckOutTime() {
            return this.lastCheckOutTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setLastCheckoutTime(Long lastCheckoutTime) {
            this.lastCheckoutTime = lastCheckoutTime;
            return this;
        }
        public Long getLastCheckoutTime() {
            return this.lastCheckoutTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOffSiteLoggedInTime(Long totalOffSiteLoggedInTime) {
            this.totalOffSiteLoggedInTime = totalOffSiteLoggedInTime;
            return this;
        }
        public Long getTotalOffSiteLoggedInTime() {
            return this.totalOffSiteLoggedInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOffSiteOnlineTime(Long totalOffSiteOnlineTime) {
            this.totalOffSiteOnlineTime = totalOffSiteOnlineTime;
            return this;
        }
        public Long getTotalOffSiteOnlineTime() {
            return this.totalOffSiteOnlineTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
            this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
            return this;
        }
        public Long getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOfficePhoneOnlineTime(Long totalOfficePhoneOnlineTime) {
            this.totalOfficePhoneOnlineTime = totalOfficePhoneOnlineTime;
            return this;
        }
        public Long getTotalOfficePhoneOnlineTime() {
            return this.totalOfficePhoneOnlineTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOnSiteLoggedInTime(Long totalOnSiteLoggedInTime) {
            this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
            return this;
        }
        public Long getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOnSiteOnlineTime(Long totalOnSiteOnlineTime) {
            this.totalOnSiteOnlineTime = totalOnSiteOnlineTime;
            return this;
        }
        public Long getTotalOnSiteOnlineTime() {
            return this.totalOnSiteOnlineTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
            this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
            return this;
        }
        public Long getTotalOutboundScenarioLoggedInTime() {
            return this.totalOutboundScenarioLoggedInTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
            this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
            return this;
        }
        public Long getTotalOutboundScenarioReadyTime() {
            return this.totalOutboundScenarioReadyTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalOutboundScenarioTime(Long totalOutboundScenarioTime) {
            this.totalOutboundScenarioTime = totalOutboundScenarioTime;
            return this;
        }
        public Long getTotalOutboundScenarioTime() {
            return this.totalOutboundScenarioTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalAgentReportResponseBodyDataOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalAgentReportResponseBodyData extends TeaModel {
        /**
         * <p>Back-to-back call metric.</p>
         */
        @NameInMap("Back2Back")
        public ListIntervalAgentReportResponseBodyDataBack2Back back2Back;

        /**
         * <p>Inbound metrics.</p>
         */
        @NameInMap("Inbound")
        public ListIntervalAgentReportResponseBodyDataInbound inbound;

        /**
         * <p>Internal call metrics.</p>
         */
        @NameInMap("Internal")
        public ListIntervalAgentReportResponseBodyDataInternal internal;

        /**
         * <p>Outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public ListIntervalAgentReportResponseBodyDataOutbound outbound;

        /**
         * <p>Overall metrics.</p>
         */
        @NameInMap("Overall")
        public ListIntervalAgentReportResponseBodyDataOverall overall;

        /**
         * <p>Start time of the time segment, formatted as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620291600000</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        public static ListIntervalAgentReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalAgentReportResponseBodyData self = new ListIntervalAgentReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntervalAgentReportResponseBodyData setBack2Back(ListIntervalAgentReportResponseBodyDataBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListIntervalAgentReportResponseBodyDataBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListIntervalAgentReportResponseBodyData setInbound(ListIntervalAgentReportResponseBodyDataInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListIntervalAgentReportResponseBodyDataInbound getInbound() {
            return this.inbound;
        }

        public ListIntervalAgentReportResponseBodyData setInternal(ListIntervalAgentReportResponseBodyDataInternal internal) {
            this.internal = internal;
            return this;
        }
        public ListIntervalAgentReportResponseBodyDataInternal getInternal() {
            return this.internal;
        }

        public ListIntervalAgentReportResponseBodyData setOutbound(ListIntervalAgentReportResponseBodyDataOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListIntervalAgentReportResponseBodyDataOutbound getOutbound() {
            return this.outbound;
        }

        public ListIntervalAgentReportResponseBodyData setOverall(ListIntervalAgentReportResponseBodyDataOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListIntervalAgentReportResponseBodyDataOverall getOverall() {
            return this.overall;
        }

        public ListIntervalAgentReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

    }

}
