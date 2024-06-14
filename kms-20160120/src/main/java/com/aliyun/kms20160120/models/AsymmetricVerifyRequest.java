// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyRequest extends TeaModel {
    /**
     * <p>The signature algorithm.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The digest that is generated for the original message by using a hash algorithm. The hash algorithm is specified by the **Algorithm** parameter.</p>
     * <br>
     * <p>>  The value is encoded in Base64.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>>  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Overview of aliases](https://help.aliyun.com/document_detail/68522.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The signature value to be verified.</p>
     * <br>
     * <p>>  The value is encoded in Base64.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public String value;

    public static AsymmetricVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricVerifyRequest self = new AsymmetricVerifyRequest();
        return TeaModel.build(map, self);
    }

    public AsymmetricVerifyRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public AsymmetricVerifyRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public AsymmetricVerifyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricVerifyRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricVerifyRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
