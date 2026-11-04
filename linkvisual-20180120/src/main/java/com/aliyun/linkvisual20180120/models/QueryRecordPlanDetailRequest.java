// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailRequest extends TeaModel {
    /**
     * <p>The ID of the recording plan. You can call <a href="https://help.aliyun.com/document_detail/107896.html">QueryRecordPlans</a> to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b60bf0dd55944c19d7817442bc9****</p>
     */
    @NameInMap("PlanId")
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
