// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestRequest extends TeaModel {
    /**
     * <p>The city. Default value: Hangzhou.</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The Common Name of the certificate.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country or region in which the organization is located. Default value: CN.</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The email address.</p>
     */
    @NameInMap("Email")
    public String email;

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
     * <p>The Subject Alternative Name (SAN) extension of the SSL certificate. This extension is used to add domain names to the certificate. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("SANs")
    public String SANs;

    /**
     * <p>The provincial district. Default value: Zhejiang.</p>
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
