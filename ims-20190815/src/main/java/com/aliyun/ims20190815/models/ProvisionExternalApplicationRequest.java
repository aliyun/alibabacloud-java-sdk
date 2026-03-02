// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionExternalApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Scopes")
    public String scopes;

    public static ProvisionExternalApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionExternalApplicationRequest self = new ProvisionExternalApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionExternalApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ProvisionExternalApplicationRequest setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

}
