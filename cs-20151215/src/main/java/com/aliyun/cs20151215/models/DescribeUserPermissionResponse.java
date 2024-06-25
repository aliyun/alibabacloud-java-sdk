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
         * <ul>
         * <li><code>{cluster_id}</code> is returned if the permissions are scoped to a cluster.</li>
         * <li><code>{cluster_id}/{namespace}</code> is returned if the permissions are scoped to a namespace of a cluster.</li>
         * <li><code>all-clusters</code> is returned if the permissions are scoped to all clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c1b542****</p>
         */
        @NameInMap("resource_id")
        public String resourceId;

        /**
         * <p>The authorization type. Valid values:</p>
         * <ul>
         * <li><code>cluster</code>: indicates that the permissions are scoped to a cluster.</li>
         * <li><code>namespace</code>: indicates that the permissions are scoped to a namespace of a cluster.</li>
         * <li><code>console</code>: indicates that the permissions are scoped to all clusters. This value was displayed only in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.</p>
         * 
         * <strong>example:</strong>
         * <p>view</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The type of predefined role. Valid values:</p>
         * <ul>
         * <li><code>admin</code>: administrator</li>
         * <li><code>ops</code>: O\&amp;M engineer</li>
         * <li><code>dev</code>: developer</li>
         * <li><code>restricted</code>: restricted user</li>
         * <li><code>custom</code>: custom role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("role_type")
        public String roleType;

        /**
         * <p>Indicates whether the permissions are granted to the cluster owner.</p>
         * <ul>
         * <li><code>0</code>: indicates that the permissions are not granted to the cluster owner.</li>
         * <li><code>1</code>: indicates that the permissions are granted to the cluster owner. The cluster owner is the administrator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("is_owner")
        public Long isOwner;

        /**
         * <p>Indicates whether the permissions are granted to the RAM role. Valid values:</p>
         * <ul>
         * <li><code>0</code>: indicates that the permissions are not granted to the RAM role.</li>
         * <li><code>1</code>: indicates that the permissions are granted to the RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
