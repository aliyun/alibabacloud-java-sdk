// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSAMLIdentityProviderShrinkRequest extends TeaModel {
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

    @NameInMap("UserPoolName")
    public String userPoolName;

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
