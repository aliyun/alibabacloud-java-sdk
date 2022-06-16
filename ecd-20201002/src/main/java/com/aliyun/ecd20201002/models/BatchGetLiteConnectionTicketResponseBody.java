// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class BatchGetLiteConnectionTicketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TicketList")
    public java.util.List<BatchGetLiteConnectionTicketResponseBodyTicketList> ticketList;

    public static BatchGetLiteConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetLiteConnectionTicketResponseBody self = new BatchGetLiteConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetLiteConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetLiteConnectionTicketResponseBody setTicketList(java.util.List<BatchGetLiteConnectionTicketResponseBodyTicketList> ticketList) {
        this.ticketList = ticketList;
        return this;
    }
    public java.util.List<BatchGetLiteConnectionTicketResponseBodyTicketList> getTicketList() {
        return this.ticketList;
    }

    public static class BatchGetLiteConnectionTicketResponseBodyTicketList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Ticket")
        public String ticket;

        public static BatchGetLiteConnectionTicketResponseBodyTicketList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetLiteConnectionTicketResponseBodyTicketList self = new BatchGetLiteConnectionTicketResponseBodyTicketList();
            return TeaModel.build(map, self);
        }

        public BatchGetLiteConnectionTicketResponseBodyTicketList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchGetLiteConnectionTicketResponseBodyTicketList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public BatchGetLiteConnectionTicketResponseBodyTicketList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchGetLiteConnectionTicketResponseBodyTicketList setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

    }

}
