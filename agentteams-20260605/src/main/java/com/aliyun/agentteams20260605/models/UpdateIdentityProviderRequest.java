// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The client idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-1234abcd</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The identity provider type. Currently, only DingTalk is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>The identity provider metadata. In the DingTalk scenario, this is a JSON object string that contains the appKey, appSecret, corpId, encryptKey, and verificationToken fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appKey&quot;:&quot;dingxxxx&quot;,&quot;appSecret&quot;:&quot;xxxxx&quot;,&quot;corpId&quot;:&quot;dingxxxx&quot;,&quot;encryptKey&quot;:&quot;xxxxx&quot;,&quot;verificationToken&quot;:&quot;xxxxx&quot;}</p>
     */
    @NameInMap("IdpMetadata")
    public String idpMetadata;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable logon. If this parameter is not specified, the existing configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LoginEnabled")
    public Boolean loginEnabled;

    /**
     * <p>Specifies whether to enable user synchronization. If this parameter is not specified, the existing configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
