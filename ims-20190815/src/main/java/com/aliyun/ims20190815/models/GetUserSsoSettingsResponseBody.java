// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69FC3E5E-D3D9-434B-90CA-BBA8E0551A47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of user-based SSO.</p>
     */
    @NameInMap("UserSsoSettings")
    public GetUserSsoSettingsResponseBodyUserSsoSettings userSsoSettings;

    public static GetUserSsoSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserSsoSettingsResponseBody self = new GetUserSsoSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserSsoSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSsoSettingsResponseBody setUserSsoSettings(GetUserSsoSettingsResponseBodyUserSsoSettings userSsoSettings) {
        this.userSsoSettings = userSsoSettings;
        return this;
    }
    public GetUserSsoSettingsResponseBodyUserSsoSettings getUserSsoSettings() {
        return this.userSsoSettings;
    }

    public static class GetUserSsoSettingsResponseBodyUserSsoSettings extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVy****</p>
         */
        @NameInMap("MetadataDocument")
        public String metadataDocument;

        /**
         * <p>Indicates whether user-based SSO is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>Indicates whether the Security Assertion Markup Language (SAML) SSO requires a domain name in the <code>&lt;saml:NameID&gt;</code> element of the SAML response. If yes, the username specified by the identity provider (IdP) for SSO must have a domain name as the suffix.</p>
         * <ul>
         * <li>If the value of the parameter is <code>true</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format. You can set <code>domain</code> to the default domain name or the configured domain alias.</li>
         * <li>If the value of the parameter is <code>false</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username</code> format and <strong>cannot</strong> contain the <code>domain</code> suffix.</li>
         * </ul>
         * <p>The default value is <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SsoLoginWithDomain")
        public Boolean ssoLoginWithDomain;

        public static GetUserSsoSettingsResponseBodyUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            GetUserSsoSettingsResponseBodyUserSsoSettings self = new GetUserSsoSettingsResponseBodyUserSsoSettings();
            return TeaModel.build(map, self);
        }

        public GetUserSsoSettingsResponseBodyUserSsoSettings setAuxiliaryDomain(String auxiliaryDomain) {
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }
        public String getAuxiliaryDomain() {
            return this.auxiliaryDomain;
        }

        public GetUserSsoSettingsResponseBodyUserSsoSettings setMetadataDocument(String metadataDocument) {
            this.metadataDocument = metadataDocument;
            return this;
        }
        public String getMetadataDocument() {
            return this.metadataDocument;
        }

        public GetUserSsoSettingsResponseBodyUserSsoSettings setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public GetUserSsoSettingsResponseBodyUserSsoSettings setSsoLoginWithDomain(Boolean ssoLoginWithDomain) {
            this.ssoLoginWithDomain = ssoLoginWithDomain;
            return this;
        }
        public Boolean getSsoLoginWithDomain() {
            return this.ssoLoginWithDomain;
        }

    }

}
