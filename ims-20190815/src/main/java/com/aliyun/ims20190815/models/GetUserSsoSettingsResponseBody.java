// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuxiliaryDomain")
        public String auxiliaryDomain;

        @NameInMap("MetadataDocument")
        public String metadataDocument;

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
