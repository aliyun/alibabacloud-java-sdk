// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy that you want to modify. You can specify only one ID in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The new name of the protection policy.</p>
     * <blockquote>
     * <p>You must specify PolicyName or PolicyStatus.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The new status of the protection policy. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * <blockquote>
     * <p>You must specify PolicyName or PolicyStatus.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PolicyStatus")
    public String policyStatus;

    public static ModifyDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyRequest self = new ModifyDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public ModifyDcdnWafPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyDcdnWafPolicyRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

}
