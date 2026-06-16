// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateResponseBody extends TeaModel {
    /**
     * <p>The details of the client certificate or server-side certificate.</p>
     */
    @NameInMap("Certificate")
    public DescribeClientCertificateResponseBodyCertificate certificate;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateResponseBody self = new DescribeClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateResponseBody setCertificate(DescribeClientCertificateResponseBodyCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public DescribeClientCertificateResponseBodyCertificate getCertificate() {
        return this.certificate;
    }

    public DescribeClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientCertificateResponseBodyCertificateTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;tag\&quot;:\&quot;PROPERTY_TYPE\&quot;,\&quot;values\&quot;:[]}]</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeClientCertificateResponseBodyCertificateTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateResponseBodyCertificateTags self = new DescribeClientCertificateResponseBodyCertificateTags();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateResponseBodyCertificateTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeClientCertificateResponseBodyCertificateTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeClientCertificateResponseBodyCertificate extends TeaModel {
        /**
         * <p>The expiration date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The type of the encryption algorithm. Valid values:</p>
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
         * <p>The alias of the issued certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>rsa_root_2048</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The issuance date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634283958000</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The complete certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * cert
         * -----END CERTIFICATE-----
         * -----BEGIN CERTIFICATE-----
         * subCA
         * -----END CERTIFICATE-----
         * -----BEGIN CERTIFICATE-----
         * rootCA
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("CertChain")
        public String certChain;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>CLIENT</strong>: a client certificate.</p>
         * </li>
         * <li><p><strong>SERVER</strong>: a server-side certificate.</p>
         * </li>
         * </ul>
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
         * <p>aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The country code of the subject organization.</p>
         * <p>For more information about country codes, see the <strong>International codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The custom identifier, which is a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>3a32d96883a6650e672ea0276</strong></em>*</p>
         */
        @NameInMap("CustomIdentifier")
        public String customIdentifier;

        /**
         * <p>The validity period of the certificate. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("Days")
        public Integer days;

        /**
         * <p>The algorithm and its length.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        @NameInMap("FullAlgorithm")
        public String fullAlgorithm;

        /**
         * <p>The ID of the data source to which the certificate order belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1137354</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>d3b95700998e47afc4d95f886579****</p>
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
         * <p>The city where the subject organization is located.</p>
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
         * <p>d3b95700998e47afc4d95f886579****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The organization associated with the certificate of the issuing subordinate CA.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The organizational unit of the certificate subject.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The unique identifier of the subordinate CA certificate that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>The ID of the resource group to which the certificate belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxllajdpw3fi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The Subject Alternative Name (SAN) extension of the certificate. The SAN extension indicates other domain names or IP addresses that are associated with the certificate.</p>
         * <p>This parameter is a string that is converted from a JSON array. Each element in the JSON array is a struct that corresponds to a SAN extension. Each SAN extension struct contains the following parameters:</p>
         * <ul>
         * <li><p><strong>Type</strong>: The type of the extension. This parameter is of the Integer type. Valid values:</p>
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
         * <li><p><strong>Value</strong>: The content of the extension. This parameter is of the String type.</p>
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
         * <p>62b2b943a32d96883a6650e672ea0276****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The SHA-256 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1fcec36d658f7e20de18f6957bbac42b373a66bc9de4e9****</p>
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
         * <p>The state or province where the subject organization is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>ISSUE</strong>: The certificate is issued.</p>
         * </li>
         * <li><p><strong>REVOKE</strong>: The certificate is revoked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subject Distinguished Name (DN) of the certificate. This value is composed of the following fields:</p>
         * <ul>
         * <li><p><strong>C</strong>: Country.</p>
         * </li>
         * <li><p><strong>O</strong>: Organization.</p>
         * </li>
         * <li><p><strong>OU</strong>: Organizational unit.</p>
         * </li>
         * <li><p><strong>CN</strong>: Common name.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>ST</strong>: The province, municipality, or autonomous region.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><p><strong>ST</strong>: Province or state.</p>
         * </li>
         * <li><p><strong>CN</strong>: Common name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>C=CN,O=Aliyun,OU=Security,L=Hangzhou,ST=Zhejiang,CN=Aliyun</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <p>The list of tags.</p>
         * 
         * <strong>example:</strong>
         * <p>mtls</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeClientCertificateResponseBodyCertificateTags> tags;

        /**
         * <p>Indicates whether the certificate is synchronized to Digital Certificate Management Service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UploadFlag")
        public Integer uploadFlag;

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----  ...... -----END CERTIFICATE-----</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static DescribeClientCertificateResponseBodyCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateResponseBodyCertificate self = new DescribeClientCertificateResponseBodyCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateResponseBodyCertificate setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeClientCertificateResponseBodyCertificate setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeClientCertificateResponseBodyCertificate setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeClientCertificateResponseBodyCertificate setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeClientCertificateResponseBodyCertificate setCertChain(String certChain) {
            this.certChain = certChain;
            return this;
        }
        public String getCertChain() {
            return this.certChain;
        }

        public DescribeClientCertificateResponseBodyCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeClientCertificateResponseBodyCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeClientCertificateResponseBodyCertificate setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeClientCertificateResponseBodyCertificate setCustomIdentifier(String customIdentifier) {
            this.customIdentifier = customIdentifier;
            return this;
        }
        public String getCustomIdentifier() {
            return this.customIdentifier;
        }

        public DescribeClientCertificateResponseBodyCertificate setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public DescribeClientCertificateResponseBodyCertificate setFullAlgorithm(String fullAlgorithm) {
            this.fullAlgorithm = fullAlgorithm;
            return this;
        }
        public String getFullAlgorithm() {
            return this.fullAlgorithm;
        }

        public DescribeClientCertificateResponseBodyCertificate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeClientCertificateResponseBodyCertificate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeClientCertificateResponseBodyCertificate setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeClientCertificateResponseBodyCertificate setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeClientCertificateResponseBodyCertificate setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeClientCertificateResponseBodyCertificate setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeClientCertificateResponseBodyCertificate setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeClientCertificateResponseBodyCertificate setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribeClientCertificateResponseBodyCertificate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClientCertificateResponseBodyCertificate setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeClientCertificateResponseBodyCertificate setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeClientCertificateResponseBodyCertificate setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeClientCertificateResponseBodyCertificate setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeClientCertificateResponseBodyCertificate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClientCertificateResponseBodyCertificate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClientCertificateResponseBodyCertificate setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeClientCertificateResponseBodyCertificate setTags(java.util.List<DescribeClientCertificateResponseBodyCertificateTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeClientCertificateResponseBodyCertificateTags> getTags() {
            return this.tags;
        }

        public DescribeClientCertificateResponseBodyCertificate setUploadFlag(Integer uploadFlag) {
            this.uploadFlag = uploadFlag;
            return this;
        }
        public Integer getUploadFlag() {
            return this.uploadFlag;
        }

        public DescribeClientCertificateResponseBodyCertificate setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
