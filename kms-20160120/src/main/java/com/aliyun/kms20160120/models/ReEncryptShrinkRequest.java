// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptShrinkRequest extends TeaModel {
    /**
     * <p>The ciphertext that you want to re-encrypt.<br> This parameter can be the ciphertext that is returned after symmetric or asymmetric key encryption.<br><br></p>
     * <ul>
     * <li><p>Symmetric encryption: the ciphertext that is returned after you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation.</p>
     * </li>
     * <li><p>Asymmetric key encryption: the data that is encrypted using a public key after you call the <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, or the data that is encrypted using an asymmetric public key in an external system.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901q********</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. This parameter specifies the encryption context for the destination master key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("DestinationEncryptionContext")
    public String destinationEncryptionContextShrink;

    /**
     * <p>The ID of the symmetric master key that is used to re-encrypt the data after the ciphertext is decrypted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    /**
     * <p>Specifies whether to enable the DryRun mode.</p>
     * <ul>
     * <li><p>true: enables the DryRun mode.</p>
     * </li>
     * <li><p>false (default): disables the DryRun mode.</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test API calls, verify whether you have the permissions to perform operations on the required resources, and check whether the request parameters are valid. If you enable the DryRun mode, KMS always returns a failure and a reason for the failure. The reasons for the failure include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not configured.</p>
     * </li>
     * <li><p>ValidationError: The parameters specified in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform the operation on the KMS resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>If CiphertextBlob is the result of public key encryption, specify the public key encryption algorithm. For more information about the algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.<br> Valid values:<br><br></p>
     * <ul>
     * <li><p>RSAES_OAEP_SHA_256</p>
     * </li>
     * <li><p>RSAES_OAEP_SHA_1</p>
     * </li>
     * <li><p>SM2PKE</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_256</p>
     */
    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter when you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, you must specify the same parameter to decrypt the data. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
     * <blockquote>
     * <p>You must specify this parameter when CiphertextBlob is the ciphertext that is returned after symmetric encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
     */
    @NameInMap("SourceEncryptionContext")
    public String sourceEncryptionContextShrink;

    /**
     * <p>The ID of the master key that is used to decrypt the ciphertext.<br> The globally unique identifier of the master key.<br><br></p>
     * <blockquote>
     * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("SourceKeyId")
    public String sourceKeyId;

    /**
     * <p>The ID of the key version that is used to decrypt the ciphertext.</p>
     * <blockquote>
     * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
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

    public ReEncryptShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
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
