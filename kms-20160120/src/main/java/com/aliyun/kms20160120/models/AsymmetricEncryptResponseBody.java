// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricEncryptResponseBody extends TeaModel {
    /**
     * <p>The Base64-encoded ciphertext that was generated after encryption.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>>  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version ID of the CMK that is used to encrypt the plaintext.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AsymmetricEncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricEncryptResponseBody self = new AsymmetricEncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public AsymmetricEncryptResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public AsymmetricEncryptResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricEncryptResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricEncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
