// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserSsoSettings")
    @Validation(required = true)
    public SetUserSsoSettingsResponseUserSsoSettings userSsoSettings;

    public static SetUserSsoSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsResponse self = new SetUserSsoSettingsResponse();
        return TeaModel.build(map, self);
    }

    public SetUserSsoSettingsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetUserSsoSettingsResponse setUserSsoSettings(SetUserSsoSettingsResponseUserSsoSettings userSsoSettings) {
        this.userSsoSettings = userSsoSettings;
        return this;
    }
    public SetUserSsoSettingsResponseUserSsoSettings getUserSsoSettings() {
        return this.userSsoSettings;
    }

    public static class SetUserSsoSettingsResponseUserSsoSettings extends TeaModel {
        @NameInMap("SsoEnabled")
        @Validation(required = true)
        public Boolean ssoEnabled;

        @NameInMap("MetadataDocument")
        @Validation(required = true)
        public String metadataDocument;

        @NameInMap("AuxiliaryDomain")
        @Validation(required = true)
        public String auxiliaryDomain;

        public static SetUserSsoSettingsResponseUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            SetUserSsoSettingsResponseUserSsoSettings self = new SetUserSsoSettingsResponseUserSsoSettings();
            return TeaModel.build(map, self);
        }

        public SetUserSsoSettingsResponseUserSsoSettings setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public SetUserSsoSettingsResponseUserSsoSettings setMetadataDocument(String metadataDocument) {
            this.metadataDocument = metadataDocument;
            return this;
        }
        public String getMetadataDocument() {
            return this.metadataDocument;
        }

        public SetUserSsoSettingsResponseUserSsoSettings setAuxiliaryDomain(String auxiliaryDomain) {
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }
        public String getAuxiliaryDomain() {
            return this.auxiliaryDomain;
        }

    }

}
