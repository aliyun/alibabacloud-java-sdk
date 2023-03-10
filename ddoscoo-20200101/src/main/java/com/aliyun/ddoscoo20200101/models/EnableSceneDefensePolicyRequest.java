// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableSceneDefensePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the policy that you want to enable.</p>
     * <br>
     * <p>> You can call the [DescribeSceneDefensePolicies](~~159382~~) operation to query the IDs of all policies.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static EnableSceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneDefensePolicyRequest self = new EnableSceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableSceneDefensePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
