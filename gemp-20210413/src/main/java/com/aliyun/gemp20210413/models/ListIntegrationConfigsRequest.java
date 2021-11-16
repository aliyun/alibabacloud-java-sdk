// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsRequest extends TeaModel {
    // 幂等id
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("monitorSourceName")
    public String monitorSourceName;

    public static ListIntegrationConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigsRequest self = new ListIntegrationConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIntegrationConfigsRequest setMonitorSourceName(String monitorSourceName) {
        this.monitorSourceName = monitorSourceName;
        return this;
    }
    public String getMonitorSourceName() {
        return this.monitorSourceName;
    }

}
