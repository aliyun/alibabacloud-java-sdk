// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyRequest extends TeaModel {
    /**
     * <p>The ciphertext of the data key encrypted by using a CMK.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter when you use a CMK to encrypt the data key, an equivalent value is required here. For more information, see [EncryptionContext](https://help.aliyun.com/document_detail/42975.html).</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    /**
     * <p>A Base64-encoded public key.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    /**
     * <p>The encryption algorithm based on which you want to use the public key specified by PublicKeyBlob to encrypt the data key. For more information about encryption algorithms, see [AsymmetricDecrypt](https://help.aliyun.com/document_detail/148130.html).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA_256</p>
     * <p>*   RSAES_OAEP_SHA_1</p>
     * <p>*   SM2PKE</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    /**
     * <p>The key type of the public key specified by PublicKeyBlob. For more information about key types, see [Introduction to asymmetric keys](https://help.aliyun.com/document_detail/148147.html).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSA_2048</p>
     * <p>*   EC_SM2</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    public static ExportDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyRequest self = new ExportDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ExportDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public ExportDataKeyRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public ExportDataKeyRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    public ExportDataKeyRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

}
