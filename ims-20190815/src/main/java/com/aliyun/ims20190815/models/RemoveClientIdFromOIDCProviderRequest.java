// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

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
