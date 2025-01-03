// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentPlanRequest extends TeaModel {
    /**
     * <p>Plan ID</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("PlanId")
    public Long planId;

    public static GetExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanRequest self = new GetExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

}
