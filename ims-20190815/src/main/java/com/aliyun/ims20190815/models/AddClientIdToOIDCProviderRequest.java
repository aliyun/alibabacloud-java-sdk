// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderRequest extends TeaModel {
    /**
     * <p>The specified client ID.</p>
     * <p>Format: letters, digits, and the special characters <code>.-_:/</code> are allowed. The value cannot start with the special characters <code>.-_:/</code>.</p>
     * <p>Length: up to 128 characters.</p>
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
