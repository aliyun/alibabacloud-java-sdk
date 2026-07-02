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
     * <p>The digest that is generated using the hash algorithm that corresponds to the value of <strong>Algorithm</strong> to hash the original message.</p>
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
     * <p>Specifies whether to perform a dry run.</p>
     * <ul>
     * <li><p>true: performs a dry run.</p>
     * </li>
     * <li><p>false (default): does not perform a dry run.</p>
     * </li>
     * </ul>
     * <p>A dry run is used to test API calls and verify whether you have the permissions to access the specified resources and whether the request parameters are valid. If you perform a dry run, KMS always returns a failure response that indicates the cause of the failure. The following failure causes are included:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter is not specified.</p>
     * </li>
     * <li><p>ValidationError: The specified parameters in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform this operation on the KMS resource.</p>
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
