// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("contentFieldList")
    public String contentFieldListShrink;

    @NameInMap("creatorId")
    public String creatorId;

    @NameInMap("description")
    public String description;

    @NameInMap("detailUrl")
    public String detailUrlShrink;

    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public String executorIdsShrink;

    @NameInMap("isOnlyShowExecutor")
    public Boolean isOnlyShowExecutor;

    @NameInMap("notifyConfigs")
    public String notifyConfigsShrink;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("participantIds")
    public String participantIdsShrink;

    @NameInMap("priority")
    public Integer priority;

    @NameInMap("sourceId")
    public String sourceId;

    @NameInMap("subject")
    public String subject;

    public static CreateTodoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoTaskShrinkRequest self = new CreateTodoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTodoTaskShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateTodoTaskShrinkRequest setContentFieldListShrink(String contentFieldListShrink) {
        this.contentFieldListShrink = contentFieldListShrink;
        return this;
    }
    public String getContentFieldListShrink() {
        return this.contentFieldListShrink;
    }

    public CreateTodoTaskShrinkRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateTodoTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTodoTaskShrinkRequest setDetailUrlShrink(String detailUrlShrink) {
        this.detailUrlShrink = detailUrlShrink;
        return this;
    }
    public String getDetailUrlShrink() {
        return this.detailUrlShrink;
    }

    public CreateTodoTaskShrinkRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreateTodoTaskShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public CreateTodoTaskShrinkRequest setIsOnlyShowExecutor(Boolean isOnlyShowExecutor) {
        this.isOnlyShowExecutor = isOnlyShowExecutor;
        return this;
    }
    public Boolean getIsOnlyShowExecutor() {
        return this.isOnlyShowExecutor;
    }

    public CreateTodoTaskShrinkRequest setNotifyConfigsShrink(String notifyConfigsShrink) {
        this.notifyConfigsShrink = notifyConfigsShrink;
        return this;
    }
    public String getNotifyConfigsShrink() {
        return this.notifyConfigsShrink;
    }

    public CreateTodoTaskShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateTodoTaskShrinkRequest setParticipantIdsShrink(String participantIdsShrink) {
        this.participantIdsShrink = participantIdsShrink;
        return this;
    }
    public String getParticipantIdsShrink() {
        return this.participantIdsShrink;
    }

    public CreateTodoTaskShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTodoTaskShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateTodoTaskShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
