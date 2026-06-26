// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static GetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyRequest self = new GetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
