// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailEscalationPlansRequest extends TeaModel {
    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    // 事件ID
    @NameInMap("incidentId")
    public Long incidentId;

    public static ListIncidentDetailEscalationPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailEscalationPlansRequest self = new ListIncidentDetailEscalationPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailEscalationPlansRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentDetailEscalationPlansRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
