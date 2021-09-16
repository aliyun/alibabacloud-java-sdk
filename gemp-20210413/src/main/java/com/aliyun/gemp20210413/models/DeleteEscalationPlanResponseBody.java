// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteEscalationPlanResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEscalationPlanResponseBody self = new DeleteEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
