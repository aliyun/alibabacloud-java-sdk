// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignRequest extends TeaModel {
    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_PSS_SHA_256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The signature algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiu****=</p>
     */
    @NameInMap("Digest")
    public String digest;

    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>AsymmetricSign</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <blockquote>
     * <p> You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Alias overview</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
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

    public AsymmetricSignRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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
