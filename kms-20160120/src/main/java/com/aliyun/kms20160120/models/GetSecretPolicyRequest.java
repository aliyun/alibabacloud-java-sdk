// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretPolicyRequest extends TeaModel {
    /**
     * <p>The name of the credential policy. Only the static field default is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the credential.</p>
     * <blockquote>
     * <p>If you access a credential that belongs to another Alibaba Cloud account, you must specify the ARN of the credential. The ARN of a credential must be in the <code>acs:kms:${region}:${account}:secret/${secret-name}</code> format.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret_test</p>
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
