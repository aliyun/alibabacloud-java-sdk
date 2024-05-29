// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableSceneDefensePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the policy that you want to disable.</p>
     * <br>
     * <p>> You can call the [DescribeSceneDefensePolicies](https://help.aliyun.com/document_detail/159382.html) operation to query the IDs of all policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DisableSceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneDefensePolicyRequest self = new DisableSceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneDefensePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
