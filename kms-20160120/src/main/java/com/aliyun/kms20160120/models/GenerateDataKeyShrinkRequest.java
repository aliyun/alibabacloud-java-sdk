// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the DryRun mode.</p>
     * <ul>
     * <li><p>true: enables the DryRun mode.</p>
     * </li>
     * <li><p>false (default): disables the DryRun mode.</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test the API call. It verifies whether you have the permissions to access the specified resources and whether the request parameters are valid. If you enable the DryRun mode, KMS always returns a failure response and a failure reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request succeeds if the DryRun parameter is not specified.</p>
     * </li>
     * <li><p>ValidationError: The parameters specified in the request are invalid.</p>
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
     * <p>A JSON string that consists of key-value pairs.</p>
     * <p>If you specify this parameter, you must also specify the same parameter when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The ID of the key. You can also specify the alias or the key resource name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage aliases</a>.</p>
     * <blockquote>
     * <p>When you access a key in another Alibaba Cloud account, you must enter the ARN of the key. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The length of the data key to be generated. Valid values:</p>
     * <ul>
     * <li><p>AES_256: a 256-bit symmetric key.</p>
     * </li>
     * <li><p>AES_128: a 128-bit symmetric key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If you do not specify either of the parameters, KMS generates a 256-bit data key. If you specify both parameters, KMS ignores the KeySpec parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES_256</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key that you want to generate. Unit: bytes.</p>
     * <p>Valid values: 1 to 1024.</p>
     * <p>Default values:</p>
     * <ul>
     * <li><p>If you set KeySpec to AES_256, the default value of NumberOfBytes is 32.</p>
     * </li>
     * <li><p>If you set KeySpec to AES_128, the default value of NumberOfBytes is 16.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

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
