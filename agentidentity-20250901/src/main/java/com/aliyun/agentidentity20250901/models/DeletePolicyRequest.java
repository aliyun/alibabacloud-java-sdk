// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    /**
     * <p>The name of the policy. The name must be unique within the policy set to which it belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rate-limit-policy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    public static DeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyRequest self = new DeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DeletePolicyRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
