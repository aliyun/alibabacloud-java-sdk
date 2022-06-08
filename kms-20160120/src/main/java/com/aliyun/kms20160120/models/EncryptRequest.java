// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptRequest extends TeaModel {
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("Plaintext")
    public String plaintext;

    public static EncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptRequest self = new EncryptRequest();
        return TeaModel.build(map, self);
    }

    public EncryptRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public EncryptRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public EncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
