// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIntegrationConfigRequest extends TeaModel {
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    // 集成秘钥
    @NameInMap("accessKey")
    public String accessKey;

    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationConfigRequest self = new UpdateIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public UpdateIntegrationConfigRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public UpdateIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
