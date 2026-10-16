// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed configurations of the identity provider.</p>
     */
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
        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The content of the X.509 certificate in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDdz...
         * -----END CERTIFICATE-----</p>
         */
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
        /**
         * <p>The IdP identifier.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The enabling status of Just-In-Time (JIT) user provisioning. A value of Enabled indicates that JIT user provisioning is enabled, and a value of Disabled indicates that it is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("JITProvisionStatus")
        public String JITProvisionStatus;

        /**
         * <p>The enabling status of updating user information through synchronization. A value of Enabled indicates that the update is enabled, and a value of Disabled indicates that it is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("JITUpdateStatus")
        public String JITUpdateStatus;

        /**
         * <p>The IdP logon URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso/saml">https://idp.example.com/sso/saml</a></p>
         */
        @NameInMap("LoginURL")
        public String loginURL;

        /**
         * <p>The SAML protocol binding type. Valid values: HTTP-Redirect and HTTP-POST.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("SAMLBindingType")
        public String SAMLBindingType;

        /**
         * <p>The enabling status of single sign-on (SSO). A value of Enabled indicates that SSO is enabled, and a value of Disabled indicates that SSO is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSOStatus")
        public String SSOStatus;

        /**
         * <p>The list of X.509 certificates.</p>
         */
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
