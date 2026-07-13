// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    @NameInMap("IdpMetadata")
    public String idpMetadata;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginEnabled")
    public Boolean loginEnabled;

    @NameInMap("SyncEnabled")
    public Boolean syncEnabled;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public UpdateIdentityProviderRequest setIdpMetadata(String idpMetadata) {
        this.idpMetadata = idpMetadata;
        return this;
    }
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

    public UpdateIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIdentityProviderRequest setLoginEnabled(Boolean loginEnabled) {
        this.loginEnabled = loginEnabled;
        return this;
    }
    public Boolean getLoginEnabled() {
        return this.loginEnabled;
    }

    public UpdateIdentityProviderRequest setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
        return this;
    }
    public Boolean getSyncEnabled() {
        return this.syncEnabled;
    }

}
