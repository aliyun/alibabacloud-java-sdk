// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableSceneDefensePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the policy to disable.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/159382.html">DescribeSceneDefensePolicies</a> to query all policy IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>321a-fd31-df51-****</p>
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
