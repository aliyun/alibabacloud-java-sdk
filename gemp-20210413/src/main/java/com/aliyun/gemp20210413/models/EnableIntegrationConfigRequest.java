// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableIntegrationConfigRequest extends TeaModel {
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    public static EnableIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableIntegrationConfigRequest self = new EnableIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public EnableIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public EnableIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
