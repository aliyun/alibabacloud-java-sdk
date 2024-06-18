// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetRegistrationPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reg-policy-dcbfd33cb004****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static GetRegistrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegistrationPolicyRequest self = new GetRegistrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetRegistrationPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
