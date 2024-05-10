// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreatePersonalTodoTaskShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DueTime")
    public Long dueTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecutorIds")
    public String executorIdsShrink;

    @NameInMap("NotifyConfigs")
    public String notifyConfigsShrink;

    @NameInMap("ParticipantIds")
    public String participantIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static CreatePersonalTodoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTodoTaskShrinkRequest self = new CreatePersonalTodoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTodoTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalTodoTaskShrinkRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreatePersonalTodoTaskShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public CreatePersonalTodoTaskShrinkRequest setNotifyConfigsShrink(String notifyConfigsShrink) {
        this.notifyConfigsShrink = notifyConfigsShrink;
        return this;
    }
    public String getNotifyConfigsShrink() {
        return this.notifyConfigsShrink;
    }

    public CreatePersonalTodoTaskShrinkRequest setParticipantIdsShrink(String participantIdsShrink) {
        this.participantIdsShrink = participantIdsShrink;
        return this;
    }
    public String getParticipantIdsShrink() {
        return this.participantIdsShrink;
    }

    public CreatePersonalTodoTaskShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreatePersonalTodoTaskShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
