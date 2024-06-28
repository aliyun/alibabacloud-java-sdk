// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class WithdrawTicketRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static WithdrawTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawTicketRequest self = new WithdrawTicketRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawTicketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public WithdrawTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WithdrawTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
