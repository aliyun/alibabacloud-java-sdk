// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptShrinkRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to decrypt.</p>
     * <br>
     * <p>You can generate the ciphertext by calling the following operations:</p>
     * <br>
     * <p>*   [GenerateDataKey](https://help.aliyun.com/document_detail/28948.html)</p>
     * <p>*   [Encrypt](https://help.aliyun.com/document_detail/28949.html)</p>
     * <p>*   [GenerateDataKeyWithoutPlaintext](https://help.aliyun.com/document_detail/134043.html)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The JSON string that consists of key-value pairs.</p>
     * <br>
     * <p>>  If you specify the EncryptionContext parameter when you call the [GenerateDataKey](https://help.aliyun.com/document_detail/28948.html), [Encrypt](https://help.aliyun.com/document_detail/28949.html), or [GenerateDataKeyWithoutPlaintext](https://help.aliyun.com/document_detail/134043.html) operation, you must specify the same context when you call the Decrypt operation. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    public static DecryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptShrinkRequest self = new DecryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DecryptShrinkRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public DecryptShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

}
