// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    @NameInMap("Definition")
    public Definition definition;

    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>rate-limit-policy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setDefinition(Definition definition) {
        this.definition = definition;
        return this;
    }
    public Definition getDefinition() {
        return this.definition;
    }

    public UpdatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
