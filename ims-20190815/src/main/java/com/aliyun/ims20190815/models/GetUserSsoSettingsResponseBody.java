// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("AuxiliaryDomain")
        public String auxiliaryDomain;

        /**
         * <p>The metadata file, which is Base64-encoded.</p>
         */
        @NameInMap("MetadataDocument")
        public String metadataDocument;

        /**
         * <p>Indicates whether user-based SSO is enabled.</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

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

    }

}
