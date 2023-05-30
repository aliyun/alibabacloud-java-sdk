// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignRequest extends TeaModel {
    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The signature algorithm.</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The operation that you want to perform. Set the value to **AsymmetricSign**.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <br>
     * <p>>  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Alias overview](~~68522~~).</p>
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
