// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIncidentRequest extends TeaModel {
    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    // 事件Id
    @NameInMap("incidentId")
    public Long incidentId;

    public static DeleteIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIncidentRequest self = new DeleteIncidentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIncidentRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
