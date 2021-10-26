// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SignatureName")
    public String signatureName;

    @NameInMap("SignatureKey")
    public String signatureKey;

    @NameInMap("SignatureSecret")
    public String signatureSecret;

    public static CreateSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureRequest self = new CreateSignatureRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignatureRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateSignatureRequest setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

    public CreateSignatureRequest setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }
    public String getSignatureKey() {
        return this.signatureKey;
    }

    public CreateSignatureRequest setSignatureSecret(String signatureSecret) {
        this.signatureSecret = signatureSecret;
        return this;
    }
    public String getSignatureSecret() {
        return this.signatureSecret;
    }

}
