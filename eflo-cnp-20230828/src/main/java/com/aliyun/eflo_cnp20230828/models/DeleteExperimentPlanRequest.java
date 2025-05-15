// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanRequest extends TeaModel {
    /**
     * <p>Plan ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("PlanId")
    public Long planId;

    public static DeleteExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanRequest self = new DeleteExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

}
