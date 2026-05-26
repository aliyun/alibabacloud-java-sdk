// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicyShrinkRequest extends TeaModel {
    @NameInMap("Definition")
    public String definitionShrink;

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

    public static UpdatePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyShrinkRequest self = new UpdatePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyShrinkRequest setDefinitionShrink(String definitionShrink) {
        this.definitionShrink = definitionShrink;
        return this;
    }
    public String getDefinitionShrink() {
        return this.definitionShrink;
    }

    public UpdatePolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyShrinkRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
