// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestRequest extends TeaModel {
    // The city to which the organization belongs. Default value: Hangzhou.
    @NameInMap("City")
    public String city;

    // The Common Name of the SSL certificate.
    @NameInMap("CommonName")
    public String commonName;

    // The country to which the organization belongs. Default value: CN.
    @NameInMap("Country")
    public String country;

    // The email address that can be used to contact the organization.
    @NameInMap("Email")
    public String email;

    // The name of the organization. Default value: Alibaba Inc.
    @NameInMap("Organization")
    public String organization;

    // The name of the organization unit. Default value: Aliyun CDN.
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The Subject Alternative Name (SAN) extension of the SSL certificate. This extension is used to add domain names to the certificate. Separate multiple domain names with commas (,).
    @NameInMap("SANs")
    public String SANs;

    // The provincial district to which the organization belongs. Default value: Zhejiang.
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

    public CreateCdnCertificateSigningRequestRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
