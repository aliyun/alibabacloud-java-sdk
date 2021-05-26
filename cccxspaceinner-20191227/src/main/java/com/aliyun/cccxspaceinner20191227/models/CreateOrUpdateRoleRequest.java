// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOrUpdateRoleRequest extends TeaModel {
    @NameInMap("RoleId")
    public Long roleId;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("SecurityLevel")
    public String securityLevel;

    @NameInMap("Status")
    public String status;

    @NameInMap("OperatorId")
    public Long operatorId;

    public static CreateOrUpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateRoleRequest self = new CreateOrUpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateRoleRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public CreateOrUpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateOrUpdateRoleRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public CreateOrUpdateRoleRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public CreateOrUpdateRoleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateOrUpdateRoleRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

}
