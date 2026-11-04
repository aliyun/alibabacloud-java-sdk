// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanRequest extends TeaModel {
    /**
     * <p>The ID of the recording plan. You can call the <a href="https://help.aliyun.com/document_detail/107896.html">QueryRecordPlans</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c5a397bc17c4b48ace86f0f0c30****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    public static DeleteRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordPlanRequest self = new DeleteRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
