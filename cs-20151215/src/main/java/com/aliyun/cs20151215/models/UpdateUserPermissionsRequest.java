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
     * <p>The authorization mode. Valid values:</p>
     * <ul>
     * <li><code>apply</code>: full update. A full update overwrites all existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role.</li>
     * <li><code>delete</code>: delete permissions. Only the cluster authorization information included in the request is deleted. Other cluster Resource Access Management (RAM) user or RAM role are not affected.</li>
     * <li><code>patch</code>: add permissions. Only the cluster authorization information included in the request is added. Other cluster Resource Access Management (RAM) user or RAM role are not affected.</li>
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
         * <p>The ID of the target cluster for authorization.</p>
         * <p>If the <code>role_type</code> parameter is set to <code>all-clusters</code>, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>c796c60***</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Specifies whether the authorization is a custom authorization (the <code>role_name</code> uses a custom ClusterRole name).</p>
         * <ul>
         * <li><p>true: The authorized role is a custom cluster role.</p>
         * </li>
         * <li><p>false: The authorized role is a cluster preset role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_custom")
        public Boolean isCustom;

        /**
         * <p>Specifies whether the authorization is for a RAM role.</p>
         * <ul>
         * <li><p>true: The authorization is for a RAM role.</p>
         * </li>
         * <li><p>false: The authorization is for a Resource Access Management (RAM) user.</p>
         * </li>
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
         * <p>The name of the preset role. Valid values:</p>
         * <ul>
         * <li><code>admin</code>: administrator.</li>
         * <li><code>admin-view</code>: read-only administrator.</li>
         * <li><code>ops</code>: O&amp;M engineer.</li>
         * <li><code>dev</code>: developer.</li>
         * <li><code>restricted</code>: restricted user.</li>
         * <li>A custom ClusterRole name.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><code>admin</code>, <code>admin-view</code>, <code>ops</code>: These roles cannot be granted at the <strong>namespace</strong> level.</li>
         * <li><code>admin-view</code>: This role cannot be granted at the <strong>all-clusters</strong> level.</li>
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
         * <li><code>cluster</code>: cluster level.</li>
         * <li><code>namespace</code>: namespace level.</li>
         * <li><code>all-clusters</code>: all-clusters level.</li>
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
