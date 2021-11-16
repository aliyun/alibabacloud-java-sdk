// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIntegrationConfigRequest extends TeaModel {
    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    // 集成配置id
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    public static DeleteIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationConfigRequest self = new DeleteIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

}
