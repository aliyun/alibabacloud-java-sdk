// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate. This is a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>Specify the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters together, or omit both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1665819958</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>The key algorithm of the client certificate. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><p><strong>RSA_1024</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_2048</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_4096</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>ECC_256</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_384</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_512</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>SM2_256</strong>: The corresponding signature algorithm is SM3WithSM2.</p>
     * </li>
     * </ul>
     * <p>The encryption algorithm of the client certificate must be the same as that of the subordinate CA certificate, but the key length can be different. For example, if the key algorithm of the subordinate CA certificate is RSA_2048, the key algorithm of the client certificate must be one of RSA_1024, RSA_2048, and RSA_4096.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the key algorithm of the subordinate CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The issuance time of the client certificate. This is a UNIX timestamp in seconds. The default value is the time of the API call.</p>
     * <blockquote>
     * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be specified together or left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>The common name of the certificate. Chinese and English characters are supported.</p>
     * <blockquote>
     * <p>If you specify the <strong>Csr</strong> parameter, the value of this parameter is determined by the information in the <strong>Csr</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country code, for example, <strong>CN</strong> or <strong>US</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the CSR. Use OpenSSL or Keytool to generate a CSR. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">Create a CSR file</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>A custom identifier. This is a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong>e6bb538d538c70c01f81fg3</strong></em>*</p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The validity period of the client certificate, in days. You must specify the validity period using one of the following methods:</p>
     * <ul>
     * <li><p>Specify the <strong>Days</strong> parameter.</p>
     * </li>
     * <li><p>Specify both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you specify <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> at the same time, the value of <strong>Days</strong> is used.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The validity period of the client certificate cannot exceed that of the subordinate CA certificate. Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to view the validity period of the subordinate CA certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>Specifies whether to include the Certificate Revocation List (CRL) address.</p>
     * <p>0: No</p>
     * <p>1: Yes</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Specifies whether to return the digital certificate.</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not return the certificate. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: Return the certificate.</p>
     * </li>
     * <li><p><strong>2</strong>: Return the certificate and its certificate chain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The name of the city where the organization is located. Chinese and English characters are supported. By default, this parameter uses the city name of the organization that is associated with the issuing subordinate CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The validity period of the certificate, in months.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Months")
    public Integer months;

    /**
     * <p>The name of the organization. Default value: Alibaba Inc.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Inc</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department. Default value: Alibaba Cloud CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>Security</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the subordinate CA certificate that issues the client certificate.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifiers of subordinate CA certificates.</p>
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
     * <p>The type of the Subject Alternative Name (SAN) extension for the client certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Email address.</p>
     * </li>
     * <li><p><strong>6</strong>: Uniform Resource Identifier (URI).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SanType")
    public Integer sanType;

    /**
     * <p>The extension for the client certificate. To specify multiple extensions, separate them with a comma.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:somebody@example.com">somebody@example.com</a></p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>Specify the name of the province or state where the certificate organization is located. The value can contain letters. The default value is the name of the province or state of the intermediate CA\&quot;s organization.</p>
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
    public java.util.List<CreateClientCertificateWithCsrRequestTags> tags;

    /**
     * <p>The validity period of the certificate, in years.</p>
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
         * <p>The value of the tag.</p>
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
