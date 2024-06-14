// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetSecretPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static SetSecretPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecretPolicyRequest self = new SetSecretPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetSecretPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetSecretPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public SetSecretPolicyRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
