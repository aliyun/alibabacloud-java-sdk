// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyV2ShrinkRequest extends TeaModel {
    /**
     * <p>The description of the backup policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Data is backed up at 10:00:00 every day and replicated to the China (Shanghai) region for geo-redundancy.</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The name of the backup policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily Local Backup + Remote Backup</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The rules in the backup policy.</p>
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
