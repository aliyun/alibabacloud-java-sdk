// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    public Long planId;

    @NameInMap("DeletePlanDetail")
    public Boolean deletePlanDetail;

    public static DeletePatentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentPlanRequest self = new DeletePatentPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeletePatentPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public DeletePatentPlanRequest setDeletePlanDetail(Boolean deletePlanDetail) {
        this.deletePlanDetail = deletePlanDetail;
        return this;
    }
    public Boolean getDeletePlanDetail() {
        return this.deletePlanDetail;
    }

}
