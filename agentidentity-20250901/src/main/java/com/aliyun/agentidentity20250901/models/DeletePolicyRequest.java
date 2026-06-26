// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

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
