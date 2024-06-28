// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TerminateTicketRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static TerminateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateTicketRequest self = new TerminateTicketRequest();
        return TeaModel.build(map, self);
    }

    public TerminateTicketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public TerminateTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TerminateTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
