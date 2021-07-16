// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableIntegrationConfigRequest extends TeaModel {
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    public static DisableIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableIntegrationConfigRequest self = new DisableIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DisableIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public DisableIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
