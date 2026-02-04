// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ExecIdentityProviderMetadataUrlResolutionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>idp_mwpcwnhrimlr2horxXXXX</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>inae_public</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>OIDC Issuer地址。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://login.example.com/.well-known/openid-configuration">https://login.example.com/.well-known/openid-configuration</a></p>
     */
    @NameInMap("OidcIssuer")
    public String oidcIssuer;

    public static ExecIdentityProviderMetadataUrlResolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecIdentityProviderMetadataUrlResolutionRequest self = new ExecIdentityProviderMetadataUrlResolutionRequest();
        return TeaModel.build(map, self);
    }

    public ExecIdentityProviderMetadataUrlResolutionRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public ExecIdentityProviderMetadataUrlResolutionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecIdentityProviderMetadataUrlResolutionRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public ExecIdentityProviderMetadataUrlResolutionRequest setOidcIssuer(String oidcIssuer) {
        this.oidcIssuer = oidcIssuer;
        return this;
    }
    public String getOidcIssuer() {
        return this.oidcIssuer;
    }

}
