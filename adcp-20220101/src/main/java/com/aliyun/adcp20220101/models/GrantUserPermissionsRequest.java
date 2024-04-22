// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsRequest extends TeaModel {
    /**
     * <p>The list of permissions that you want to grant to the RAM user.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<GrantUserPermissionsRequestPermissions> permissions;

    /**
     * <p>The ID of the RAM user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsRequest self = new GrantUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsRequest setPermissions(java.util.List<GrantUserPermissionsRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<GrantUserPermissionsRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public GrantUserPermissionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GrantUserPermissionsRequestPermissions extends TeaModel {
        /**
         * <p>The master instance ID.</p>
         * <br>
         * <p>*   When the role_type parameter is set to all-clusters, set the parameter to an empty string.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The entity to which the permissions are granted. A value of `true` indicates that the permissions are granted to a RAM user. A value of `false` indicates that the permissions are granted to a RAM role.</p>
         */
        @NameInMap("IsRamRole")
        public Boolean isRamRole;

        /**
         * <p>The namespace to which the permissions are scoped. By default, this parameter is empty when you set RoleType to cluster.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The predefined role that you want to assign. Valid values:</p>
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
         * <p>*   all-clusters: specifies that the permissions are scoped to all master instances.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static GrantUserPermissionsRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            GrantUserPermissionsRequestPermissions self = new GrantUserPermissionsRequestPermissions();
            return TeaModel.build(map, self);
        }

        public GrantUserPermissionsRequestPermissions setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GrantUserPermissionsRequestPermissions setIsRamRole(Boolean isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        public GrantUserPermissionsRequestPermissions setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GrantUserPermissionsRequestPermissions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GrantUserPermissionsRequestPermissions setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
