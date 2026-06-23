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
         * <p>集群访问配置，格式为：</p>
         * <ul>
         * <li>当是集群维度授权时，格式为：<code>{cluster_id}</code>。</li>
         * <li>当是命名空间维度授权时，格式为：<code>{cluster_id}/{namespace}</code>。</li>
         * <li>当是所有集群授权时，值固定为：<code>all-clusters</code>。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c1b542****</p>
         */
        @NameInMap("resource_id")
        public String resourceId;

        /**
         * <p>授权类型，取值：</p>
         * <ul>
         * <li><code>cluster</code>：集群维度。</li>
         * <li><code>namespace</code>：命名空间维度。</li>
         * <li><code>console</code>：所有集群维度的授权。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>自定义角色名称，当授权自定义角色时，该字段为指定的自定义集群管理角色名称。</p>
         * 
         * <strong>example:</strong>
         * <p>terway-pod-reader</p>
         */
        @NameInMap("role_name")
        public String roleName;

        /**
         * <p>预置的角色类型，取值：</p>
         * <ul>
         * <li><code>admin</code>：管理员。</li>
         * <li><code>ops</code>：运维人员。</li>
         * <li><code>dev</code>：开发人员。</li>
         * <li><code>restricted</code>：受限用户。</li>
         * <li><code>custom</code>：使用自定义的集群管理角色。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("role_type")
        public String roleType;

        /**
         * <p>是否为集群创建者的授权，取值：</p>
         * <ul>
         * <li><code>0</code>：代表不是集群创建者的授权记录。</li>
         * <li><code>1</code>：代表该授权记录为集群创建者的管理员权限。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("is_owner")
        public Long isOwner;

        /**
         * <p>是否为RAM角色授权，取值：</p>
         * <ul>
         * <li><code>0</code>：代表当前记录不是RAM角色授权。</li>
         * <li><code>1</code>：代表当前记录是RAM角色授权。</li>
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
