// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("description")
    public String description;

    @NameInMap("done")
    public Boolean done;

    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public String executorIdsShrink;

    @NameInMap("participantIds")
    public String participantIdsShrink;

    @NameInMap("subject")
    public String subject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static UpdateTodoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskShrinkRequest self = new UpdateTodoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateTodoTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTodoTaskShrinkRequest setDone(Boolean done) {
        this.done = done;
        return this;
    }
    public Boolean getDone() {
        return this.done;
    }

    public UpdateTodoTaskShrinkRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public UpdateTodoTaskShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public UpdateTodoTaskShrinkRequest setParticipantIdsShrink(String participantIdsShrink) {
        this.participantIdsShrink = participantIdsShrink;
        return this;
    }
    public String getParticipantIdsShrink() {
        return this.participantIdsShrink;
    }

    public UpdateTodoTaskShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateTodoTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
