// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RejectTicketRequest extends TeaModel {
    /**
     * <p>The comment on the ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>请补充信息。</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ticket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f2c6722b-cd13-442d-bf10-22a07c70d6d5</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static RejectTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectTicketRequest self = new RejectTicketRequest();
        return TeaModel.build(map, self);
    }

    public RejectTicketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RejectTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
