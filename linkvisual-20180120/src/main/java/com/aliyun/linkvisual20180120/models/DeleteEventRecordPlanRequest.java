// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    public static DeleteEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanRequest self = new DeleteEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
