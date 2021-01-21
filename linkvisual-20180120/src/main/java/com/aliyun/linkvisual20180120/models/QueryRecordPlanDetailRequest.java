// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static QueryRecordPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDetailRequest self = new QueryRecordPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDetailRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
