// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetKeyPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyName")
    public String policyName;

    public static SetKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetKeyPolicyRequest self = new SetKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetKeyPolicyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SetKeyPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetKeyPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
