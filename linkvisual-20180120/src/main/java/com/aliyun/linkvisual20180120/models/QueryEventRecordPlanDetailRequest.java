// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDetailRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static QueryEventRecordPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDetailRequest self = new QueryEventRecordPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDetailRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
