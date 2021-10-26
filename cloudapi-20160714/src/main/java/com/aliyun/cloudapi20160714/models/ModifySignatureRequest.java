// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("SignatureName")
    public String signatureName;

    @NameInMap("SignatureKey")
    public String signatureKey;

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

    public ModifySignatureRequest setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

    public ModifySignatureRequest setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }
    public String getSignatureKey() {
        return this.signatureKey;
    }

    public ModifySignatureRequest setSignatureSecret(String signatureSecret) {
        this.signatureSecret = signatureSecret;
        return this;
    }
    public String getSignatureSecret() {
        return this.signatureSecret;
    }

}
