// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderRequest extends TeaModel {
    /**
     * <p>The client ID that you want to remove.</p>
     * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are <code>periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)</code>.``</p>
     * <p>The client ID can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>498469743454717****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The name of the OIDC IdP.</p>
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
