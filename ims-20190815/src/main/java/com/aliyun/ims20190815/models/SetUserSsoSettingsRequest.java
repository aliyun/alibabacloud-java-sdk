// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsRequest extends TeaModel {
    @NameInMap("AuxiliaryDomain")
    public String auxiliaryDomain;

    @NameInMap("MetadataDocument")
    public String metadataDocument;

    @NameInMap("SsoEnabled")
    public Boolean ssoEnabled;

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

}
