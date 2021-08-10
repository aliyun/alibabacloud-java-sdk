// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ExportPatentPlanDetailRequest extends TeaModel {
    @NameInMap("PlanId")
    public Long planId;

    public static ExportPatentPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportPatentPlanDetailRequest self = new ExportPatentPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public ExportPatentPlanDetailRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

}
