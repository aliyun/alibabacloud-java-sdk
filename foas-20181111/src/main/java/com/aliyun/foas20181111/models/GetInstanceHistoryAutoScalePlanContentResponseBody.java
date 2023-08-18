// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceHistoryAutoScalePlanContentResponseBody extends TeaModel {
    @NameInMap("PlanContent")
    public String planContent;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceHistoryAutoScalePlanContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceHistoryAutoScalePlanContentResponseBody self = new GetInstanceHistoryAutoScalePlanContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceHistoryAutoScalePlanContentResponseBody setPlanContent(String planContent) {
        this.planContent = planContent;
        return this;
    }
    public String getPlanContent() {
        return this.planContent;
    }

    public GetInstanceHistoryAutoScalePlanContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
