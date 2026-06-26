// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicySetRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static UpdatePolicySetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicySetRequest self = new UpdatePolicySetRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicySetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicySetRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
