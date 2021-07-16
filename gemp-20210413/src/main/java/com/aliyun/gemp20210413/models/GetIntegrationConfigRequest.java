// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIntegrationConfigRequest extends TeaModel {
    // 集成配置id
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    public static GetIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationConfigRequest self = new GetIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public GetIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
