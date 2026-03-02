// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsRequest extends TeaModel {
    /**
     * <p>The signature algorithm that is supported by the Alibaba Cloud service provider (SP). Valid values:</p>
     * <ul>
     * <li><p>rsa-sha256</p>
     * </li>
     * <li><p>rsa-sha1 (default)</p>
     * </li>
     * </ul>
     */
    @NameInMap("AuthnSignAlgo")
    public String authnSignAlgo;

    /**
     * <p>The auxiliary domain name.</p>
     */
    @NameInMap("AuxiliaryDomain")
    public String auxiliaryDomain;

    /**
     * <p>The metadata file. The file must be Base64-encoded.</p>
     * <p>The file is provided by an identity provider (IdP) that supports the Security Assertion Markup Language (SAML) 2.0 protocol.</p>
     */
    @NameInMap("MetadataDocument")
    public String metadataDocument;

    /**
     * <p>Specifies whether to enable user-based SSO for Resource Access Management (RAM) users. Valid values:</p>
     * <ul>
     * <li><p>true: Enables user-based SSO.</p>
     * </li>
     * <li><p>false (default): Disables user-based SSO.</p>
     * </li>
     * </ul>
     */
    @NameInMap("SsoEnabled")
    public Boolean ssoEnabled;

    /**
     * <p>Specifies whether the <code>&lt;saml:NameID&gt;</code> element in a SAML response must contain a domain name when a user logs on using SAML-based SSO. This applies if the username that is specified on the IdP for logon matching contains a domain name suffix.</p>
     * <ul>
     * <li><p>If this parameter is set to <code>true</code>, the value of the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format, which includes a domain name suffix. The <code>domain</code> can be the default domain name or a domain alias if one is configured.</p>
     * </li>
     * <li><p>If this parameter is set to <code>false</code>, the value of the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be the <code>username</code> only. The value <strong>must not</strong> contain the <code>domain</code> part.</p>
     * </li>
     * </ul>
     * <p>The default value is <code>true</code>.</p>
     */
    @NameInMap("SsoLoginWithDomain")
    public Boolean ssoLoginWithDomain;

    public static SetUserSsoSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsRequest self = new SetUserSsoSettingsRequest();
        return TeaModel.build(map, self);
    }

    public SetUserSsoSettingsRequest setAuthnSignAlgo(String authnSignAlgo) {
        this.authnSignAlgo = authnSignAlgo;
        return this;
    }
    public String getAuthnSignAlgo() {
        return this.authnSignAlgo;
    }

    public SetUserSsoSettingsRequest setAuxiliaryDomain(String auxiliaryDomain) {
        this.auxiliaryDomain = auxiliaryDomain;
        return this;
    }
    public String getAuxiliaryDomain() {
        return this.auxiliaryDomain;
    }

    public SetUserSsoSettingsRequest setMetadataDocument(String metadataDocument) {
        this.metadataDocument = metadataDocument;
        return this;
    }
    public String getMetadataDocument() {
        return this.metadataDocument;
    }

    public SetUserSsoSettingsRequest setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
        return this;
    }
    public Boolean getSsoEnabled() {
        return this.ssoEnabled;
    }

    public SetUserSsoSettingsRequest setSsoLoginWithDomain(Boolean ssoLoginWithDomain) {
        this.ssoLoginWithDomain = ssoLoginWithDomain;
        return this;
    }
    public Boolean getSsoLoginWithDomain() {
        return this.ssoLoginWithDomain;
    }

}
