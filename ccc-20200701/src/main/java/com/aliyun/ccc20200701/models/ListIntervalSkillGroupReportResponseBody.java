// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalSkillGroupReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListIntervalSkillGroupReportResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
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
        @NameInMap("AgentHandleRate")
        public Float agentHandleRate;

        @NameInMap("AnswerRate")
        public String answerRate;

        @NameInMap("AverageCustomerRingTime")
        public Float averageCustomerRingTime;

        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("AverageTalkTime")
        public String averageTalkTime;

        @NameInMap("CallsAgentHandled")
        public Long callsAgentHandled;

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
        public String maxTalkTime;

        @NameInMap("TotalCustomerRingTime")
        public Long totalCustomerRingTime;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageAbandonedInRingTime")
        public Float averageAbandonedInRingTime;

        @NameInMap("AverageFirstResponseTime")
        public Float averageFirstResponseTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("AverageResponseTime")
        public Float averageResponseTime;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

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
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsOverflow")
        public Long callsOverflow;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsQueued")
        public Long callsQueued;

        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsTimeout")
        public Long callsTimeout;

        /**
         * <strong>example:</strong>
         * <p>0.6666666666666666</p>
         */
        @NameInMap("HandleRate")
        public Float handleRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <strong>example:</strong>
         * <p>19</p>
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
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

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
        @NameInMap("TotalAbandonTime")
        public Long totalAbandonTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalMessagesSent")
        public Long totalMessagesSent;

        @NameInMap("TotalMessagesSentByAgent")
        public Long totalMessagesSentByAgent;

        @NameInMap("TotalMessagesSentByCustomer")
        public Long totalMessagesSentByCustomer;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsAttendedTransferIn")
        public Long callsAttendedTransferIn;

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
        @NameInMap("CallsBlindTransferIn")
        public Long callsBlindTransferIn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsBlindTransferOut")
        public Long callsBlindTransferOut;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsHold")
        public Long callsHold;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallsRinged")
        public Long callsRinged;

        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
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
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

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
         * <p>60</p>
         */
        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
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
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("Count")
        public Long count;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListIntervalSkillGroupReportResponseBodyDataOverallBreakCodeDetailList> breakCodeDetailList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        /**
         * <strong>example:</strong>
         * <p>4927</p>
         */
        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        /**
         * <strong>example:</strong>
         * <p>0.00422315148470254</p>
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
        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

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
         * <p>5</p>
         */
        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        /**
         * <strong>example:</strong>
         * <p>9236</p>
         */
        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        /**
         * <strong>example:</strong>
         * <p>9106</p>
         */
        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
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
        @NameInMap("Back2Back")
        public ListIntervalSkillGroupReportResponseBodyDataBack2Back back2Back;

        @NameInMap("Inbound")
        public ListIntervalSkillGroupReportResponseBodyDataInbound inbound;

        @NameInMap("Outbound")
        public ListIntervalSkillGroupReportResponseBodyDataOutbound outbound;

        @NameInMap("Overall")
        public ListIntervalSkillGroupReportResponseBodyDataOverall overall;

        /**
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
