// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportResponseBody extends TeaModel {
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
    public GetHistoricalInstanceReportResponseBodyData data;

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

    public static GetHistoricalInstanceReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalInstanceReportResponseBody self = new GetHistoricalInstanceReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoricalInstanceReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHistoricalInstanceReportResponseBody setData(GetHistoricalInstanceReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoricalInstanceReportResponseBodyData getData() {
        return this.data;
    }

    public GetHistoricalInstanceReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHistoricalInstanceReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoricalInstanceReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList extends TeaModel {
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
         * <p>5</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        public static GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList self = new GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataInbound extends TeaModel {
        /**
         * <p>Abandon rate. Calculation Formula: CallsAbandoned / CallsOffered (because abandonment events and assignment events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <p>Statistics for each channel.</p>
         */
        @NameInMap("AccessChannelTypeDetailList")
        public java.util.List<GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList> accessChannelTypeDetailList;

        /**
         * <p>Average abandon time, in seconds. Calculation formula: TotalAbandonTime / CallsAbandoned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        /**
         * <p>Average IVR abandonment duration, in seconds. Calculation Formula: TotalAbandonedInIVRTime / CallsAbandonedInIVR.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInIVRTime")
        public Float averageAbandonedInIVRTime;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_MaxAbandonedInQueueTime_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        /**
         * <p>Average ring-time abandon duration, in seconds. Calculation formula: TotalAbandonedInRingTime / CallsAbandonedInRing.</p>
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
         * <p>12</p>
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
         * <p>Average response time (RT) for chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <p>Average ring time in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
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
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_AverageFirstResponseTime_type]number</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        /**
         * <p>Average post-processing time, in seconds. Calculation formula: TotalWorkTime / CallsHandled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Total number of abandoned calls. Calculation Formula: CallsAbandonedInIVR + CallsAbandonedInQueue + CallsAbandonedInRing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <p>Number of calls abandoned in IVR, which refers to the count of calls where the customer hung up during the IVR flow after entering it. This is determined by the hang-up reason in call details being marked as &quot;IVR abandoned.&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        /**
         * <p>Number of calls abandoned in queue, which refers to the number of calls where the customer hung up while waiting in the queue after the call entered the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        /**
         * <p>Number of calls abandoned during ringing, which refers to the quantity of calls where the customer hung up while the agent\&quot;s phone was ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        /**
         * <p>Number of calls abandoned in the Intelligent Voice Navigator module.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInVoiceNavigator")
        public Long callsAbandonedInVoiceNavigator;

        /**
         * <p>Number of consultative transfers, which refers to the number of calls that were transferred via consultative transfer. If a single call is transferred multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        /**
         * <p>The number of blind transfers, which refers to the count of calls directly transferred without consultation. If a single call is transferred multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        /**
         * <p>Number of calls that caused IVR exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsCausedIVRException")
        public Long callsCausedIVRException;

        /**
         * <p>Number of calls forwarded to an external number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsForwardToOutsideNumber")
        public Long callsForwardToOutsideNumber;

        /**
         * <p>Acknowledgement count, which refers to the number of calls answered by agents. If a single call is answered by multiple agents, it is counted only once.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_TotalAbandonTime_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <p>Number of calls with IVR exceptions. A call is counted when the IVR enters a hang-up reason node and the hang-up reason configured in that node is &quot;transfer to agent failed.&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsIVRException")
        public Long callsIVRException;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_TotalAbandonedInRingTime_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>Number of calls entering the queue. If a single call enters the queue multiple times, it is counted once.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueued")
        public Long callsQueued;

        /**
         * <p>The number of queue failures, which refers to the count of calls where the customer hung up while waiting in the queue after entering it.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        /**
         * <p>The number of calls that overflowed from the queue, where queue overflow refers to calls exceeding the queue capacity while waiting in the IVR queue.</p>
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
         * <p>Number of calls that rang agents. If a single call is assigned to multiple agents and rings, it is counted once.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>The number of calls routed to voicemail.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsToVoicemail")
        public Long callsToVoicemail;

        /**
         * <p>Number of calls transferred to voicemail. The count increases by 1 when a call enters the voicemail module configured in IVR.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsVoicemail")
        public Long callsVoicemail;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_CallsBlindTransferred_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <p>Maximum abandon time, in seconds. A call is considered abandoned if the customer hangs up after entering the IVR but before an agent answers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        /**
         * <p>Maximum IVR abandonment duration, in seconds. IVR abandonment is defined as a customer hanging up during IVR interaction. This does not include hang-ups while waiting in queue or during agent ringing after call assignment.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxAbandonedInIVRTime")
        public Long maxAbandonedInIVRTime;

        /**
         * <p>Maximum queue abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        /**
         * <p>Maximum ringing abandonment duration, in seconds. Ringing abandonment is defined as the customer hanging up while the call is ringing on the agent\&quot;s side after being assigned to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        /**
         * <p>Maximum hold time, in seconds.</p>
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
         * <p>Maximum wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <p>Maximum post-processing time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_CallsQueuingOverflow_type]integer</p>
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
         * <p>Service level within 15 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.78</p>
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
         * <p>Total IVR abandonment duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInIVRTime")
        public Long totalAbandonedInIVRTime;

        /**
         * <p>Total queue abandon time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_SatisfactionSurveysOffered_type]integer</p>
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
         * <p>8</p>
         */
        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        /**
         * <p>Total number of messages sent by the customer in chat sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_CallsQueuingFailed_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>[responses_200_schema_properties_Data_properties_Inbound_properties_CallsToVoicemail_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Total wait time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
         * <p>Total post-processing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GetHistoricalInstanceReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataInbound self = new GetHistoricalInstanceReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAbandonRate(Float abandonRate) {
            this.abandonRate = abandonRate;
            return this;
        }
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAccessChannelTypeDetailList(java.util.List<GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList> accessChannelTypeDetailList) {
            this.accessChannelTypeDetailList = accessChannelTypeDetailList;
            return this;
        }
        public java.util.List<GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList> getAccessChannelTypeDetailList() {
            return this.accessChannelTypeDetailList;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonTime(Float averageAbandonTime) {
            this.averageAbandonTime = averageAbandonTime;
            return this;
        }
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonedInIVRTime(Float averageAbandonedInIVRTime) {
            this.averageAbandonedInIVRTime = averageAbandonedInIVRTime;
            return this;
        }
        public Float getAverageAbandonedInIVRTime() {
            return this.averageAbandonedInIVRTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
            this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
            return this;
        }
        public Float getAverageAbandonedInQueueTime() {
            return this.averageAbandonedInQueueTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
            this.averageAbandonedInRingTime = averageAbandonedInRingTime;
            return this;
        }
        public Float getAverageAbandonedInRingTime() {
            return this.averageAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageFirstResponseTime(Float averageFirstResponseTime) {
            this.averageFirstResponseTime = averageFirstResponseTime;
            return this;
        }
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageResponseTime(Float averageResponseTime) {
            this.averageResponseTime = averageResponseTime;
            return this;
        }
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageWaitTime(Float averageWaitTime) {
            this.averageWaitTime = averageWaitTime;
            return this;
        }
        public Float getAverageWaitTime() {
            return this.averageWaitTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInRing(Long callsAbandonedInRing) {
            this.callsAbandonedInRing = callsAbandonedInRing;
            return this;
        }
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInVoiceNavigator(Long callsAbandonedInVoiceNavigator) {
            this.callsAbandonedInVoiceNavigator = callsAbandonedInVoiceNavigator;
            return this;
        }
        public Long getCallsAbandonedInVoiceNavigator() {
            return this.callsAbandonedInVoiceNavigator;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAttendedTransferred(Long callsAttendedTransferred) {
            this.callsAttendedTransferred = callsAttendedTransferred;
            return this;
        }
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsBlindTransferred(Long callsBlindTransferred) {
            this.callsBlindTransferred = callsBlindTransferred;
            return this;
        }
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsCausedIVRException(Long callsCausedIVRException) {
            this.callsCausedIVRException = callsCausedIVRException;
            return this;
        }
        public Long getCallsCausedIVRException() {
            return this.callsCausedIVRException;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsForwardToOutsideNumber(Long callsForwardToOutsideNumber) {
            this.callsForwardToOutsideNumber = callsForwardToOutsideNumber;
            return this;
        }
        public Long getCallsForwardToOutsideNumber() {
            return this.callsForwardToOutsideNumber;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsIVRException(Long callsIVRException) {
            this.callsIVRException = callsIVRException;
            return this;
        }
        public Long getCallsIVRException() {
            return this.callsIVRException;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueued(Long callsQueued) {
            this.callsQueued = callsQueued;
            return this;
        }
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingFailed(Long callsQueuingFailed) {
            this.callsQueuingFailed = callsQueuingFailed;
            return this;
        }
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingOverflow(Long callsQueuingOverflow) {
            this.callsQueuingOverflow = callsQueuingOverflow;
            return this;
        }
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsToVoicemail(Long callsToVoicemail) {
            this.callsToVoicemail = callsToVoicemail;
            return this;
        }
        public Long getCallsToVoicemail() {
            return this.callsToVoicemail;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsVoicemail(Long callsVoicemail) {
            this.callsVoicemail = callsVoicemail;
            return this;
        }
        public Long getCallsVoicemail() {
            return this.callsVoicemail;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonTime(Long maxAbandonTime) {
            this.maxAbandonTime = maxAbandonTime;
            return this;
        }
        public Long getMaxAbandonTime() {
            return this.maxAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInIVRTime(Long maxAbandonedInIVRTime) {
            this.maxAbandonedInIVRTime = maxAbandonedInIVRTime;
            return this;
        }
        public Long getMaxAbandonedInIVRTime() {
            return this.maxAbandonedInIVRTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
            this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
            return this;
        }
        public Long getMaxAbandonedInQueueTime() {
            return this.maxAbandonedInQueueTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
            this.maxAbandonedInRingTime = maxAbandonedInRingTime;
            return this;
        }
        public Long getMaxAbandonedInRingTime() {
            return this.maxAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setServiceLevel15(Float serviceLevel15) {
            this.serviceLevel15 = serviceLevel15;
            return this;
        }
        public Float getServiceLevel15() {
            return this.serviceLevel15;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setServiceLevel30(Float serviceLevel30) {
            this.serviceLevel30 = serviceLevel30;
            return this;
        }
        public Float getServiceLevel30() {
            return this.serviceLevel30;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonTime(Long totalAbandonTime) {
            this.totalAbandonTime = totalAbandonTime;
            return this;
        }
        public Long getTotalAbandonTime() {
            return this.totalAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInIVRTime(Long totalAbandonedInIVRTime) {
            this.totalAbandonedInIVRTime = totalAbandonedInIVRTime;
            return this;
        }
        public Long getTotalAbandonedInIVRTime() {
            return this.totalAbandonedInIVRTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
            this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
            return this;
        }
        public Long getTotalAbandonedInQueueTime() {
            return this.totalAbandonedInQueueTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
            this.totalAbandonedInRingTime = totalAbandonedInRingTime;
            return this;
        }
        public Long getTotalAbandonedInRingTime() {
            return this.totalAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalMessagesSent(Long totalMessagesSent) {
            this.totalMessagesSent = totalMessagesSent;
            return this;
        }
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
            this.totalMessagesSentByAgent = totalMessagesSentByAgent;
            return this;
        }
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
            this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
            return this;
        }
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataInternal extends TeaModel {
        /**
         * <p>Number of answered calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Dial-up volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        public static GetHistoricalInstanceReportResponseBodyDataInternal build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataInternal self = new GetHistoricalInstanceReportResponseBodyDataInternal();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataInternal setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetHistoricalInstanceReportResponseBodyDataInternal setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataOutbound extends TeaModel {
        /**
         * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because the answering event and the acknowledgement event may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Average Dial-up Time, in seconds. Calculation Formula: TotalDialingTime / CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <p>Average post-processing time per call, in seconds. Calculation Formula: TotalWorkTime / CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Answered Call Count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <p>Number of attended transfers, which refers to the quantity of calls that underwent attended transfer. If a single call is transferred multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        /**
         * <p>Number of blind transfers, which refers to the quantity of calls that underwent blind transfer. If a single call is transferred multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        /**
         * <p>Dial-up Call Count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Hold Count, which is the number of calls that were placed on hold. If a single call was put on hold multiple times, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Integer callsHold;

        /**
         * <p>Number of calls that rang for agents. If a single call is assigned to multiple agents and rings for each, it is counted as one.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <p>Maximum Dial-up Time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <p>Maximum call hold duration, in seconds.</p>
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
         * <p>Maximum Talk Time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>Maximum post-processing time per call, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <p>Satisfaction Index, which is the average of the satisfaction keypress digits (single-digit numbers).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        /**
         * <p>Satisfaction Rate. Calculation Formula: Number of responses marked as satisfied / Count of satisfaction survey responses.</p>
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
         * <p>0</p>
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
         * <p>Total Ring Time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <p>Total Talk Time, in seconds.</p>
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
         * <p>0</p>
         */
        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GetHistoricalInstanceReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataOutbound self = new GetHistoricalInstanceReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsAttendedTransferred(Long callsAttendedTransferred) {
            this.callsAttendedTransferred = callsAttendedTransferred;
            return this;
        }
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsBlindTransferred(Long callsBlindTransferred) {
            this.callsBlindTransferred = callsBlindTransferred;
            return this;
        }
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsHold(Integer callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Integer getCallsHold() {
            return this.callsHold;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataOverall extends TeaModel {
        /**
         * <p>Average break duration, in seconds. Calculation Formula: TotalBreakTime / Count of breaks. The count of breaks is not an exposed API field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / (InboundCallsHold + OutboundCallsHold).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <p>Average ready duration, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is not currently exposed externally.</p>
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
         * <p>Average post-processing time per call, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <p>Maximum short break duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Maximum number of agents simultaneously logged on during the Time Range.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("MaxLoggedInAgents")
        public Long maxLoggedInAgents;

        /**
         * <p>Maximum ready time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Maximum post-processing time per call, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Total break time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <p>Total call volume. Calculation Formula: CallsOffered + CallsDialed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Total logon duration, in seconds. Exclude break time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <p>Total ready time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

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

        public static GetHistoricalInstanceReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataOverall self = new GetHistoricalInstanceReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxLoggedInAgents(Long maxLoggedInAgents) {
            this.maxLoggedInAgents = maxLoggedInAgents;
            return this;
        }
        public Long getMaxLoggedInAgents() {
            return this.maxLoggedInAgents;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyData extends TeaModel {
        /**
         * <p>Inbound data.</p>
         */
        @NameInMap("Inbound")
        public GetHistoricalInstanceReportResponseBodyDataInbound inbound;

        /**
         * <p>Internal call metrics.</p>
         */
        @NameInMap("Internal")
        public GetHistoricalInstanceReportResponseBodyDataInternal internal;

        /**
         * <p>Outbound metrics.</p>
         */
        @NameInMap("Outbound")
        public GetHistoricalInstanceReportResponseBodyDataOutbound outbound;

        /**
         * <p>Overall metrics.</p>
         */
        @NameInMap("Overall")
        public GetHistoricalInstanceReportResponseBodyDataOverall overall;

        public static GetHistoricalInstanceReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyData self = new GetHistoricalInstanceReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyData setInbound(GetHistoricalInstanceReportResponseBodyDataInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetHistoricalInstanceReportResponseBodyDataInbound getInbound() {
            return this.inbound;
        }

        public GetHistoricalInstanceReportResponseBodyData setInternal(GetHistoricalInstanceReportResponseBodyDataInternal internal) {
            this.internal = internal;
            return this;
        }
        public GetHistoricalInstanceReportResponseBodyDataInternal getInternal() {
            return this.internal;
        }

        public GetHistoricalInstanceReportResponseBodyData setOutbound(GetHistoricalInstanceReportResponseBodyDataOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetHistoricalInstanceReportResponseBodyDataOutbound getOutbound() {
            return this.outbound;
        }

        public GetHistoricalInstanceReportResponseBodyData setOverall(GetHistoricalInstanceReportResponseBodyDataOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetHistoricalInstanceReportResponseBodyDataOverall getOverall() {
            return this.overall;
        }

    }

}
