// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyExecutionPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExecutionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExecutionPlanResponseBody self = new ModifyExecutionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExecutionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
