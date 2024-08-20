// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnCertificateSigningRequestRequest extends TeaModel {
    /**
     * <p>The city. Default value: Hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The Common Name of the certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The country or region in which the organization is located. Default value: CN.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyundoc.com">test@aliyundoc.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The name of the organization. Default value: Alibaba Inc.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Inc</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>The name of the department. Default value: Aliyun CDN.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun CDN</p>
     */
    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>The Subject Alternative Name (SAN) extension that allows multiple domain names to be associated with the certificate. Separate multiple domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.org</p>
     */
    @NameInMap("SANs")
    public String SANs;

    /**
     * <p>The provincial district. Default value: Zhejiang.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
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
