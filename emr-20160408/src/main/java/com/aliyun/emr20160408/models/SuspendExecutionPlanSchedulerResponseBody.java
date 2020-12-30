// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SuspendExecutionPlanSchedulerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendExecutionPlanSchedulerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendExecutionPlanSchedulerResponseBody self = new SuspendExecutionPlanSchedulerResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendExecutionPlanSchedulerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
