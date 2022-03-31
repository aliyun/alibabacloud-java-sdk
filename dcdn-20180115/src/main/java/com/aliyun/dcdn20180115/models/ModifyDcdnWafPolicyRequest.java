// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyStatus")
    public String policyStatus;

    public static ModifyDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyRequest self = new ModifyDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
