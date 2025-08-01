// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eyJ***************.eyJ******************.KUT****************</p>
     */
    @NameInMap("ticket")
    public String ticket;

    public static CreateTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketResponseBody self = new CreateTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
