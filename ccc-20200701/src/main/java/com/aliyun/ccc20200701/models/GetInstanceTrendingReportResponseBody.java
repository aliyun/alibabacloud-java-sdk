// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceTrendingReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceTrendingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportResponseBody self = new GetInstanceTrendingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceTrendingReportResponseBody setData(GetInstanceTrendingReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceTrendingReportResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceTrendingReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceTrendingReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceTrendingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceTrendingReportResponseBodyDataInbound extends TeaModel {
        @NameInMap("CallsAbandonedInIVR")
        public Long callsAbandonedInIVR;

        @NameInMap("CallsAbandonedInQueue")
        public Long callsAbandonedInQueue;

        @NameInMap("CallsAbandonedInRing")
        public Long callsAbandonedInRing;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsQueued")
        public Long callsQueued;

        @NameInMap("StatsTime")
        public Long statsTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetInstanceTrendingReportResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTrendingReportResponseBodyDataInbound self = new GetInstanceTrendingReportResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
            this.callsAbandonedInIVR = callsAbandonedInIVR;
            return this;
        }
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
            this.callsAbandonedInQueue = callsAbandonedInQueue;
            return this;
        }
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setCallsAbandonedInRing(Long callsAbandonedInRing) {
            this.callsAbandonedInRing = callsAbandonedInRing;
            return this;
        }
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setCallsQueued(Long callsQueued) {
            this.callsQueued = callsQueued;
            return this;
        }
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetInstanceTrendingReportResponseBodyDataInbound setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetInstanceTrendingReportResponseBodyDataOutbound extends TeaModel {
        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("StatsTime")
        public Long statsTime;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetInstanceTrendingReportResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTrendingReportResponseBodyDataOutbound self = new GetInstanceTrendingReportResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public GetInstanceTrendingReportResponseBodyDataOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetInstanceTrendingReportResponseBodyDataOutbound setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetInstanceTrendingReportResponseBodyDataOutbound setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetInstanceTrendingReportResponseBodyDataOverall extends TeaModel {
        @NameInMap("MaxLoggedInAgents")
        public Long maxLoggedInAgents;

        @NameInMap("StatsTime")
        public Long statsTime;

        public static GetInstanceTrendingReportResponseBodyDataOverall build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTrendingReportResponseBodyDataOverall self = new GetInstanceTrendingReportResponseBodyDataOverall();
            return TeaModel.build(map, self);
        }

        public GetInstanceTrendingReportResponseBodyDataOverall setMaxLoggedInAgents(Long maxLoggedInAgents) {
            this.maxLoggedInAgents = maxLoggedInAgents;
            return this;
        }
        public Long getMaxLoggedInAgents() {
            return this.maxLoggedInAgents;
        }

        public GetInstanceTrendingReportResponseBodyDataOverall setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

    }

    public static class GetInstanceTrendingReportResponseBodyData extends TeaModel {
        @NameInMap("Inbound")
        public java.util.List<GetInstanceTrendingReportResponseBodyDataInbound> inbound;

        @NameInMap("Outbound")
        public java.util.List<GetInstanceTrendingReportResponseBodyDataOutbound> outbound;

        @NameInMap("Overall")
        public java.util.List<GetInstanceTrendingReportResponseBodyDataOverall> overall;

        public static GetInstanceTrendingReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTrendingReportResponseBodyData self = new GetInstanceTrendingReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceTrendingReportResponseBodyData setInbound(java.util.List<GetInstanceTrendingReportResponseBodyDataInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<GetInstanceTrendingReportResponseBodyDataInbound> getInbound() {
            return this.inbound;
        }

        public GetInstanceTrendingReportResponseBodyData setOutbound(java.util.List<GetInstanceTrendingReportResponseBodyDataOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<GetInstanceTrendingReportResponseBodyDataOutbound> getOutbound() {
            return this.outbound;
        }

        public GetInstanceTrendingReportResponseBodyData setOverall(java.util.List<GetInstanceTrendingReportResponseBodyDataOverall> overall) {
            this.overall = overall;
            return this;
        }
        public java.util.List<GetInstanceTrendingReportResponseBodyDataOverall> getOverall() {
            return this.overall;
        }

    }

}
