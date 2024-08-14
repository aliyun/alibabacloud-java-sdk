// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptRequest extends TeaModel {
    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li><p>RSAES_OAEP_SHA_1</p>
     * </li>
     * <li><p>RSAES_OAEP_SHA_256</p>
     * </li>
     * <li><p>SM2PKE</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see <a href="https://help.aliyun.com/document_detail/125803.html">Managed HSM overview</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAES_OAEP_SHA_256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The data that you want to decrypt.</p>
     * <p>The value is encoded in Base64.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    public static CertificatePrivateKeyDecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeyDecryptRequest self = new CertificatePrivateKeyDecryptRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeyDecryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePrivateKeyDecryptRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePrivateKeyDecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

}
