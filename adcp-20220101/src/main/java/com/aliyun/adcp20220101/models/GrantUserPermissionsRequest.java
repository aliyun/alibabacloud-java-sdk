// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsRequest extends TeaModel {
    @NameInMap("Permissions")
    public java.util.List<GrantUserPermissionsRequestPermissions> permissions;

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
