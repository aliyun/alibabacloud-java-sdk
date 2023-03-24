// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

    public static DeletePrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessPolicyRequest self = new DeletePrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
