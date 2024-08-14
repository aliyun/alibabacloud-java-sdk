// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyRequest extends TeaModel {
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The JSON string that consists of key-value pairs.</p>
     * <p>If you specify this parameter, an equivalent value is required when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <p>You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Alias overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The type of the data key that you want to generate. Valid values:</p>
     * <ul>
     * <li>AES_256: a 256-bit symmetric key</li>
     * <li>AES_128: a 128-bit symmetric key</li>
     * </ul>
     * <blockquote>
     * <p> We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If none of the parameters are specified, KMS generates a 256-bit data key. If both parameters are specified, KMS ignores the KeySpec parameter.</p>
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
     * <p>Default value:</p>
     * <ul>
     * <li>If the KeySpec parameter is set to AES_256, set the value of the NumberOfBytes parameter to 32.</li>
     * <li>If the KeySpec parameter is set to AES_128, set the value of the NumberOfBytes parameter to 16.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyRequest self = new GenerateDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GenerateDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public GenerateDataKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

}
