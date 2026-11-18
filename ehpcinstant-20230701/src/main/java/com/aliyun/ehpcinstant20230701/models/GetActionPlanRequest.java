// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetActionPlanRequest extends TeaModel {
    /**
     * <p>The ID of the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

    public static GetActionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActionPlanRequest self = new GetActionPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetActionPlanRequest setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

}
