// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate in UNIX timestamp format. Unit: seconds.</p>
     * <blockquote>
     * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1665819958</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>The key algorithm of the client certificate. The key algorithm is in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
     * </ul>
     * <p>The encryption algorithm of the client certificate must be the same as that of the sub-CA certificate, but the key length can be different. For example, if the key algorithm of the sub-CA certificate is RSA_2048, the key algorithm of the client certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the key algorithm of the sub-CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The asynchronous processing flag. If the value is &quot;true&quot;, the backend service issues the certificate asynchronously.
     * After the request is submitted, you can call the ListClientCertificate operation to obtain the latest certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AsynchronousFlag")
    public Boolean asynchronousFlag;

    /**
     * <p>The issuance time of the client certificate in UNIX timestamp format. Default value: the time when you call this operation. Unit: seconds.</p>
     * <blockquote>
     * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>The common name of the certificate. Chinese characters, English characters, and other characters are supported.</p>
     * <blockquote>
     * <p>If you set the <strong>CsrPemString</strong> parameter, the value of the <strong>CommonName</strong> parameter is determined by the corresponding information in the <strong>CsrPemString</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country code. Example: <strong>CN</strong> or <strong>US</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The CSR content. You can use OpenSSL or Keytool to generate a CSR. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How to create a CSR file</a>.
     * &lt;props=&quot;china&quot;&gt;You can also create a CSR in the SSL Certificates Service console. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The custom identifier, which serves as a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong>e6bb538d538c70c01f81fg3</strong></em>*</p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The validity period of the client certificate. Unit: days.
     * The <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters cannot all be empty. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified. The following rules apply:</p>
     * <ul>
     * <li>If you set the <strong>Days</strong> parameter, you can choose to set or not set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
     * <li>If you do not set the <strong>Days</strong> parameter, you must set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters at the same time, the validity period of the client certificate is determined by the value of the <strong>Days</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The validity period of the client certificate cannot exceed the validity period of the sub-CA certificate. You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to view the validity period of the sub-CA certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>Specifies whether to include the Certificate Revocation List (CRL) address. Valid values:</p>
     * <ul>
     * <li>0: No.</li>
     * <li>1: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Specifies whether to immediately return the digital certificate. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: does not return the certificate. This is the default value.</li>
     * <li><strong>1</strong>: returns the certificate.</li>
     * <li><strong>2</strong>: returns the certificate and its certificate chain.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The name of the city where the certificate organization is located. Chinese characters, English characters, and other characters are supported.
     * Default value: the name of the city where the sub-CA certificate organization that issues this certificate is located.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The certificate validity period. Unit: months.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Months")
    public Integer months;

    /**
     * <p>The organization name. Default value: Alibaba Inc.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Inc</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The organizational unit name. Default value: Aliyun CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>Security</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the sub-CA certificate that issues this certificate.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifier of the sub-CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>270ae6bb538d538c70c01f81fg3****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The ID of the resource group to which the certificate belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the Subject Alternative Name (SAN) extension of the client certificate. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: otherName (0): other name.</li>
     * <li><strong>1</strong>: rfc822Name (1): RFC 822 name, which is typically an email address.</li>
     * <li><strong>2</strong>: dNSName (2): DNS name (domain name).</li>
     * <li><strong>3</strong>: x400Address (3): X.400 address, an early email standard address.</li>
     * <li><strong>4</strong>: directoryName (4): directory name, which is typically an X.500 distinguished name (DN).</li>
     * <li><strong>5</strong>: ediPartyName (5): Electronic Data Interchange (EDI) party name.</li>
     * <li><strong>6</strong>: uniformResourceIdentifier (6): Uniform Resource Identifier (URI).</li>
     * <li><strong>7</strong>: iPAddress (7): IP address.</li>
     * <li><strong>8</strong>: registeredID (8): registered ID (object identifier OID).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SanType")
    public Integer sanType;

    /**
     * <p>The specific SAN extension information of the client certificate. You can enter multiple values separated by commas (,).</p>
     * <ol>
     * <li>otherName (0): other name</li>
     * </ol>
     * <ul>
     * <li>Example: 1.3.6.1.4.1.311.20.2.3 (OID) + <a href="mailto:user@domain.com">user@domain.com</a> (UPN - User Principal Name)</li>
     * <li>Description: A custom extension type that typically consists of a specific OID (object identifier) and a corresponding value. In Windows environments, it is commonly used to store UPN (User Principal Name), such as <a href="mailto:zhangsan@company.com">zhangsan@company.com</a> for smart card logon.</li>
     * </ul>
     * <ol start="2">
     * <li>rfc822Name (1): RFC 822 name (email address)</li>
     * </ol>
     * <ul>
     * <li>Example: <a href="mailto:admin@example.com">admin@example.com</a>,<a href="mailto:support@company.cn">support@company.cn</a></li>
     * <li>Description: An Internet email address that complies with the RFC 822 standard. It is commonly used in S/MIME email signing and encryption certificates to identify the sender or recipient of an email.</li>
     * <li>dNSName (2): DNS name (domain name)</li>
     * <li>Example: <a href="http://www.example.com,api.test.cn,*.mydomain.com">www.example.com,api.test.cn,*.mydomain.com</a> (wildcard domain name)</li>
     * <li>Description: The most commonly used type in HTTPS website SSL/TLS certificates. A certificate can contain multiple DNS names through the SAN extension, allowing a single certificate to protect multiple subdomains or completely different domain names.</li>
     * </ul>
     * <ol start="3">
     * <li>x400Address (3): X.400 address</li>
     * </ol>
     * <ul>
     * <li>Example: G=Zhang; S=San; O=Company; PRMD=IT; ADMD=Telecom; C=CN</li>
     * <li>Description: An early email system address standard with a complex structure that includes attributes such as country (C), administration domain (ADMD), organization (O), surname (S), and given name (G). It is rarely used in modern Internet HTTPS certificates and is mostly found in traditional European government, enterprise, or military communication systems.</li>
     * </ul>
     * <ol start="4">
     * <li>directoryName (4): directory name</li>
     * </ol>
     * <ul>
     * <li>Example: CN=IT Department, OU=Tech, O=Company Ltd, L=Beijing, ST=Beijing, C=CN</li>
     * <li>Description: A standard X.500 distinguished name (DN). It is typically used to explicitly identify the complete hierarchical information of an organization, department, or entity in a certificate. It is commonly found in enterprise internal root certificates or specific government digital certificates.</li>
     * </ul>
     * <ol start="5">
     * <li>ediPartyName (5): EDI party name</li>
     * </ol>
     * <ul>
     * <li>Example: nameAssigner=GlobalTradeOrg, partyName=SupplierA</li>
     * <li>Description: Used specifically in the Electronic Data Interchange (EDI) domain. It identifies a specific party in business message exchanges (such as order and invoice transmissions) and typically includes the assigning organization (nameAssigner) and the party name (partyName).</li>
     * </ul>
     * <ol start="6">
     * <li>uniformResourceIdentifier (6): Uniform Resource Identifier (URI)</li>
     * </ol>
     * <ul>
     * <li>Example: <a href="http://www.example.com/verify,https://api.test.cn/status">http://www.example.com/verify,https://api.test.cn/status</a></li>
     * <li>Description: A standard URL format that must include a protocol prefix (such as http:// or https://). It can point to a specific network resource address.</li>
     * </ul>
     * <ol start="7">
     * <li>iPAddress (7): IP address</li>
     * </ol>
     * <ul>
     * <li>Example: 192.168.1.100 (IPv4), 2001:0db8:85a3::8a2e:0370:7334 (IPv6)</li>
     * <li>Description: Directly binds to a server IP address. It is commonly used for internal systems without domain names, API servers, or specific services that can only be accessed through a public IP address. Note: Public IP certificates typically require strict Organization Validation (OV).</li>
     * </ul>
     * <ol start="8">
     * <li>registeredID (8): registered ID (object identifier OID)</li>
     * </ol>
     * <ul>
     * <li>Example: 1.2.3.4.55.6.5.99, 2.5.29.17</li>
     * <li>Description: A unique numeric identifier assigned by international standards organizations. It is rarely used directly as a subject name in certificates and is more commonly used as a unique identity code or policy identifier within systems.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:somebody@example.com">somebody@example.com</a></p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the certificate organization is located. Chinese characters, English characters, and other characters are supported. Default value: the name of the province, municipality, or autonomous region where the sub-CA certificate organization that issues this certificate is located.
     * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the certificate organization is located. Chinese characters, English characters, and other characters are supported. Default value: the name of the province or state where the sub-CA certificate organization that issues this certificate is located.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateClientCertificateWithCsrRequestTags> tags;

    /**
     * <p>The certificate validity period. Unit: years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateClientCertificateWithCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateWithCsrRequest self = new CreateClientCertificateWithCsrRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateWithCsrRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateClientCertificateWithCsrRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateClientCertificateWithCsrRequest setAsynchronousFlag(Boolean asynchronousFlag) {
        this.asynchronousFlag = asynchronousFlag;
        return this;
    }
    public Boolean getAsynchronousFlag() {
        return this.asynchronousFlag;
    }

    public CreateClientCertificateWithCsrRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateClientCertificateWithCsrRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateClientCertificateWithCsrRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateClientCertificateWithCsrRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateClientCertificateWithCsrRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public CreateClientCertificateWithCsrRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CreateClientCertificateWithCsrRequest setEnableCrl(Long enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    public CreateClientCertificateWithCsrRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateClientCertificateWithCsrRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateClientCertificateWithCsrRequest setMonths(Integer months) {
        this.months = months;
        return this;
    }
    public Integer getMonths() {
        return this.months;
    }

    public CreateClientCertificateWithCsrRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateClientCertificateWithCsrRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateClientCertificateWithCsrRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateClientCertificateWithCsrRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClientCertificateWithCsrRequest setSanType(Integer sanType) {
        this.sanType = sanType;
        return this;
    }
    public Integer getSanType() {
        return this.sanType;
    }

    public CreateClientCertificateWithCsrRequest setSanValue(String sanValue) {
        this.sanValue = sanValue;
        return this;
    }
    public String getSanValue() {
        return this.sanValue;
    }

    public CreateClientCertificateWithCsrRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateClientCertificateWithCsrRequest setTags(java.util.List<CreateClientCertificateWithCsrRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateClientCertificateWithCsrRequestTags> getTags() {
        return this.tags;
    }

    public CreateClientCertificateWithCsrRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateClientCertificateWithCsrRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateClientCertificateWithCsrRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClientCertificateWithCsrRequestTags self = new CreateClientCertificateWithCsrRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateClientCertificateWithCsrRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClientCertificateWithCsrRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
