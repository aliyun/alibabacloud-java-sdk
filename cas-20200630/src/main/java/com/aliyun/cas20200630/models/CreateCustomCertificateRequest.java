// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCustomCertificateRequest extends TeaModel {
    /**
     * <p>The passthrough parameters.</p>
     */
    @NameInMap("ApiPassthrough")
    public CreateCustomCertificateRequestApiPassthrough apiPassthrough;

    /**
     * <p>The content of the CSR. You can generate a CSR by using the OpenSSL tool or the Keytool tool. For more information, see [How do I create a CSR file?](~~42218~~)</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>include the CRL address.</p>
     * <br>
     * <p>- 0- No</p>
     * <p>- 1- Yes</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Specifies whether to immediately issue the certificate. Valid values:</p>
     * <br>
     * <p>*   0: asynchronously issues the certificate.</p>
     * <p>*   1: immediately issues the certificate.</p>
     * <p>*   2: immediately issues the certificate and returns the certificate chain.</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The identifier of the certificate.</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The validity period of the certificate. The value cannot exceed the validity period of the certificate instance. Relative time and absolute time are supported.</p>
     * <br>
     * <p>Units of relative time: year, month, and day.</p>
     * <br>
     * <p>*   Use y to specify years.</p>
     * <p>*   Use m to specify months.</p>
     * <p>*   Use d to specify days.</p>
     * <br>
     * <p>Absolute time: Use Greenwich Mean Time (GMT). Format: `yyyy-MM-dd\"T\"HH:mm:ss\"Z\"`</p>
     * <br>
     * <p>*   Format of the end time: $NotAfter</p>
     * <p>*   Format of the start time and end time: $NotBefore/$NotAfter</p>
     */
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

    public CreateCustomCertificateRequest setEnableCrl(Long enableCrl) {
        this.enableCrl = enableCrl;
        return this;
    }
    public Long getEnableCrl() {
        return this.enableCrl;
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
        /**
         * <p>The original name of the parameter is NonRepudiation.</p>
         */
        @NameInMap("ContentCommitment")
        public Boolean contentCommitment;

        /**
         * <p>Specifies whether the key can be used for data encryption.</p>
         */
        @NameInMap("DataEncipherment")
        public Boolean dataEncipherment;

        /**
         * <p>Specifies whether the key can be used only for data decryption.</p>
         */
        @NameInMap("DecipherOnly")
        public Boolean decipherOnly;

        /**
         * <p>Specifies whether the key can be used for digital signing. If you set this parameter to true, the private key of the certificate can be used to generate digital signatures, and the public key of the certificate can be used to verify digital signatures.</p>
         */
        @NameInMap("DigitalSignature")
        public Boolean digitalSignature;

        /**
         * <p>Specifies whether the key can be used only for data encryption.</p>
         */
        @NameInMap("EncipherOnly")
        public Boolean encipherOnly;

        /**
         * <p>Specifies whether the key can be used for key agreement.</p>
         */
        @NameInMap("KeyAgreement")
        public Boolean keyAgreement;

        /**
         * <p>Specifies whether the key can be used for data encipherment.</p>
         */
        @NameInMap("KeyEncipherment")
        public Boolean keyEncipherment;

        /**
         * <p>Specifies whether the key can be used for non-repudiation. This parameter is renamed ContentCommitment in the X.509 standard.</p>
         */
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
        /**
         * <p>The type of the alias. Valid values:</p>
         * <br>
         * <p>*   rfc822Name: email address</p>
         * <p>*   dNSName: domain name</p>
         * <p>*   uniformResourceIdentifier: URI</p>
         * <p>*   iPAddress: IP address</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The alias that meets the requirement of a specified type.</p>
         */
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
        /**
         * <p>If it is a necessary parameter, the critical list contains the parameter name.</p>
         */
        @NameInMap("Criticals")
        public java.util.List<String> criticals;

        /**
         * <p>The extended key usage.</p>
         */
        @NameInMap("ExtendedKeyUsages")
        public java.util.List<String> extendedKeyUsages;

        /**
         * <p>The key usage.</p>
         */
        @NameInMap("KeyUsage")
        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage keyUsage;

        /**
         * <p>The aliases of the entities.</p>
         */
        @NameInMap("SubjectAlternativeNames")
        public java.util.List<CreateCustomCertificateRequestApiPassthroughExtensionsSubjectAlternativeNames> subjectAlternativeNames;

        public static CreateCustomCertificateRequestApiPassthroughExtensions build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughExtensions self = new CreateCustomCertificateRequestApiPassthroughExtensions();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughExtensions setCriticals(java.util.List<String> criticals) {
            this.criticals = criticals;
            return this;
        }
        public java.util.List<String> getCriticals() {
            return this.criticals;
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

    public static class CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes extends TeaModel {
        /**
         * <p>Custom attribute type as:</p>
         * <br>
         * <p>- 2.5.4.6 : country</p>
         * <p>- 2.5.4.10 : organization</p>
         * <p>- 2.5.4.11 : organizational unit</p>
         * <p>- 2.5.4.12 : title</p>
         * <p>- 2.5.4.3 : common name</p>
         * <p>- 2.5.4.9 : street</p>
         * <p>- 2.5.4.5 : serial number</p>
         * <p>- 2.5.4.7 : locality</p>
         * <p>- 2.5.4.8 : state</p>
         * <p>- 1.3.6.1.4.1.37244.1.1 : Matter Operational Certificate - Node ID</p>
         * <p>- 1.3.6.1.4.1.37244.1.5 : Matter Operational Certificate - Fabric ID</p>
         * <p>- 1.3.6.1.4.1.37244.2.1 : Matter Device Attestation Certificate Vender ID (VID)</p>
         * <p>- 1.3.6.1.4.1.37244.2.2 : Matter Device Attestation Certificate Product ID (PID).</p>
         */
        @NameInMap("ObjectIdentifier")
        public String objectIdentifier;

        /**
         * <p>Custom attribute value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes self = new CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes setObjectIdentifier(String objectIdentifier) {
            this.objectIdentifier = objectIdentifier;
            return this;
        }
        public String getObjectIdentifier() {
            return this.objectIdentifier;
        }

        public CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCustomCertificateRequestApiPassthroughSubject extends TeaModel {
        /**
         * <p>The common name of the certificate user.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The code of the country. The value is an alpha-2 country code that complies with the ISO 3166-1 standard. For more information about country codes, visit <https://www.iso.org/obp/ui/#search/code/>.</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>Customize the Subject attributes of the certificate.</p>
         */
        @NameInMap("CustomAttributes")
        public java.util.List<CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes> customAttributes;

        /**
         * <p>The name of the city in which the organization is located. The value can contain letters.</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The name of the organization.</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department or branch in the organization.</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The name of the province or state in which the organization associated with the certificate is located.</p>
         */
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

        public CreateCustomCertificateRequestApiPassthroughSubject setCustomAttributes(java.util.List<CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.List<CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes> getCustomAttributes() {
            return this.customAttributes;
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
        /**
         * <p>The extensions of the certificate.</p>
         */
        @NameInMap("Extensions")
        public CreateCustomCertificateRequestApiPassthroughExtensions extensions;

        /**
         * <p>The serial number MUST be a positive integer assigned by the CA to each certificate.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The name of the entity that uses the certificate.</p>
         */
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

        public CreateCustomCertificateRequestApiPassthrough setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
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
