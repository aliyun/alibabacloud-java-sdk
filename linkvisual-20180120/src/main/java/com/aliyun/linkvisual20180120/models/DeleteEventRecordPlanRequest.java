// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanRequest extends TeaModel {
    /**
     * <p>The ID of the intelligent alert event recording plan. You can call the <a href="https://help.aliyun.com/document_detail/107907.html">QueryEventRecordPlans</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e34a1989aa54debac22358aca7f****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    public static DeleteEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanRequest self = new DeleteEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
