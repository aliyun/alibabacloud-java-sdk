// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieTicketsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("MovieTicket")
    public QueryMovieTicketsResponseBodyMovieTicket movieTicket;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMovieTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieTicketsResponseBody self = new QueryMovieTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMovieTicketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieTicketsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieTicketsResponseBody setMovieTicket(QueryMovieTicketsResponseBodyMovieTicket movieTicket) {
        this.movieTicket = movieTicket;
        return this;
    }
    public QueryMovieTicketsResponseBodyMovieTicket getMovieTicket() {
        return this.movieTicket;
    }

    public QueryMovieTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieTicketsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieTicketsResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMovieTicketsResponseBodyMovieTicket extends TeaModel {
        @NameInMap("ReturnMessage")
        public String returnMessage;

        @NameInMap("Status")
        public String status;

        @NameInMap("TbOrderId")
        public String tbOrderId;

        @NameInMap("TicketContents")
        public String ticketContents;

        public static QueryMovieTicketsResponseBodyMovieTicket build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieTicketsResponseBodyMovieTicket self = new QueryMovieTicketsResponseBodyMovieTicket();
            return TeaModel.build(map, self);
        }

        public QueryMovieTicketsResponseBodyMovieTicket setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

        public QueryMovieTicketsResponseBodyMovieTicket setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMovieTicketsResponseBodyMovieTicket setTbOrderId(String tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryMovieTicketsResponseBodyMovieTicket setTicketContents(String ticketContents) {
            this.ticketContents = ticketContents;
            return this;
        }
        public String getTicketContents() {
            return this.ticketContents;
        }

    }

}
