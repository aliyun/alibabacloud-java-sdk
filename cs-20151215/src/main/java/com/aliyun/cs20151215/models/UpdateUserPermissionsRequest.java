// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateUserPermissionsRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public java.util.List<UpdateUserPermissionsRequestBody> body;

    /**
     * <p>The authorization method. Valid values:</p>
     * <ul>
     * <li><code>apply</code>: Fully updates permissions. This operation overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations to be granted to the target RAM user or RAM role.</li>
     * <li><code>delete</code>: Deletes permissions. This operation deletes only the cluster authorization information specified in the request and does not affect other cluster permissions of the RAM user or RAM role.</li>
     * <li><code>patch</code>: Adds permissions. This operation adds only the cluster authorization information specified in the request and does not affect other cluster permissions of the RAM user or RAM role.</li>
     * </ul>
     * <p>Default value: <code>apply</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>apply</p>
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
         * <p>The ID of the target cluster.</p>
         * <p>This parameter is not required when the role_type parameter is set to all-clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>c796c60***</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Specifies whether the authorization is custom. A custom authorization uses a custom ClusterRole name for the role_name parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The authorized role is a custom cluster role.</li>
         * <li>false: The authorized role is a preset cluster role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_custom")
        public Boolean isCustom;

        /**
         * <p>Specifies whether the authorized entity is a RAM role.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The authorization is for a RAM role.</li>
         * <li>false: The authorization is for a Resource Access Management (RAM) user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_ram_role")
        public Boolean isRamRole;

        /**
         * <p>The namespace name. This parameter is empty by default for cluster-level authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The preset role name. Valid values:</p>
         * <ul>
         * <li>admin: administrator.</li>
         * <li>admin-view: read-only administrator.</li>
         * <li>ops: O&amp;M engineer.</li>
         * <li>dev: developer.</li>
         * <li>restricted: restricted user.</li>
         * <li>A custom ClusterRole name.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The admin, admin-view, and ops roles do not support authorization at the <strong>namespace level</strong>.</li>
         * <li>The admin-view role does not support authorization at the <strong>all-clusters level</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ops</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The authorization type. Valid values:</p>
         * <ul>
         * <li>cluster: cluster level.</li>
         * <li>namespace: namespace level.</li>
         * <li>all-clusters: all-clusters level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
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
