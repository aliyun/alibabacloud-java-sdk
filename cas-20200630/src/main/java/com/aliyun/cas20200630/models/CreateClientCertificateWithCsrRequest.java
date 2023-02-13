// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrRequest extends TeaModel {
    /**
     * <p>The expiration time of the client certificate. This value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>>  The **BeforeTime** and **AfterTime** parameters must be both empty or both specified.</p>
     */
    @NameInMap("AfterTime")
    public Long afterTime;

    /**
     * <p>The key algorithm of the client certificate. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:</p>
     * <br>
     * <p>*   **RSA\_1024**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_2048**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_4096**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **ECC\_256**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **ECC\_384**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **ECC\_512**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **SM2\_256**: The signature algorithm is SM3WithSM2.</p>
     * <br>
     * <p>The encryption algorithm of the client certificate must be the same with the encryption algorithm of the intermediate CA certificate. The key length can be different. For example, if the key algorithm of the intermediate CA certificate is RSA\_2048, the key algorithm of the client certificate must be RSA\_1024, RSA\_2048, or RSA\_4096.</p>
     * <br>
     * <p>>  You can call the [DescribeCACertificate](~~328096~~) operation to query the key algorithm of an intermediate CA certificate.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The issuance time of the client certificate. This value is a UNIX timestamp. The default value is the time when you call this operation. Unit: seconds.</p>
     * <br>
     * <p>>  The **BeforeTime** and **AfterTime** parameters must be both empty or both specified.</p>
     */
    @NameInMap("BeforeTime")
    public Long beforeTime;

    /**
     * <p>The common name of the certificate. The value can contain letters.</p>
     * <br>
     * <p>>  If you specify the **CsrPemString** parameter, the value of the **CommonName** parameter is determined by the **CsrPemString** parameter.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The code of the country in which the organization is located, such as **CN** and **US**.</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the CSR file. You can generate a CSR file by using the OpenSSL tool or Keytool. For more information, see [How do I create a CSR file?](~~42218~~) You can also create a CSR file in the Certificate Management Service console. For more information, see [Create a CSR](~~313297~~).</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The content of the CSR file. You can generate a CSR file by using the OpenSSL tool or Keytool. For more information, see [How do I create a CSR file?](~~42218~~) You can also create a CSR file in the Certificate Management Service console. For more information, see [Create a CSR](~~313297~~).</p>
     */
    @NameInMap("Csr1")
    public String csr1;

    /**
     * <p>The validity period of the client certificate. Unit: days. You must specify at least one of the **Days**, **BeforeTime**, and **AfterTime** parameters. The **BeforeTime** and **AfterTime** parameters must be both empty or both specified. The following list describes how to specify these parameters:</p>
     * <br>
     * <p>*   If you specify the **Days** parameter, you can specify both the **BeforeTime** and **AfterTime** parameters or leave them both empty.********</p>
     * <p>*   If you do not specify the **Days** parameter, you must specify both the **BeforeTime** and **AfterTime** parameters.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you specify the **Days**, **BeforeTime**, and **AfterTime** parameters together, the validity period of the client certificate is determined by the value of the **Days** parameter.</p>
     * <br>
     * <p>*   The validity period of the client certificate cannot exceed the validity period of the intermediate CA certificate. You can call the [DescribeCACertificate](~~328096~~) operation to query the validity period of an intermediate CA certificate.</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>Specifies whether to return the certificate. Valid values:</p>
     * <br>
     * <p>*   **0**: does not return the certificate. This is the default value.</p>
     * <p>*   **1**: returns the certificate.</p>
     * <p>*   **2**: returns the certificate and the certificate chain of the certificate.</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The name of the city in which the organization is located. The value can contain letters. The default value is the name of the city in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The validity period of the client certificate. Unit: months.</p>
     */
    @NameInMap("Months")
    public Integer months;

    /**
     * <p>The name of the organization. Default value: Alibaba Inc.</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department. Default value: Aliyun CDN.</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the intermediate CA certificate from which the client certificate is issued.</p>
     * <br>
     * <p>>  You can call the [DescribeCACertificateList](~~328095~~) operation to query the unique identifier of an intermediate CA certificate.</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The type of the Subject Alternative Name (SAN) extension that is supported by the client certificate. Valid values:</p>
     * <br>
     * <p>*   **1**: an email address</p>
     * <p>*   **6**: a Uniform Resource Identifier (URI)</p>
     */
    @NameInMap("SanType")
    public Integer sanType;

    /**
     * <p>The content of the extension. You can specify multiple SAN extensions. If you want to specify multiple SAN extensions, separate them with commas (,).</p>
     */
    @NameInMap("SanValue")
    public String sanValue;

    /**
     * <p>The province, municipality, or autonomous region in which the organization is located. The value can contain letters. The default value is the name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The validity period of the client certificate. Unit: years.</p>
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

    public CreateClientCertificateWithCsrRequest setCsr1(String csr1) {
        this.csr1 = csr1;
        return this;
    }
    public String getCsr1() {
        return this.csr1;
    }

    public CreateClientCertificateWithCsrRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
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

    public CreateClientCertificateWithCsrRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

}
