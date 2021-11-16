// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 升级计划ID
    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    public static DisableEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEscalationPlanRequest self = new DisableEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public DisableEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableEscalationPlanRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

}
