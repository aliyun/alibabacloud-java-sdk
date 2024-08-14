// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to re-encrypt.</p>
     * <p>You can set this parameter to the ciphertext that is returned after a symmetric or asymmetric encryption operation.</p>
     * <ul>
     * <li>Symmetric encryption: the ciphertext returned after you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation</li>
     * <li>Asymmetric encryption: the public key-encrypted ciphertext returned after you call the <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, or the ciphertext encrypted by using the public key of an asymmetric key pair outside KMS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901q********</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. This parameter specifies the EncryptionContext that is used to re-encrypt the decrypted data or data key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("DestinationEncryptionContext")
    public java.util.Map<String, ?> destinationEncryptionContext;

    /**
     * <p>The ID of the symmetric CMK that is used to re-encrypt the ciphertext after the ciphertext is decrypted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The encryption algorithm based on which the public key is used to encrypt the ciphertext specified by CiphertextBlob. For more information about encryption algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RSAES_OAEP_SHA_256</li>
     * <li>RSAES_OAEP_SHA_1</li>
     * <li>SM2PKE</li>
     * </ul>
     * <blockquote>
     * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_256</p>
     */
    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify EncryptionContext when you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation to encrypt the data or data key, an equivalent value is required here. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * <blockquote>
     * <p> If you set CiphertextBlob to the ciphertext that is returned after a symmetric encryption operation, specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("SourceEncryptionContext")
    public java.util.Map<String, ?> sourceEncryptionContext;

    /**
     * <p>The ID of the CMK that is used to decrypt the ciphertext.</p>
     * <p>This parameter is the globally unique ID of the CMK.</p>
     * <blockquote>
     * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("SourceKeyId")
    public String sourceKeyId;

    /**
     * <p>The ID of the CMK version that is used to decrypt the ciphertext.</p>
     * <blockquote>
     * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
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

    public ReEncryptRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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
