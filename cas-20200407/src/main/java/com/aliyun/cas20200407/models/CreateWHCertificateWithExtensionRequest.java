// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHCertificateWithExtensionRequest extends TeaModel {
    @NameInMap("AfterTime")
    public Long afterTime;

    @NameInMap("AlgorithmKeySize")
    public String algorithmKeySize;

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

    public static CreateWHCertificateWithExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWHCertificateWithExtensionRequest self = new CreateWHCertificateWithExtensionRequest();
        return TeaModel.build(map, self);
    }

    public CreateWHCertificateWithExtensionRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateWHCertificateWithExtensionRequest setAlgorithmKeySize(String algorithmKeySize) {
        this.algorithmKeySize = algorithmKeySize;
        return this;
    }
    public String getAlgorithmKeySize() {
        return this.algorithmKeySize;
    }

    public CreateWHCertificateWithExtensionRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateWHCertificateWithExtensionRequest setAppendCrl(Boolean appendCrl) {
        this.appendCrl = appendCrl;
        return this;
    }
    public Boolean getAppendCrl() {
        return this.appendCrl;
    }

    public CreateWHCertificateWithExtensionRequest setBasicConstraintsCritical(Boolean basicConstraintsCritical) {
        this.basicConstraintsCritical = basicConstraintsCritical;
        return this;
    }
    public Boolean getBasicConstraintsCritical() {
        return this.basicConstraintsCritical;
    }

    public CreateWHCertificateWithExtensionRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateWHCertificateWithExtensionRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateWHCertificateWithExtensionRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateWHCertificateWithExtensionRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateWHCertificateWithExtensionRequest setCsrPemString(String csrPemString) {
        this.csrPemString = csrPemString;
        return this;
    }
    public String getCsrPemString() {
        return this.csrPemString;
    }

    public CreateWHCertificateWithExtensionRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateWHCertificateWithExtensionRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateWHCertificateWithExtensionRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateWHCertificateWithExtensionRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateWHCertificateWithExtensionRequest setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public CreateWHCertificateWithExtensionRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
