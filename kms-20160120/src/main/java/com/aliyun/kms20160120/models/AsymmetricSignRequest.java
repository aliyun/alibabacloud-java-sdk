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
     * <p>The digest of the original message. The digest is generated using the hash algorithm that corresponds to the value of the Algorithm parameter.</p>
     * <blockquote>
     * <ul>
     * <li>The value is Base64-encoded.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For information about how to calculate a message digest, see the &quot;Pre-signing: calculate a message digest&quot; section of the <a href="https://help.aliyun.com/document_detail/148146.html">Asymmetric digital signature</a> topic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiu****=</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>Specifies whether to enable the dry-run feature.</p>
     * <ul>
     * <li><p>true: enables the feature.</p>
     * </li>
     * <li><p>false (default): disables the feature.</p>
     * </li>
     * </ul>
     * <p>The dry-run feature is used to test API calls and verify the permissions on the resources that you have and the validity of the request parameters. If you enable the dry-run feature, KMS always returns a failure response and a failure reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter is not configured.</p>
     * </li>
     * <li><p>ValidationError: The specified parameters in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform the operation on the KMS resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The globally unique identifier (GUID) of the customer master key (CMK).</p>
     * <blockquote>
     * <p>You can also specify the alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Overview of aliases</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the key version. The ID must be the GUID of the key version.</p>
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
