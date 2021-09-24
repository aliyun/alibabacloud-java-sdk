// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentSubtotalCountRequest extends TeaModel {
    // 事件id列表
    @NameInMap("incidentIds")
    public java.util.List<Long> incidentIds;

    // 幂等标识
    @NameInMap("clientToken")
    public String clientToken;

    public static GetIncidentSubtotalCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentSubtotalCountRequest self = new GetIncidentSubtotalCountRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentSubtotalCountRequest setIncidentIds(java.util.List<Long> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }
    public java.util.List<Long> getIncidentIds() {
        return this.incidentIds;
    }

    public GetIncidentSubtotalCountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
