// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GrantPermissionsRequest extends TeaModel {
    // 请求体参数
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
        // 授权目标集群id
        @NameInMap("cluster")
        public String cluster;

        // 该授权是否是自定义授权
        @NameInMap("is_custom")
        public Boolean isCustom;

        // 是否是 RAM 角色授权
        @NameInMap("is_ram_role")
        public Boolean isRamRole;

        // 命名空间名称
        @NameInMap("namespace")
        public String namespace;

        // 预置的角色名称
        @NameInMap("role_name")
        public String roleName;

        // 授权类型
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
