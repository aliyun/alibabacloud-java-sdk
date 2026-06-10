// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GrantPermissionsRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
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
         * <p>The ID of the target cluster.</p>
         * <ul>
         * <li>If you set the <code>role_type</code> parameter to <code>all-clusters</code>, set this parameter to an empty string.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c796c60***</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Set to true if <code>role_name</code> specifies a custom ClusterRole.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_custom")
        public Boolean isCustom;

        /**
         * <p>Set to true if you are granting permissions to a RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_ram_role")
        public Boolean isRamRole;

        /**
         * <p>The name of the namespace. This parameter is required only when <code>role_type</code> is set to <code>namespace</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the role to grant. Valid values:</p>
         * <ul>
         * <li><p><code>admin</code>: The administrator role.</p>
         * </li>
         * <li><p><code>admin-view</code>: The read-only administrator role.</p>
         * </li>
         * <li><p><code>ops</code>: The operations role.</p>
         * </li>
         * <li><p><code>dev</code>: The developer role.</p>
         * </li>
         * <li><p><code>restricted</code>: The restricted role.</p>
         * </li>
         * <li><p>The name of a custom ClusterRole.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>The <code>admin</code>, <code>admin-view</code>, and <code>ops</code> roles cannot be granted at the namespace scope.</p>
         * </li>
         * <li><p>The <code>admin-view</code> role is not currently supported for the all-clusters scope.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ops</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li><p><code>cluster</code>: Grants permissions at the cluster scope.</p>
         * </li>
         * <li><p><code>namespace</code>: Grants permissions at the namespace scope.</p>
         * </li>
         * <li><p><code>all-clusters</code>: Grants permissions at the all-clusters scope.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
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
