// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Scopes")
    public String scopes;

    public static ProvisionApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionApplicationRequest self = new ProvisionApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ProvisionApplicationRequest setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

}
