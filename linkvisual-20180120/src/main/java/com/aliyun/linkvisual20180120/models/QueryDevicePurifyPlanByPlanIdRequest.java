// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlanByPlanIdRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static QueryDevicePurifyPlanByPlanIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlanByPlanIdRequest self = new QueryDevicePurifyPlanByPlanIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlanByPlanIdRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
