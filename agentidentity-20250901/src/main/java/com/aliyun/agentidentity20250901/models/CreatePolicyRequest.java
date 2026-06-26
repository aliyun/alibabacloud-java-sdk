// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("Definition")
    public Definition definition;

    @NameInMap("Description")
    public String description;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setDefinition(Definition definition) {
        this.definition = definition;
        return this;
    }
    public Definition getDefinition() {
        return this.definition;
    }

    public CreatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
