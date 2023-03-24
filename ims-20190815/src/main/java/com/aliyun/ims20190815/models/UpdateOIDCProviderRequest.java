// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateOIDCProviderRequest extends TeaModel {
    /**
     * <p>The ID of the client. If you want to specify multiple fingerprints, separate the fingerprints with commas (,).</p>
     * <br>
     * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are `periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)`.</p>
     * <br>
     * <p>The client ID can be up to 64 characters in length.</p>
     * <br>
     * <p>>  If you specify this parameter, all the client IDs of the OIDC IdP are replaced. If you need to only add or remove a client ID, call the AddClientIdToOIDCProvider or RemoveClientIdFromOIDCProvider operation. For more information, see [AddClientIdToOIDCProvider](~~332057~~) or [RemoveClientIdFromOIDCProvider](~~332058~~).</p>
     */
    @NameInMap("ClientIds")
    public String clientIds;

    /**
     * <p>The description of the OIDC IdP.</p>
     * <br>
     * <p>The description can be up to 256 characters in length.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The name of the OIDC IdP.</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static UpdateOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOIDCProviderRequest self = new UpdateOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOIDCProviderRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public UpdateOIDCProviderRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
