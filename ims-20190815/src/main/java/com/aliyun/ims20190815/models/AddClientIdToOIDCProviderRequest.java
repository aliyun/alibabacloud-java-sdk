// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderRequest extends TeaModel {
    /**
     * <p>The client ID that you want to add.</p>
     * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are periods (.), hyphens (-), underscores (_), colons (:), and forward slashes (/). </p>
     * <p>The client ID can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>598469743454717****</p>
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

    public static AddClientIdToOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClientIdToOIDCProviderRequest self = new AddClientIdToOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public AddClientIdToOIDCProviderRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddClientIdToOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
