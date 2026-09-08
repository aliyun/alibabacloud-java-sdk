// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListHistoricalSkillGroupReportResponseBodyData data;

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
     * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
     */
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
        /**
         * <p>Agent acknowledgement rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because acknowledgement events and answer events may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average customer-side ring time, in seconds.</p>
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
         * <p>Number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of calls answered by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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
         * <p>0.8</p>
         */
        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        /**
         * <p>Maximum Customer-side ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCustomerRingTime")
        public Long maxCustomerRingTime;

        /**
         * <p>Maximum ring time, in seconds.</p>
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
         * <p>Total Customer-side ring time, in seconds.</p>
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
        /**
         * <p>Channel Type.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <p>Quantity of assigned sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>Abandon rate. Calculation Formula: CallsAbandoned / CallsOffered (Because abandonment events and assignment events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <p>Statistics for each channel.</p>
         */
        @NameInMap("AccessChannelTypeDetails")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails;

        /**
         * <p>Average abandonment duration, in seconds. Calculation Formula: TotalAbandonTime / CallsAbandoned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        /**
         * <p>Average queue abandonment duration, in seconds. Calculation Formula: TotalAbandonedInQueueTime / CallsAbandonedInQueue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        /**
         * <p>Average ringing abandonment duration, in seconds. Calculation Formula: TotalAbandonedInRingTime / CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInRingTime")
        public Float averageAbandonedInRingTime;

        /**
         * <p>Average first response time for chat sessions, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        /**
         * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
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
         * <p>8</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average wait time, which is the average duration a caller waits before an agent answers the call. Calculation Formula: TotalWaitTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        /**
         * <p>Average post-processing duration, in seconds. Calculation Formula: TotalWorkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Quantity of abandoned calls. Calculation Formula: CallsAbandonedInQueue + CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <p>Number of calls abandoned in queue, which refers to the number of calls where the customer hung up after entering the queue but before being answered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        /**
         * <p>Ring abandonment count, which is the number of calls where the customer hung up while the agent\&quot;s phone was ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        /**
         * <p>Transfer-in volume, which refers to the number of calls transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Quantity of attended transfer-out calls, which refers to the number of calls transferred from this skill group to another skill group via consultation. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Number of blind transfer-in calls, which refers to the number of calls directly transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Number of blind transfer-out calls, which refers to the number of calls directly transferred from this skill group to another skill group. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Acknowledgement count, which is the number of times agents answered calls. For a single call that enters a queue multiple times, if it is answered by multiple agents after one queue entry, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Hold count, which is the number of times calls were placed on hold. Each time a call enters the queue and experiences multiple holds, it counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Assigned call volume, which is the number of calls assigned to this skill group, including calls assigned through queues and calls assigned via transfers (consultation transfers and direct transfers). Calculation Formula: CallsQueued + CallsBlindTransferIn + CallsAttendedTransferIn.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Overflow count, which is the number of calls that experienced queue (skill group) overflow. If a single call enters the same queue multiple times, each overflow is counted separately.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOverflow")
        public Long callsOverflow;

        /**
         * <p>Number of inbound calls entering a queue (skill group). If a single call enters the same queue multiple times, each entry is counted separately.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsQueued")
        public Long callsQueued;

        /**
         * <p>Queue Failure Quantity, which is the number of calls where the customer hung up after entering the queue but before being answered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        /**
         * <p>Quantity of calls that overflowed from the queue. Queue overflow refers to calls that overflow while queuing in IVR.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        /**
         * <p>Number of calls that timed out during the queuing phase.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        /**
         * <p>Number of calls that rang to agents. Each time a call enters the queue and is assigned to multiple agents, resulting in ringing, it counts as one.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Timeout count, which is the number of calls that experienced queue (skill group) timeout. If a single call enters the same queue multiple times, each timeout is counted separately.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        /**
         * <p>Acknowledgement rate. Calculation Formula: CallsHandled / CallsOffered (because acknowledgement events and assign events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>Maximum abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        /**
         * <p>Maximum queue abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        /**
         * <p>Maximum ring abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        /**
         * <p>Maximum call hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>Maximum ring duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <p>Maximum post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average of the satisfaction keypress digits (single-digit numbers).</p>
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
         * <p>Service level within 15 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("ServiceLevel15")
        public Float serviceLevel15;

        /**
         * <p>Service level within 20 seconds: number of calls with wait time less than or equal to 20 seconds divided by CallsQueued.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        /**
         * <p>Service level within 30 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("ServiceLevel30")
        public Float serviceLevel30;

        /**
         * <p>Total abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonTime")
        public Long totalAbandonTime;

        /**
         * <p>Total queue abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        /**
         * <p>Total ring abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        /**
         * <p>Total call hold duration, in seconds.</p>
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
         * <p>Total number of messages sent by agents in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>Total number of messages sent by the customer in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>Total ringing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>447</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total waiting duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
         * <p>Total post-processing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
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
        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because the call answering event and the acknowledgement event may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
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
         * <p>37</p>
         */
        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        /**
         * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
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
         * <p>3</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing duration per call, in seconds. Calculation Formula: TotalWorkTime / CallsDialed</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Transfer-in volume for consultation, which refers to the number of calls transferred to this skill group from other skill groups for consultation. Transfers between agents within the same skill group are not counted. If an agent joins multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Quantity of attended transfer-out calls, which refers to the number of calls transferred from this skill group to another skill group for consultation. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Quantity of direct transfer-in calls, which refers to the number of calls directly transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Quantity of direct transfer-out calls, which refers to the number of calls directly transferred from this skill group to other skill groups. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Number of dialed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Number of calls placed on hold. If a call is placed on hold multiple times before being transfer-out from the current skill group, it counts as one occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls that rang to agents. Each time a call enters the queue and is assigned to multiple agents, resulting in ringing, it counts as one occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Maximum dialing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
         * <p>Maximum ring duration, in seconds.</p>
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
         * <p>Maximum post-processing duration per call, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average value of the single-digit satisfaction key presses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Calculation Formula: Quantity of evaluations marked as satisfied divided by the Count of satisfaction survey responses.</p>
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
         * <p>Total dial-up duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>218</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <p>Total call hold duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total ring duration, in seconds.</p>
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
         * <p>3</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
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
        /**
         * <p>Break type code.</p>
         * 
         * <strong>example:</strong>
         * <p>会议</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Number of occurrences of this break type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Total duration of this break type, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
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
        /**
         * <p>Average break duration, in seconds. Calculation Formula: TotalBreakTime / Break Count. Break Count is a non-API statistical field.</p>
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
         * <p>Average ready time, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is not an API statistics field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        /**
         * <p>Average talk time, in seconds. Calculation formula: TotalTalkTime / (CallsAnswered + CallsHandled).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing time, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>List of break details.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>Maximum break duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        /**
         * <p>Maximum call hold duration, in seconds.</p>
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
         * <p>19328</p>
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
         * <p>Maximum post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Agent occupancy rate. Calculation formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02332222293912065</p>
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
         * <p>Satisfaction rate. Calculation Formula: Number of responses marked as satisfied / Count of satisfaction survey responses.</p>
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
         * <p>Total break time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <p>Total call volume. Calculation Formula: CallsOffered + CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <p>Total hold duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total logon time, in seconds.<br><em>Note: Excludes offline and short break durations.</em></p>
         * 
         * <strong>example:</strong>
         * <p>23218</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>Total ready time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22428</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>449</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
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
        /**
         * <p>Back-to-back metric.</p>
         */
        @NameInMap("Back2Back")
        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back back2Back;

        /**
         * <p>Inbound metrics.</p>
         */
        @NameInMap("Inbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListInbound inbound;

        /**
         * <p>Outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound outbound;

        /**
         * <p>Overall metrics.</p>
         */
        @NameInMap("Overall")
        public ListHistoricalSkillGroupReportResponseBodyDataListOverall overall;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>Skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
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
        /**
         * <p>List of historical data for skill groups.</p>
         */
        @NameInMap("List")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
