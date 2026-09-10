// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationWorkflowSubmitStartRequest extends TeaModel {
    /**
     * <p>The scheduling migration task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetBwmMigrationWorkflowSubmitStartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationWorkflowSubmitStartRequest self = new GetBwmMigrationWorkflowSubmitStartRequest();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationWorkflowSubmitStartRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
