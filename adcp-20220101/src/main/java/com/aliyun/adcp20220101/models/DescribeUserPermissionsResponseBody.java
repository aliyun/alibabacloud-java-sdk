// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The details about the permissions of the RAM user.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<DescribeUserPermissionsResponseBodyPermissions> permissions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EA06613B-37A3-549E-BAE0-E4AD8A6E93D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionsResponseBody self = new DescribeUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionsResponseBody setPermissions(java.util.List<DescribeUserPermissionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<DescribeUserPermissionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public DescribeUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserPermissionsResponseBodyPermissions extends TeaModel {
        /**
         * <p>The authorization setting. Valid values:</p>
         * <ul>
         * <li>{cluster_id} is returned if the permissions are scoped to a cluster.</li>
         * <li>{cluster_id}/{namespace} is returned if the permissions are scoped to a namespace of a cluster.</li>
         * <li>all-clusters is returned if the permissions are scoped to all clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cffef3c9c7ba145b083292942a2c3****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The authorization type. Valid values:</p>
         * <ul>
         * <li>cluster: indicates that the permissions are scoped to a cluster.</li>
         * <li>namespace: indicates that the permissions are scoped to a namespace of a cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.</p>
         * 
         * <strong>example:</strong>
         * <p>view</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The type of predefined role. Valid values:</p>
         * <ul>
         * <li>admin: administrator</li>
         * <li>dev: developer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static DescribeUserPermissionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserPermissionsResponseBodyPermissions self = new DescribeUserPermissionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeUserPermissionsResponseBodyPermissions setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeUserPermissionsResponseBodyPermissions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeUserPermissionsResponseBodyPermissions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeUserPermissionsResponseBodyPermissions setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
