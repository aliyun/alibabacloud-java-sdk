// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateEscalationPlanResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEscalationPlanResponseBody self = new UpdateEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
