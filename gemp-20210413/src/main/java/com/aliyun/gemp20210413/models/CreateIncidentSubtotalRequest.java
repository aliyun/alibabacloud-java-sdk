// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentSubtotalRequest extends TeaModel {
    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    // 描述
    @NameInMap("description")
    public String description;

    // 事件id
    @NameInMap("incidentId")
    public Long incidentId;

    public static CreateIncidentSubtotalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentSubtotalRequest self = new CreateIncidentSubtotalRequest();
        return TeaModel.build(map, self);
    }

    public CreateIncidentSubtotalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIncidentSubtotalRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIncidentSubtotalRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
