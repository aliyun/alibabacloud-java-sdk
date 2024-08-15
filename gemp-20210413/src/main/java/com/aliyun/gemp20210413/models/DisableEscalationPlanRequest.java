// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC2REQUEST</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234534</p>
     */
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
