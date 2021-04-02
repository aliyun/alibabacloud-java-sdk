// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserSsoSettings")
    @Validation(required = true)
    public GetUserSsoSettingsResponseUserSsoSettings userSsoSettings;

    public static GetUserSsoSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSsoSettingsResponse self = new GetUserSsoSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSsoSettingsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSsoSettingsResponse setUserSsoSettings(GetUserSsoSettingsResponseUserSsoSettings userSsoSettings) {
        this.userSsoSettings = userSsoSettings;
        return this;
    }
    public GetUserSsoSettingsResponseUserSsoSettings getUserSsoSettings() {
        return this.userSsoSettings;
    }

    public static class GetUserSsoSettingsResponseUserSsoSettings extends TeaModel {
        @NameInMap("MetadataDocument")
        @Validation(required = true)
        public String metadataDocument;

        @NameInMap("SsoEnabled")
        @Validation(required = true)
        public Boolean ssoEnabled;

        @NameInMap("AuxiliaryDomain")
        @Validation(required = true)
        public String auxiliaryDomain;

        public static GetUserSsoSettingsResponseUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            GetUserSsoSettingsResponseUserSsoSettings self = new GetUserSsoSettingsResponseUserSsoSettings();
            return TeaModel.build(map, self);
        }

        public GetUserSsoSettingsResponseUserSsoSettings setMetadataDocument(String metadataDocument) {
            this.metadataDocument = metadataDocument;
            return this;
        }
        public String getMetadataDocument() {
            return this.metadataDocument;
        }

        public GetUserSsoSettingsResponseUserSsoSettings setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public GetUserSsoSettingsResponseUserSsoSettings setAuxiliaryDomain(String auxiliaryDomain) {
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }
        public String getAuxiliaryDomain() {
            return this.auxiliaryDomain;
        }

    }

}
