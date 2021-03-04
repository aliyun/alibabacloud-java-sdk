// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptShrinkRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    public static EncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptShrinkRequest self = new EncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EncryptShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public EncryptShrinkRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public EncryptShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

}
