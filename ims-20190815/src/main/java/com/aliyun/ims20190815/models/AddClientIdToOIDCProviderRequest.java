// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

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
