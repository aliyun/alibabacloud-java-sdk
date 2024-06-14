// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyShrinkRequest extends TeaModel {
    /**
     * <p>The JSON string that consists of key-value pairs.</p>
     * <br>
     * <p>If you specify this parameter, an equivalent value is required when you call the [Decrypt](https://help.aliyun.com/document_detail/28950.html) operation. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>You can also set this parameter to an alias that is bound to the CMK. For more information, see [Alias overview](https://help.aliyun.com/document_detail/68522.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The type of the data key that you want to generate. Valid values:</p>
     * <br>
     * <p>*   AES_256: a 256-bit symmetric key</p>
     * <p>*   AES_128: a 128-bit symmetric key</p>
     * <br>
     * <p>>  We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If none of the parameters are specified, KMS generates a 256-bit data key. If both parameters are specified, KMS ignores the KeySpec parameter.</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key that you want to generate. Unit: bytes.</p>
     * <br>
     * <p>Valid values: 1 to 1024.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If the KeySpec parameter is set to AES_256, set the value of the NumberOfBytes parameter to 32.</p>
     * <p>*   If the KeySpec parameter is set to AES_128, set the value of the NumberOfBytes parameter to 16.</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyShrinkRequest self = new GenerateDataKeyShrinkRequest();
        return TeaModel.build(map, self);
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

}
