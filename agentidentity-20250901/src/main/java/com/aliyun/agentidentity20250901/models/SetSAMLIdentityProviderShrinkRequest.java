// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderShrinkRequest extends TeaModel {
    /**
     * <p>The IdP identifier. This is the EntityID from the SAML metadata of the external IdP.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The enabling status of Just-In-Time (JIT) user synchronization and creation. Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled. If a user with the same name does not exist in the user pool during SAML logon, automatic creation is performed.</li>
     * <li>Disabled: Shutdown. If the user is not found, the logon is failed. Default value.</li>
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
     * <li>Enabled: The update is enabled. If a user with the same name exists during SAML logon, the user information is updated based on the attributes (DisplayName and Description) passed by the IdP.</li>
     * <li>Disabled: The update is disabled. Only the logon state is updated, and user attributes are not updated. Default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("JITUpdateStatus")
    public String JITUpdateStatus;

    /**
     * <p>The IdP logon URL. When a user logs on, the browser is redirected to this URL to complete SAML authentication.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/sso/saml">https://idp.example.com/sso/saml</a></p>
     */
    @NameInMap("LoginURL")
    public String loginURL;

    /**
     * <p>The SAML protocol binding type. Valid values:</p>
     * <ul>
     * <li>HTTP-Redirect: AuthnRequest is sent by using HTTP redirect. Default value.</li>
     * <li>HTTP-POST: AuthnRequest is sent by using HTTP POST.</li>
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
     * <li>Enabled: SAML SSO is enabled, and users can log on through an external IdP.</li>
     * <li>Disabled: SAML SSO is disabled, and users cannot log on through the IdP. Default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SSOStatus")
    public String SSOStatus;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    /**
     * <p>The list of X.509 certificates in PEM format. If you specify this parameter, all existing certificates are replaced.</p>
     */
    @NameInMap("X509Certificates")
    public String x509CertificatesShrink;

    public static SetSAMLIdentityProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSAMLIdentityProviderShrinkRequest self = new SetSAMLIdentityProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetSAMLIdentityProviderShrinkRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SetSAMLIdentityProviderShrinkRequest setJITProvisionStatus(String JITProvisionStatus) {
        this.JITProvisionStatus = JITProvisionStatus;
        return this;
    }
    public String getJITProvisionStatus() {
        return this.JITProvisionStatus;
    }

    public SetSAMLIdentityProviderShrinkRequest setJITUpdateStatus(String JITUpdateStatus) {
        this.JITUpdateStatus = JITUpdateStatus;
        return this;
    }
    public String getJITUpdateStatus() {
        return this.JITUpdateStatus;
    }

    public SetSAMLIdentityProviderShrinkRequest setLoginURL(String loginURL) {
        this.loginURL = loginURL;
        return this;
    }
    public String getLoginURL() {
        return this.loginURL;
    }

    public SetSAMLIdentityProviderShrinkRequest setSAMLBindingType(String SAMLBindingType) {
        this.SAMLBindingType = SAMLBindingType;
        return this;
    }
    public String getSAMLBindingType() {
        return this.SAMLBindingType;
    }

    public SetSAMLIdentityProviderShrinkRequest setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
        return this;
    }
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    public SetSAMLIdentityProviderShrinkRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public SetSAMLIdentityProviderShrinkRequest setX509CertificatesShrink(String x509CertificatesShrink) {
        this.x509CertificatesShrink = x509CertificatesShrink;
        return this;
    }
    public String getX509CertificatesShrink() {
        return this.x509CertificatesShrink;
    }

}
