// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeliverIncidentRequest extends TeaModel {
    @NameInMap("assignUserId")
    public Long assignUserId;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("incidentId")
    public Long incidentId;

    public static DeliverIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeliverIncidentRequest self = new DeliverIncidentRequest();
        return TeaModel.build(map, self);
    }

    public DeliverIncidentRequest setAssignUserId(Long assignUserId) {
        this.assignUserId = assignUserId;
        return this;
    }
    public Long getAssignUserId() {
        return this.assignUserId;
    }

    public DeliverIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeliverIncidentRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
