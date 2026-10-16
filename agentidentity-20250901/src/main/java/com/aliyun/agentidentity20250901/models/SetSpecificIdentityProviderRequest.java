// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetSpecificIdentityProviderRequest extends TeaModel {
    /**
     * <p>The IdP metadata. For the DingTalk type, the metadata is in JSON format and includes fields such as corpId, appKey, appSecret, encryptKey, verificationToken, and syncCallbackStatus.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;corpId&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appKey&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appSecret&quot;:&quot;your_app_secret&quot;,&quot;encryptKey&quot;:&quot;your_encrypt_key&quot;,&quot;verificationToken&quot;:&quot;your_verification_token&quot;,&quot;syncCallbackStatus&quot;:&quot;Enabled&quot;}</p>
     */
    @NameInMap("IDPMetadata")
    public String IDPMetadata;

    /**
     * <p>The type of the identity provider. Currently, only DingTalk is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>The SSO enabling status. Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled.</li>
     * <li>Disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SSOStatus")
    public String SSOStatus;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static SetSpecificIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSpecificIdentityProviderRequest self = new SetSpecificIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public SetSpecificIdentityProviderRequest setIDPMetadata(String IDPMetadata) {
        this.IDPMetadata = IDPMetadata;
        return this;
    }
    public String getIDPMetadata() {
        return this.IDPMetadata;
    }

    public SetSpecificIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public SetSpecificIdentityProviderRequest setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
        return this;
    }
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    public SetSpecificIdentityProviderRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
