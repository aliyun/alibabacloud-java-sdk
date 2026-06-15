// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePlanMaintenanceWindowResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3CD6886-D8D0-4FEE-B93E-1B732396****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlanMaintenanceWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlanMaintenanceWindowResponseBody self = new DeletePlanMaintenanceWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlanMaintenanceWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
