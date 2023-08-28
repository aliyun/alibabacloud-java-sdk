// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("executorStatusList")
    public String executorStatusListShrink;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("taskId")
    public String taskId;

    public static UpdateTodoTaskExecutorStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusShrinkRequest self = new UpdateTodoTaskExecutorStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateTodoTaskExecutorStatusShrinkRequest setExecutorStatusListShrink(String executorStatusListShrink) {
        this.executorStatusListShrink = executorStatusListShrink;
        return this;
    }
    public String getExecutorStatusListShrink() {
        return this.executorStatusListShrink;
    }

    public UpdateTodoTaskExecutorStatusShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateTodoTaskExecutorStatusShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
