// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptResponseBody extends TeaModel {
    /**
     * <p>The ciphertext of the data that is encrypted by using the primary CMK version.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The globally unique ID of the CMK. If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the key version that is used to encrypt the plaintext. It is the primary version of the CMK.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncryptResponseBody self = new EncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public EncryptResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public EncryptResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public EncryptResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public EncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
