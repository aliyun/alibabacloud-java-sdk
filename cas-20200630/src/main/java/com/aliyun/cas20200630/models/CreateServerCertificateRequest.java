// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateRequest extends TeaModel {
    /**
     * <p>The expiration time of the server certificate in timestamp format. Unit: seconds.</p>
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
     * <p>The key algorithm of the server certificate. The key algorithm is in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
     * </ul>
     * <p>The encryption algorithm of the server certificate must be the same as that of the subordinate CA certificate, but the key length can be different. For example, if the key algorithm of the subordinate CA certificate is RSA_2048, the key algorithm of the server certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the key algorithm of the subordinate CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>The issuance time of the server certificate in timestamp format. Default value: the time when you call this operation. Unit: seconds.</p>
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
     * <p>The name of the certificate user. For a server authentication (ServerAuth) certificate, the user is a server. Enter the domain name or IP address bound to the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country code, such as CN or US.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The custom identifier, which is a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81dg3</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The validity period of the server certificate. Unit: days.
     * The <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters cannot all be empty. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified. The following rules apply:</p>
     * <ul>
     * <li><p>If you set the <strong>Days</strong> parameter, you can choose to set or not set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</p>
     * </li>
     * <li><p>If you do not set the <strong>Days</strong> parameter, you must set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters at the same time, the validity period of the server certificate is determined by the value of the <strong>Days</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The validity period of the server certificate cannot exceed the validity period of the subordinate CA certificate. You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the validity period of the subordinate CA certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>The extended domain names and extended IP addresses of the server certificate. After you add extended information to the certificate, you can apply the certificate to multiple domain names and IP addresses.</p>
     * <p>Separate multiple domain names and IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to include the Certificate Revocation List (CRL) address. Valid values:</p>
     * <p>0: no. </p>
     * <p>1: yes.</p>
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
     * <p>The name of the city where the certificate organization is located. Chinese and English characters are supported.
     * Default value: the name of the city where the organization of the subordinate CA certificate that issues this certificate is located.</p>
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
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The department name. Default value: Aliyun CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the subordinate CA certificate that issues this certificate.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifier of the subordinate CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>271ae6bb538d538c70c01f81dg3****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The resource group ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the certificate organization is located. Chinese and English characters are supported. Default value: the name of the province, municipality, or autonomous region where the organization of the subordinate CA certificate that issues this certificate is located.
     * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the certificate organization is located. Chinese and English characters are supported. Default value: the name of the province or state where the organization of the subordinate CA certificate that issues this certificate is located.</p>
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
    public java.util.List<CreateServerCertificateRequestTags> tags;

    /**
     * <p>The certificate validity period. Unit: years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateRequest self = new CreateServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateServerCertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateServerCertificateRequest setAsynchronousFlag(Boolean asynchronousFlag) {
        this.asynchronousFlag = asynchronousFlag;
        return this;
    }
    public Boolean getAsynchronousFlag() {
        return this.asynchronousFlag;
    }

    public CreateServerCertificateRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateServerCertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateServerCertificateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateServerCertificateRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public CreateServerCertificateRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CreateServerCertificateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateServerCertificateRequest setEnableCrl(Long enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    public CreateServerCertificateRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateServerCertificateRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateServerCertificateRequest setMonths(Integer months) {
        this.months = months;
        return this;
    }
    public Integer getMonths() {
        return this.months;
    }

    public CreateServerCertificateRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateServerCertificateRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateServerCertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateServerCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerCertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateServerCertificateRequest setTags(java.util.List<CreateServerCertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateServerCertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateServerCertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateServerCertificateRequestTags extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServerCertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateServerCertificateRequestTags self = new CreateServerCertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateServerCertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServerCertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
