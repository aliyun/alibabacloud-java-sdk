// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyRequest extends TeaModel {
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
     * <p>The digest generated for the original message by using the hash algorithm that corresponds to the <strong>Algorithm</strong> parameter.</p>
     * <blockquote>
     * <p>The value is Base64-encoded.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>Specifies whether to enable the DryRun mode. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false (default): Disabled.</li>
     * </ul>
     * <p>The DryRun mode is used to test API calls, verify whether you have the required permissions on the resources, and check whether the request parameters are correctly configured. When the DryRun mode is enabled, KMS always returns a failure and provides the cause of the failure. The causes include:</p>
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
     * <p>The key version ID. The globally unique identifier of the key version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The signature value to be verified.</p>
     * <blockquote>
     * <p>The value is Base64-encoded.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</p>
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

    public AsymmetricVerifyRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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
