// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IsRamRole")
    public Boolean isRamRole;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("RoleType")
    public String roleType;

    @NameInMap("UserId")
    public String userId;

    public static GrantUserPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionRequest self = new GrantUserPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GrantUserPermissionRequest setIsRamRole(Boolean isRamRole) {
        this.isRamRole = isRamRole;
        return this;
    }
    public Boolean getIsRamRole() {
        return this.isRamRole;
    }

    public GrantUserPermissionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GrantUserPermissionRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public GrantUserPermissionRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public GrantUserPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
