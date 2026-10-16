// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed configuration of the identity provider.</p>
     */
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
        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The content of the X509 certificate in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDdz...
         * -----END CERTIFICATE-----</p>
         */
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
        /**
         * <p>The IdP identifier.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The enabling status of just-in-time (JIT) user provisioning. Valid values:</p>
         * <ul>
         * <li>Enabled: JIT user provisioning is enabled.</li>
         * <li>Disabled: JIT user provisioning is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("JITProvisionStatus")
        public String JITProvisionStatus;

        /**
         * <p>The enabling status of updating user information through synchronization. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("JITUpdateStatus")
        public String JITUpdateStatus;

        /**
         * <p>The logon URL of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso/saml">https://idp.example.com/sso/saml</a></p>
         */
        @NameInMap("LoginURL")
        public String loginURL;

        /**
         * <p>The SAML protocol binding type. Valid values:</p>
         * <ul>
         * <li>HTTP-Redirect</li>
         * <li>HTTP-POST</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("SAMLBindingType")
        public String SAMLBindingType;

        /**
         * <p>The enabling status of single sign-on (SSO). Valid values:</p>
         * <ul>
         * <li>Enabled: SSO is enabled.</li>
         * <li>Disabled: SSO is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSOStatus")
        public String SSOStatus;

        /**
         * <p>The list of X509 certificates.</p>
         */
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
