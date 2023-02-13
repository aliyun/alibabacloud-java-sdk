// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListRevokeCertificateResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the revoked client certificates or server certificates.</p>
     */
    @NameInMap("CertificateList")
    public java.util.List<ListRevokeCertificateResponseBodyCertificateList> certificateList;

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
     * <p>The number of revoked certificates that are returned per page.</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of revoked client certificates and server certificates that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRevokeCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRevokeCertificateResponseBody self = new ListRevokeCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRevokeCertificateResponseBody setCertificateList(java.util.List<ListRevokeCertificateResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<ListRevokeCertificateResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public ListRevokeCertificateResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRevokeCertificateResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListRevokeCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRevokeCertificateResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListRevokeCertificateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRevokeCertificateResponseBodyCertificateList extends TeaModel {
        /**
         * <p>The expiration date of the certificate. The date is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-12-31T00:00Z` indicates December 31, 2021.</p>
         */
        @NameInMap("AfterDate")
        public String afterDate;

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
         * <p>The issuance date of the certificate. The date is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-01-01T00:00Z` indicates January 1, 2021.</p>
         */
        @NameInMap("BeforeDate")
        public String beforeDate;

        /**
         * <p>The type of the certificate.</p>
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
         * <p>The identifier of the root certificate.</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>The date on which the certificate was revoked. The value is in the `yyyy-MM-ddT00:00Z` format. For example, the value `2021-09-01T00:00Z` indicates September 1, 2021.</p>
         */
        @NameInMap("RevokeDate")
        public String revokeDate;

        /**
         * <p>The subject alternative name (SAN) extension of the certificate.</p>
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
         * <p>The status.</p>
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

        public static ListRevokeCertificateResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            ListRevokeCertificateResponseBodyCertificateList self = new ListRevokeCertificateResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public ListRevokeCertificateResponseBodyCertificateList setAfterDate(String afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public String getAfterDate() {
            return this.afterDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListRevokeCertificateResponseBodyCertificateList setBeforeDate(String beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public String getBeforeDate() {
            return this.beforeDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListRevokeCertificateResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListRevokeCertificateResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListRevokeCertificateResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListRevokeCertificateResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListRevokeCertificateResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public ListRevokeCertificateResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListRevokeCertificateResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public ListRevokeCertificateResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public ListRevokeCertificateResponseBodyCertificateList setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public ListRevokeCertificateResponseBodyCertificateList setRevokeDate(String revokeDate) {
            this.revokeDate = revokeDate;
            return this;
        }
        public String getRevokeDate() {
            return this.revokeDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public ListRevokeCertificateResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRevokeCertificateResponseBodyCertificateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

    }

}
