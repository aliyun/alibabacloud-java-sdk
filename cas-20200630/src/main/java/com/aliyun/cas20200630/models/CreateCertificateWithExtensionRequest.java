// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCertificateWithExtensionRequest extends TeaModel {
    @NameInMap("AfterTime")
    public Long afterTime;

    @NameInMap("AlgorithmKeySize")
    public Integer algorithmKeySize;

    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("AppendCrl")
    public Boolean appendCrl;

    @NameInMap("BasicConstraintsCritical")
    public Boolean basicConstraintsCritical;

    @NameInMap("BeforeTime")
    public Long beforeTime;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("CsrPemString")
    public String csrPemString;

    @NameInMap("Locality")
    public String locality;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    @NameInMap("Sans")
    public String sans;

    @NameInMap("State")
    public String state;

    public static CreateCertificateWithExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithExtensionRequest self = new CreateCertificateWithExtensionRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithExtensionRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateCertificateWithExtensionRequest setAlgorithmKeySize(Integer algorithmKeySize) {
        this.algorithmKeySize = algorithmKeySize;
        return this;
    }
    public Integer getAlgorithmKeySize() {
        return this.algorithmKeySize;
    }

    public CreateCertificateWithExtensionRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateCertificateWithExtensionRequest setAppendCrl(Boolean appendCrl) {
        this.appendCrl = appendCrl;
        return this;
    }
    public Boolean getAppendCrl() {
        return this.appendCrl;
    }

    public CreateCertificateWithExtensionRequest setBasicConstraintsCritical(Boolean basicConstraintsCritical) {
        this.basicConstraintsCritical = basicConstraintsCritical;
        return this;
    }
    public Boolean getBasicConstraintsCritical() {
        return this.basicConstraintsCritical;
    }

    public CreateCertificateWithExtensionRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateCertificateWithExtensionRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateCertificateWithExtensionRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateCertificateWithExtensionRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateCertificateWithExtensionRequest setCsrPemString(String csrPemString) {
        this.csrPemString = csrPemString;
        return this;
    }
    public String getCsrPemString() {
        return this.csrPemString;
    }

    public CreateCertificateWithExtensionRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateCertificateWithExtensionRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateCertificateWithExtensionRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateCertificateWithExtensionRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateCertificateWithExtensionRequest setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public CreateCertificateWithExtensionRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
