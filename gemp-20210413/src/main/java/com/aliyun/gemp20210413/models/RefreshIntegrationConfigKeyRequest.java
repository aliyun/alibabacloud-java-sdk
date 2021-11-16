// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RefreshIntegrationConfigKeyRequest extends TeaModel {
    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    public static RefreshIntegrationConfigKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshIntegrationConfigKeyRequest self = new RefreshIntegrationConfigKeyRequest();
        return TeaModel.build(map, self);
    }

    public RefreshIntegrationConfigKeyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RefreshIntegrationConfigKeyRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

}
