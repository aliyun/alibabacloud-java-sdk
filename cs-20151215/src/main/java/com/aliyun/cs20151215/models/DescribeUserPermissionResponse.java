// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DescribeUserPermissionResponseBody> body;

    public static DescribeUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionResponse self = new DescribeUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserPermissionResponse setBody(java.util.List<DescribeUserPermissionResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeUserPermissionResponseBody extends TeaModel {
        /**
         * <p>The authorization setting. Valid values:</p>
         * <br>
         * <p>*   `{cluster_id}` is returned if the permissions are scoped to a cluster.</p>
         * <p>*   `{cluster_id}/{namespace}` is returned if the permissions are scoped to a namespace of a cluster.</p>
         * <p>*   `all-clusters` is returned if the permissions are scoped to all clusters.</p>
         */
        @NameInMap("resource_id")
        public String resourceId;

        /**
         * <p>The authorization type. Valid values:</p>
         * <br>
         * <p>*   `cluster`: indicates that the permissions are scoped to a cluster.</p>
         * <p>*   `namespace`: indicates that the permissions are scoped to a namespace of a cluster.</p>
         * <p>*   `console`: indicates that the permissions are scoped to all clusters. This value was displayed only in the console.</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The type of predefined role. Valid values:</p>
         * <br>
         * <p>*   `admin`: administrator</p>
         * <p>*   `ops`: O\&M engineer</p>
         * <p>*   `dev`: developer</p>
         * <p>*   `restricted`: restricted user</p>
         * <p>*   `custom`: custom role</p>
         */
        @NameInMap("role_type")
        public String roleType;

        /**
         * <p>Indicates whether the permissions are granted to the cluster owner.</p>
         * <br>
         * <p>*   `0`: indicates that the permissions are not granted to the cluster owner.</p>
         * <p>*   `1`: indicates that the permissions are granted to the cluster owner. The cluster owner is the administrator.</p>
         */
        @NameInMap("is_owner")
        public Long isOwner;

        /**
         * <p>Indicates whether the permissions are granted to the RAM role. Valid values:</p>
         * <br>
         * <p>*   `0`: indicates that the permissions are not granted to the RAM role.</p>
         * <p>*   `1`: indicates that the permissions are granted to the RAM role.</p>
         */
        @NameInMap("is_ram_role")
        public Long isRamRole;

        public static DescribeUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserPermissionResponseBody self = new DescribeUserPermissionResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeUserPermissionResponseBody setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeUserPermissionResponseBody setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeUserPermissionResponseBody setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeUserPermissionResponseBody setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public DescribeUserPermissionResponseBody setIsOwner(Long isOwner) {
            this.isOwner = isOwner;
            return this;
        }
        public Long getIsOwner() {
            return this.isOwner;
        }

        public DescribeUserPermissionResponseBody setIsRamRole(Long isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public Long getIsRamRole() {
            return this.isRamRole;
        }

    }

}
