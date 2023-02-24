// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignRequest extends TeaModel {
    /**
     * <p>The signature algorithm.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The digest that is generated for the original message by using a hash algorithm. The hash algorithm is specified by the Algorithm parameter.</p>
     * <br>
     * <p>> </p>
     * <p>*   The value is encoded in Base64.</p>
     * <p>*   For more information about how to calculate message digests, see the **Preprocess signature: compute a message digest** section of the [Generate and verify a signature by using an asymmetric CMK](~~148146~~) topic.</p>
     */
    @NameInMap("Digest")
    public String digest;

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

    public static AsymmetricSignRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricSignRequest self = new AsymmetricSignRequest();
        return TeaModel.build(map, self);
    }

    public AsymmetricSignRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public AsymmetricSignRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public AsymmetricSignRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricSignRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

}
