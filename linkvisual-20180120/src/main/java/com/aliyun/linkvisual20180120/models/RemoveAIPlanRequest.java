// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveAIPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static RemoveAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAIPlanRequest self = new RemoveAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAIPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
