// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKeyPolicyRequest extends TeaModel {
    /**
     * <p>The ID or Alibaba Cloud Resource Name (ARN) of the key.</p>
     * <blockquote>
     * <p>When you access a key in another Alibaba Cloud account, you must enter the ARN of the key. The ARN of a key is in the <code>acs:kms:${region}:${account}:key/${keyid}</code> format.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the key policy. Only the static value default is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
