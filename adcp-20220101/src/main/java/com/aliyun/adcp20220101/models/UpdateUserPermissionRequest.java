// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateUserPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c8e28143817db4b039b8548d7c899****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace to which the permissions are scoped. By default, this parameter is empty when you set RoleType to cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Specifies the predefined role that you want to assign. Valid values:</p>
     * <ul>
     * <li>admin: the administrator role.</li>
     * <li>dev: the developer role.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The authorization type. Valid values:</p>
     * <ul>
     * <li>cluster: specifies that the permissions are scoped to a master instance.</li>
     * <li>namespace: specifies that the permissions are scoped to a namespace of a cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The ID of the RAM user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2176****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UpdateUserPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPermissionRequest self = new UpdateUserPermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPermissionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateUserPermissionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateUserPermissionRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateUserPermissionRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public UpdateUserPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
