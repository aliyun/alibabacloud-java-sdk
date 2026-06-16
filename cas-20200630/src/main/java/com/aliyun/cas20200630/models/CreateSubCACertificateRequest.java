// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateRequest extends TeaModel {
    /**
     * <p>The key algorithm for the intermediate CA certificate. The algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><p><strong>RSA_1024</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_2048</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>RSA_4096</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
     * </li>
     * <li><p><strong>ECC_256</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
     * </li>
     * <li><p><strong>SM2_256</strong>: The corresponding signature algorithm is SM3WithSM2.</p>
     * </li>
     * </ul>
     * <p>The encryption algorithm of the intermediate CA certificate must be the same as that of the root CA certificate, but the key length can be different. For example, if the root CA certificate uses the <strong>RSA_2048</strong> algorithm, the intermediate CA certificate must use <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> operation to get the key algorithm of the root CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CertMaxTime")
    public Integer certMaxTime;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. The token must be unique for each request. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The common name of your organization. The name can contain Chinese characters and English letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The two- or three-letter country or region code in uppercase. For example, <strong>CN</strong> indicates China and <strong>US</strong> indicates the United States.</p>
     * <p>For more information, see the <strong>Country codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The validity period of the CRL, in days. Valid values: 1 to 365.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CrlDay")
    public Integer crlDay;

    /**
     * <p>Specifies whether to enable the certificate revocation list (CRL) feature.</p>
     * <ul>
     * <li><p>false: No</p>
     * </li>
     * <li><p>true: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCrl")
    public Boolean enableCrl;

    /**
     * <p>The extended key usages.</p>
     */
    @NameInMap("ExtendedKeyUsages")
    public java.util.List<String> extendedKeyUsages;

    /**
     * <p>The name of the city where your organization is located. The name can contain Chinese characters and English letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The name of your organization, such as your company. The name can contain Chinese characters and English letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department in your organization. The name can contain Chinese characters and English letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Security</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the root CA certificate.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> operation to get the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1a83bcbb89e562885e40aa0108f5****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The certificate path length constraint. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PathLenConstraint")
    public Integer pathLenConstraint;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae****vty</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the organization is located. Chinese characters and English letters are supported.
     * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the organization is located. Chinese characters and English letters are supported.</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<CreateSubCACertificateRequestTags> tags;

    /**
     * <p>The validity period of the intermediate CA certificate, in years. Valid values: 5 to 10.</p>
     * <p>Set this parameter to a value from 5 to 10.</p>
     * <blockquote>
     * <p>The validity period of the intermediate CA certificate cannot exceed that of the root CA certificate. Call the <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> operation to get the validity period of the root CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateSubCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCACertificateRequest self = new CreateSubCACertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubCACertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateSubCACertificateRequest setCertMaxTime(Integer certMaxTime) {
        this.certMaxTime = certMaxTime;
        return this;
    }
    public Integer getCertMaxTime() {
        return this.certMaxTime;
    }

    public CreateSubCACertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubCACertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateSubCACertificateRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateSubCACertificateRequest setCrlDay(Integer crlDay) {
        this.crlDay = crlDay;
        return this;
    }
    public Integer getCrlDay() {
        return this.crlDay;
    }

    public CreateSubCACertificateRequest setEnableCrl(Boolean enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Boolean getEnableCrl() {
        return this.enableCrl;
    }

    public CreateSubCACertificateRequest setExtendedKeyUsages(java.util.List<String> extendedKeyUsages) {
        this.extendedKeyUsages = extendedKeyUsages;
        return this;
    }
    public java.util.List<String> getExtendedKeyUsages() {
        return this.extendedKeyUsages;
    }

    public CreateSubCACertificateRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateSubCACertificateRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateSubCACertificateRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateSubCACertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateSubCACertificateRequest setPathLenConstraint(Integer pathLenConstraint) {
        this.pathLenConstraint = pathLenConstraint;
        return this;
    }
    public Integer getPathLenConstraint() {
        return this.pathLenConstraint;
    }

    public CreateSubCACertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSubCACertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateSubCACertificateRequest setTags(java.util.List<CreateSubCACertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateSubCACertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateSubCACertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateSubCACertificateRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
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

        public static CreateSubCACertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSubCACertificateRequestTags self = new CreateSubCACertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateSubCACertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSubCACertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
