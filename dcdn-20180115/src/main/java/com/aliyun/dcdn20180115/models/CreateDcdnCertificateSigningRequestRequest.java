// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnCertificateSigningRequestRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("Country")
    public String country;

    @NameInMap("Email")
    public String email;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    @NameInMap("SANs")
    public String SANs;

    @NameInMap("State")
    public String state;

    public static CreateDcdnCertificateSigningRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnCertificateSigningRequestRequest self = new CreateDcdnCertificateSigningRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnCertificateSigningRequestRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateDcdnCertificateSigningRequestRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateDcdnCertificateSigningRequestRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateDcdnCertificateSigningRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateDcdnCertificateSigningRequestRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateDcdnCertificateSigningRequestRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateDcdnCertificateSigningRequestRequest setSANs(String SANs) {
        this.SANs = SANs;
        return this;
    }
    public String getSANs() {
        return this.SANs;
    }

    public CreateDcdnCertificateSigningRequestRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
