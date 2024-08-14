// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c102fe5f1ee5d4c87a68121a77d8b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The entity to which the permissions are granted. A value of <code>true</code> indicates that the permissions are granted to a RAM user. A value of <code>false</code> indicates that the permissions are granted to a RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsRamRole")
    public Boolean isRamRole;

    /**
     * <p>The name of the namespace.</p>
     * <ul>
     * <li>If <strong>RoleType</strong> is set to <strong>cluster</strong>, you do not need to specify this parameter.</li>
     * <li>This parameter is required if <strong>RoleType</strong> is set to <strong>namespace</strong>.</li>
     * <li>If <strong>RoleType</strong> is set to <strong>namespace</strong> and <strong>RoleName</strong> is set to <strong>gitops-dev</strong>, this parameter is required and must be set to <strong>argocd</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The predefined role. Valid values:</p>
     * <ul>
     * <li>admin: administrator</li>
     * <li>dev: developer</li>
     * <li>gitops-dev: GitOps developer. The parameter is available only for Fleet instances.</li>
     * </ul>
     * <p>The value of RoleName and that of RoleType must meet the following requirements:</p>
     * <ul>
     * <li>If <strong>RoleType</strong> is set to <strong>cluster</strong>, this parameter must be set to <strong>admin</strong>.</li>
     * <li>If <strong>RoleType</strong> is set to <strong>namespace</strong>, this parameter must be set to <strong>dev</strong> or <strong>gitops-dev</strong>.</li>
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
     * <li>cluster: The permissions are granted to a cluster.</li>
     * <li>namespace: The permissions are granted to a namespace of a cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The ID of the RAM user or RAM role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2176****</p>
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
