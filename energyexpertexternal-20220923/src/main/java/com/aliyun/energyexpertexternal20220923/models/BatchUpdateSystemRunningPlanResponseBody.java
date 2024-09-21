// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchUpdateSystemRunningPlanResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static BatchUpdateSystemRunningPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateSystemRunningPlanResponseBody self = new BatchUpdateSystemRunningPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateSystemRunningPlanResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BatchUpdateSystemRunningPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
