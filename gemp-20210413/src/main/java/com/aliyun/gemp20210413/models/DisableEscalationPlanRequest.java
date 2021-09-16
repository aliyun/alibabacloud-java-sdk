// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanRequest extends TeaModel {
    // 升级计划ID
    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static DisableEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEscalationPlanRequest self = new DisableEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public DisableEscalationPlanRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    public DisableEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
