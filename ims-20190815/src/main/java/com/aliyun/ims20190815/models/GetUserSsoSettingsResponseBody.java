// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user-based SSO settings.</p>
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
         * <p>The signature algorithm supported by the Alibaba Cloud service provider (SP). Valid values:</p>
         * <ul>
         * <li><p>rsa-sha256</p>
         * </li>
         * <li><p>rsa-sha1</p>
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
         * <p>The metadata file. The value is Base64-encoded.</p>
         */
        @NameInMap("MetadataDocument")
        public String metadataDocument;

        /**
         * <p>Indicates whether user-based SSO is enabled.</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>Specifies whether the <code>&lt;saml:NameID&gt;</code> element in a SAML response must contain a domain name when a user logs on using SAML SSO. The username for SSO logon matching is specified on the identity provider (IdP) side.</p>
         * <ul>
         * <li><p>If this parameter is set to <code>true</code>, the value of the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format. The <code>domain</code> can be the default domain name or a domain alias, if a domain alias is configured.</p>
         * </li>
         * <li><p>If this parameter is set to <code>false</code>, the value of the <code>&lt;saml:NameID&gt;</code> element \<em>\<em>must\</em>\</em> contain only the \<code>username\\</code> and \<em>\<em>must not\</em>\</em> contain the \<code>domain\\</code> part.</p>
         * </li>
         * </ul>
         * <p>The default value is <code>true</code>.</p>
         */
        @NameInMap("SsoLoginWithDomain")
        public Boolean ssoLoginWithDomain;

        public static GetUserSsoSettingsResponseBodyUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            GetUserSsoSettingsResponseBodyUserSsoSettings self = new GetUserSsoSettingsResponseBodyUserSsoSettings();
            return TeaModel.build(map, self);
        }

        public GetUserSsoSettingsResponseBodyUserSsoSettings setAuthnSignAlgo(String authnSignAlgo) {
            this.authnSignAlgo = authnSignAlgo;
            return this;
        }
        public String getAuthnSignAlgo() {
            return this.authnSignAlgo;
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
