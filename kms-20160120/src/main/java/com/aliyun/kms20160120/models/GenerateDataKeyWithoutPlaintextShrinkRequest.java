// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyWithoutPlaintextShrinkRequest extends TeaModel {
    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter, an equivalent value is required when you call the Decrypt operation. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     */
    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    /**
     * <p>The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see Use aliases.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The length of the data key that you want to generate. Valid values:</p>
     * <br>
     * <p>*   AES_256: 256-bit symmetric key</p>
     * <p>*   AES_128: 128-bit symmetric key</p>
     * <br>
     * <p>>  We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If both of them are not specified, KMS generates a 256-bit data key. If both of them are specified, KMS ignores the KeySpec parameter.</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The length of the data key that you want to generate.</p>
     * <br>
     * <p>Valid values: 1 to 1024.</p>
     * <br>
     * <p>Unit: bytes.</p>
     */
    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyWithoutPlaintextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyWithoutPlaintextShrinkRequest self = new GenerateDataKeyWithoutPlaintextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyWithoutPlaintextShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public GenerateDataKeyWithoutPlaintextShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyWithoutPlaintextShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyWithoutPlaintextShrinkRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

}
