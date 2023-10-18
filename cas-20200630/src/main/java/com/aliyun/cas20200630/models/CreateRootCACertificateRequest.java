// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateRequest extends TeaModel {
    /**
     * <p>The key algorithm of the root CA certificate. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:</p>
     * <br>
     * <p>*   **RSA\_1024**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_2048**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **RSA\_4096**: The signature algorithm is Sha256WithRSA.</p>
     * <p>*   **ECC\_256**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **ECC\_384**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **ECC\_512**: The signature algorithm is Sha256WithECDSA.</p>
     * <p>*   **SM2\_256**: The signature algorithm is SM3WithSM2.</p>
     * <br>
     * <p>The encryption algorithm of the root CA certificate must be consistent with the **encryption algorithm** of the private root CA instance that you purchase. For example, if the **encryption algorithm** of the private root CA instance that you purchase is **RSA**, the key algorithm of the root CA certificate must be **RSA\_1024**, **RSA\_2048**, or **RSA\_4096**.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>10</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The certificate chain of the root CA certificate.</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The common name or abbreviation of the organization. The value can contain letters.</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The validity period of the root CA certificate. Unit: years.</p>
     * <br>
     * <p>>  We recommend that you set this parameter to a value from 5 to 10.</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the province, municipality, or autonomous region in which the organization is located. The value can contain letters.</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>Alibaba</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The name of the department or branch in the organization. The value can contain letters.</p>
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

    public CreateRootCACertificateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateRootCACertificateRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

}
