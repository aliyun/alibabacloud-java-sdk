// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCustomCertificateRequest extends TeaModel {
    /**
     * <p>Pass-through parameters.</p>
     */
    @NameInMap("ApiPassthrough")
    public CreateCustomCertificateRequestApiPassthrough apiPassthrough;

    /**
     * <p>The content of the CSR. You can generate a CSR using tools such as OpenSSL or Keytool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">Create a CSR file</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * ...
     * ...
     * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
     * -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>Specifies whether to include a CRL address.</p>
     * <ul>
     * <li><p>0 - No</p>
     * </li>
     * <li><p>1 - Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableCrl")
    public Long enableCrl;

    /**
     * <p>Obtain the certificate immediately.</p>
     * <ul>
     * <li><p>0 - Issue the certificate asynchronously.</p>
     * </li>
     * <li><p>1 - Issue the certificate immediately.</p>
     * </li>
     * <li><p>2 - Issue the certificate immediately and return the CA certificate chain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Immediately")
    public Integer immediately;

    /**
     * <p>The identifier of the CA certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ed4068c-6f1b-6deb-8e32-3f8439a851cb</p>
     */
    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <p>The ID of the resource group. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateCustomCertificateRequestTags> tags;

    /**
     * <p>The validity period of the certificate. This period cannot exceed the validity period of the instance. You can use relative time or absolute time.</p>
     * <p>Relative time: Supports years, months, and days.</p>
     * <ul>
     * <li><p>Year - y</p>
     * </li>
     * <li><p>Month - m</p>
     * </li>
     * <li><p>Day - d</p>
     * </li>
     * </ul>
     * <p>Absolute time: Uses GMT. Format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code></p>
     * <ul>
     * <li><p>Specify the end time - $NotAfter</p>
     * </li>
     * <li><p>Specify the start and end times - $NotBefore/$NotAfter</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>相对时间：
     * ● 1y
     * ● 3m
     * ● 7d</p>
     * <p>绝对时间：
     * ● 2006-01-02T15:04:05Z
     * ● 2006-01-02T15:04:05Z/2023-03-09T17:48:13Z</p>
     */
    @NameInMap("Validity")
    public String validity;

    /**
     * <p>A custom identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX068c-6f1b-6deb-8e32-3f8439a8XXX</p>
     */
    @NameInMap("customIdentifier")
    public String customIdentifier;

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

    public CreateCustomCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCustomCertificateRequest setTags(java.util.List<CreateCustomCertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateCustomCertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateCustomCertificateRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public CreateCustomCertificateRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public static class CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage extends TeaModel {
        /**
         * <p>Content commitment. Formerly known as NonRepudiation. Allows the certificate key to be used for content commitment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContentCommitment")
        public Boolean contentCommitment;

        /**
         * <p>Data encipherment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DataEncipherment")
        public Boolean dataEncipherment;

        /**
         * <p>When KeyAgreement is true, this marks that the certificate key can only be used for decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DecipherOnly")
        public Boolean decipherOnly;

        /**
         * <p>Digital signature. Allows the private key of the certificate to be used for digital signatures and the public key to be used to verify digital signatures.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DigitalSignature")
        public Boolean digitalSignature;

        /**
         * <p>When KeyAgreement is true, this marks that the certificate key can only be used for encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EncipherOnly")
        public Boolean encipherOnly;

        /**
         * <p>Key agreement.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeyAgreement")
        public Boolean keyAgreement;

        /**
         * <p>Key encipherment. Allows the certificate key to be used to encrypt other keys.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeyEncipherment")
        public Boolean keyEncipherment;

        /**
         * <p>Non-repudiation. This has been renamed to ContentCommitment in the X.509 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The following values are allowed:</p>
         * <ul>
         * <li><p>rfc822Name - Email address</p>
         * </li>
         * <li><p>dNSName - Domain name</p>
         * </li>
         * <li><p>uniformResourceIdentifier - Uniform Resource Identifier (URI)</p>
         * </li>
         * <li><p>iPAddress - IP address</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dNSName</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A value that matches the specified Type.</p>
         * 
         * <strong>example:</strong>
         * <p>rfc822Name:
         * example.aliyundoc.com</p>
         * <p>dNSName:
         * learn.aliyundoc.com</p>
         * <p>uniformResourceIdentifier:
         * acs:ecs:regionid:15619224785*****:instance/i-bp1bzvz55uz27hf*****</p>
         * <p>iPAddress:
         * 127.0.0.1</p>
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
         * <p>If an extension is critical, its name is included in the criticals list.</p>
         */
        @NameInMap("Criticals")
        public java.util.List<String> criticals;

        /**
         * <p>The extended key usages.</p>
         */
        @NameInMap("ExtendedKeyUsages")
        public java.util.List<String> extendedKeyUsages;

        /**
         * <p>The key usage.</p>
         */
        @NameInMap("KeyUsage")
        public CreateCustomCertificateRequestApiPassthroughExtensionsKeyUsage keyUsage;

        /**
         * <p>The subject alternative names (SANs) of the certificate.</p>
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
         * <p>The key of the custom property. It must comply with industry standards. Examples:</p>
         * <ul>
         * <li><p>2.5.4.6: Country code</p>
         * </li>
         * <li><p>2.5.4.10: Organization</p>
         * </li>
         * <li><p>2.5.4.11: Organizational unit name</p>
         * </li>
         * <li><p>2.5.4.12: Title</p>
         * </li>
         * <li><p>2.5.4.3: Common name</p>
         * </li>
         * <li><p>2.5.4.9: Street</p>
         * </li>
         * <li><p>2.5.4.5: Serial number</p>
         * </li>
         * <li><p>2.5.4.7: Locality</p>
         * </li>
         * <li><p>2.5.4.8: State or province</p>
         * </li>
         * <li><p>1.3.6.1.4.1.37244.1.1: Matter certificate - Node ID</p>
         * </li>
         * <li><p>1.3.6.1.4.1.37244.1.5: Matter certificate - Fabric ID</p>
         * </li>
         * <li><p>1.3.6.1.4.1.37244.2.1: Matter certificate Vendor ID (VID)</p>
         * </li>
         * <li><p>1.3.6.1.4.1.37244.2.2: Matter certificate Product ID (PID)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.5.4.3</p>
         */
        @NameInMap("ObjectIdentifier")
        public String objectIdentifier;

        /**
         * <p>The value of the custom property.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
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
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The country code. Use the two-letter country code from ISO 3166-1. For more information, see <a href="https://www.iso.org/obp/ui/#search/code/">ISO</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The custom subject properties of the certificate.</p>
         */
        @NameInMap("CustomAttributes")
        public java.util.List<CreateCustomCertificateRequestApiPassthroughSubjectCustomAttributes> customAttributes;

        /**
         * <p>The name of the city where the organization is located. Chinese characters and letters are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The name of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX公司</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department or branch within the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX部门</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The province or state where the organization is located.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省</p>
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
         * <p>The certificate extensions.</p>
         */
        @NameInMap("Extensions")
        public CreateCustomCertificateRequestApiPassthroughExtensions extensions;

        /**
         * <p>The custom serial number of the certificate. Must be a long integer.</p>
         * 
         * <strong>example:</strong>
         * <p>16889526086333</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The certificate subject.</p>
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

    public static class CreateCustomCertificateRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCustomCertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCertificateRequestTags self = new CreateCustomCertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateCustomCertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCustomCertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
