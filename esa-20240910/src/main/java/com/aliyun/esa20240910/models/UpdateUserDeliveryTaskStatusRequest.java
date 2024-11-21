// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserDeliveryTaskStatusRequest extends TeaModel {
    /**
     * <p>Enables or disables the delivery task. Valid values: online and offline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The name of the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateUserDeliveryTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDeliveryTaskStatusRequest self = new UpdateUserDeliveryTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserDeliveryTaskStatusRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateUserDeliveryTaskStatusRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
