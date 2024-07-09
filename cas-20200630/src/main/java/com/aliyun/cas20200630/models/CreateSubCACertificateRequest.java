// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateRequest extends TeaModel {
    /**
     * <p>The type of the key algorithm of the intermediate CA. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
     * </ul>
     * <p>The encryption algorithm of an intermediate CA certificate must be consistent with the encryption algorithm of a root CA certificate. The length of the keys can be different. For example, if the key algorithm of the root CA certificate is <strong>RSA_2048</strong>, the key algorithm of the intermediate CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> operation to query the key algorithm of a root CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The common name or abbreviation of the organization. The value can contain letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The code of the country or region in which the organization is located. You can enter an alpha-2 or alpha-3 code. For example, you can use <strong>CN</strong> to indicate China and use <strong>US</strong> to indicate the United States.</p>
     * <p>For more information about country codes, see the <strong>&quot;Country codes&quot;</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>CRL validity period: 1-365 days</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CrlDay")
    public Integer crlDay;

    /**
     * <p>Enable Crl Service.</p>
     * <ul>
     * <li>0- No</li>
     * <li>1- Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Boolean enableCrl;

    /**
     * <p>The extended key usages of the certificate.</p>
     */
    @NameInMap("ExtendedKeyUsages")
    public java.util.List<String> extendedKeyUsages;

    /**
     * <p>The name of the city in which the organization is located. The value can contain letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The name of the organization that is associated with the intermediate CA certificate. You can enter the name of your enterprise or company. The value can contain letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Maizi Technology</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department or branch in the organization. The value can contain letters.</p>
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
     * <p>You can call the [DescribeCACertificateList] operation to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a83bcbb89e562885e40aa0108f5****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The path length constraint of the certificate. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PathLenConstraint")
    public Integer pathLenConstraint;

    /**
     * <p>The name of the province or state in which the organization is located. The value can contain letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The validity period of the intermediate CA certificate. Unit: years.</p>
     * <p>We recommend that you set this parameter to 5 to 10.</p>
     * <blockquote>
     * <p>The validity period of the intermediate CA certificate cannot exceed the validity period of the root CA certificate. You can call the [DescribeCACertificate]operation to query the validity period of a root CA certificate.</p>
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

    public CreateSubCACertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateSubCACertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

}
