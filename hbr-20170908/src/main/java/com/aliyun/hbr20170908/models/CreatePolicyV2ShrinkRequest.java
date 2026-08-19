// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyV2ShrinkRequest extends TeaModel {
    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>Backup once every day at 10:00 AM, with cross-region backup to Shanghai.</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily local backup + geo-redundancy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: general backup policy. Supports backing up data sources other than ECS full-server backup.</li>
     * <li><strong>UDM_ECS_ONLY</strong>: full-server backup policy. Supports only ECS full-server backup.</li>
     * </ul>
     * <p>If the policy type is not specified, Cloud Backup automatically sets the policy type based on whether a backup vault is specified in the policy rules:</p>
     * <ul>
     * <li>Backup vault specified in policy rules: <strong>STANDARD</strong></li>
     * <li>Backup vault not specified in policy rules: <strong>UDM_ECS_ONLY</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The list of policy rules.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static CreatePolicyV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyV2ShrinkRequest self = new CreatePolicyV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyV2ShrinkRequest setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public CreatePolicyV2ShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyV2ShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreatePolicyV2ShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
