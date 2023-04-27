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
         * <br>
         * <p>*   {cluster_id} is returned if the permissions are scoped to a cluster.</p>
         * <p>*   {cluster_id}/{namespace} is returned if the permissions are scoped to a namespace of a cluster.</p>
         * <p>*   all-clusters is returned if the permissions are scoped to all clusters.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The authorization type. Valid values:</p>
         * <br>
         * <p>*   cluster: indicates that the permissions are scoped to a cluster.</p>
         * <p>*   namespace: indicates that the permissions are scoped to a namespace of a cluster.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The type of predefined role. Valid values:</p>
         * <br>
         * <p>*   admin: administrator</p>
         * <p>*   dev: developer</p>
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
