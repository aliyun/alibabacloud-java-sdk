// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEscalationPlanRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    public static GetEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEscalationPlanRequest self = new GetEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetEscalationPlanRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

}
