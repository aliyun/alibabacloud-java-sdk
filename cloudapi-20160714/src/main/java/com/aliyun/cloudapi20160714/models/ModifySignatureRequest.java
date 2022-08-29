// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureRequest extends TeaModel {
    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("SignatureKey")
    public String signatureKey;

    @NameInMap("SignatureName")
    public String signatureName;

    @NameInMap("SignatureSecret")
    public String signatureSecret;

    public static ModifySignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySignatureRequest self = new ModifySignatureRequest();
        return TeaModel.build(map, self);
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
