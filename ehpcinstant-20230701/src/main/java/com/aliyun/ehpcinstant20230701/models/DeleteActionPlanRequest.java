// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteActionPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

    public static DeleteActionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteActionPlanRequest self = new DeleteActionPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteActionPlanRequest setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

}
