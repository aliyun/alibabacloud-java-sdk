// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSMCertificateDetailResponseBody extends TeaModel {
    @NameInMap("CertExpireTime")
    public String certExpireTime;

    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertOrg")
    public String certOrg;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sans")
    public String sans;

    @NameInMap("SignCertificate")
    public String signCertificate;

    public static DescribeDcdnSMCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSMCertificateDetailResponseBody self = new DescribeDcdnSMCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSMCertificateDetailResponseBody setCertExpireTime(String certExpireTime) {
        this.certExpireTime = certExpireTime;
        return this;
    }
    public String getCertExpireTime() {
        return this.certExpireTime;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setCertOrg(String certOrg) {
        this.certOrg = certOrg;
        return this;
    }
    public String getCertOrg() {
        return this.certOrg;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setEncryptCertificate(String encryptCertificate) {
        this.encryptCertificate = encryptCertificate;
        return this;
    }
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public DescribeDcdnSMCertificateDetailResponseBody setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }
    public String getSignCertificate() {
        return this.signCertificate;
    }

}
