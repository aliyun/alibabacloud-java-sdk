// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsRequest extends TeaModel {
    /**
     * <p>The auxiliary domain name.</p>
     */
    @NameInMap("AuxiliaryDomain")
    public String auxiliaryDomain;

    /**
     * <p>The metadata file, which is Base64-encoded.</p>
     * <br>
     * <p>The file is provided by an IdP that supports SAML 2.0.</p>
     */
    @NameInMap("MetadataDocument")
    public String metadataDocument;

    /**
     * <p>Specifies whether to enable SSO for the RAM user. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
