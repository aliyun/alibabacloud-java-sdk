// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate. The value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The BeforeTime and AfterTime parameters must be both empty or both specified.</p>
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
     * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
     * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
     * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
     * </ul>
     * <p>The encryption algorithm of the client certificate must be the same as that of the subordinate CA certificate, but the key length can be different. For example, if the key algorithm of the subordinate CA certificate is RSA_2048, the key algorithm of the client certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The issuance time of the client certificate. The value is a UNIX timestamp. Default value: the time when you call this operation. Unit: seconds.</p>
     * <blockquote>
     * <p>The BeforeTime and AfterTime parameters must be both empty or both specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1634283958</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>The common name of the client certificate. Chinese and English characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country where the company or organization of the user who purchases the certificate is located.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the certificate signing request (CSR). You can use OpenSSL or Keytool to generate a CSR.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The validity period of the client certificate. Unit: days.</p>
     * <p>The Days, BeforeTime, and AfterTime parameters cannot be left empty at the same time. The BeforeTime and AfterTime parameters must be both empty or both specified. The configuration rules are as follows:</p>
     * <ul>
     * <li>If you specify the Days parameter, you can choose to specify or not specify the BeforeTime and AfterTime parameters.</li>
     * <li>If you do not specify the Days parameter, you must specify the BeforeTime and AfterTime parameters.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify the Days, BeforeTime, and AfterTime parameters at the same time, the validity period of the client certificate is subject to the value of the Days parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("Days")
    public Long days;

    /**
     * <p>Specifies whether to immediately return the digital certificate. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No. This is the default value.</li>
     * <li><strong>1</strong>: Yes, return the certificate.</li>
     * <li><strong>2</strong>: Yes, return the certificate and its certificate chain.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Immediately")
    public Long immediately;

    /**
     * <p>The name of the city where the organization is located. Chinese and English characters are supported.</p>
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
    public Long months;

    /**
     * <p>The name of the organization associated with the root CA certificate. The organization corresponds to your enterprise or institution. Chinese and English characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Network Technology Co., Ltd</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the company or organization to which the certificate belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the subordinate CA certificate that issues the client certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>273ae6bb538d538c70c01f81jh2****</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The Subject Alternative Name (SAN) type supported by the client certificate. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Email address.</li>
     * <li><strong>2</strong>: Domain name.</li>
     * <li><strong>6</strong>: Uniform Resource Identifier (URI).</li>
     * <li><strong>7</strong>: IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SanType")
    public Long sanType;

    /**
     * <p>The specific SAN of the client certificate. You can specify multiple SANs. Separate multiple SANs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>The name of the province, municipality, or autonomous region where the organization is located. Chinese and English characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The certificate validity period. Unit: years.</p>
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
