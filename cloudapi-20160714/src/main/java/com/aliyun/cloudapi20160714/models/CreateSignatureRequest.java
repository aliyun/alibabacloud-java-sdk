// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The Key value of the key. The value must be 6 to 20 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwertyuiop</p>
     */
    @NameInMap("SignatureKey")
    public String signatureKey;

    /**
     * <p>The displayed name of the key. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backendsignature</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    /**
     * <p>The Secret value of the key. The value must be 6 to 30 characters in length and can contain letters, digits, and special characters. Special characters include underscores (_), at signs (@), number signs (#), exclamation points (!), and asterisks (\*). The value must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdfghjkl</p>
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
