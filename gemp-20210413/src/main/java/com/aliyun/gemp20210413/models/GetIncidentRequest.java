// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("incidentId")
    public Long incidentId;

    public static GetIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentRequest self = new GetIncidentRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetIncidentRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
