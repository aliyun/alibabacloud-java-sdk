// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePlanMaintenanceWindowResponseBody extends TeaModel {
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
