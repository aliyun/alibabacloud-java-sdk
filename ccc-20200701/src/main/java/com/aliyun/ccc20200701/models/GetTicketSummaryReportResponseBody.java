// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketSummaryReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTicketSummaryReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EAF3C248-E123-441B-A545-B6CD02E98EED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTicketSummaryReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketSummaryReportResponseBody self = new GetTicketSummaryReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketSummaryReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTicketSummaryReportResponseBody setData(GetTicketSummaryReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketSummaryReportResponseBodyData getData() {
        return this.data;
    }

    public GetTicketSummaryReportResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTicketSummaryReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketSummaryReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTicketSummaryReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TicketsAssigned")
        public String ticketsAssigned;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TicketsCreated")
        public String ticketsCreated;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TicketsParticipated")
        public String ticketsParticipated;

        public static GetTicketSummaryReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketSummaryReportResponseBodyData self = new GetTicketSummaryReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketSummaryReportResponseBodyData setTicketsAssigned(String ticketsAssigned) {
            this.ticketsAssigned = ticketsAssigned;
            return this;
        }
        public String getTicketsAssigned() {
            return this.ticketsAssigned;
        }

        public GetTicketSummaryReportResponseBodyData setTicketsCreated(String ticketsCreated) {
            this.ticketsCreated = ticketsCreated;
            return this;
        }
        public String getTicketsCreated() {
            return this.ticketsCreated;
        }

        public GetTicketSummaryReportResponseBodyData setTicketsParticipated(String ticketsParticipated) {
            this.ticketsParticipated = ticketsParticipated;
            return this;
        }
        public String getTicketsParticipated() {
            return this.ticketsParticipated;
        }

    }

}
