// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class FinishTicketShrinkRequest extends TeaModel {
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

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("TicketMemo")
    public String ticketMemoShrink;

    public static FinishTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishTicketShrinkRequest self = new FinishTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FinishTicketShrinkRequest setNotifyShrink(String notifyShrink) {
        this.notifyShrink = notifyShrink;
        return this;
    }
    public String getNotifyShrink() {
        return this.notifyShrink;
    }

    public FinishTicketShrinkRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public FinishTicketShrinkRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public FinishTicketShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public FinishTicketShrinkRequest setTicketMemoShrink(String ticketMemoShrink) {
        this.ticketMemoShrink = ticketMemoShrink;
        return this;
    }
    public String getTicketMemoShrink() {
        return this.ticketMemoShrink;
    }

}
