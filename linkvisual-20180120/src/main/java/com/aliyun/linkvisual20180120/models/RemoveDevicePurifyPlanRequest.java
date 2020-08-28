// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveDevicePurifyPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static RemoveDevicePurifyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDevicePurifyPlanRequest self = new RemoveDevicePurifyPlanRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDevicePurifyPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
