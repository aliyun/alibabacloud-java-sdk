// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePlanMaintenanceWindowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pw-bp1a9yavgq3dgttvowun</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

    /**
     * <strong>example:</strong>
     * <p>7D5B1188-3F08-56D1-A6B2-91B267452633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePlanMaintenanceWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanMaintenanceWindowResponseBody self = new CreatePlanMaintenanceWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlanMaintenanceWindowResponseBody setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public CreatePlanMaintenanceWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
