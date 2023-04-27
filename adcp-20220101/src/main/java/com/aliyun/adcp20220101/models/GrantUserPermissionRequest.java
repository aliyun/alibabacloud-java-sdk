// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace to which the permissions are scoped. By default, this parameter is empty when you set role_type to cluster.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Specifies the predefined role that you want to assign. Valid values:</p>
     * <br>
     * <p>*   admin: the administrator role.</p>
     * <p>*   dev: the developer role.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The authorization type. Valid values:</p>
     * <br>
     * <p>*   cluster: specifies that the permissions are scoped to a master instance.</p>
     * <p>*   namespace: specifies that the permissions are scoped to a namespace of a cluster.</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The ID of the RAM user.</p>
     */
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
