// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretPolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static GetSecretPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretPolicyRequest self = new GetSecretPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetSecretPolicyRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
