// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPlanMaintenanceWindowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F3CD6886-D8D0-4FEE-B93E-1B732396****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPlanMaintenanceWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanMaintenanceWindowResponseBody self = new ModifyPlanMaintenanceWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPlanMaintenanceWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
