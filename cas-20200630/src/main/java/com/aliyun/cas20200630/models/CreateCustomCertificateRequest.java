// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCustomCertificateRequest extends TeaModel {
    @NameInMap("ApiPassthrough")
    public CreateCustomCertificateRequestApiPassthrough apiPassthrough;

    @NameInMap("Csr")
    public String csr;

    @NameInMap("Immediately")
    public Integer immediately;

    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    @NameInMap("Validity")
    public String validity;

    public static CreateCustomCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCertificateRequest self = new CreateCustomCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomCertificateRequest setApiPassthrough(CreateCustomCertificateRequestApiPassthrough apiPassthrough) {
        this.apiPassthrough = apiPassthrough;
        return this;
    }
    public CreateCustomCertificateRequestApiPassthrough getApiPassthrough() {
        return this.apiPassthrough;
    }

    public CreateCustomCertificateRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCustomCertificateRequest setImmediately(Integer immediately) {
        this.immediately = immediately;
        return this;
    }
    public Integer getImmediately() {
        return this.immediately;
    }

    public CreateCustomCertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateCustomCertificateRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public static class CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage extends TeaModel {
        @NameInMap("ContentCommitment")
        public Boolean contentCommitment;

        @NameInMap("DataEncipherment")
        public Boolean dataEncipherment;

        @NameInMap("DecipherOnly")
        public Boolean decipherOnly;

        @NameInMap("DigitalSignature")
        public Boolean digitalSignature;

        @NameInMap("EncipherOnly")
        public Boolean encipherOnly;

        @NameInMap("KeyAgreement")
        public Boolean keyAgreement;

        @NameInMap("KeyEncipherment")
        public Boolean keyEncipherment;

        @NameInMap("NonRepudiation")
        public Boolean nonRepudiation;

        public static CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage self = new CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setContentCommitment(Boolean contentCommitment) {
            this.contentCommitment = contentCommitment;
            return this;
        }
        public Boolean getContentCommitment() {
            return this.contentCommitment;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setDataEncipherment(Boolean dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }
        public Boolean getDataEncipherment() {
            return this.dataEncipherment;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setDecipherOnly(Boolean decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }
        public Boolean getDecipherOnly() {
            return this.decipherOnly;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setDigitalSignature(Boolean digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }
        public Boolean getDigitalSignature() {
            return this.digitalSignature;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setEncipherOnly(Boolean encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }
        public Boolean getEncipherOnly() {
            return this.encipherOnly;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setKeyAgreement(Boolean keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }
        public Boolean getKeyAgreement() {
            return this.keyAgreement;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setKeyEncipherment(Boolean keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }
        public Boolean getKeyEncipherment() {
            return this.keyEncipherment;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage setNonRepudiation(Boolean nonRepudiation) {
            this.nonRepudiation = nonRepudiation;
            return this;
        }
        public Boolean getNonRepudiation() {
            return this.nonRepudiation;
        }

    }

    public static class CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames self = new CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCustomCertificateRequestApiPassthroughExtensions extends TeaModel {
        @NameInMap("ExtendedKeyUsages")
        public java.util.List<String> extendedKeyUsages;

        @NameInMap("KeyUsage")
        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage keyUsage;

        @NameInMap("SubjectAlternativeNames")
        public java.util.List<CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames> subjectAlternativeNames;

        public static CreateCustomCertificateRequestApiPassthroughExtensions build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughExtensions self = new CreateCustomCertificateRequestApiPassthroughExtensions();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughExtensions setExtendedKeyUsages(java.util.List<String> extendedKeyUsages) {
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }
        public java.util.List<String> getExtendedKeyUsages() {
            return this.extendedKeyUsages;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensions setKeyUsage(CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage getKeyUsage() {
            return this.keyUsage;
        }

        public CreateCustomCertificateRequestApiPassthroughExtensions setSubjectAlternativeNames(java.util.List<CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public java.util.List<CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

    }

    public static class CreateCustomCertificateRequestApiPassthroughSubject extends TeaModel {
        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("Country")
        public String country;

        @NameInMap("Locality")
        public String locality;

        @NameInMap("Organization")
        public String organization;

        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        @NameInMap("State")
        public String state;

        public static CreateCustomCertificateRequestApiPassthroughSubject build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughSubject self = new CreateCustomCertificateRequestApiPassthroughSubject();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public CreateCustomCertificateRequestApiPassthroughSubject setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class CreateCustomCertificateRequestApiPassthrough extends TeaModel {
        @NameInMap("Extensions")
        public CreateCustomCertificateRequestApiPassthroughExtensions extensions;

        @NameInMap("Subject")
        public CreateCustomCertificateRequestApiPassthroughSubject subject;

        public static CreateCustomCertificateRequestApiPassthrough build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthrough self = new CreateCustomCertificateRequestApiPassthrough();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthrough setExtensions(CreateCustomCertificateRequestApiPassthroughExtensions extensions) {
            this.extensions = extensions;
            return this;
        }
        public CreateCustomCertificateRequestApiPassthroughExtensions getExtensions() {
            return this.extensions;
        }

        public CreateCustomCertificateRequestApiPassthrough setSubject(CreateCustomCertificateRequestApiPassthroughSubject subject) {
            this.subject = subject;
            return this;
        }
        public CreateCustomCertificateRequestApiPassthroughSubject getSubject() {
            return this.subject;
        }

    }

}
