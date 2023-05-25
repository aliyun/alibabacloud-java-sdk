// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("SignatureKey")
    public String signatureKey;

    /**
     * <p>The Secret value of the key. The value must be 6 to 30 characters in length and can contain letters, digits, and special characters. Special characters include underscores (\_), at signs (@), number signs (#), exclamation points (!), and asterisks (\*). The value must start with a letter.</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    /**
     * <p>The ID of the back-end signature key.</p>
     */
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

    public CreateSignatureRequest setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }
    public String getSignatureKey() {
        return this.signatureKey;
    }

    public CreateSignatureRequest setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

    public CreateSignatureRequest setSignatureSecret(String signatureSecret) {
        this.signatureSecret = signatureSecret;
        return this;
    }
    public String getSignatureSecret() {
        return this.signatureSecret;
    }

}
