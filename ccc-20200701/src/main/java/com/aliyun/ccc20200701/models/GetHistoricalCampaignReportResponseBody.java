// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCampaignReportResponseBody extends TeaModel {
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
    public GetHistoricalCampaignReportResponseBodyData data;

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
     * <p>E3A847C1-9800-57DF-9172-2CDDC026388D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHistoricalCampaignReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCampaignReportResponseBody self = new GetHistoricalCampaignReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCampaignReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHistoricalCampaignReportResponseBody setData(GetHistoricalCampaignReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoricalCampaignReportResponseBodyData getData() {
        return this.data;
    }

    public GetHistoricalCampaignReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHistoricalCampaignReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoricalCampaignReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistoricalCampaignReportResponseBodyData extends TeaModel {
        /**
         * <p>Abandon rate, calculated as: number of abandoned calls divided by total calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("AbandonRate")
        public Float abandonRate;

        /**
         * <p>Deprecated. Refer to AbandonRate instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("AbandonedRate")
        public Float abandonedRate;

        /**
         * <p>Answer rate, in %.</p>
         * 
         * <strong>example:</strong>
         * <p>0.50</p>
         */
        @NameInMap("AnswerRate")
        public Float answerRate;

        /**
         * <p>Number of abandoned calls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallsAbandoned")
        public Long callsAbandoned;

        /**
         * <p>Number of connected calls.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CallsConnected")
        public Long callsConnected;

        /**
         * <p>Number of calls dialed, including retries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallsDialed")
        public Long callsDialed;

        /**
         * <p>Deprecated. Refer to AnswerRate instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0.50</p>
         */
        @NameInMap("ConnectedRate")
        public Float connectedRate;

        /**
         * <p>Agent occupancy rate, calculated as: (total talk duration + total post-processing duration) divided by total agent online duration. Total agent online duration refers to the sum of online durations of all agents in the skill group associated with this activity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.50</p>
         */
        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        public static GetHistoricalCampaignReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalCampaignReportResponseBodyData self = new GetHistoricalCampaignReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoricalCampaignReportResponseBodyData setAbandonRate(Float abandonRate) {
            this.abandonRate = abandonRate;
            return this;
        }
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        public GetHistoricalCampaignReportResponseBodyData setAbandonedRate(Float abandonedRate) {
            this.abandonedRate = abandonedRate;
            return this;
        }
        public Float getAbandonedRate() {
            return this.abandonedRate;
        }

        public GetHistoricalCampaignReportResponseBodyData setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetHistoricalCampaignReportResponseBodyData setCallsAbandoned(Long callsAbandoned) {
            this.callsAbandoned = callsAbandoned;
            return this;
        }
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        public GetHistoricalCampaignReportResponseBodyData setCallsConnected(Long callsConnected) {
            this.callsConnected = callsConnected;
            return this;
        }
        public Long getCallsConnected() {
            return this.callsConnected;
        }

        public GetHistoricalCampaignReportResponseBodyData setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetHistoricalCampaignReportResponseBodyData setConnectedRate(Float connectedRate) {
            this.connectedRate = connectedRate;
            return this;
        }
        public Float getConnectedRate() {
            return this.connectedRate;
        }

        public GetHistoricalCampaignReportResponseBodyData setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

    }

}
