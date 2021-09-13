// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetHistoricalInstanceReportResponseBodyData data;

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

    public GetHistoricalInstanceReportResponseBody setData(GetHistoricalInstanceReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoricalInstanceReportResponseBodyData getData() {
        return this.data;
    }

    public static class GetHistoricalInstanceReportResponseBodyDataInbound extends TeaModel {
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("CallsVoicemail")
        public Long callsVoicemail;

        @NameInMap("MaxAbandonedInIVRTime")
        public Long maxAbandonedInIVRTime;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsIVRException")
        public Long callsIVRException;

        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("MaxAbandonTime")
        public Long maxAbandonTime;

        @NameInMap("AverageAbandonTime")
        public Float averageAbandonTime;

        @NameInMap("CallsRinged")
        public Long callsRinged;

        @NameInMap("CallsQueuingFailed")
        public Long callsQueuingFailed;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("AbandonRate")
        public Float abandonRate;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxAbandonedInRingTime")
        public Long maxAbandonedInRingTime;

        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        @NameInMap("AverageAbandonedInIVRTime")
        public Float averageAbandonedInIVRTime;

        @NameInMap("AverageAbandonedInQueueTime")
        public Float averageAbandonedInQueueTime;

        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        @NameInMap("TotalAbandonedInIVRTime")
        public Long totalAbandonedInIVRTime;

        @NameInMap("CallsQueuingOverflow")
        public Long callsQueuingOverflow;

        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        @NameInMap("TotalAbandonedInRingTime")
        public Long totalAbandonedInRingTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("AverageWaitTime")
        public Float averageWaitTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("CallsQueued")
        public Long callsQueued;

        @NameInMap("AverageAbandonedInRingTime")
        public Float averageAbandonedInRingTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        @NameInMap("MaxAbandonedInQueueTime")
        public Long maxAbandonedInQueueTime;

        @NameInMap("CallsAbandonedInVoiceNavigator")
        public Long callsAbandonedInVoiceNavigator;

        @NameInMap("TotalWaitTime")
        public Long totalWaitTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("TotalAbandonTime")
        public Long totalAbandonTime;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsQueuingTimeout")
        public Long callsQueuingTimeout;

        @NameInMap("ServiceLevel20")
        public Float serviceLevel20;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("CallsForwardToOutsideNumber")
        public Long callsForwardToOutsideNumber;

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("CallsHold")
        public Long callsHold;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        @NameInMap("TotalAbandonedInQueueTime")
        public Long totalAbandonedInQueueTime;

        public static GetHistoricalInstanceReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataInbound self = new GetHistoricalInstanceReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsVoicemail(Long callsVoicemail) {
            this.callsVoicemail = callsVoicemail;
            return this;
        }
        public Long getCallsVoicemail() {
            return this.callsVoicemail;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInIVRTime(Long maxAbandonedInIVRTime) {
            this.maxAbandonedInIVRTime = maxAbandonedInIVRTime;
            return this;
        }
        public Long getMaxAbandonedInIVRTime() {
            return this.maxAbandonedInIVRTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsIVRException(Long callsIVRException) {
            this.callsIVRException = callsIVRException;
            return this;
        }
        public Long getCallsIVRException() {
            return this.callsIVRException;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonTime(Long maxAbandonTime) {
            this.maxAbandonTime = maxAbandonTime;
            return this;
        }
        public Long getMaxAbandonTime() {
            return this.maxAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonTime(Float averageAbandonTime) {
            this.averageAbandonTime = averageAbandonTime;
            return this;
        }
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingFailed(Long callsQueuingFailed) {
            this.callsQueuingFailed = callsQueuingFailed;
            return this;
        }
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAbandonRate(Float abandonRate) {
            this.abandonRate = abandonRate;
            return this;
        }
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
            this.maxAbandonedInRingTime = maxAbandonedInRingTime;
            return this;
        }
        public Long getMaxAbandonedInRingTime() {
            return this.maxAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsBlindTransferred(Long callsBlindTransferred) {
            this.callsBlindTransferred = callsBlindTransferred;
            return this;
        }
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
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

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAttendedTransferred(Long callsAttendedTransferred) {
            this.callsAttendedTransferred = callsAttendedTransferred;
            return this;
        }
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInIVRTime(Long totalAbandonedInIVRTime) {
            this.totalAbandonedInIVRTime = totalAbandonedInIVRTime;
            return this;
        }
        public Long getTotalAbandonedInIVRTime() {
            return this.totalAbandonedInIVRTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingOverflow(Long callsQueuingOverflow) {
            this.callsQueuingOverflow = callsQueuingOverflow;
            return this;
        }
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInRing(Long callsAbandonedInRing) {
            this.callsAbandonedInRing = callsAbandonedInRing;
            return this;
        }
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
            this.totalAbandonedInRingTime = totalAbandonedInRingTime;
            return this;
        }
        public Long getTotalAbandonedInRingTime() {
            return this.totalAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
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

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueued(Long callsQueued) {
            this.callsQueued = callsQueued;
            return this;
        }
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
            this.averageAbandonedInRingTime = averageAbandonedInRingTime;
            return this;
        }
        public Float getAverageAbandonedInRingTime() {
            return this.averageAbandonedInRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
            this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
            return this;
        }
        public Long getMaxAbandonedInQueueTime() {
            return this.maxAbandonedInQueueTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInVoiceNavigator(Long callsAbandonedInVoiceNavigator) {
            this.callsAbandonedInVoiceNavigator = callsAbandonedInVoiceNavigator;
            return this;
        }
        public Long getCallsAbandonedInVoiceNavigator() {
            return this.callsAbandonedInVoiceNavigator;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalWaitTime(Long totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonTime(Long totalAbandonTime) {
            this.totalAbandonTime = totalAbandonTime;
            return this;
        }
        public Long getTotalAbandonTime() {
            return this.totalAbandonTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsQueuingTimeout(Long callsQueuingTimeout) {
            this.callsQueuingTimeout = callsQueuingTimeout;
            return this;
        }
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setServiceLevel20(Float serviceLevel20) {
            this.serviceLevel20 = serviceLevel20;
            return this;
        }
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsForwardToOutsideNumber(Long callsForwardToOutsideNumber) {
            this.callsForwardToOutsideNumber = callsForwardToOutsideNumber;
            return this;
        }
        public Long getCallsForwardToOutsideNumber() {
            return this.callsForwardToOutsideNumber;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsHold(Long callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Long getCallsHold() {
            return this.callsHold;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public GetHistoricalInstanceReportResponseBodyDataInbound setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
            this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
            return this;
        }
        public Long getTotalAbandonedInQueueTime() {
            return this.totalAbandonedInQueueTime;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataOutbound extends TeaModel {
        @NameInMap("AverageRingTime")
        public Float averageRingTime;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("CallsRinged")
        public Long callsRinged;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("CallsBlindTransferred")
        public Long callsBlindTransferred;

        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("CallsAttendedTransferred")
        public Long callsAttendedTransferred;

        @NameInMap("CallsHold")
        public Integer callsHold;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("AverageDialingTime")
        public Float averageDialingTime;

        public static GetHistoricalInstanceReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataOutbound self = new GetHistoricalInstanceReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageRingTime(Float averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
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

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsRinged(Long callsRinged) {
            this.callsRinged = callsRinged;
            return this;
        }
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsBlindTransferred(Long callsBlindTransferred) {
            this.callsBlindTransferred = callsBlindTransferred;
            return this;
        }
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsAttendedTransferred(Long callsAttendedTransferred) {
            this.callsAttendedTransferred = callsAttendedTransferred;
            return this;
        }
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setCallsHold(Integer callsHold) {
            this.callsHold = callsHold;
            return this;
        }
        public Integer getCallsHold() {
            return this.callsHold;
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

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOutbound setAverageDialingTime(Float averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyDataOverall extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageBreakTime")
        public Float averageBreakTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("SatisfactionRate")
        public Float satisfactionRate;

        @NameInMap("MaxBreakTime")
        public Long maxBreakTime;

        @NameInMap("AverageWorkTime")
        public Float averageWorkTime;

        @NameInMap("AverageTalkTime")
        public Float averageTalkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("AverageReadyTime")
        public Float averageReadyTime;

        @NameInMap("AverageHoldTime")
        public Float averageHoldTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetHistoricalInstanceReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalInstanceReportResponseBodyDataOverall self = new GetHistoricalInstanceReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageBreakTime(Float averageBreakTime) {
            this.averageBreakTime = averageBreakTime;
            return this;
        }
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionRate(Float satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxBreakTime(Long maxBreakTime) {
            this.maxBreakTime = maxBreakTime;
            return this;
        }
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageWorkTime(Float averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageTalkTime(Float averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
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

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageReadyTime(Float averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setAverageHoldTime(Float averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetHistoricalInstanceReportResponseBodyDataOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetHistoricalInstanceReportResponseBodyData extends TeaModel {
        @NameInMap("Inbound")
        public GetHistoricalInstanceReportResponseBodyDataInbound inbound;

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
