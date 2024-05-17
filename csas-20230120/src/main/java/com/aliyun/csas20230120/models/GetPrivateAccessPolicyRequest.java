// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static GetPrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessPolicyRequest self = new GetPrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
