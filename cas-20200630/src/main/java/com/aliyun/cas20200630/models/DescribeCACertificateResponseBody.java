// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    public DescribeCACertificateResponseBodyCertificate certificate;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateResponseBody self = new DescribeCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateResponseBody setCertificate(DescribeCACertificateResponseBodyCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public DescribeCACertificateResponseBodyCertificate getCertificate() {
        return this.certificate;
    }

    public DescribeCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCACertificateResponseBodyCertificate extends TeaModel {
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CertificateType")
        public String certificateType;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("KeySize")
        public Integer keySize;

        @NameInMap("Locality")
        public String locality;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Organization")
        public String organization;

        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        @NameInMap("Sans")
        public String sans;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Sha2")
        public String sha2;

        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubjectDN")
        public String subjectDN;

        @NameInMap("X509Certificate")
        public String x509Certificate;

        @NameInMap("Years")
        public Integer years;

        public static DescribeCACertificateResponseBodyCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificateResponseBodyCertificate self = new DescribeCACertificateResponseBodyCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificateResponseBodyCertificate setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeCACertificateResponseBodyCertificate setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeCACertificateResponseBodyCertificate setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeCACertificateResponseBodyCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeCACertificateResponseBodyCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificateResponseBodyCertificate setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeCACertificateResponseBodyCertificate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeCACertificateResponseBodyCertificate setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeCACertificateResponseBodyCertificate setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeCACertificateResponseBodyCertificate setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeCACertificateResponseBodyCertificate setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeCACertificateResponseBodyCertificate setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeCACertificateResponseBodyCertificate setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribeCACertificateResponseBodyCertificate setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeCACertificateResponseBodyCertificate setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCACertificateResponseBodyCertificate setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeCACertificateResponseBodyCertificate setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeCACertificateResponseBodyCertificate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCACertificateResponseBodyCertificate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCACertificateResponseBodyCertificate setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeCACertificateResponseBodyCertificate setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public DescribeCACertificateResponseBodyCertificate setYears(Integer years) {
            this.years = years;
            return this;
        }
        public Integer getYears() {
            return this.years;
        }

    }

}
