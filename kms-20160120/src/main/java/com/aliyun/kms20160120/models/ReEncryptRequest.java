// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to re-encrypt.</p>
     * <br>
     * <p>You can set this parameter to the ciphertext that is returned after a symmetric or asymmetric encryption operation.</p>
     * <br>
     * <p>*   Symmetric encryption: the ciphertext returned after you call the [Encrypt](~~28949~~), [GenerateDataKey](~~28948~~), [GenerateDataKeyWithoutPlaintext](~~134043~~), or [GenerateAndExportDataKey](~~176804~~) operation</p>
     * <p>*   Asymmetric encryption: the public key-encrypted ciphertext returned after you call the [GenerateAndExportDataKey](~~176804~~) operation, or the ciphertext encrypted by using the public key of an asymmetric key pair outside KMS</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. This parameter specifies the EncryptionContext that is used to re-encrypt the decrypted data or data key.</p>
     */
    @NameInMap("DestinationEncryptionContext")
    public java.util.Map<String, ?> destinationEncryptionContext;

    /**
     * <p>The ID of the symmetric CMK that is used to re-encrypt the ciphertext after the ciphertext is decrypted.</p>
     */
    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    /**
     * <p>The encryption algorithm based on which the public key is used to encrypt the ciphertext specified by CiphertextBlob. For more information about encryption algorithms, see [AsymmetricDecrypt](~~148130~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA\_256</p>
     * <p>*   RSAES_OAEP_SHA\_1</p>
     * <p>*   SM2PKE</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify EncryptionContext when you call the [Encrypt](~~28949~~), [GenerateDataKey](~~28948~~), [GenerateDataKeyWithoutPlaintext](~~134043~~), or [GenerateAndExportDataKey](~~176804~~) operation to encrypt the data or data key, an equivalent value is required here. For more information, see [EncryptionContext](~~42975~~).</p>
     * <br>
     * <p>>  If you set CiphertextBlob to the ciphertext that is returned after a symmetric encryption operation, specify this parameter.</p>
     */
    @NameInMap("SourceEncryptionContext")
    public java.util.Map<String, ?> sourceEncryptionContext;

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

    public static ReEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        ReEncryptRequest self = new ReEncryptRequest();
        return TeaModel.build(map, self);
    }

    public ReEncryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ReEncryptRequest setDestinationEncryptionContext(java.util.Map<String, ?> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getDestinationEncryptionContext() {
        return this.destinationEncryptionContext;
    }

    public ReEncryptRequest setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    public ReEncryptRequest setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    public ReEncryptRequest setSourceEncryptionContext(java.util.Map<String, ?> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getSourceEncryptionContext() {
        return this.sourceEncryptionContext;
    }

    public ReEncryptRequest setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    public ReEncryptRequest setSourceKeyVersionId(String sourceKeyVersionId) {
        this.sourceKeyVersionId = sourceKeyVersionId;
        return this;
    }
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

}
