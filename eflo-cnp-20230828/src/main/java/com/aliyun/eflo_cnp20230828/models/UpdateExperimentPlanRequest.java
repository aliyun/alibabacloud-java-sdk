// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanRequest extends TeaModel {
    /**
     * <p>Experiment plan ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("PlanId")
    public Long planId;

    /**
     * <p>Experiment plan name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PlanTemplateName")
    public String planTemplateName;

    public static UpdateExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanRequest self = new UpdateExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public UpdateExperimentPlanRequest setPlanTemplateName(String planTemplateName) {
        this.planTemplateName = planTemplateName;
        return this;
    }
    public String getPlanTemplateName() {
        return this.planTemplateName;
    }

}
