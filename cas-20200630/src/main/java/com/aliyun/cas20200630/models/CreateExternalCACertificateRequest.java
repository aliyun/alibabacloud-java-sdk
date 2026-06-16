// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateRequest extends TeaModel {
    /**
     * <p>Specifies API parameters that override content from the CSR or add information to the CA certificate.</p>
     */
    @NameInMap("ApiPassthrough")
    public CreateExternalCACertificateRequestApiPassthrough apiPassthrough;

    @NameInMap("CertMaxTime")
    public Integer certMaxTime;

    /**
     * <p>The certificate signing request (CSR). The CSR can contain information such as the SubjectDN and custom extensions for the CA certificate. The CA generates the SubjectKeyIdentifier, AuthorityKeyIdentifier, and CRLDistributionPoints extensions, ignoring any corresponding values in the CSR.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
     * -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The ID of the external subordinate CA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_deposit-cn-1234abcd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags to add to the certificate.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateExternalCACertificateRequestTags> tags;

    /**
     * <p>The certificate validity period. You can specify this using either relative or absolute time.</p>
     * <blockquote>
     * <p>Relative time: Supported units are year, month, and day.</p>
     * </blockquote>
     * <ul>
     * <li><p>y - year</p>
     * </li>
     * <li><p>m - month</p>
     * </li>
     * <li><p>d - day</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Absolute time: Use GMT time in the <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code> format.</p>
     * </blockquote>
     * <ul>
     * <li><p>To specify only the expiration time, use <code>$NotAfter</code>.</p>
     * </li>
     * <li><p>To specify both the start and expiration times, use <code>$NotBefore/$NotAfter</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10y</p>
     */
    @NameInMap("Validity")
    public String validity;

    public static CreateExternalCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateRequest self = new CreateExternalCACertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateRequest setApiPassthrough(CreateExternalCACertificateRequestApiPassthrough apiPassthrough) {
        this.apiPassthrough = apiPassthrough;
        return this;
    }
    public CreateExternalCACertificateRequestApiPassthrough getApiPassthrough() {
        return this.apiPassthrough;
    }

    public CreateExternalCACertificateRequest setCertMaxTime(Integer certMaxTime) {
        this.certMaxTime = certMaxTime;
        return this;
    }
    public Integer getCertMaxTime() {
        return this.certMaxTime;
    }

    public CreateExternalCACertificateRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateExternalCACertificateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExternalCACertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExternalCACertificateRequest setTags(java.util.List<CreateExternalCACertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateExternalCACertificateRequestTags> getTags() {
        return this.tags;
    }

    public CreateExternalCACertificateRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public static class CreateExternalCACertificateRequestApiPassthroughExtensions extends TeaModel {
        /**
         * <p>The extended key usages.</p>
         */
        @NameInMap("ExtendedKeyUsages")
        public java.util.List<String> extendedKeyUsages;

        /**
         * <p>The certificate path length constraint. For an end-entity CA, set this parameter to 0. A value of 0 indicates the CA will issue end-entity certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PathLenConstraint")
        public Integer pathLenConstraint;

        public static CreateExternalCACertificateRequestApiPassthroughExtensions build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateRequestApiPassthroughExtensions self = new CreateExternalCACertificateRequestApiPassthroughExtensions();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateRequestApiPassthroughExtensions setExtendedKeyUsages(java.util.List<String> extendedKeyUsages) {
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }
        public java.util.List<String> getExtendedKeyUsages() {
            return this.extendedKeyUsages;
        }

        public CreateExternalCACertificateRequestApiPassthroughExtensions setPathLenConstraint(Integer pathLenConstraint) {
            this.pathLenConstraint = pathLenConstraint;
            return this;
        }
        public Integer getPathLenConstraint() {
            return this.pathLenConstraint;
        }

    }

    public static class CreateExternalCACertificateRequestApiPassthroughSubject extends TeaModel {
        /**
         * <p>The name of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Testing CA</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The two-letter country code (ISO 3166-1).</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The city or region.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The organization or company.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The organizational subdivision, such as a department, team, project group, or branch.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud Security</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The state or province.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("State")
        public String state;

        public static CreateExternalCACertificateRequestApiPassthroughSubject build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateRequestApiPassthroughSubject self = new CreateExternalCACertificateRequestApiPassthroughSubject();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public CreateExternalCACertificateRequestApiPassthroughSubject setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class CreateExternalCACertificateRequestApiPassthrough extends TeaModel {
        /**
         * <p>Specifies the extensions for the CA certificate. If specified, these values override the corresponding extensions in the CSR or are added to the CA certificate.</p>
         */
        @NameInMap("Extensions")
        public CreateExternalCACertificateRequestApiPassthroughExtensions extensions;

        /**
         * <p>The subject information for the CA certificate. If specified, this value overwrites the SubjectDN from the CSR.</p>
         */
        @NameInMap("Subject")
        public CreateExternalCACertificateRequestApiPassthroughSubject subject;

        public static CreateExternalCACertificateRequestApiPassthrough build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateRequestApiPassthrough self = new CreateExternalCACertificateRequestApiPassthrough();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateRequestApiPassthrough setExtensions(CreateExternalCACertificateRequestApiPassthroughExtensions extensions) {
            this.extensions = extensions;
            return this;
        }
        public CreateExternalCACertificateRequestApiPassthroughExtensions getExtensions() {
            return this.extensions;
        }

        public CreateExternalCACertificateRequestApiPassthrough setSubject(CreateExternalCACertificateRequestApiPassthroughSubject subject) {
            this.subject = subject;
            return this;
        }
        public CreateExternalCACertificateRequestApiPassthroughSubject getSubject() {
            return this.subject;
        }

    }

    public static class CreateExternalCACertificateRequestTags extends TeaModel {
        /**
         * <p>The tag\&quot;s key.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag\&quot;s value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateExternalCACertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateRequestTags self = new CreateExternalCACertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExternalCACertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
