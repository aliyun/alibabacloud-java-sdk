// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListRevokeCertificateResponseBody extends TeaModel {
    /**
     * <p>The details of the revoked client or server-side certificates.</p>
     */
    @NameInMap("CertificateList")
    public java.util.List<ListRevokeCertificateResponseBodyCertificateList> certificateList;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of revoked certificates on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of revoked client and server-side certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The expiration date of the certificate. The format is <code>yyyy-MM-ddT00:00Z</code>. For example, <code>2021-12-31T00:00Z</code> indicates December 31, 2021.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T00:00Z</p>
         */
        @NameInMap("AfterDate")
        public String afterDate;

        /**
         * <p>The type of the encryption algorithm of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>RSA</strong>: the RSA algorithm.</p>
         * </li>
         * <li><p><strong>ECC</strong>: the ECC algorithm.</p>
         * </li>
         * <li><p><strong>SM2</strong>: the SM2 algorithm.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The date when the certificate was issued. The format is <code>yyyy-MM-ddT00:00Z</code>. For example, <code>2021-01-01T00:00Z</code> indicates January 1, 2021.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01T00:00Z</p>
         */
        @NameInMap("BeforeDate")
        public String beforeDate;

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SERVER</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The common name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The country code of the organization that is associated with the subordinate CA certificate that issued the certificate.</p>
         * <p>For more information about country codes, see the &quot;Country codes&quot; section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The custom identifier. This is a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>48d8d3ecc9976d9ecd2b2f25</strong></strong></p>
         */
        @NameInMap("CustomIdentifier")
        public String customIdentifier;

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>05e148d8d3ecc9976d9ecd2b2f25****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The key length of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The name of the city where the organization of the subordinate CA certificate that issued the certificate is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The MD5 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>05e148d8d3ecc9976d9ecd2b2f25****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the organization that is associated with the subordinate CA certificate that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云计算有限公司</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department of the organization that is associated with the subordinate CA certificate that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The identifier of the parent certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>The date when the certificate was revoked. The format is <code>yyyy-MM-ddT00:00Z</code>. For example, <code>2021-09-01T00:00Z</code> indicates September 1, 2021.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-01T00:00Z</p>
         */
        @NameInMap("RevokeDate")
        public String revokeDate;

        /**
         * <p>The Subject Alternative Name (SAN) extension of the certificate.</p>
         * <p>This parameter is a string that is converted from a JSON array. Each element in the JSON array is a struct that corresponds to a SAN extension. Each SAN extension struct contains the following parameters:</p>
         * <ul>
         * <li><p><strong>Type</strong>: The type of the extension. This parameter is of the integer type. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: an email address.</p>
         * </li>
         * <li><p><strong>2</strong>: a domain name.</p>
         * </li>
         * <li><p><strong>6</strong>: a Uniform Resource Identifier (URI).</p>
         * </li>
         * <li><p><strong>7</strong>: an IP address.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>Value</strong>: The content of the extension. This parameter is of the string type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;Type&quot;: 7, &quot;Value&quot;: &quot;192.0.XX.XX&quot;}, {&quot;Type&quot;: 2, &quot;Value&quot;: &quot;<a href="http://www.aliyundoc.com%22%7D">www.aliyundoc.com&quot;}</a>, ]</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>168b12c42e62339f8d2340ff530f9365****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The SHA-256 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>b60eff7e04323ff662f9ab5e6986f849f626a9c7bf2c59dcc752fa23779a****</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256WITHRSA</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The name of the province or state of the organization that is associated with the subordinate CA certificate that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Distinguished Name (DN) of the certificate. The DN indicates the user of the certificate and contains the following information:</p>
         * <ul>
         * <li><p><strong>C</strong>: The country.</p>
         * </li>
         * <li><p><strong>O</strong>: The organization.</p>
         * </li>
         * <li><p><strong>OU</strong>: The department.</p>
         * </li>
         * <li><p><strong>CN</strong>: The common name.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>ST</strong>: The province, municipality, or autonomous region.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><p><strong>ST</strong>: The province or state.</p>
         * </li>
         * <li><p><strong>CN</strong>: The common name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>C=CN,O=阿里云计算有限公司,OU=Security,L=ZheJiang,ST=HangZhou,CN=aliyundoc.com</p>
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

        public ListRevokeCertificateResponseBodyCertificateList setCustomIdentifier(String customIdentifier) {
            this.customIdentifier = customIdentifier;
            return this;
        }
        public String getCustomIdentifier() {
            return this.customIdentifier;
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
