// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSMCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the certificate. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-31T09:42:28Z</p>
     */
    @NameInMap("CertExpireTime")
    public String certExpireTime;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>648****-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>yourCertName</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate authority (CA) that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>DigiCert Inc</p>
     */
    @NameInMap("CertOrg")
    public String certOrg;

    /**
     * <p>The common name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The content of the encryption certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-BEGIN CERTIFICATE-----***-----END CERTIFICATE--</p>
     */
    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A7C69682-7F88-40DD-A198-10D0309E439D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subdomain name.</p>
     * 
     * <strong>example:</strong>
     * <p>***.example.com</p>
     */
    @NameInMap("Sans")
    public String sans;

    /**
     * <p>The content of the signature certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>--BEGIN CERTIFICATE-----***-----END CERTIFICATE--</p>
     */
    @NameInMap("SignCertificate")
    public String signCertificate;

    public static DescribeCdnSMCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSMCertificateDetailResponseBody self = new DescribeCdnSMCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSMCertificateDetailResponseBody setCertExpireTime(String certExpireTime) {
        this.certExpireTime = certExpireTime;
        return this;
    }
    public String getCertExpireTime() {
        return this.certExpireTime;
    }

    public DescribeCdnSMCertificateDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DescribeCdnSMCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeCdnSMCertificateDetailResponseBody setCertOrg(String certOrg) {
        this.certOrg = certOrg;
        return this;
    }
    public String getCertOrg() {
        return this.certOrg;
    }

    public DescribeCdnSMCertificateDetailResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public DescribeCdnSMCertificateDetailResponseBody setEncryptCertificate(String encryptCertificate) {
        this.encryptCertificate = encryptCertificate;
        return this;
    }
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    public DescribeCdnSMCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnSMCertificateDetailResponseBody setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public DescribeCdnSMCertificateDetailResponseBody setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }
    public String getSignCertificate() {
        return this.signCertificate;
    }

}
