// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestRequest extends TeaModel {
    /**
     * <p>The city to which the organization belongs. Default value: Hangzhou.</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The email address that can be used to contact the organization.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The content of the CSR.</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateCdnCertificateSigningRequest**.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The Subject Alternative Name (SAN) extension of the SSL certificate. This extension is used to add domain names to the certificate. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The MD5 value of the certificate public key.</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The Common Name of the certificate.</p>
     */
    @NameInMap("SANs")
    public String SANs;

    /**
     * <p>The name of the organization. Default value: Alibaba Inc.</p>
     */
    @NameInMap("State")
    public String state;

    public static CreateCdnCertificateSigningRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnCertificateSigningRequestRequest self = new CreateCdnCertificateSigningRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnCertificateSigningRequestRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateCdnCertificateSigningRequestRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateCdnCertificateSigningRequestRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateCdnCertificateSigningRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCdnCertificateSigningRequestRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateCdnCertificateSigningRequestRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateCdnCertificateSigningRequestRequest setSANs(String SANs) {
        this.SANs = SANs;
        return this;
    }
    public String getSANs() {
        return this.SANs;
    }

    public CreateCdnCertificateSigningRequestRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
