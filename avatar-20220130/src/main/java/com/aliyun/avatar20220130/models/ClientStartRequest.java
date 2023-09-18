// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientStartRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ClientStartRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientStartRequest self = new ClientStartRequest();
        return TeaModel.build(map, self);
    }

    public ClientStartRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ClientStartRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
