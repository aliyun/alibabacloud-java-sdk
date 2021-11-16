// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableEscalationPlanRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 升级计划ID
    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    public static EnableEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableEscalationPlanRequest self = new EnableEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public EnableEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableEscalationPlanRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

}
