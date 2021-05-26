// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GrantRolesRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("RoleIds")
    public String roleIds;

    @NameInMap("AdminId")
    public Long adminId;

    @NameInMap("AdminName")
    public String adminName;

    public static GrantRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRolesRequest self = new GrantRolesRequest();
        return TeaModel.build(map, self);
    }

    public GrantRolesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GrantRolesRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public GrantRolesRequest setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }
    public Long getAdminId() {
        return this.adminId;
    }

    public GrantRolesRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

}
