// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GrantPermissionsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<GrantPermissionsRequestBody> body;

    public static GrantPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPermissionsRequest self = new GrantPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GrantPermissionsRequest setBody(java.util.List<GrantPermissionsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GrantPermissionsRequestBody> getBody() {
        return this.body;
    }

    public static class GrantPermissionsRequestBody extends TeaModel {
        /**
         * <p>The ID of the cluster that you want to manage.</p>
         * <br>
         * <p>*   When the `role_type` parameter is set to `all-clusters`, this parameter is set to an empty string.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Specifies whether to perform a custom authorization. To perform a custom authorization, set `role_name` to a custom cluster role.</p>
         */
        @NameInMap("is_custom")
        public Boolean isCustom;

        /**
         * <p>Specifies whether the permissions are granted to a RAM role.</p>
         */
        @NameInMap("is_ram_role")
        public Boolean isRamRole;

        /**
         * <p>The namespace to which the permissions are scoped. This parameter is required only if you set role_type to namespace.</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The predefined role name. Valid values:</p>
         * <br>
         * <p>*   `admin`: administrator</p>
         * <p>*   `ops`: O\&M engineer</p>
         * <p>*   `dev`: developer</p>
         * <p>*   `restricted`: restricted user</p>
         * <p>*   The custom cluster role.</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The authorization type. Valid values:</p>
         * <br>
         * <p>*   `cluster`: indicates that the permissions are scoped to a cluster.</p>
         * <p>*   `namespace`: specifies that the permissions are scoped to a namespace of a cluster.</p>
         * <p>*   `all-clusters`: specifies that the permissions are scoped to all clusters.</p>
         */
        @NameInMap("role_type")
        public String roleType;

        public static GrantPermissionsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GrantPermissionsRequestBody self = new GrantPermissionsRequestBody();
            return TeaModel.build(map, self);
        }

        public GrantPermissionsRequestBody setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GrantPermissionsRequestBody setIsCustom(Boolean isCustom) {
            this.isCustom = isCustom;
            return this;
        }
        public Boolean getIsCustom() {
            return this.isCustom;
        }

        public GrantPermissionsRequestBody setIsRamRole(Boolean isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        public GrantPermissionsRequestBody setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GrantPermissionsRequestBody setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GrantPermissionsRequestBody setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
