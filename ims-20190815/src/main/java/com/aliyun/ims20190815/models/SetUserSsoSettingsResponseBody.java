// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user-based SSO settings.</p>
     */
    @NameInMap("UserSsoSettings")
    public SetUserSsoSettingsResponseBodyUserSsoSettings userSsoSettings;

    public static SetUserSsoSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsResponseBody self = new SetUserSsoSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserSsoSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetUserSsoSettingsResponseBody setUserSsoSettings(SetUserSsoSettingsResponseBodyUserSsoSettings userSsoSettings) {
        this.userSsoSettings = userSsoSettings;
        return this;
    }
    public SetUserSsoSettingsResponseBodyUserSsoSettings getUserSsoSettings() {
        return this.userSsoSettings;
    }

    public static class SetUserSsoSettingsResponseBodyUserSsoSettings extends TeaModel {
        /**
         * <p>The signature algorithm that is supported by the Alibaba Cloud SP. Valid values:</p>
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
         * <p>The metadata file. The file is Base64-encoded.</p>
         */
        @NameInMap("MetadataDocument")
        public String metadataDocument;

        /**
         * <p>Indicates whether user-based SSO is enabled.</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>Indicates whether the <code>&lt;saml:NameID&gt;</code> element in a SAML response must contain a domain name when a user logs on using SAML-based SSO. This applies if the username that is specified on the IdP for logon matching contains a domain name suffix.</p>
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

        public static SetUserSsoSettingsResponseBodyUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            SetUserSsoSettingsResponseBodyUserSsoSettings self = new SetUserSsoSettingsResponseBodyUserSsoSettings();
            return TeaModel.build(map, self);
        }

        public SetUserSsoSettingsResponseBodyUserSsoSettings setAuthnSignAlgo(String authnSignAlgo) {
            this.authnSignAlgo = authnSignAlgo;
            return this;
        }
        public String getAuthnSignAlgo() {
            return this.authnSignAlgo;
        }

        public SetUserSsoSettingsResponseBodyUserSsoSettings setAuxiliaryDomain(String auxiliaryDomain) {
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }
        public String getAuxiliaryDomain() {
            return this.auxiliaryDomain;
        }

        public SetUserSsoSettingsResponseBodyUserSsoSettings setMetadataDocument(String metadataDocument) {
            this.metadataDocument = metadataDocument;
            return this;
        }
        public String getMetadataDocument() {
            return this.metadataDocument;
        }

        public SetUserSsoSettingsResponseBodyUserSsoSettings setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public SetUserSsoSettingsResponseBodyUserSsoSettings setSsoLoginWithDomain(Boolean ssoLoginWithDomain) {
            this.ssoLoginWithDomain = ssoLoginWithDomain;
            return this;
        }
        public Boolean getSsoLoginWithDomain() {
            return this.ssoLoginWithDomain;
        }

    }

}
