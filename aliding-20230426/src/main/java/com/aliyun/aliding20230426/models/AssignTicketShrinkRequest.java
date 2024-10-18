// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AssignTicketShrinkRequest extends TeaModel {
    @NameInMap("Notify")
    public String notifyShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKWh3xxxxiE</p>
     */
    @NameInMap("OpenTeamId")
    public String openTeamId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dq9hP8Sk2v6vQxxxxiE</p>
     */
    @NameInMap("OpenTicketId")
    public String openTicketId;

    @NameInMap("ProcessorUserIds")
    public String processorUserIdsShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("TicketMemo")
    public String ticketMemoShrink;

    public static AssignTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketShrinkRequest self = new AssignTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AssignTicketShrinkRequest setNotifyShrink(String notifyShrink) {
        this.notifyShrink = notifyShrink;
        return this;
    }
    public String getNotifyShrink() {
        return this.notifyShrink;
    }

    public AssignTicketShrinkRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public AssignTicketShrinkRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public AssignTicketShrinkRequest setProcessorUserIdsShrink(String processorUserIdsShrink) {
        this.processorUserIdsShrink = processorUserIdsShrink;
        return this;
    }
    public String getProcessorUserIdsShrink() {
        return this.processorUserIdsShrink;
    }

    public AssignTicketShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public AssignTicketShrinkRequest setTicketMemoShrink(String ticketMemoShrink) {
        this.ticketMemoShrink = ticketMemoShrink;
        return this;
    }
    public String getTicketMemoShrink() {
        return this.ticketMemoShrink;
    }

}
