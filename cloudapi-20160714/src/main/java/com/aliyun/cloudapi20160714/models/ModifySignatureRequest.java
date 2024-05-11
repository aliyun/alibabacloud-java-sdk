// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the signature key that you want to manage.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>The new Key value of the key. The value must be 6 to 20 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     */
    @NameInMap("SignatureKey")
    public String signatureKey;

    /**
     * <p>The new name of the key. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     */
    @NameInMap("SignatureName")
    public String signatureName;

    /**
     * <p>The new Secret value of the key. The value must be 6 to 30 characters in length and can contain letters, digits, and special characters. Special characters include underscores (_), at signs (@), number signs (#), exclamation points (!), and asterisks (\\*). The value must start with a letter.</p>
     */
    @NameInMap("SignatureSecret")
    public String signatureSecret;

    public static ModifySignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySignatureRequest self = new ModifySignatureRequest();
        return TeaModel.build(map, self);
    }

    public ModifySignatureRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifySignatureRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public ModifySignatureRequest setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }
    public String getSignatureKey() {
        return this.signatureKey;
    }

    public ModifySignatureRequest setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

    public ModifySignatureRequest setSignatureSecret(String signatureSecret) {
        this.signatureSecret = signatureSecret;
        return this;
    }
    public String getSignatureSecret() {
        return this.signatureSecret;
    }

}
