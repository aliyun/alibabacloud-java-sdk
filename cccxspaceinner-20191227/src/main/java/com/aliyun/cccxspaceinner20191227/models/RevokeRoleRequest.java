// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class RevokeRoleRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("RoleId")
    public Long roleId;

    @NameInMap("AdminAgentId")
    public Long adminAgentId;

    public static RevokeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleRequest self = new RevokeRoleRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRoleRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public RevokeRoleRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public RevokeRoleRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public RevokeRoleRequest setAdminAgentId(Long adminAgentId) {
        this.adminAgentId = adminAgentId;
        return this;
    }
    public Long getAdminAgentId() {
        return this.adminAgentId;
    }

}
