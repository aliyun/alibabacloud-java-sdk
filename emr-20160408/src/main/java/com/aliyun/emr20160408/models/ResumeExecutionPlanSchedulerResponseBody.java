// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResumeExecutionPlanSchedulerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeExecutionPlanSchedulerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeExecutionPlanSchedulerResponseBody self = new ResumeExecutionPlanSchedulerResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeExecutionPlanSchedulerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
