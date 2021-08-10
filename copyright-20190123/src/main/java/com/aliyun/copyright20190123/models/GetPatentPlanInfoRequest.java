// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanInfoRequest extends TeaModel {
    @NameInMap("PlanId")
    public Long planId;

    public static GetPatentPlanInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanInfoRequest self = new GetPatentPlanInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanInfoRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

}
