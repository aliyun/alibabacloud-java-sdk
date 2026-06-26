// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeletePolicySetRequest extends TeaModel {
    @NameInMap("PolicySetName")
    public String policySetName;

    public static DeletePolicySetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicySetRequest self = new DeletePolicySetRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicySetRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
