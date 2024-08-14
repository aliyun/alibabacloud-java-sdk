// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetKeyPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:[&quot;kms:<em>&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511</em><em>**:<em>&quot;]},&quot;Resource&quot;:[&quot;</em>&quot;],&quot;Sid&quot;:&quot;kms default key policy&quot;},{&quot;Action&quot;:[&quot;kms:List</em>&quot;,&quot;kms:Describe*&quot;,&quot;kms:Create*&quot;,&quot;kms:Enable*&quot;,&quot;kms:Disable*&quot;,&quot;kms:Get*&quot;,&quot;kms:Set*&quot;,&quot;kms:Update*&quot;,&quot;kms:Delete*&quot;,&quot;kms:Cancel*&quot;,&quot;kms:TagResource&quot;,&quot;kms:UntagResource&quot;,&quot;kms:ImportKeyMaterial&quot;,&quot;kms:ScheduleKeyDeletion&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511****:user/for_test_policy&quot;]},&quot;Resource&quot;:[&quot;*&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static SetKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetKeyPolicyRequest self = new SetKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetKeyPolicyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SetKeyPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetKeyPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
