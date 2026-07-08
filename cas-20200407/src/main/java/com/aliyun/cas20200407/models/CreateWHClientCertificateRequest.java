// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate, specified as a Unix timestamp in seconds.</p>
     * <blockquote>
     * <p>The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1665819958</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>The key algorithm for the client certificate. The format is <code>&lt;encryption_algorithm&gt;_&lt;key_length&gt;</code>. Valid values:</p>
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
     * <p>The encryption algorithm of the client certificate must match that of the issuing subordinate CA certificate, but the key lengths can differ. For example, if the key algorithm of the subordinate CA certificate is RSA_2048, the key algorithm for the client certificate must be one of RSA_1024, RSA_2048, or RSA_4096.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The issuance time of the client certificate, as a Unix timestamp in seconds. If omitted, this defaults to the time of the API call.</p>
     * <blockquote>
     * <p>The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>The common name of the client certificate. Supports Chinese, English, and other characters.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country where the organization is located.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the certificate signing request (CSR). You can generate a CSR with tools like OpenSSL or Keytool.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The validity period of the client certificate, in days.</p>
     * <p>You cannot leave the <code>Days</code>, <code>BeforeTime</code>, and <code>AfterTime</code> parameters all empty. The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
     * <ul>
     * <li><p>If you specify the <code>Days</code> parameter, specifying <code>BeforeTime</code> and <code>AfterTime</code> is optional.</p>
     * </li>
     * <li><p>If you do not specify the <code>Days</code> parameter, you must specify both <code>BeforeTime</code> and <code>AfterTime</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify <code>Days</code>, <code>BeforeTime</code>, and <code>AfterTime</code> simultaneously, the <code>Days</code> parameter takes precedence in determining the validity period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Long days;

    /**
     * <p>Specifies which certificate content to return in the response.</p>
     * <ul>
     * <li><p><strong>0</strong>: Does not return the certificate (default).</p>
     * </li>
     * <li><p><strong>1</strong>: Returns the certificate.</p>
     * </li>
     * <li><p><strong>2</strong>: Returns the certificate and its certificate chain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Immediately")
    public Long immediately;

    /**
     * <p>The city where the organization is located. Chinese, English, and other characters are supported.</p>
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
    public Long months;

    /**
     * <p>The organization name associated with the root CA certificate, typically your company or enterprise name. Supports Chinese, English, and other characters.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里巴巴网络技术有限公司</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department or business unit within the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the issuing subordinate CA certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>273ae6bb538d538c70c01f81jh2****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The type of the subject alternative name (SAN) for the client certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: email address.</p>
     * </li>
     * <li><p><strong>2</strong>: domain name.</p>
     * </li>
     * <li><p><strong>6</strong>: Uniform Resource Identifier (URI).</p>
     * </li>
     * <li><p><strong>7</strong>: IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SanType")
    public Long sanType;

    /**
     * <p>The value of the SAN extension. To specify multiple values, separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>The province, municipality, or autonomous region where the organization is located. Chinese, English, and other characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The validity period of the certificate, in years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Years")
    public Long years;

    public static CreateWHClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWHClientCertificateRequest self = new CreateWHClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWHClientCertificateRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateWHClientCertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateWHClientCertificateRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateWHClientCertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateWHClientCertificateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateWHClientCertificateRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateWHClientCertificateRequest setDays(Long days) {
        this.days = days;
        return this;
    }
    public Long getDays() {
        return this.days;
    }

    public CreateWHClientCertificateRequest setImmediately(Long immediately) {
        this.immediately = immediately;
        return this;
    }
    public Long getImmediately() {
        return this.immediately;
    }

    public CreateWHClientCertificateRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateWHClientCertificateRequest setMonths(Long months) {
        this.months = months;
        return this;
    }
    public Long getMonths() {
        return this.months;
    }

    public CreateWHClientCertificateRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateWHClientCertificateRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateWHClientCertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateWHClientCertificateRequest setSanType(Long sanType) {
        this.sanType = sanType;
        return this;
    }
    public Long getSanType() {
        return this.sanType;
    }

    public CreateWHClientCertificateRequest setSanValue(String sanValue) {
        this.sanValue = sanValue;
        return this;
    }
    public String getSanValue() {
        return this.sanValue;
    }

    public CreateWHClientCertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateWHClientCertificateRequest setYears(Long years) {
        this.years = years;
        return this;
    }
    public Long getYears() {
        return this.years;
    }

}
