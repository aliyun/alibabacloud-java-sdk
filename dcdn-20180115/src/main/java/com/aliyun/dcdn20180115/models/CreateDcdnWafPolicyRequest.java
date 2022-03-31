// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyRequest extends TeaModel {
    @NameInMap("DefenseScene")
    public String defenseScene;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyStatus")
    public String policyStatus;

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

    public CreateDcdnWafPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
