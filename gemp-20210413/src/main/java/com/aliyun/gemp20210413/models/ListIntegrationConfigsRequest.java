// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Zabbix</p>
     */
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
