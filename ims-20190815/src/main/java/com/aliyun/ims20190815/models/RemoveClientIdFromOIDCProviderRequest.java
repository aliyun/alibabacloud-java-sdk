// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderRequest extends TeaModel {
    /**
     * <p>The client ID that you want to remove.</p>
     * <br>
     * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are `periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)`.</p>
     * <br>
     * <p>The client ID can be up to 64 characters in length.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The name of the OIDC IdP.</p>
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
