// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetGWSConnectTicketResponseBody extends TeaModel {
    @NameInMap("Ticket")
    public String ticket;

    @NameInMap("RequestId")
    public String requestId;

    public static GetGWSConnectTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGWSConnectTicketResponseBody self = new GetGWSConnectTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGWSConnectTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public GetGWSConnectTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
