// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignRequest extends TeaModel {
    /**
     * <p>The signature algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_PSS_SHA_256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The digest generated from the original message by using the hash algorithm that corresponds to the value of the Algorithm parameter.</p>
     * <blockquote>
     * <ul>
     * <li>The value is Base64-encoded.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For more information about how to calculate a message digest, see the <strong>Signature preprocessing: Calculate the message digest</strong> section in <a href="https://help.aliyun.com/document_detail/148146.html">Asymmetric digital signatures</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiu****=</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>Specifies whether to enable the dry run mode.</p>
     * <ul>
     * <li>true: Enables the dry run mode.</li>
     * <li>false: Disables the dry run mode. This is the default value.</li>
     * </ul>
     * <p>The dry run mode is used to test API calls, verify whether you have the required permissions on the resources, and check whether the request parameters are correctly configured. When the dry run mode is enabled, KMS always returns a failure and provides the cause of the failure. The causes include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not configured.</li>
     * <li>ValidationError: The specified parameters in the request are invalid.</li>
     * <li>AccessDeniedError: You are not authorized to perform the operation on the KMS resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The globally unique identifier of the customer master key (CMK).</p>
     * <blockquote>
     * <p>You can also set this parameter to the alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Usage notes for aliases</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The key version ID, which is the globally unique identifier of the key version.</p>
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
