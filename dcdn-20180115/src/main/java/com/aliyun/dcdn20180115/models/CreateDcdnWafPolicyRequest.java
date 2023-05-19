// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy that you created.</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The ID of the protection policy that you created.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>>*   You can call this operation up to 20 times per second per account.</p>
     * <p>*   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</p>
     */
    @NameInMap("PolicyStatus")
    public String policyStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static CreateDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafPolicyRequest self = new CreateDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafPolicyRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDcdnWafPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateDcdnWafPolicyRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public CreateDcdnWafPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
