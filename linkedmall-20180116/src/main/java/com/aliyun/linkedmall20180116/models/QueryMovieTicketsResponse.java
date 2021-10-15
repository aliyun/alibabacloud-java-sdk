// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieTicketsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("MovieTicket")
    @Validation(required = true)
    public QueryMovieTicketsResponseMovieTicket movieTicket;

    public static QueryMovieTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieTicketsResponse self = new QueryMovieTicketsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieTicketsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieTicketsResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieTicketsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieTicketsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieTicketsResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieTicketsResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieTicketsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMovieTicketsResponse setMovieTicket(QueryMovieTicketsResponseMovieTicket movieTicket) {
        this.movieTicket = movieTicket;
        return this;
    }
    public QueryMovieTicketsResponseMovieTicket getMovieTicket() {
        return this.movieTicket;
    }

    public static class QueryMovieTicketsResponseMovieTicket extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ReturnMessage")
        @Validation(required = true)
        public String returnMessage;

        @NameInMap("TbOrderId")
        @Validation(required = true)
        public String tbOrderId;

        @NameInMap("TicketContents")
        @Validation(required = true)
        public String ticketContents;

        public static QueryMovieTicketsResponseMovieTicket build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieTicketsResponseMovieTicket self = new QueryMovieTicketsResponseMovieTicket();
            return TeaModel.build(map, self);
        }

        public QueryMovieTicketsResponseMovieTicket setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMovieTicketsResponseMovieTicket setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

        public QueryMovieTicketsResponseMovieTicket setTbOrderId(String tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryMovieTicketsResponseMovieTicket setTicketContents(String ticketContents) {
            this.ticketContents = ticketContents;
            return this;
        }
        public String getTicketContents() {
            return this.ticketContents;
        }

    }

}
