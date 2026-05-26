// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("JITProvisionStatus")
    public String JITProvisionStatus;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("JITUpdateStatus")
    public String JITUpdateStatus;

    /**
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/sso/saml">https://idp.example.com/sso/saml</a></p>
     */
    @NameInMap("LoginURL")
    public String loginURL;

    /**
     * <strong>example:</strong>
     * <p>HTTP-Redirect</p>
     */
    @NameInMap("SAMLBindingType")
    public String SAMLBindingType;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SSOStatus")
    public String SSOStatus;

    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    @NameInMap("X509Certificates")
    public java.util.List<String> x509Certificates;

    public static SetSAMLIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSAMLIdentityProviderRequest self = new SetSAMLIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public SetSAMLIdentityProviderRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SetSAMLIdentityProviderRequest setJITProvisionStatus(String JITProvisionStatus) {
        this.JITProvisionStatus = JITProvisionStatus;
        return this;
    }
    public String getJITProvisionStatus() {
        return this.JITProvisionStatus;
    }

    public SetSAMLIdentityProviderRequest setJITUpdateStatus(String JITUpdateStatus) {
        this.JITUpdateStatus = JITUpdateStatus;
        return this;
    }
    public String getJITUpdateStatus() {
        return this.JITUpdateStatus;
    }

    public SetSAMLIdentityProviderRequest setLoginURL(String loginURL) {
        this.loginURL = loginURL;
        return this;
    }
    public String getLoginURL() {
        return this.loginURL;
    }

    public SetSAMLIdentityProviderRequest setSAMLBindingType(String SAMLBindingType) {
        this.SAMLBindingType = SAMLBindingType;
        return this;
    }
    public String getSAMLBindingType() {
        return this.SAMLBindingType;
    }

    public SetSAMLIdentityProviderRequest setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
        return this;
    }
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    public SetSAMLIdentityProviderRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public SetSAMLIdentityProviderRequest setX509Certificates(java.util.List<String> x509Certificates) {
        this.x509Certificates = x509Certificates;
        return this;
    }
    public java.util.List<String> getX509Certificates() {
        return this.x509Certificates;
    }

}
