// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate in UNIX timestamp format. The unit is seconds.</p>
     * <blockquote>
     * <p><strong>BeforeTime</strong> and <strong>AfterTime</strong> must be specified together or left empty together.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1665819958</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>The key algorithm for the client certificate. The format is <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</p>
     * </li>
     * </ul>
     * <p>The encryption algorithm of the client certificate must be the same as the subordinate CA certificate. The key length can be different. For example, if the subordinate CA certificate uses the RSA_2048 key algorithm, the client certificate must use RSA_1024, RSA_2048, or RSA_4096.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to find the key algorithm of the subordinate CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Set the name of the issued certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-name</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The issuance time of the client certificate in UNIX timestamp format. The unit is seconds. The default value is the time when you call this operation.</p>
     * <blockquote>
     * <p><strong>BeforeTime</strong> and <strong>AfterTime</strong> must be specified together or left empty together.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>Used to ensure request idempotence. The client generates this parameter value, which must be unique across different requests. It can contain a maximum of 64 ASCII characters and must not include any non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the certificate user. For a client authentication (ClientAuth) certificate, the user is typically an individual, a company, an organization, or an application. Specify the common name of the user, such as John Doe, Alibaba, Alibaba Cloud Cryptography Platform, or Tmall Genie.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country code. Default: CN.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>A custom identifier. This is a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The validity period of the client certificate in days. The <strong>Days</strong>, <strong>BeforeTime</strong>, or <strong>AfterTime</strong> parameters cannot all be empty. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be set together or left empty. The parameters are configured as follows:</p>
     * <ul>
     * <li><p>If you set the <strong>Days</strong> parameter, the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters are optional.</p>
     * </li>
     * <li><p>If you do not set the <strong>Days</strong> parameter, you must set both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters, the value of the <strong>Days</strong> parameter takes precedence.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The validity period of the client certificate cannot exceed the validity period of the subordinate CA certificate. To view the validity period of the subordinate CA certificate, you can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>Specifies whether to include the Certificate Revocation List (CRL) address.</p>
     * <p>Valid values: 0 (No) and 1 (Yes).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Specifies whether to return the digital certificate immediately.</p>
     * <ul>
     * <li><p><strong>0</strong>: No. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: Yes, return the certificate.</p>
     * </li>
     * <li><p><strong>2</strong>: Yes, return the certificate and its certificate chain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The name of the city where the organization is located. The default value is the city of the subordinate CA that issues the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The validity period of the certificate in months.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Months")
    public Integer months;

    /**
     * <p>The name of the organization. Default: Alibaba Inc.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department. Default: Alibaba Cloud CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the subordinate CA certificate that issues this certificate.</p>
     * <blockquote>
     * <p>Call DescribeCACertificateList to query the unique identifier of the subordinate CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>273ae6bb538d538c70c01f81jh2****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of Subject Alternative Name (SAN) extension for the client certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Email</p>
     * </li>
     * <li><p><strong>6</strong>: Uniform Resource Identifier (URI)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SanType")
    public Integer sanType;

    /**
     * <p>The extension information for the client certificate. To enter multiple extensions, separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:somebody@example.com">somebody@example.com</a></p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>Specify the province or state of the certificate organization. The value can contain letters. The default value is the province or state of the organization for the intermediate CA that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateClientCertificateRequestTags> tags;

    /**
     * <p>The validity period of the certificate in years.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateRequest self = new CreateClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateClientCertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateClientCertificateRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateClientCertificateRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateClientCertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClientCertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateClientCertificateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateClientCertificateRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public CreateClientCertificateRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CreateClientCertificateRequest setEnableCrl(Long enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    public CreateClientCertificateRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateClientCertificateRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateClientCertificateRequest setMonths(Integer months) {
        this.months = months;
        return this;
    }
    public Integer getMonths() {
        return this.months;
    }

    public CreateClientCertificateRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateClientCertificateRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateClientCertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateClientCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClientCertificateRequest setSanType(Integer sanType) {
        this.sanType = sanType;
        return this;
    }
    public Integer getSanType() {
        return this.sanType;
    }

    public CreateClientCertificateRequest setSanValue(String sanValue) {
        this.sanValue = sanValue;
        return this;
    }
    public String getSanValue() {
        return this.sanValue;
    }

    public CreateClientCertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateClientCertificateRequest setTags(java.util.List<CreateClientCertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateClientCertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateClientCertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateClientCertificateRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
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

        public static CreateClientCertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClientCertificateRequestTags self = new CreateClientCertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateClientCertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClientCertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
