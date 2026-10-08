// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListHistoricalSkillGroupReportResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <p>The agent answer rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        /**
         * <p>The answer rate. Calculation formula: CallsAnswered/CallsDialed. The result may exceed 100% in some cases because answer events and response events may fall into different time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>The average ring time on the customer side, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        /**
         * <p>The average ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>The average talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>The number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>The number of calls answered by customers.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CallsCustomerAnswered")
        public Long callsCustomerAnswered;

        /**
         * <p>The number of dialed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>The customer answer rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("CustomerAnswerRate")
        public Float customerAnswerRate;

        /**
         * <p>The maximum ring time on the customer side, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCustomerRingTime")
        public Long maxCustomerRingTime;

        /**
         * <p>The maximum ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>The maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>The total ring time on the customer side, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCustomerRingTime")
        public Long totalCustomerRingTime;

        /**
         * <p>The total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>The total talk time, in seconds.</p>
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
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <p>The number of offered sessions.</p>
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
         * <p>The abandon rate. Calculation formula: CallsAbandoned/CallsOffered. The result may exceed 100% in some cases because abandon events and allocation events may fall into different time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <p>The statistical data for each channel.</p>
         */
        @NameInMap("AccessChannelTypeDetails")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListInboundAccessChannelTypeDetails> accessChannelTypeDetails;

        /**
         * <p>The average abandon time, in seconds. Calculation formula: TotalAbandonTime/CallsAbandoned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        /**
         * <p>The average abandon time in queue, in seconds. Calculation formula: TotalAbandonedInQueueTime/CallsAbandonedInQueue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        /**
         * <p>The average abandon time during ringing, in seconds. Calculation formula: TotalAbandonedInRingTime/CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInRingTime")
        public Float averageAbandonedInRingTime;

        /**
         * <p>The average first response time for chat sessions, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        /**
         * <p>The average hold time, in seconds. Calculation formula: TotalHoldTime/CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>The average response time for chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>The average ring time, in seconds. Calculation formula: TotalRingTime/CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>The average talk time, in seconds. Calculation formula: TotalTalkTime/CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>The average wait time, which is the average time a caller waits before an agent answers the call. Calculation formula: TotalWaitTime/CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        /**
         * <p>The average after-call work time, in seconds. Calculation formula: TotalWorkTime/CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>The number of abandoned calls. Calculation formula: CallsAbandonedInQueue + CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <p>The number of calls abandoned in queue, which refers to the number of calls hung up by customers while waiting in the queue after entering it.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        /**
         * <p>The number of calls abandoned during ringing, which refers to the number of calls hung up by customers while the agent is ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        /**
         * <p>The number of attended transfers in, which refers to the number of calls transferred to this skill group from other skill groups through attended transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>The number of attended transfers out, which refers to the number of calls transferred from this skill group to other skill groups through attended transfers. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>The number of blind transfers in, which refers to the number of calls transferred to this skill group from other skill groups through blind transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>The number of blind transfers out, which refers to the number of calls transferred from this skill group to other skill groups through blind transfers. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>The number of handled calls, which refers to the number of times agents answer calls. If a call is answered by multiple agents after entering the queue each time, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>The number of held calls, which refers to the number of times calls are put on hold. If a call is put on hold multiple times after entering the queue each time, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>The number of offered calls, which refers to the number of calls assigned to this skill group, including calls assigned through queues and calls assigned through transfers (attended transfers and blind transfers). Calculation formula: CallsQueued + CallsBlindTransferIn + CallsAttendedTransferIn.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>The number of overflowed calls, which refers to the number of calls that overflow from the queue or skill group. If a call enters the same queue multiple times and overflows each time, each overflow is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOverflow")
        public Long callsOverflow;

        /**
         * <p>The number of queued calls in inbound scenarios, which refers to the number of calls that enter the queue or skill group. If a call enters the same queue multiple times, each entry is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsQueued")
        public Long callsQueued;

        /**
         * <p>The number of failed queue calls, which refers to the number of calls hung up by customers while waiting in the queue after entering it.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        /**
         * <p>The number of calls that overflow from the queue, which refers to calls that overflow while waiting in the IVR queue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        /**
         * <p>The number of calls that time out during the queuing phase.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        /**
         * <p>The number of ringing calls, which refers to the number of calls that trigger agent ringing. If a call is assigned to multiple agents and triggers ringing after entering the queue each time, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>The number of timed-out calls, which refers to the number of calls that time out in the queue or skill group. If a call enters the same queue multiple times and times out each time, each timeout is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        /**
         * <p>The handle rate. Calculation formula: CallsHandled/CallsOffered. The result may exceed 100% in some cases because handle events and offer events may fall into different time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>The maximum abandon time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        /**
         * <p>The maximum abandon time in queue, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        /**
         * <p>The maximum abandon time during ringing, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        /**
         * <p>The maximum hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>The maximum ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>The maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>The maximum wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <p>The maximum after-call work time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>The number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>The number of satisfaction surveys responded to.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>The 15-second service level.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("ServiceLevel15")
        public Float serviceLevel15;

        /**
         * <p>The 20-second service level. Calculation formula: Number of calls with a wait time of less than or equal to 20 seconds / CallsQueued.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        /**
         * <p>The 30-second service level.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("ServiceLevel30")
        public Float serviceLevel30;

        /**
         * <p>The total abandon time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonTime")
        public Long totalAbandonTime;

        /**
         * <p>The total abandon time in queue, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        /**
         * <p>The total abandon time during ringing, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        /**
         * <p>The total hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>The total number of messages sent in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        /**
         * <p>The total number of messages sent by agents in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>The total number of messages sent by customers in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>The total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>The total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>447</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>The total wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
         * <p>The total after-call work time, in seconds.</p>
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
         * <p>The answer rate. Calculation formula: CallsAnswered/CallsDialed. The result may exceed 100% in some cases because answer events and response events may fall into different time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>The average dialing time in seconds. Formula: TotalDialingTime/CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        /**
         * <p>The average hold time, in seconds. Calculation formula: TotalHoldTime/CallsHold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>The average ring time, in seconds. Calculation formula: TotalRingTime/CallsRinged.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <p>The average talk time in seconds. Formula: TotalTalkTime/CallsAnswered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>The average after-call work time in seconds. Formula: TotalWorkTime/CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>The number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>The number of attended transfers in, which refers to the number of calls transferred to this skill group from other skill groups through attended transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

        /**
         * <p>The number of attended transfers out, which refers to the number of calls transferred from this skill group to other skill groups through attended transfers. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferOut")
        public Long callsAttendedTransferOut;

        /**
         * <p>The number of blind transfers in, which refers to the number of calls transferred to this skill group from other skill groups through blind transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <p>The number of blind transfers out, which refers to the number of calls transferred from this skill group to other skill groups through blind transfers. Transfers between agents within the same skill group are not counted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <p>The number of dialed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>The number of calls placed on hold. If a call is placed on hold multiple times before being transferred out of the current skill group, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>The number of ringing calls, which refers to the number of calls that trigger agent ringing. If a call is assigned to multiple agents and triggers ringing after entering the queue each time, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>The maximum dialing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <p>The maximum hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>The maximum ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <p>The maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>The maximum after-call work time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>The number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>The number of satisfaction surveys responded to.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>The total dialing time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>218</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <p>The total hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>The total ring time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>The total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>The total after-call work time, in seconds.</p>
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
         * <p>The break type code.</p>
         * 
         * <strong>example:</strong>
         * <p>Meeting</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>The number of occurrences of this break type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The total duration of this break type in seconds.</p>
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
         * <p>The average break time in seconds. Formula: TotalBreakTime/Number of breaks. The number of breaks is not a statistical field returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <p>The average hold time in seconds. Formula: TotalHoldTime/(Inbound CallsHold + Outbound CallsHold).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>The average ready time in seconds. Formula: TotalReadyTime/Number of ready states. The number of ready states is not a statistical field returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        /**
         * <p>The average talk time in seconds. Formula: TotalTalkTime/(CallsAnswered + CallsHandled).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>The average after-call work time in seconds. Formula: TotalWorkTime/TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>The list of break details.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataListOverallBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>The maximum break time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        /**
         * <p>The maximum hold time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <p>The maximum ready time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>19328</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <p>The maximum talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>The maximum after-call work time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>The agent occupancy rate. Formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02332222293912065</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        /**
         * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        /**
         * <p>The number of satisfaction surveys offered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        /**
         * <p>The number of satisfaction surveys responded to.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        /**
         * <p>The total break time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <p>The total number of calls. Formula: CallsOffered + CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <p>The total hold time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <p>The total logged-in time in seconds.
         * <em>Note: Excludes offline and break time.</em></p>
         * 
         * <strong>example:</strong>
         * <p>23218</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>The total ready time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22428</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <p>The total talk time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>449</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>The total after-call work time, in seconds.</p>
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
         * <p>The back-to-back call metrics.</p>
         */
        @NameInMap("Back2Back")
        public ListHistoricalSkillGroupReportResponseBodyDataListBack2Back back2Back;

        /**
         * <p>The inbound call metrics.</p>
         */
        @NameInMap("Inbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListInbound inbound;

        /**
         * <p>The outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public ListHistoricalSkillGroupReportResponseBodyDataListOutbound outbound;

        /**
         * <p>The overall metrics.</p>
         */
        @NameInMap("Overall")
        public ListHistoricalSkillGroupReportResponseBodyDataListOverall overall;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The skill group name.</p>
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
         * <p>The list of historical data for the skill group.</p>
         */
        @NameInMap("List")
        public java.util.List<ListHistoricalSkillGroupReportResponseBodyDataList> list;

        /**
         * <p>The page number. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
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
