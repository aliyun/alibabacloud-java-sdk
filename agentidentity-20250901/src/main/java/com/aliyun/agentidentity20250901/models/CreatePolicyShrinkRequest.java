// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicyShrinkRequest extends TeaModel {
    @NameInMap("Definition")
    public String definitionShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static CreatePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyShrinkRequest self = new CreatePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyShrinkRequest setDefinitionShrink(String definitionShrink) {
        this.definitionShrink = definitionShrink;
        return this;
    }
    public String getDefinitionShrink() {
        return this.definitionShrink;
    }

    public CreatePolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyShrinkRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
