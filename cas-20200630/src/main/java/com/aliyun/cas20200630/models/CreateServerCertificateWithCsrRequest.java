// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateWithCsrRequest extends TeaModel {
    @NameInMap("AfterTime")
    public Long afterTime;

    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("BeforeTime")
    public Long beforeTime;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("Country")
    public String country;

    @NameInMap("Csr")
    public String csr;

    @NameInMap("Csr1")
    public String csr1;

    @NameInMap("Days")
    public Integer days;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Immediately")
    public Integer immediately;

    @NameInMap("Locality")
    public String locality;

    @NameInMap("Months")
    public Integer months;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    @NameInMap("State")
    public String state;

    @NameInMap("Years")
    public Integer years;

    public static CreateServerCertificateWithCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateWithCsrRequest self = new CreateServerCertificateWithCsrRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateWithCsrRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateServerCertificateWithCsrRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateServerCertificateWithCsrRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateServerCertificateWithCsrRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateServerCertificateWithCsrRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateServerCertificateWithCsrRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateServerCertificateWithCsrRequest setCsr1(String csr1) {
        this.csr1 = csr1;
        return this;
    }
    public String getCsr1() {
        return this.csr1;
    }

    public CreateServerCertificateWithCsrRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CreateServerCertificateWithCsrRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateServerCertificateWithCsrRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateServerCertificateWithCsrRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateServerCertificateWithCsrRequest setMonths(Integer months) {
        this.months = months;
        return this;
    }
    public Integer getMonths() {
        return this.months;
    }

    public CreateServerCertificateWithCsrRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateServerCertificateWithCsrRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateServerCertificateWithCsrRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateServerCertificateWithCsrRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateServerCertificateWithCsrRequest setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

}
