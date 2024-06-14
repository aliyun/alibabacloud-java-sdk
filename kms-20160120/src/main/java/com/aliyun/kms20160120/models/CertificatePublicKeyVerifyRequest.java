// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyVerifyRequest extends TeaModel {
    /**
     * <p>The signature algorithm. Valid values:</p>
     * <br>
     * <p>*   RSA_PKCS1_SHA_256</p>
     * <br>
     * <p>*   RSA_PSS_SHA_256</p>
     * <br>
     * <p>*   ECDSA_SHA_256</p>
     * <br>
     * <p>*   SM2DSA</p>
     * <br>
     * <p>> The SM2DSA signature algorithm is supported only in regions where managed hardware security modules (HSMs) are used in the Chinese mainland. For more information, see [Managed HSM overview](https://help.aliyun.com/document_detail/125803.html).</p>
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
     * <p>The raw data that is signed.</p>
     * <br>
     * <p>The value is encoded in Base64. For example, if the raw data in the hexadecimal format is `[0x31, 0x32, 0x33, 0x34]`, set this parameter to the Base64-encoded value `MTIzNA==`.</p>
     * <br>
     * <p>If the MessageType parameter is set to RAW, the size of the data must be less than or equal to 4 KB.</p>
     * <br>
     * <p>If the size of the data is greater than 4 KB, you can set the MessageType parameter to DIGEST and set the Message parameter to the digest of the data. The digest is also called hash value. You can compute the digest of the data on an on-premises device. Certificates Manager uses the digest that you compute in your own certificate application system. The message digest algorithm that you use must match the specified signature algorithm. Comply with the following mapping between signature algorithms and message digest algorithms:</p>
     * <br>
     * <p>*   If the signature algorithm is RSA_PKCS1_SHA_256, RSA_PSS_SHA_256, or ECDSA_SHA_256, the message digest algorithm must be SHA-256.</p>
     * <p>*   If the signature algorithm is SM2DSA, the message digest algorithm must be SM3.</p>
     * <br>
     * <p>>  If the key type of the certificate is EC_SM2 and the MessageType parameter is set to DIGEST, the value of the Message parameter is `e` that is described in GB/T 32918.2-2016 6.1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The type of the message. Valid values:</p>
     * <br>
     * <p>*   RAW: the raw data. This is the default value.</p>
     * <p>*   DIGEST: the message digest (hash value) of the raw data.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The signature value.</p>
     * <br>
     * <p>The value is encoded in Base64.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignatureValue")
    public String signatureValue;

    public static CertificatePublicKeyVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyVerifyRequest self = new CertificatePublicKeyVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyVerifyRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePublicKeyVerifyRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyVerifyRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CertificatePublicKeyVerifyRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public CertificatePublicKeyVerifyRequest setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }
    public String getSignatureValue() {
        return this.signatureValue;
    }

}
