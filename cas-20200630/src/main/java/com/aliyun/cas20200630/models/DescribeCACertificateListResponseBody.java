// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the CA certificate.</p>
     */
    @NameInMap("CertificateList")
    public java.util.List<DescribeCACertificateListResponseBodyCertificateList> certificateList;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of returned pages.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of CA certificates returned per page.</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of root CA certificates and intermediate CA certificates that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCACertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateListResponseBody self = new DescribeCACertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateListResponseBody setCertificateList(java.util.List<DescribeCACertificateListResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<DescribeCACertificateListResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public DescribeCACertificateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCACertificateListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeCACertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCACertificateListResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribeCACertificateListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCACertificateListResponseBodyCertificateList extends TeaModel {
        /**
         * <p>The expiration date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The encryption algorithm of the CA certificate. Valid values:</p>
         * <br>
         * <p>*   **RSA**: the Rivest-Shamir-Adleman (RSA) algorithm.</p>
         * <p>*   **ECC**: the elliptic curve cryptography (ECC) algorithm.</p>
         * <p>*   **SM2**: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The issuance date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The type of the CA certificate. Valid values:</p>
         * <br>
         * <p>*   **ROOT**: root CA certificate</p>
         * <p>*   **SUB_ROOT**: intermediate CA certificate</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The common name or abbreviation of the organization that is associated with the CA certificate.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The code of the country in which the organization is located.</p>
         * <br>
         * <p>For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The unique identifier of the CA certificate.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The key length of the CA certificate.</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The name of the city in which the organization is located.</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The MD5 fingerprint of the CA certificate.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the organization that is associated with the CA certificate.</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department or branch in the organization that is associated with the CA certificate.</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The unique identifier of the root CA certificate from which the CA certificate is issued.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of the **CertificateType** parameter is **SUB_ROOT**. The value SUB_ROOT indicates an intermediate CA certificate.</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the CA certificate.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The SHA-256 fingerprint of the CA certificate.</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The signature algorithm of the CA certificate.</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The name of the province, municipality, or autonomous region in which the organization is located.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the CA certificate. Valid values:</p>
         * <br>
         * <p>*   **ISSUE**: The CA certificate is issued.</p>
         * <p>*   **REVOKE**: The CA certificate is revoked.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Distinguished Name (DN) attribute of the CA certificate, which indicates the user information of the certificate. The DN attribute contains the following information:</p>
         * <br>
         * <p>*   **C**: the country code in which the organization is located</p>
         * <p>*   **O**: the name of the organization</p>
         * <p>*   **OU**: the name of the department or branch in the organization</p>
         * <p>*   **L**: the name of the city in which the organization is located</p>
         * <br>
         * <p><props="china">- **ST**: the name of the province, municipality, or autonomous region in which the organization is located</props> <props="intl">- **ST**: the name of the province or state in which the organization is located</props></p>
         * <br>
         * <p>*   **CN**: the common name or abbreviation of the organization</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <p>The content of the CA certificate.</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        /**
         * <p>The validity period of the CA certificate. Unit: years.</p>
         */
        @NameInMap("Years")
        public Integer years;

        public static DescribeCACertificateListResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificateListResponseBodyCertificateList self = new DescribeCACertificateListResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificateListResponseBodyCertificateList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeCACertificateListResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeCACertificateListResponseBodyCertificateList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeCACertificateListResponseBodyCertificateList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeCACertificateListResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificateListResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeCACertificateListResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeCACertificateListResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeCACertificateListResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeCACertificateListResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeCACertificateListResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeCACertificateListResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeCACertificateListResponseBodyCertificateList setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribeCACertificateListResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeCACertificateListResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCACertificateListResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeCACertificateListResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeCACertificateListResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCACertificateListResponseBodyCertificateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCACertificateListResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeCACertificateListResponseBodyCertificateList setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public DescribeCACertificateListResponseBodyCertificateList setYears(Integer years) {
            this.years = years;
            return this;
        }
        public Integer getYears() {
            return this.years;
        }

    }

}
