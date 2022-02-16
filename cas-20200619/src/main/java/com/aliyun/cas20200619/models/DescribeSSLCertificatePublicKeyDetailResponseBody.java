// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePublicKeyDetailResponseBody extends TeaModel {
    @NameInMap("CertificateInfo")
    public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo certificateInfo;

    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignCertificate")
    public String signCertificate;

    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static DescribeSSLCertificatePublicKeyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePublicKeyDetailResponseBody self = new DescribeSSLCertificatePublicKeyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePublicKeyDetailResponseBody setCertificateInfo(DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo certificateInfo) {
        this.certificateInfo = certificateInfo;
        return this;
    }
    public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo getCertificateInfo() {
        return this.certificateInfo;
    }

    public DescribeSSLCertificatePublicKeyDetailResponseBody setEncryptCertificate(String encryptCertificate) {
        this.encryptCertificate = encryptCertificate;
        return this;
    }
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    public DescribeSSLCertificatePublicKeyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSSLCertificatePublicKeyDetailResponseBody setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }
    public String getSignCertificate() {
        return this.signCertificate;
    }

    public DescribeSSLCertificatePublicKeyDetailResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static class DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo extends TeaModel {
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("KeySize")
        public Integer keySize;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Sans")
        public String sans;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("Sha2")
        public String sha2;

        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        public static DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo self = new DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeSSLCertificatePublicKeyDetailResponseBodyCertificateInfo setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

    }

}
