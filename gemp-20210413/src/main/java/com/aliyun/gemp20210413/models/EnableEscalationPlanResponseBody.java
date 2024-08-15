// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableEscalationPlanResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC21925D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableEscalationPlanResponseBody self = new EnableEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
