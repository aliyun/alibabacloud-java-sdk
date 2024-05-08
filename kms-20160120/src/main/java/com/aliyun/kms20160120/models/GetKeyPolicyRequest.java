// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKeyPolicyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("PolicyName")
    public String policyName;

    public static GetKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeyPolicyRequest self = new GetKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetKeyPolicyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetKeyPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
