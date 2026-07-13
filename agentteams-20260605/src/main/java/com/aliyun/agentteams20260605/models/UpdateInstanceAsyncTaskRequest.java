// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceAsyncTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsResume")
    public Boolean isResume;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams:pay-order:create</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateInstanceAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAsyncTaskRequest self = new UpdateInstanceAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAsyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceAsyncTaskRequest setIsResume(Boolean isResume) {
        this.isResume = isResume;
        return this;
    }
    public Boolean getIsResume() {
        return this.isResume;
    }

    public UpdateInstanceAsyncTaskRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public UpdateInstanceAsyncTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
