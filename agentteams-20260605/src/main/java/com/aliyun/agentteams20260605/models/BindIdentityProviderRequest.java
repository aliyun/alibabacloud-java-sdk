// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class BindIdentityProviderRequest extends TeaModel {
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
     * <p>The identity provider metadata. In the DingTalk scenario, this is a JSON object string that contains the <code>appKey</code>, <code>appSecret</code>, <code>corpId</code>, <code>encryptKey</code>, and <code>verificationToken</code> fields. This is a sensitive parameter.</p>
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
     * <p>Specifies whether to enable logon. Default value: <code>true</code>. This default value is used if the parameter is not specified or is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LoginEnabled")
    public Boolean loginEnabled;

    /**
     * <p>Specifies whether to enable user synchronization. Default value: <code>false</code>. User synchronization is enabled only when this parameter is explicitly set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncEnabled")
    public Boolean syncEnabled;

    public static BindIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        BindIdentityProviderRequest self = new BindIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public BindIdentityProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public BindIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public BindIdentityProviderRequest setIdpMetadata(String idpMetadata) {
        this.idpMetadata = idpMetadata;
        return this;
    }
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

    public BindIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindIdentityProviderRequest setLoginEnabled(Boolean loginEnabled) {
        this.loginEnabled = loginEnabled;
        return this;
    }
    public Boolean getLoginEnabled() {
        return this.loginEnabled;
    }

    public BindIdentityProviderRequest setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
        return this;
    }
    public Boolean getSyncEnabled() {
        return this.syncEnabled;
    }

}
