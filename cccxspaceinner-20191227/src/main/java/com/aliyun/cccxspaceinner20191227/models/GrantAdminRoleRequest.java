// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GrantAdminRoleRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("AdminAgentId")
    public Long adminAgentId;

    public static GrantAdminRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAdminRoleRequest self = new GrantAdminRoleRequest();
        return TeaModel.build(map, self);
    }

    public GrantAdminRoleRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public GrantAdminRoleRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GrantAdminRoleRequest setAdminAgentId(Long adminAgentId) {
        this.adminAgentId = adminAgentId;
        return this;
    }
    public Long getAdminAgentId() {
        return this.adminAgentId;
    }

}
