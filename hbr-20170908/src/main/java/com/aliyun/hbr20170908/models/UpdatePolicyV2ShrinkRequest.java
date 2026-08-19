// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyV2ShrinkRequest extends TeaModel {
    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>Back up once every day at 10:00 AM, with cross-region backup to Shanghai.</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************viy</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily backup + cross-region backup</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The list of policy rules.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static UpdatePolicyV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyV2ShrinkRequest self = new UpdatePolicyV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyV2ShrinkRequest setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public UpdatePolicyV2ShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyV2ShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyV2ShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
