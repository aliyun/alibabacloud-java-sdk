// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunTicketJwtCreateRequest extends TeaModel {
    @NameInMap("Ticket")
    public String ticket;

    public static AliyunTicketJwtCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        AliyunTicketJwtCreateRequest self = new AliyunTicketJwtCreateRequest();
        return TeaModel.build(map, self);
    }

    public AliyunTicketJwtCreateRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
