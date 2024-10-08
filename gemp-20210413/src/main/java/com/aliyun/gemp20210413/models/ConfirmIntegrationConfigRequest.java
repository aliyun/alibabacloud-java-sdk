// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ConfirmIntegrationConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    public static ConfirmIntegrationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIntegrationConfigRequest self = new ConfirmIntegrationConfigRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIntegrationConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfirmIntegrationConfigRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

}
