// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RespondIncidentRequest extends TeaModel {
    // 事件ID数组
    @NameInMap("incidentIds")
    public java.util.List<Long> incidentIds;

    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    public static RespondIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        RespondIncidentRequest self = new RespondIncidentRequest();
        return TeaModel.build(map, self);
    }

    public RespondIncidentRequest setIncidentIds(java.util.List<Long> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }
    public java.util.List<Long> getIncidentIds() {
        return this.incidentIds;
    }

    public RespondIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
