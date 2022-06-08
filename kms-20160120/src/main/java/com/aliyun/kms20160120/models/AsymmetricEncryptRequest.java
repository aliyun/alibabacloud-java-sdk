// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricEncryptRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("Plaintext")
    public String plaintext;

    public static AsymmetricEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricEncryptRequest self = new AsymmetricEncryptRequest();
        return TeaModel.build(map, self);
    }

    public AsymmetricEncryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public AsymmetricEncryptRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricEncryptRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricEncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
