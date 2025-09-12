// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateRequest extends TeaModel {
    @NameInMap("ApiPassthrough")
    public CreateExternalCACertificateRequestApiPassthrough apiPassthrough;

    /**
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_deposit-cn-1234abcd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
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

    public CreateExternalCACertificateRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public static class CreateExternalCACertificateRequestApiPassthroughExtensions extends TeaModel {
        @NameInMap("ExtendedKeyUsages")
        public java.util.List<String> extendedKeyUsages;

        /**
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
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
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
        @NameInMap("Extensions")
        public CreateExternalCACertificateRequestApiPassthroughExtensions extensions;

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

}
