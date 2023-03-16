// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsResponseBody extends TeaModel {
    @NameInMap("Permissions")
    public java.util.List<DescribeUserPermissionsResponseBodyPermissions> permissions;

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
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RoleName")
        public String roleName;

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
