// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricDecryptRequest extends TeaModel {
    /**
     * <p>The decryption algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_1</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The ciphertext to decrypt, encoded in Base64. </p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/148131.html">AsymmetricEncrypt</a> operation to generate the ciphertext.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>Specifies whether to enable DryRun mode. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false (default): Disabled.</li>
     * </ul>
     * <p>DryRun mode is used to test API calls, verify that you have the required permissions on the relevant resources, and check whether the request parameters are configured correctly. When DryRun mode is enabled, KMS always returns a failure with a reason. The failure reasons include the following:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not specified.</li>
     * <li>ValidationError: A parameter specified in the request is invalid.</li>
     * <li>AccessDeniedError: You do not have permission to perform this operation on the KMS resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The ID of the key. You can also specify a key alias or a key Amazon Resource Name (ARN). For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
     * <blockquote>
     * <p>To access a key that belongs to another Alibaba Cloud account, you must specify the key ARN. The key ARN format is <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
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
     * <strong>example:</strong>
     * <p>{ &quot;AttestationDocument&quot;:&quot;base64-encoded-attestion-document&quot;,  &quot;KeyEncryptionAlgorithm&quot;:&quot;RSAES_OAEP_SHA_256&quot; }</p>
     */
    @NameInMap("Recipient")
    public String recipient;

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

    public AsymmetricDecryptRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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

    public AsymmetricDecryptRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    public String getRecipient() {
        return this.recipient;
    }

}
