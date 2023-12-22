// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHistoricalInstanceReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AccessChannelType")
        public String accessChannelType;

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
        @NameInMap("AbandonRate")
        public Float abandonRate;

        @NameInMap("AccessChannelTypeDetailList")
        public java.util.List<GetHistoricalInstanceReportResponseBodyDataInboundAccessChannelTypeDetailList> accessChannelTypeDetailList;

        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        @NameInMap("AverageAbandonedInIVRTime")
        public Float averageAbandonedInIVRTime;

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

        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        @NameInMap("CallsAbandonedInVoiceNavigator")
        public Long callsAbandonedInVoiceNavigator;

        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        @NameInMap("CallsCausedIVRException")
        public Long callsCausedIVRException;

        @NameInMap("CallsForwardToOutsideNumber")
        public Long callsForwardToOutsideNumber;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsHold")
        public Long callsHold;

        @NameInMap("CallsIVRException")
        public Long callsIVRException;

        @NameInMap("CallsOffered")
        public Long callsOffered;

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

        @NameInMap("CallsToVoicemail")
        public Long callsToVoicemail;

        @NameInMap("CallsVoicemail")
        public Long callsVoicemail;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        @NameInMap("MaxAbandonedInIVRTime")
        public Long maxAbandonedInIVRTime;

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

        @NameInMap("TotalAbandonedInIVRTime")
        public Long totalAbandonedInIVRTime;

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
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

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

        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsHold")
        public Integer callsHold;

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

        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxLoggedInAgents")
        public Long maxLoggedInAgents;

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
        @NameInMap("Inbound")
        public GetHistoricalInstanceReportResponseBodyDataInbound inbound;

        @NameInMap("Internal")
        public GetHistoricalInstanceReportResponseBodyDataInternal internal;

        @NameInMap("Outbound")
        public GetHistoricalInstanceReportResponseBodyDataOutbound outbound;

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
