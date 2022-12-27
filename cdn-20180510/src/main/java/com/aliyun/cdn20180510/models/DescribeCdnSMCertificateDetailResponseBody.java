// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSMCertificateDetailResponseBody extends TeaModel {
    // The time when the certificate expires. The time is displayed in UTC.
    @NameInMap("CertExpireTime")
    public String certExpireTime;

    // The ID of the certificate.
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    // The name of the certificate.
    @NameInMap("CertName")
    public String certName;

    // The certificate authority (CA) that issued the certificate.
    @NameInMap("CertOrg")
    public String certOrg;

    // The top-level domain name.
    @NameInMap("CommonName")
    public String commonName;

    // The content of the encryption certificate.
    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The subdomain name.
    @NameInMap("Sans")
    public String sans;

    // The content of the signature certificate.
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
