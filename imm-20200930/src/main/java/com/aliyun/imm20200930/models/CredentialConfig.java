// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CredentialConfig extends TeaModel {
    /**
     * <p>The authorization chains. All roles in the array must have the <code>sts:AssumeRole</code> permission. You need to only grant other permissions, such as read and write permissions on OSS, to the last role in the array. You can grant permissions in the RAM console.</p>
     */
    @NameInMap("Chain")
    public java.util.List<CredentialConfigChain> chain;

    /**
     * <p>The policy that is attached to the role specified by the ServiceRole parameter. For example, the policy allows access to OSS. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;oss:<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The service role in the account that is used to call an IMM API operation. The role must have the <code>sts:AssumeRole</code> permission. You can configure permissions for the role in the Resource Access Management (RAM) console.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunSTSAssumeForIMMServiceRole</p>
     */
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
        /**
         * <p>The ID of the account that you use to grant permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>10232100246xxxxx</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>The RAM role that can be assumed.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOSSRole</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The role type. Valid values:</p>
         * <ul>
         * <li>user: Alibaba Cloud account.</li>
         * <li>service: Alibaba Cloud service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
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
