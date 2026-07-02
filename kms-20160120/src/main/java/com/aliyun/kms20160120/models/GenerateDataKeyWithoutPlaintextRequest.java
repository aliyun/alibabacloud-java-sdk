// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyWithoutPlaintextRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the DryRun mode.</p>
     * <ul>
     * <li><p>true: enables the DryRun mode.</p>
     * </li>
     * <li><p>false (default): disables the DryRun mode.</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test API calls, verify your permissions on the required resources, and check if the request parameters are valid. If you enable the DryRun mode, KMS returns a failure response with a reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not specified.</p>
     * </li>
     * <li><p>ValidationError: The request parameters are invalid.</p>
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
     * <p>A JSON string of key-value pairs. If you specify this parameter, you must provide the same parameter when you call the Decrypt operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    /**
     * <p>The globally unique identifier of the CMK. You can also specify an alias that is bound to the CMK. For more information about how to use an alias, see Alias overview.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>599fa825-17de-417e-9554-bb032cc6****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The length of the data key to generate. Valid values:</p>
     * <ul>
     * <li><p>AES_256: a 256-bit symmetric key</p>
     * </li>
     * <li><p>AES_128: a 128-bit symmetric key</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Use KeySpec or NumberOfBytes to specify the length of the data key. If you do not specify either parameter, KMS generates a 256-bit data key. If you specify both parameters, KMS ignores the KeySpec parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES_256</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key to generate.<br> Valid values: 1 to 1024.<br> Unit: bytes<br><br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyWithoutPlaintextRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyWithoutPlaintextRequest self = new GenerateDataKeyWithoutPlaintextRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyWithoutPlaintextRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GenerateDataKeyWithoutPlaintextRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public GenerateDataKeyWithoutPlaintextRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyWithoutPlaintextRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyWithoutPlaintextRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

}
