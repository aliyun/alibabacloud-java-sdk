// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SetRunningPlanResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static SetRunningPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRunningPlanResponseBody self = new SetRunningPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRunningPlanResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetRunningPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
