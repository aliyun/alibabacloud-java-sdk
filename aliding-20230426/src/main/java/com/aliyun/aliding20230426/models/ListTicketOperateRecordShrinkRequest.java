// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTicketOperateRecordShrinkRequest extends TeaModel {
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

    public static ListTicketOperateRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketOperateRecordShrinkRequest self = new ListTicketOperateRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketOperateRecordShrinkRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public ListTicketOperateRecordShrinkRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public ListTicketOperateRecordShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
