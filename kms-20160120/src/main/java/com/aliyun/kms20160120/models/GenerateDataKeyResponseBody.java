// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyResponseBody extends TeaModel {
    /**
     * <p>The ciphertext of the data key that is encrypted by using the primary version of the specified CMK.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>>  If you set the KeyId parameter in the request to an alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the CMK version. The ID must be globally unique.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The Base64 encoded plaintext of the data key.</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyResponseBody self = new GenerateDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public GenerateDataKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public GenerateDataKeyResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public GenerateDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
