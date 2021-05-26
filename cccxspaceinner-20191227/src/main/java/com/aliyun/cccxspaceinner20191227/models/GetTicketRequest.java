// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTicketRequest extends TeaModel {
    @NameInMap("TicketId")
    public Long ticketId;

    public static GetTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketRequest self = new GetTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

}
