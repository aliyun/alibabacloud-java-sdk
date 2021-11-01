// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuxiliaryDomain")
        public String auxiliaryDomain;

        @NameInMap("MetadataDocument")
        public String metadataDocument;

        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        public static SetUserSsoSettingsResponseBodyUserSsoSettings build(java.util.Map<String, ?> map) throws Exception {
            SetUserSsoSettingsResponseBodyUserSsoSettings self = new SetUserSsoSettingsResponseBodyUserSsoSettings();
            return TeaModel.build(map, self);
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

    }

}
