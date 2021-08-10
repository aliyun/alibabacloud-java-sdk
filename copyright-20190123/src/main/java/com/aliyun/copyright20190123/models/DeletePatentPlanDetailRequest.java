// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentPlanDetailRequest extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    @NameInMap("ApplyNumbers")
    public String applyNumbers;

    public static DeletePatentPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentPlanDetailRequest self = new DeletePatentPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public DeletePatentPlanDetailRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DeletePatentPlanDetailRequest setApplyNumbers(String applyNumbers) {
        this.applyNumbers = applyNumbers;
        return this;
    }
    public String getApplyNumbers() {
        return this.applyNumbers;
    }

}
