// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIntegrationConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("monitorSourceId")
    public Long monitorSourceId;

    public static CreateIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationConfigRequest self = new CreateIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIntegrationConfigRequest setMonitorSourceId(Long monitorSourceId) {
        this.monitorSourceId = monitorSourceId;
        return this;
    }
    public Long getMonitorSourceId() {
        return this.monitorSourceId;
    }

}
