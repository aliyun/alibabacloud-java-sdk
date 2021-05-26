// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CloseTicketRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("ActionItems")
    public String actionItems;

    @NameInMap("OperatorId")
    public Long operatorId;

    public static CloseTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketRequest self = new CloseTicketRequest();
        return TeaModel.build(map, self);
    }

    public CloseTicketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloseTicketRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CloseTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public CloseTicketRequest setActionItems(String actionItems) {
        this.actionItems = actionItems;
        return this;
    }
    public String getActionItems() {
        return this.actionItems;
    }

    public CloseTicketRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

}
