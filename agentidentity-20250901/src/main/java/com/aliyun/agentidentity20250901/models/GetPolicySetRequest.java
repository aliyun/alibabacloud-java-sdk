// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicySetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    public static GetPolicySetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicySetRequest self = new GetPolicySetRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicySetRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
