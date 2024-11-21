// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUserDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The name of the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DeleteUserDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDeliveryTaskRequest self = new DeleteUserDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
