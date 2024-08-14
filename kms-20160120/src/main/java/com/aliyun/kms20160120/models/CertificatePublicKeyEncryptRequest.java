// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyEncryptRequest extends TeaModel {
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
     * <p>The data that you want to encrypt.</p>
     * <p>The value is encoded in Base64. For example, if the hexadecimal data that you want to encrypt is <code>[0x31, 0x32, 0x33, 0x34]</code>, the Base64-encoded data is <code>MTIzNA==</code>.</p>
     * <p>The size of data that can be encrypted varies based on the encryption algorithm that you use:</p>
     * <ul>
     * <li>RSAES_OAEP_SHA_1: 214 bytes</li>
     * <li>RSAES_OAEP_SHA_256: 190 bytes</li>
     * <li>SM2PKE: 6,047 bytes</li>
     * </ul>
     * <p>If the size of data that you want to encrypt exceeds the preceding limits, you can call the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation to generate a data key to encrypt the data. Then, call the CertificatePublicKeyEncrypt operation to encrypt the data key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    public static CertificatePublicKeyEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyEncryptRequest self = new CertificatePublicKeyEncryptRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyEncryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePublicKeyEncryptRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyEncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
