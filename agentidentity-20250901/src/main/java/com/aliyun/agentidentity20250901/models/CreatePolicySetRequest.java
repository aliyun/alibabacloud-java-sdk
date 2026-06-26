// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicySetRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static CreatePolicySetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicySetRequest self = new CreatePolicySetRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicySetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicySetRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
