// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderRequest extends TeaModel {
    /**
     * <p>The specified client ID.</p>
     * <p>Format: The client ID can contain letters, digits, and the following special characters: <code>.-_:/</code>. It cannot start with a special character.</p>
     * <p>Length: The client ID can be up to 128 characters in length.</p>
     * <p>The <code>ClientId</code> must be bound to the OIDC IdP specified by <code>OIDCProviderName</code>. If it is not bound, you can first call <code>CreateOIDCProvider</code> by setting <code>ClientIds</code> or call <code>AddClientIdToOIDCProvider</code> to bind it.</p>
     * 
     * <strong>example:</strong>
     * <p>498469743454717****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The name of the OIDC IdP that exists and is bound to the target <code>ClientId</code>. If the OIDC IdP has not been created or the client ID has not been bound, you can first call <code>CreateOIDCProvider</code> by setting <code>ClientIds</code> or call <code>AddClientIdToOIDCProvider</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOIDCProvider</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static RemoveClientIdFromOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientIdFromOIDCProviderRequest self = new RemoveClientIdFromOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClientIdFromOIDCProviderRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RemoveClientIdFromOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
