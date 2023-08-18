// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetJobLatestAutoScalePlanResponseBody extends TeaModel {
    @NameInMap("PlanJson")
    public String planJson;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobLatestAutoScalePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobLatestAutoScalePlanResponseBody self = new GetJobLatestAutoScalePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobLatestAutoScalePlanResponseBody setPlanJson(String planJson) {
        this.planJson = planJson;
        return this;
    }
    public String getPlanJson() {
        return this.planJson;
    }

    public GetJobLatestAutoScalePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
