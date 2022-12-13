// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentSubtotalCountRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("incidentIds")
    public java.util.List<Long> incidentIds;

    public static GetIncidentSubtotalCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentSubtotalCountRequest self = new GetIncidentSubtotalCountRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentSubtotalCountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetIncidentSubtotalCountRequest setIncidentIds(java.util.List<Long> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }
    public java.util.List<Long> getIncidentIds() {
        return this.incidentIds;
    }

}
