// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricDecryptRequest extends TeaModel {
    /**
     * <p>The decryption algorithm.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The ciphertext that you want to decrypt.</p>
     * <br>
     * <p>> * The value is encoded in Base64.</p>
     * <p>> * You can call the [AsymmetricEncrypt](~~148131~~) operation to generate the ciphertext.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <br>
     * <p>>  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Alias overview](~~68522~~).</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    public static AsymmetricDecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricDecryptRequest self = new AsymmetricDecryptRequest();
        return TeaModel.build(map, self);
    }

    public AsymmetricDecryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public AsymmetricDecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public AsymmetricDecryptRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricDecryptRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

}
