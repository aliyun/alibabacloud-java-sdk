// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTodoTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPJpwtxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetTodoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTodoTaskShrinkRequest self = new GetTodoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTodoTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTodoTaskShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
