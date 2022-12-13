// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveIntegrationConfigRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    public static RemoveIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIntegrationConfigRequest self = new RemoveIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

}
