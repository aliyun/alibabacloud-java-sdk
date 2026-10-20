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
         * <p>The cluster access configuration. The format varies based on the authorization scope:</p>
         * <ul>
         * <li>Cluster-level authorization: <code>{cluster_id}</code>.</li>
         * <li>Namespace-level authorization: <code>{cluster_id}/{namespace}</code>.</li>
         * <li>All-cluster authorization: <code>all-clusters</code>.</li>
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
         * <li><code>cluster</code>: cluster-level.</li>
         * <li><code>namespace</code>: namespace-level.</li>
         * <li><code>console</code>: all-cluster-level authorization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The custom role name. When a custom role is authorized, this field specifies the name of the custom cluster management role.</p>
         * 
         * <strong>example:</strong>
         * <p>terway-pod-reader</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>The preset role type. Valid values:</p>
         * <ul>
         * <li><code>admin</code>: Administrator.</li>
         * <li><code>ops</code>: O&amp;M engineer.</li>
         * <li><code>dev</code>: Developer.</li>
         * <li><code>restricted</code>: Restricted user.</li>
         * <li><code>custom</code>: Custom cluster management role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("role_type")
        public String roleType;

        /**
         * <p>Indicates whether the authorization belongs to the cluster creator. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The authorization record does not belong to the cluster creator.</li>
         * <li><code>1</code>: The authorization record represents the administrator permissions of the cluster creator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("is_owner")
        public Long isOwner;

        /**
         * <p>Indicates whether the authorization is for a RAM role. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The record is not a RAM role authorization.</li>
         * <li><code>1</code>: The record is a RAM role authorization.</li>
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
