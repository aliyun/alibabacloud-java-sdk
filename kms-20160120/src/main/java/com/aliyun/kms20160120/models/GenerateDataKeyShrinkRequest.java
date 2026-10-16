// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable DryRun mode.</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false (default): disabled.</li>
     * </ul>
     * <p>DryRun mode is used to test API calls, verify that you have the required permissions on the relevant resources, and check whether request parameters are configured correctly. When DryRun mode is enabled, KMS always returns a failure with a reason. Possible failure reasons include:</p>
     * <ul>
     * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not set.</li>
     * <li>ValidationError: A parameter specified in the request is invalid.</li>
     * <li>AccessDeniedError: You do not have permission to perform the operation on the KMS resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>A JSON string of key-value pairs.</p>
     * <p>If you specify this parameter, you must provide the same parameter when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The ID of the key. You can also specify a key alias or a key Amazon Resource Name (ARN). For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
     * <blockquote>
     * <p>To access a key in another Alibaba Cloud account, you must specify the key ARN. The key ARN format is <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The length of the data key (DK) to generate. Valid values:</p>
     * <ul>
     * <li><p>AES_256: a 256-bit symmetric key.</p>
     * </li>
     * <li><p>AES_128: a 128-bit symmetric key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Use KeySpec or NumberOfBytes to specify the DK length. If neither is specified, KMS generates a 256-bit DK. If both are specified, KMS ignores the KeySpec parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES_256</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key (DK) to generate, in bytes.</p>
     * <p>Valid values: 1 to 1024.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>When KeySpec is set to AES_256, the default value of NumberOfBytes is 32.</li>
     * <li>When KeySpec is set to AES_128, the default value of NumberOfBytes is 16.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;AttestationDocument&quot;:&quot;base64-encoded-attestion-document&quot;, 
     * &quot;KeyEncryptionAlgorithm&quot;:&quot;RSAES_OAEP_SHA_256&quot;
     * }</p>
     */
    @NameInMap("Recipient")
    public String recipient;

    public static GenerateDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyShrinkRequest self = new GenerateDataKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GenerateDataKeyShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public GenerateDataKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyShrinkRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public GenerateDataKeyShrinkRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    public String getRecipient() {
        return this.recipient;
    }

}
