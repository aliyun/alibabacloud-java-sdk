// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DisableEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableEscalationPlanResponseBody self = new DisableEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
