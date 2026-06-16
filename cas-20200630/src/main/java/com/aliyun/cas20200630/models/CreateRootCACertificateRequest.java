// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateRequest extends TeaModel {
    /**
     * <p>The key algorithm of the root CA certificate. The key algorithm is in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
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
     * <p>The encryption algorithm of the root CA certificate must be the same as the <strong>Certificate Algorithm</strong> of the private root CA that you purchased. For example, if you set <strong>Certificate Algorithm</strong> to <strong>RSA</strong> when you purchase a private root CA, the key algorithm of the root CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * <p>Generate a unique value for this parameter from your client. The token supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3838B684-3075-582B-9A45-8C99104029DF</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The common name or abbreviation of the organization. Supports Chinese characters and letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The two-letter uppercase code of the country or region where the organization is located. For example, <strong>CN</strong> indicates China and <strong>US</strong> indicates the United States.</p>
     * <p>For more information about country codes, see the <strong>Country codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The name of the city where the organization is located. Supports Chinese characters and letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The name of the organization for the root CA certificate. This is typically your company or enterprise name. Supports Chinese characters and letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department or branch in the organization. Supports Chinese characters and letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Security</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>&lt;props=&quot;intl&quot;&gt;The name of the province or state where the organization is located. Supports Chinese characters and letters.</p>
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
    public java.util.List<CreateRootCACertificateRequestTags> tags;

    /**
     * <p>The validity period of the root CA certificate. Unit: years.</p>
     * <blockquote>
     * <p>Set the validity period to 5 to 10 years.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static CreateRootCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRootCACertificateRequest self = new CreateRootCACertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRootCACertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateRootCACertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRootCACertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateRootCACertificateRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateRootCACertificateRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateRootCACertificateRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateRootCACertificateRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateRootCACertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRootCACertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateRootCACertificateRequest setTags(java.util.List<CreateRootCACertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateRootCACertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateRootCACertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class CreateRootCACertificateRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
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

        public static CreateRootCACertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRootCACertificateRequestTags self = new CreateRootCACertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateRootCACertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRootCACertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
