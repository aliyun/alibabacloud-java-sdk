// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteExecutionPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExecutionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionPlanResponseBody self = new DeleteExecutionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
