// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateUserPermissionsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<UpdateUserPermissionsRequestBody> body;

    /**
     * <p>The authorization method. Valid values:</p>
     * <br>
     * <p>*   `apply`: updates all permissions of the RAM user or RAM role. If you use this method, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation.</p>
     * <p>*   `delete`: revokes the specified permissions from the RAM user or RAM role. If you use this method, only the permissions that you specify are revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</p>
     * <p>*   `patch`: grants the specified permissions to the RAM user or role. If you use this method, only the permissions that you specify are granted, other permissions of the RAM user or RAM role on the cluster are not affected.</p>
     * <br>
     * <p>Default value: `apply`</p>
     */
    @NameInMap("mode")
    public String mode;

    public static UpdateUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPermissionsRequest self = new UpdateUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPermissionsRequest setBody(java.util.List<UpdateUserPermissionsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdateUserPermissionsRequestBody> getBody() {
        return this.body;
    }

    public UpdateUserPermissionsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public static class UpdateUserPermissionsRequestBody extends TeaModel {
        /**
         * <p>The ID of the cluster on which you want to grant permissions to the RAM role or RAM role.</p>
         * <br>
         * <p>*   Set this parameter to an empty string if `role_type` is set to `all-clusters`.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Specifies whether to assign a custom role to the RAM user or RAM role. If you want to assign a custom role to the RAM user or RAM role, set `role_name` to the name of the custom role.</p>
         */
        @NameInMap("is_custom")
        public Boolean isCustom;

        /**
         * <p>Specifies whether to use a RAM role to grant permissions.</p>
         */
        @NameInMap("is_ram_role")
        public Boolean isRamRole;

        /**
         * <p>The namespace that you want to authorize the RAM user or RAM role to manage. This parameter is required only if you set role_type to namespace.</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The predefined role. Valid values:</p>
         * <br>
         * <p>*   `admin`: administrator</p>
         * <p>*   `ops`: O\\&M engineer</p>
         * <p>*   `dev`: developer</p>
         * <p>*   `restricted`: restricted user</p>
         * <p>*   Custom role</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The authorization type. Valid values:</p>
         * <br>
         * <p>*   `cluster`: authorizes the RAM user or RAM role to manage the specified clusters.</p>
         * <p>*   `namespace`: authorizes the RAM user or RAM role to manage the specified namepsaces.</p>
         * <p>*   `all-clusters`: authorizes the RAM user or RAM role to manage all clusters.</p>
         */
        @NameInMap("role_type")
        public String roleType;

        public static UpdateUserPermissionsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserPermissionsRequestBody self = new UpdateUserPermissionsRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateUserPermissionsRequestBody setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public UpdateUserPermissionsRequestBody setIsCustom(Boolean isCustom) {
            this.isCustom = isCustom;
            return this;
        }
        public Boolean getIsCustom() {
            return this.isCustom;
        }

        public UpdateUserPermissionsRequestBody setIsRamRole(Boolean isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        public UpdateUserPermissionsRequestBody setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateUserPermissionsRequestBody setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateUserPermissionsRequestBody setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
