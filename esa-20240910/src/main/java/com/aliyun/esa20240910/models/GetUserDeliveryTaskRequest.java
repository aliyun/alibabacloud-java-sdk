// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The name of the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static GetUserDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeliveryTaskRequest self = new GetUserDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
