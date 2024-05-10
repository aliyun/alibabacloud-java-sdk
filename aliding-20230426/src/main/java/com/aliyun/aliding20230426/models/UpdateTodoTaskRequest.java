// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskRequest extends TeaModel {
    @NameInMap("TenantContext")
    public UpdateTodoTaskRequestTenantContext tenantContext;

    @NameInMap("description")
    public String description;

    @NameInMap("done")
    public Boolean done;

    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public java.util.List<String> executorIds;

    @NameInMap("participantIds")
    public java.util.List<String> participantIds;

    @NameInMap("subject")
    public String subject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static UpdateTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskRequest self = new UpdateTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskRequest setTenantContext(UpdateTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateTodoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTodoTaskRequest setDone(Boolean done) {
        this.done = done;
        return this;
    }
    public Boolean getDone() {
        return this.done;
    }

    public UpdateTodoTaskRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public UpdateTodoTaskRequest setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public UpdateTodoTaskRequest setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

    public UpdateTodoTaskRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateTodoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UpdateTodoTaskRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateTodoTaskRequestTenantContext self = new UpdateTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
