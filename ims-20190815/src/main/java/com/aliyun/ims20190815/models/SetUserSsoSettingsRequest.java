// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsRequest extends TeaModel {
    /**
     * <p>The auxiliary domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("AuxiliaryDomain")
    public String auxiliaryDomain;

    /**
     * <p>The metadata file, which is Base64-encoded.</p>
     * <p>The file is provided by an identity provider (IdP) that supports Security Assertion Markup Language (SAML) 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>PD94bWwgdmVy****</p>
     */
    @NameInMap("MetadataDocument")
    public String metadataDocument;

    /**
     * <p>Specifies whether to enable SSO for the RAM user. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SsoEnabled")
    public Boolean ssoEnabled;

    /**
     * <p>Specifies whether the SAML SSO requires a domain name in the <code>&lt;saml:NameID&gt;</code> element of the SAML response. If yes, the username specified by the IdP for SSO must have a domain name as the suffix.</p>
     * <ul>
     * <li>If the value of the parameter is <code>true</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format. You can set <code>domain</code> to the default domain name or the configured domain alias.</li>
     * <li>If the value of the parameter is <code>false</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username</code> format and <strong>cannot</strong> contain the <code>domain</code> suffix.</li>
     * </ul>
     * <p>Set the value to the default <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SsoLoginWithDomain")
    public Boolean ssoLoginWithDomain;

    public static SetUserSsoSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsRequest self = new SetUserSsoSettingsRequest();
        return TeaModel.build(map, self);
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
