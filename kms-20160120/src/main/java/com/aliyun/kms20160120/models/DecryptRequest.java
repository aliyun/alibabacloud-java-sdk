// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to decrypt.</p>
     * <br>
     * <p>You can generate the ciphertext by calling the following operations:</p>
     * <br>
     * <p>*   [GenerateDataKey](~~28948~~)</p>
     * <p>*   [Encrypt](~~28949~~)</p>
     * <p>*   [GenerateDataKeyWithoutPlaintext](~~134043~~)</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The JSON string that consists of key-value pairs.</p>
     * <br>
     * <p>>  If you specify the EncryptionContext parameter when you call the [GenerateDataKey](~~28948~~), [Encrypt](~~28949~~), or [GenerateDataKeyWithoutPlaintext](~~134043~~) operation, you must specify the same context when you call the Decrypt operation. For more information, see [EncryptionContext](~~42975~~).</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    public static DecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptRequest self = new DecryptRequest();
        return TeaModel.build(map, self);
    }

    public DecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public DecryptRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

}
