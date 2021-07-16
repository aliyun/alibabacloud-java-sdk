// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentSubtotalsRequest extends TeaModel {
    // 事件ID
    @NameInMap("incidentId")
    public Long incidentId;

    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    public static ListIncidentSubtotalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentSubtotalsRequest self = new ListIncidentSubtotalsRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentSubtotalsRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public ListIncidentSubtotalsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
