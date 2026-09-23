// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderRequest extends TeaModel {
    /**
     * <p>The client ID to remove.</p>
     * <p>Format: letters, digits, and the special characters <code>.-_:/</code> are allowed. The value cannot start with the special characters <code>.-_:/</code>.</p>
     * <p>Length: up to 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>498469743454717****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The name of an existing OIDC IdP that has the target <code>ClientId</code> attached. If you have not created or attached one, call <code>CreateOIDCProvider</code> (with <code>ClientIds</code> specified) or <code>AddClientIdToOIDCProvider</code> first.</p>
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
