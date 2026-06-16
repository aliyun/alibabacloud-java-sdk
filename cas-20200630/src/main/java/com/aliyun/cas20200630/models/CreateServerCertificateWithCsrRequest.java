// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateWithCsrRequest extends TeaModel {
    /**
     * <p>Expiration time of the server-side certificate, in UNIX timestamp format. Unit: seconds.</p>
     * <blockquote>
     * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both configured.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1665819958</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>Key algorithm for the server-side certificate. Use the format <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>RSA_1024</strong>: Signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_2048</strong>: Signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_4096</strong>: Signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>ECC_256</strong>: Signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_384</strong>: Signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>ECC_512</strong>: Signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>SM2_256</strong>: Signature algorithm is SM3WithSM2.</p>
     * </li>
     * </ul>
     * <p>The encryption algorithm of the server-side certificate must match that of the sub-CA certificate. The key length can differ. For example, if the sub-CA certificate uses RSA_2048, the server-side certificate must use RSA_1024, RSA_2048, or RSA_4096.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to check the key algorithm of the sub-CA certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Issue time of the server-side certificate, in UNIX timestamp format. Default: current time when you call this API. Unit: seconds.</p>
     * <blockquote>
     * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both configured.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>Set the common name for the certificate. Supports Chinese, English, and other characters.</p>
     * <blockquote>
     * <p>If you set the <strong>Csr</strong> parameter, the value of <strong>CommonName</strong> comes from the corresponding field in the <strong>Csr</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mtcsq.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country code. For example, CN or US.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>You can generate a CSR using OpenSSL or Keytool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How to create a CSR file</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>You can also create a CSR in the SSL Certificate console. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.</p>
     * <p>This parameter is required.</p>
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
     * <p><em><strong>e6bb538d538c70c01f81hfd3</strong></em>*</p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters cannot all be empty. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both set. Follow these rules:</p>
     * <ul>
     * <li><p>If you set <strong>Days</strong>, you can optionally set <strong>BeforeTime</strong> and <strong>AfterTime</strong>.</p>
     * </li>
     * <li><p>If you do not set <strong>Days</strong>, you must set both <strong>BeforeTime</strong> and <strong>AfterTime</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> together, the validity period uses the value of <strong>Days</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The server-side certificate validity period cannot exceed that of the sub-CA certificate. Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to check the sub-CA certificate validity period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>Additional domain names or IP addresses for the server-side certificate. Adding this information lets you apply the certificate to multiple domains or IP addresses.</p>
     * <p>You can enter multiple domain names and IP addresses. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to include the certificate revocation list (CRL) address.</p>
     * <p>0 - No</p>
     * <p>1 - Yes</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Specifies whether to return the digital certificate immediately.</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not return. Default.</p>
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
     * <p>The city where the organization for the certificate is located. The name can contain both Chinese and English characters. By default, this parameter is set to the city of the organization for the issuing subordinate Certificate Authority (CA).</p>
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
     * <p>阿里云</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department. Default value: Alibaba Cloud CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>Unique identifier of the sub-CA certificate that issues this certificate.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifier of the sub-CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>270oe6bb538d538c70c01f81hfd3****</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;Set the name of the province, municipality, or autonomous region where the organization is located. Supports Chinese, English, and other characters. Defaults to the province, municipality, or autonomous region of the issuing sub-CA certificate\&quot;s organization.
     * &lt;props=&quot;intl&quot;&gt;Set the name of the state or province where the organization is located. Supports Chinese, English, and other characters. Defaults to the state or province of the issuing sub-CA certificate\&quot;s organization.</p>
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
    public java.util.List<CreateServerCertificateWithCsrRequestTags> tags;

    /**
     * <p>The validity period of the certificate, in years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateServerCertificateWithCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateWithCsrRequest self = new CreateServerCertificateWithCsrRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateWithCsrRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateServerCertificateWithCsrRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateServerCertificateWithCsrRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateServerCertificateWithCsrRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateServerCertificateWithCsrRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateServerCertificateWithCsrRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateServerCertificateWithCsrRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public CreateServerCertificateWithCsrRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CreateServerCertificateWithCsrRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateServerCertificateWithCsrRequest setEnableCrl(Long enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    public CreateServerCertificateWithCsrRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateServerCertificateWithCsrRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateServerCertificateWithCsrRequest setMonths(Integer months) {
        this.months = months;
        return this;
    }
    public Integer getMonths() {
        return this.months;
    }

    public CreateServerCertificateWithCsrRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateServerCertificateWithCsrRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateServerCertificateWithCsrRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateServerCertificateWithCsrRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerCertificateWithCsrRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateServerCertificateWithCsrRequest setTags(java.util.List<CreateServerCertificateWithCsrRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateServerCertificateWithCsrRequestTags> getTags() {
        return this.tags;
    }

    public CreateServerCertificateWithCsrRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateServerCertificateWithCsrRequestTags extends TeaModel {
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServerCertificateWithCsrRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateServerCertificateWithCsrRequestTags self = new CreateServerCertificateWithCsrRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateServerCertificateWithCsrRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServerCertificateWithCsrRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
