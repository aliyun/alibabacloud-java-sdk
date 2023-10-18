// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateRequest extends TeaModel {
    /**
     * <p>The type of the key algorithm of the intermediate CA. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:</p>
     * <br>
     * <p>*   **RSA\_1024**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_2048**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_4096**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **ECC\_256**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **SM2\_256**: The signature algorithm is SM3WithSM2.</p>
     * <br>
     * <p>The encryption algorithm of an intermediate CA certificate must be consistent with the encryption algorithm of a root CA certificate. The length of the keys can be different. For example, if the key algorithm of the root CA certificate is **RSA\_2048**, the key algorithm of the intermediate CA certificate must be **RSA\_1024**, **RSA\_2048**, or **RSA\_4096**.</p>
     * <br>
     * <p>> You can call the [DescribeCACertificate](~~465954~~) operation to query the key algorithm of a root CA certificate.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The common name or abbreviation of the organization. The value can contain letters.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The code of the country or region in which the organization is located. You can enter an alpha-2 or alpha-3 code. For example, you can use **CN** to indicate China and use **US** to indicate the United States.</p>
     * <br>
     * <p>For more information about country codes, see the **"Country codes"** section in [Manage company profiles](~~198289~~).</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("CrlDay")
    public Integer crlDay;

    @NameInMap("EnableCrl")
    public Boolean enableCrl;

    /**
     * <p>The extended key usages of the certificate.</p>
     */
    @NameInMap("ExtendedKeyUsages")
    public java.util.List<String> extendedKeyUsages;

    /**
     * <p>The name of the city in which the organization is located. The value can contain letters.</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The name of the organization that is associated with the intermediate CA certificate. You can enter the name of your enterprise or company. The value can contain letters.</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department or branch in the organization. The value can contain letters.</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The unique identifier of the root CA certificate.</p>
     * <br>
     * <p>> You can call the [DescribeCACertificateList](~~465957~~) operation to query the unique identifiers of all CA certificates.</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The path length constraint of the certificate. Default value: 0.</p>
     */
    @NameInMap("PathLenConstraint")
    public Integer pathLenConstraint;

    /**
     * <p>The name of the province or state in which the organization is located. The value can contain letters.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The validity period of the intermediate CA certificate. Unit: years.</p>
     * <br>
     * <p>We recommend that you set this parameter to 5 to 10.</p>
     * <br>
     * <p>> The validity period of the intermediate CA certificate cannot exceed the validity period of the root CA certificate. You can call the [DescribeCACertificate](~~465954~~) operation to query the validity period of a root CA certificate.</p>
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
