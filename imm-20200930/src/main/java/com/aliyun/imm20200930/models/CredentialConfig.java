// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CredentialConfig extends TeaModel {
    // 授权链
    @NameInMap("Chain")
    public java.util.List<CredentialConfigChain> chain;

    // 权限策略
    @NameInMap("Policy")
    public String policy;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

    public static CredentialConfig build(java.util.Map<String, ?> map) throws Exception {
        CredentialConfig self = new CredentialConfig();
        return TeaModel.build(map, self);
    }

    public CredentialConfig setChain(java.util.List<CredentialConfigChain> chain) {
        this.chain = chain;
        return this;
    }
    public java.util.List<CredentialConfigChain> getChain() {
        return this.chain;
    }

    public CredentialConfig setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CredentialConfig setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public static class CredentialConfigChain extends TeaModel {
        // 授权对象
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        // 授权角色
        @NameInMap("Role")
        public String role;

        // 授权方类型
        @NameInMap("RoleType")
        public String roleType;

        public static CredentialConfigChain build(java.util.Map<String, ?> map) throws Exception {
            CredentialConfigChain self = new CredentialConfigChain();
            return TeaModel.build(map, self);
        }

        public CredentialConfigChain setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CredentialConfigChain setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CredentialConfigChain setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
