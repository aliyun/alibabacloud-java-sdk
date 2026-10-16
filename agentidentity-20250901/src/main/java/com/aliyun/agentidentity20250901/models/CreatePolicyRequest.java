// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The policy definition.</p>
     */
    @NameInMap("Definition")
    public Definition definition;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the policy. The name must be unique within the policy set to which the policy belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rate-limit-policy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
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
