// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentListByIdListRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("incidentIdList")
    public java.util.List<Long> incidentIdList;

    public static GetIncidentListByIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentListByIdListRequest self = new GetIncidentListByIdListRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentListByIdListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetIncidentListByIdListRequest setIncidentIdList(java.util.List<Long> incidentIdList) {
        this.incidentIdList = incidentIdList;
        return this;
    }
    public java.util.List<Long> getIncidentIdList() {
        return this.incidentIdList;
    }

}
