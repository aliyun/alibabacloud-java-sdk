// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateRequest extends TeaModel {
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

    @NameInMap("Days")
    public Long days;

    @NameInMap("Immediately")
    public Long immediately;

    @NameInMap("Locality")
    public String locality;

    @NameInMap("Months")
    public Long months;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    @NameInMap("SanType")
    public Long sanType;

    @NameInMap("SanValue")
    public String sanValue;

    @NameInMap("State")
    public String state;

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
