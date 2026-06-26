// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SSOIdentityProviderConfiguration")
    public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration SSOIdentityProviderConfiguration;

    public static GetSAMLIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLIdentityProviderResponseBody self = new GetSAMLIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSAMLIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSAMLIdentityProviderResponseBody setSSOIdentityProviderConfiguration(GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration SSOIdentityProviderConfiguration) {
        this.SSOIdentityProviderConfiguration = SSOIdentityProviderConfiguration;
        return this;
    }
    public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration getSSOIdentityProviderConfiguration() {
        return this.SSOIdentityProviderConfiguration;
    }

    public static class GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates build(java.util.Map<String, ?> map) throws Exception {
            GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates self = new GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates();
            return TeaModel.build(map, self);
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

    public static class GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration extends TeaModel {
        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("JITProvisionStatus")
        public String JITProvisionStatus;

        @NameInMap("JITUpdateStatus")
        public String JITUpdateStatus;

        @NameInMap("LoginURL")
        public String loginURL;

        @NameInMap("SAMLBindingType")
        public String SAMLBindingType;

        @NameInMap("SSOStatus")
        public String SSOStatus;

        @NameInMap("X509Certificates")
        public java.util.List<GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> x509Certificates;

        public static GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration self = new GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setJITProvisionStatus(String JITProvisionStatus) {
            this.JITProvisionStatus = JITProvisionStatus;
            return this;
        }
        public String getJITProvisionStatus() {
            return this.JITProvisionStatus;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setJITUpdateStatus(String JITUpdateStatus) {
            this.JITUpdateStatus = JITUpdateStatus;
            return this;
        }
        public String getJITUpdateStatus() {
            return this.JITUpdateStatus;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setLoginURL(String loginURL) {
            this.loginURL = loginURL;
            return this;
        }
        public String getLoginURL() {
            return this.loginURL;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setSAMLBindingType(String SAMLBindingType) {
            this.SAMLBindingType = SAMLBindingType;
            return this;
        }
        public String getSAMLBindingType() {
            return this.SAMLBindingType;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        public GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setX509Certificates(java.util.List<GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<GetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> getX509Certificates() {
            return this.x509Certificates;
        }

    }

}
