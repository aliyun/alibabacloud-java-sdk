// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SSOIdentityProviderConfiguration")
    public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration SSOIdentityProviderConfiguration;

    public static SetSAMLIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSAMLIdentityProviderResponseBody self = new SetSAMLIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSAMLIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSAMLIdentityProviderResponseBody setSSOIdentityProviderConfiguration(SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration SSOIdentityProviderConfiguration) {
        this.SSOIdentityProviderConfiguration = SSOIdentityProviderConfiguration;
        return this;
    }
    public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration getSSOIdentityProviderConfiguration() {
        return this.SSOIdentityProviderConfiguration;
    }

    public static class SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates build(java.util.Map<String, ?> map) throws Exception {
            SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates self = new SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates();
            return TeaModel.build(map, self);
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

    public static class SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration extends TeaModel {
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
        public java.util.List<SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> x509Certificates;

        public static SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration self = new SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setJITProvisionStatus(String JITProvisionStatus) {
            this.JITProvisionStatus = JITProvisionStatus;
            return this;
        }
        public String getJITProvisionStatus() {
            return this.JITProvisionStatus;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setJITUpdateStatus(String JITUpdateStatus) {
            this.JITUpdateStatus = JITUpdateStatus;
            return this;
        }
        public String getJITUpdateStatus() {
            return this.JITUpdateStatus;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setLoginURL(String loginURL) {
            this.loginURL = loginURL;
            return this;
        }
        public String getLoginURL() {
            return this.loginURL;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setSAMLBindingType(String SAMLBindingType) {
            this.SAMLBindingType = SAMLBindingType;
            return this;
        }
        public String getSAMLBindingType() {
            return this.SAMLBindingType;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        public SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfiguration setX509Certificates(java.util.List<SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<SetSAMLIdentityProviderResponseBodySSOIdentityProviderConfigurationX509Certificates> getX509Certificates() {
            return this.x509Certificates;
        }

    }

}
