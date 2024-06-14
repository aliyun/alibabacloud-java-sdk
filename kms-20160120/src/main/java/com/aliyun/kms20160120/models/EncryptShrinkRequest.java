// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptShrinkRequest extends TeaModel {
    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter, an equivalent value is required when you call the Decrypt operation. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see [Use aliases](https://help.aliyun.com/document_detail/68522.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The plaintext to be encrypted. The plaintext must be Base64 encoded.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    public static EncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptShrinkRequest self = new EncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EncryptShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
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

}
