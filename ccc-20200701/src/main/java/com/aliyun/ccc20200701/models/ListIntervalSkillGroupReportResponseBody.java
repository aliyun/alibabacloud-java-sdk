// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalSkillGroupReportResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of segment-based statistics for the skill group.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListIntervalSkillGroupReportResponseBodyData> data;

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

    public static ListIntervalSkillGroupReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalSkillGroupReportResponseBody self = new ListIntervalSkillGroupReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntervalSkillGroupReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntervalSkillGroupReportResponseBody setData(java.util.List<ListIntervalSkillGroupReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntervalSkillGroupReportResponseBodyData> getData() {
        return this.data;
    }

    public ListIntervalSkillGroupReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntervalSkillGroupReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntervalSkillGroupReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntervalSkillGroupReportResponseBodyDataBack2Back extends TeaModel {
        /**
         * <p>Agent acknowledgement rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because management events for answering and acknowledgement may fall into different Time Ranges, the Result may exceed 100% in certain cases.)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("AnswerRate")
        public String answerRate;

        /**
         * <p>Average ring time on the Customer side, in seconds.</p>
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
        public String averageTalkTime;

        /**
         * <p>Quantity of calls handled by agents.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

        /**
         * <p>Call connection volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Quantity of calls answered by the Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        /**
         * <p>Dial-up volume.</p>
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
         * <p>0.6</p>
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
        public String maxTalkTime;

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

        public static ListIntervalSkillGroupReportResponseBodyDataBack2Back build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyDataBack2Back self = new ListIntervalSkillGroupReportResponseBodyDataBack2Back();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setAgentHandleRate(Float agentHandleRate) {
            this.agentHandleRate = agentHandleRate;
            return this;
        }
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setAnswerRate(String answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public String getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setAverageCustomerRingTime(Float averageCustomerRingTime) {
            this.averageCustomerRingTime = averageCustomerRingTime;
            return this;
        }
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setAverageTalkTime(String averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public String getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setCallsAgentHandled(Long callsAgentHandled) {
            this.callsAgentHandled = callsAgentHandled;
            return this;
        }
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setCallsCustomerAnswered(Long callsCustomerAnswered) {
            this.callsCustomerAnswered = callsCustomerAnswered;
            return this;
        }
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setCustomerAnswerRate(Float customerAnswerRate) {
            this.customerAnswerRate = customerAnswerRate;
            return this;
        }
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setMaxCustomerRingTime(Long maxCustomerRingTime) {
            this.maxCustomerRingTime = maxCustomerRingTime;
            return this;
        }
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setMaxTalkTime(String maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setTotalCustomerRingTime(Long totalCustomerRingTime) {
            this.totalCustomerRingTime = totalCustomerRingTime;
            return this;
        }
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataBack2Back setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

    }

    public static class ListIntervalSkillGroupReportResponseBodyDataInbound extends TeaModel {
        /**
         * <p>Abandon rate. Calculation Formula: CallsAbandoned / CallsOffered (because management events related to abandonment and assignment may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <p>Average abandonment duration, in seconds. Calculation Formula: TotalAbandonTime / CallsAbandoned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        /**
         * <p>Average abandoned-in-queue duration, in seconds. Calculation Formula: TotalAbandonedInQueueTime / CallsAbandonedInQueue.</p>
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
         * <p>18</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>Average talk duration, in seconds. Calculation Formula: TotalTalkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average wait time, which is the average duration a caller waits before an agent answers the call. Calculation Formula: TotalWaitTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        /**
         * <p>Average post-processing duration, in seconds. Calculation Formula: TotalWorkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Abandoned call quantity. Calculation Formula: CallsAbandonedInQueue + CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <p>Quantity of abandoned calls in queue, which refers to the number of calls where the customer hung up after entering the queue but before being answered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        /**
         * <p>Ring abandonment count, which refers to the number of calls abandoned by customers while ringing to an agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        /**
         * <p>Attended transfer-in count, which is the number of calls transferred to this skill group via attended transfers initiated from other skill groups. Transfers between agents within the same skill group are not counted. If an agent signs in to multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed in to. If a single call is transferred from another skill group to this skill group multiple times, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Attended transfer-out count, which refers to the number of calls transferred from this skill group to another skill group for consultation. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Quantity of blind transfer-in calls, which refers to the number of calls directly transferred into this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups into this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Quantity of blind transfer-out calls, which refers to the number of calls directly transferred out from this skill group to other skill groups. Transfers between agents within the same skill group are not counted.</p>
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
         * <p>2</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>Hold count, which is the number of times calls were placed on hold. If a single call enters the queue and is placed on hold multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Assigned call volume, which is the number of calls assigned to this skill group, including calls assigned through queues and calls assigned via transfers (consultation transfers and direct transfers). Calculation formula: CallsQueued + CallsBlindTransferIn + CallsAttendedTransferIn.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Overflow count, which is the number of calls that overflowed from a queue (skill group). If a single call enters the same queue multiple times, each overflow is counted separately.</p>
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
         * <p>3</p>
         */
        @NameInMap("CallsQueued")
        public Long callsQueued;

        /**
         * <p>Number of calls that overflowed from the queue, meaning calls that experienced queue overflow while waiting in the IVR queue.</p>
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
         * <p>Number of calls that rang to agents. Each time a call enters the queue and is assigned to multiple agents, resulting in ringing, it is counted as one occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Timeout count, which is the number of calls that timed out in a queue (skill group). If a single call enters the same queue multiple times, each timeout is counted separately.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        /**
         * <p>Acknowledgement rate. Calculation Formula: CallsHandled / CallsOffered (because acknowledgement events and assignment events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>0.6666666666666666</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>Maximum abandonment time, in seconds.</p>
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
         * <p>Maximum hold duration, in seconds.</p>
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
         * <p>18</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>Maximum talk duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <p>Maximum post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction index, which is the average value of the satisfaction rating digits (single-digit numbers) entered by callers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction rate. Calculation Formula: Number of evaluations marked as satisfied divided by the count of satisfaction survey responses.</p>
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
         * <p>Service level within 20 seconds: the number of calls with waiting time less than or equal to 20 seconds divided by CallsQueued.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

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
         * <p>Total ringing abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        /**
         * <p>Total call hold time, in seconds.</p>
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
         * <p>7</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>Total number of messages sent by the Customer in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>Total ringing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total talk duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
         * <p>Total post-processing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalSkillGroupReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyDataInbound self = new ListIntervalSkillGroupReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAbandonRate(Float abandonRate) {
            this.abandonRate = abandonRate;
            return this;
        }
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageAbandonTime(Float averageAbandonTime) {
            this.averageAbandonTime = averageAbandonTime;
            return this;
        }
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
            this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
            return this;
        }
        public Float getAverageAbandonedInQueueTime() {
            return this.averageAbandonedInQueueTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
            this.averageAbandonedInRingTime = averageAbandonedInRingTime;
            return this;
        }
        public Float getAverageAbandonedInRingTime() {
            return this.averageAbandonedInRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageWaitTime(Float averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Float getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsAbandonedInRing(Long callsAbandonedInRing) {
            this.callsAbandonedInRing = callsAbandonedInRing;
            return this;
        }
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsOverflow(Long callsOverflow) {
            this.callsOverflow = callsOverflow;
            return this;
        }
        public Long getCallsOverflow() {
            return this.callsOverflow;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsQueued(Long callsQueued) {
            this.callsQueued = callsQueued;
            return this;
        }
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsQueuingOverflow(Long callsQueuingOverflow) {
            this.callsQueuingOverflow = callsQueuingOverflow;
            return this;
        }
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setCallsTimeout(Long callsTimeout) {
            this.callsTimeout = callsTimeout;
            return this;
        }
        public Long getCallsTimeout() {
            return this.callsTimeout;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxAbandonTime(Long maxAbandonTime) {
            this.maxAbandonTime = maxAbandonTime;
            return this;
        }
        public Long getMaxAbandonTime() {
            return this.maxAbandonTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
            this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
            return this;
        }
        public Long getMaxAbandonedInQueueTime() {
            return this.maxAbandonedInQueueTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
            this.maxAbandonedInRingTime = maxAbandonedInRingTime;
            return this;
        }
        public Long getMaxAbandonedInRingTime() {
            return this.maxAbandonedInRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalAbandonTime(Long totalAbandonTime) {
            this.totalAbandonTime = totalAbandonTime;
            return this;
        }
        public Long getTotalAbandonTime() {
            return this.totalAbandonTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
            this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
            return this;
        }
        public Long getTotalAbandonedInQueueTime() {
            return this.totalAbandonedInQueueTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
            this.totalAbandonedInRingTime = totalAbandonedInRingTime;
            return this;
        }
        public Long getTotalAbandonedInRingTime() {
            return this.totalAbandonedInRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalSkillGroupReportResponseBodyDataOutbound extends TeaModel {
        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed (because management events for answering and acknowledgement may fall into different Time Ranges, the Result may exceed 100% in certain cases).</p>
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
         * <p>Average hold time during calls, in seconds. Calculation formula: TotalHoldTime / CallsHold.</p>
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
         * <p>5</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing time in seconds. Calculation Formula: TotalWorkTime / CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Answered call count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Transfer-in calls, which refer to the number of calls transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>Transfer-out call volume, which refers to the number of calls initiated by this skill group and transferred to other skill groups. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>Direct transfer-in calls, which refer to the number of calls directly transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>Direct transfer-out calls, which refer to the number of calls directly transferred from this skill group to other skill groups. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>Dialed call count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Hold count, which is the number of calls that were placed on hold. If a single call was placed on hold multiple times before being transferred out of the current skill group, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls that rang to agents. Each call is counted once per queue entry, even if it was assigned to multiple agents and rang multiple times.</p>
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
         * <p>49</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <p>Maximum hold time during a call, in seconds.</p>
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
         * <p>5</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>Satisfaction rate. Calculation Formula: number of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
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
         * <p>60</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <p>Total hold time during calls, in seconds.</p>
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
         * <p>5</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalSkillGroupReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyDataOutbound self = new ListIntervalSkillGroupReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
            this.callsAttendedTransferIn = callsAttendedTransferIn;
            return this;
        }
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
            this.callsAttendedTransferOut = callsAttendedTransferOut;
            return this;
        }
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsBlindTransferIn(Long callsBlindTransferIn) {
            this.callsBlindTransferIn = callsBlindTransferIn;
            return this;
        }
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsBlindTransferOut(Long callsBlindTransferOut) {
            this.callsBlindTransferOut = callsBlindTransferOut;
            return this;
        }
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList extends TeaModel {
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
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Total duration of this break type, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList self = new ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class ListIntervalSkillGroupReportResponseBodyDataOverall extends TeaModel {
        /**
         * <p>Average break time, in seconds. Calculation Formula: TotalBreakTime / Count of breaks. The Count of breaks is not a field provided by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <p>Average call hold time, in seconds. Calculation Formula: TotalHoldTime / (Inbound CallsHold + Outbound CallsHold).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ready time, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is not an API statistical field.</p>
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
         * <p>Average post-processing time, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Statistics for each break type.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList;

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
         * <p>4927</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <p>Maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Agent occupancy rate, calculated using the formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00422315148470254</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        /**
         * <p>Satisfaction index, which is the average value of the single-digit satisfaction rating entered by users.</p>
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
         * <p>5</p>
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
         * <p>Total hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>Total logon duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9236</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>Total ready time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9106</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <p>Total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total post-processing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static ListIntervalSkillGroupReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyDataOverall self = new ListIntervalSkillGroupReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setBreakCodeDetailList(java.util.List<ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListIntervalSkillGroupReportResponseBodyDataOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class ListIntervalSkillGroupReportResponseBodyData extends TeaModel {
        /**
         * <p>Back-to-back call metric.</p>
         */
        @NameInMap("Back2Back")
        public ListIntervalSkillGroupReportResponseBodyDataBack2Back back2Back;

        /**
         * <p>Inbound metrics.</p>
         */
        @NameInMap("Inbound")
        public ListIntervalSkillGroupReportResponseBodyDataInbound inbound;

        /**
         * <p>Outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public ListIntervalSkillGroupReportResponseBodyDataOutbound outbound;

        /**
         * <p>Overall metrics.</p>
         */
        @NameInMap("Overall")
        public ListIntervalSkillGroupReportResponseBodyDataOverall overall;

        /**
         * <p>Start Time of the time segment, formatted as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1604639129000</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        public static ListIntervalSkillGroupReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntervalSkillGroupReportResponseBodyData self = new ListIntervalSkillGroupReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntervalSkillGroupReportResponseBodyData setBack2Back(ListIntervalSkillGroupReportResponseBodyDataBack2Back back2Back) {
            this.back2Back = back2Back;
            return this;
        }
        public ListIntervalSkillGroupReportResponseBodyDataBack2Back getBack2Back() {
            return this.back2Back;
        }

        public ListIntervalSkillGroupReportResponseBodyData setInbound(ListIntervalSkillGroupReportResponseBodyDataInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public ListIntervalSkillGroupReportResponseBodyDataInbound getInbound() {
            return this.inbound;
        }

        public ListIntervalSkillGroupReportResponseBodyData setOutbound(ListIntervalSkillGroupReportResponseBodyDataOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public ListIntervalSkillGroupReportResponseBodyDataOutbound getOutbound() {
            return this.outbound;
        }

        public ListIntervalSkillGroupReportResponseBodyData setOverall(ListIntervalSkillGroupReportResponseBodyDataOverall overall) {
            this.overall = overall;
            return this;
        }
        public ListIntervalSkillGroupReportResponseBodyDataOverall getOverall() {
            return this.overall;
        }

        public ListIntervalSkillGroupReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

    }

}
