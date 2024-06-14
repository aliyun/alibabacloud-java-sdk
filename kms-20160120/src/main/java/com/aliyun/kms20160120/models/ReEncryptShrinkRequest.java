// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptShrinkRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to re-encrypt.</p>
     * <br>
     * <p>You can set this parameter to the ciphertext that is returned after a symmetric or asymmetric encryption operation.</p>
     * <br>
     * <p>*   Symmetric encryption: the ciphertext returned after you call the [Encrypt](https://help.aliyun.com/document_detail/28949.html), [GenerateDataKey](https://help.aliyun.com/document_detail/28948.html), [GenerateDataKeyWithoutPlaintext](https://help.aliyun.com/document_detail/134043.html), or [GenerateAndExportDataKey](https://help.aliyun.com/document_detail/176804.html) operation</p>
     * <p>*   Asymmetric encryption: the public key-encrypted ciphertext returned after you call the [GenerateAndExportDataKey](https://help.aliyun.com/document_detail/176804.html) operation, or the ciphertext encrypted by using the public key of an asymmetric key pair outside KMS</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. This parameter specifies the EncryptionContext that is used to re-encrypt the decrypted data or data key.</p>
     */
    @NameInMap("DestinationEncryptionContext")
    public String destinationEncryptionContextShrink;

    /**
     * <p>The ID of the symmetric CMK that is used to re-encrypt the ciphertext after the ciphertext is decrypted.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    /**
     * <p>The encryption algorithm based on which the public key is used to encrypt the ciphertext specified by CiphertextBlob. For more information about encryption algorithms, see [AsymmetricDecrypt](https://help.aliyun.com/document_detail/148130.html).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA_256</p>
     * <p>*   RSAES_OAEP_SHA_1</p>
     * <p>*   SM2PKE</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify EncryptionContext when you call the [Encrypt](https://help.aliyun.com/document_detail/28949.html), [GenerateDataKey](https://help.aliyun.com/document_detail/28948.html), [GenerateDataKeyWithoutPlaintext](https://help.aliyun.com/document_detail/134043.html), or [GenerateAndExportDataKey](https://help.aliyun.com/document_detail/176804.html) operation to encrypt the data or data key, an equivalent value is required here. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the ciphertext that is returned after a symmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceEncryptionContext")
    public String sourceEncryptionContextShrink;

    /**
     * <p>The ID of the CMK that is used to decrypt the ciphertext.</p>
     * <br>
     * <p>This parameter is the globally unique ID of the CMK.</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceKeyId")
    public String sourceKeyId;

    /**
     * <p>The ID of the CMK version that is used to decrypt the ciphertext.</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceKeyVersionId")
    public String sourceKeyVersionId;

    public static ReEncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReEncryptShrinkRequest self = new ReEncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReEncryptShrinkRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ReEncryptShrinkRequest setDestinationEncryptionContextShrink(String destinationEncryptionContextShrink) {
        this.destinationEncryptionContextShrink = destinationEncryptionContextShrink;
        return this;
    }
    public String getDestinationEncryptionContextShrink() {
        return this.destinationEncryptionContextShrink;
    }

    public ReEncryptShrinkRequest setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    public ReEncryptShrinkRequest setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    public ReEncryptShrinkRequest setSourceEncryptionContextShrink(String sourceEncryptionContextShrink) {
        this.sourceEncryptionContextShrink = sourceEncryptionContextShrink;
        return this;
    }
    public String getSourceEncryptionContextShrink() {
        return this.sourceEncryptionContextShrink;
    }

    public ReEncryptShrinkRequest setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    public ReEncryptShrinkRequest setSourceKeyVersionId(String sourceKeyVersionId) {
        this.sourceKeyVersionId = sourceKeyVersionId;
        return this;
    }
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

}
