// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptRequest extends TeaModel {
    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA_1</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA_256</p>
     * <br>
     * <p>*   SM2PKE</p>
     * <br>
     * <p>> The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see [Managed HSM overview](https://help.aliyun.com/document_detail/125803.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The data that you want to decrypt.</p>
     * <br>
     * <p>The value is encoded in Base64.</p>
     * <br>
     * <p>This parameter is required.</p>
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
