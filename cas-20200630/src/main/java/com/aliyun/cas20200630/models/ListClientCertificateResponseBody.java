// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListClientCertificateResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about all client certificates and server certificates.</p>
     */
    @NameInMap("CertificateList")
    public java.util.List<ListClientCertificateResponseBodyCertificateList> certificateList;

    /**
     * <p>The page number of the current page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of certificates that are returned per page.</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The number of client certificates and server certificates that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientCertificateResponseBody self = new ListClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientCertificateResponseBody setCertificateList(java.util.List<ListClientCertificateResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<ListClientCertificateResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public ListClientCertificateResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClientCertificateResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientCertificateResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListClientCertificateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListClientCertificateResponseBodyCertificateList extends TeaModel {
        /**
         * <p>The expiration date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The type of the encryption algorithm of the certificate. Valid values:</p>
         * <br>
         * <p>*   **RSA**: the Rivest-Shamir-Adleman (RSA) algorithm.</p>
         * <p>*   **ECC**: the elliptic curve cryptography (ECC) algorithm.</p>
         * <p>*   **SM2**: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The issuance date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <br>
         * <p>*   **CLIENT**: client certificate</p>
         * <p>*   **SERVER**: server certificate</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The common name of the certificate.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The code of the country in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         * <br>
         * <p>For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The validity period of the certificate. Unit: days.</p>
         */
        @NameInMap("Days")
        public Integer days;

        /**
         * <p>The unique identifier of the certificate.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The key length of the certificate.</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The name of the city in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The MD5 fingerprint of the certificate.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the organization. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department in the organization. The organization is associated with the intermediate certificate authority (CA) certificate from which the certificate is issued.</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The unique identifier of the intermediate certificate from which the client certificate is issued.</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>The subject alternative name (SAN) extension of the certificate. The value indicates additional information, including the additional domain names or IP addresses that are associated with the certificate.</p>
         * <br>
         * <p>The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that corresponds to a SAN extension. A SAN extension struct contains the following parameters:</p>
         * <br>
         * <p>*   **Type**: the type of the extension. Data type: integer. Valid values:</p>
         * <br>
         * <p>    *   **1**: an email address</p>
         * <p>    *   **2**: a domain name</p>
         * <p>    *   **6**: a Uniform Resource Identifier (URI)</p>
         * <p>    *   **7**: an IP address</p>
         * <br>
         * <p>*   **Value**: the value of the extension. Data type: string.</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the certificate.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The SHA-256 fingerprint of the certificate.</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The signature algorithm of the certificate.</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **ISSUE**: issued</p>
         * <p>*   **REVOKE**: revoked</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The distinguished name (DN) extension of the certificate, which indicates the user of the certificate. The DN extension includes the following information:</p>
         * <br>
         * <p>*   **C**: the country</p>
         * <p>*   **O**: the organization</p>
         * <p>*   **OU**: the department</p>
         * <p>*   **L**: the city</p>
         * <p>*   **ST**: the province, municipality, or autonomous region</p>
         * <p>*   **CN**: the common name</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <p>The content of the certificate.</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static ListClientCertificateResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            ListClientCertificateResponseBodyCertificateList self = new ListClientCertificateResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public ListClientCertificateResponseBodyCertificateList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public ListClientCertificateResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListClientCertificateResponseBodyCertificateList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public ListClientCertificateResponseBodyCertificateList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListClientCertificateResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListClientCertificateResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListClientCertificateResponseBodyCertificateList setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public ListClientCertificateResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListClientCertificateResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListClientCertificateResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public ListClientCertificateResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListClientCertificateResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public ListClientCertificateResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public ListClientCertificateResponseBodyCertificateList setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public ListClientCertificateResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public ListClientCertificateResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListClientCertificateResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public ListClientCertificateResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public ListClientCertificateResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListClientCertificateResponseBodyCertificateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClientCertificateResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public ListClientCertificateResponseBodyCertificateList setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
