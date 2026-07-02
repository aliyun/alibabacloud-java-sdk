// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricEncryptRequest extends TeaModel {
    /**
     * <p>The encryption algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_1</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Specifies whether to enable the dry run feature.</p>
     * <ul>
     * <li><p>true: enables the feature.</p>
     * </li>
     * <li><p>false (default): disables the feature.</p>
     * </li>
     * </ul>
     * <p>The dry run feature is used to test the API call and verify the permissions on the specified resources and the validity of the request parameters. If you enable the dry run feature, KMS always returns a failed result and a failure reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not specified.</p>
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
     * <p>The ID of the key. You can also specify the alias or the Amazon Resource Name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage aliases</a>.</p>
     * <blockquote>
     * <p>To access a key of another Alibaba Cloud account, you must specify the ARN of the key. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the key version. The ID must be a globally unique identifier.</p>
     * <blockquote>
     * <p>To obtain the key version ID, call the <a href="https://help.aliyun.com/document_detail/133966.html">ListKeyVersions</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The plaintext to be encrypted. The value must be Base64-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SGVsbG8gd29ybGQ=</p>
     */
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

    public AsymmetricEncryptRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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
