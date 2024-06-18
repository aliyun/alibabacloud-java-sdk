// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>应用可以调用该接口发起一个钉钉待办任务，该待办事项会出现在钉钉客户端“待办”页面，需要注意的是，通过开放接口发起的待办，目前仅支持直接跳转ISV应用详情页（ISV在调该接口时需传入自身应用详情页链接）。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("done")
    public Boolean done;

    /**
     * <strong>example:</strong>
     * <p>1617675000000</p>
     */
    @NameInMap("dueTime")
    public Long dueTime;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("executorIds")
    public String executorIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("participantIds")
    public String participantIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>更新钉钉待办</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>taskId</p>
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
