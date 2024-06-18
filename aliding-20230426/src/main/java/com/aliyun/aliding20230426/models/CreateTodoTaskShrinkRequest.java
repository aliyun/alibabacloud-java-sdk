// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("contentFieldList")
    public String contentFieldListShrink;

    /**
     * <strong>example:</strong>
     * <p>PUoiinWIpa2yH2ymhiiGiP6g</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>应用可以调用该接口发起一个钉钉待办任务，该待办事项会出现在钉钉客户端“待办”页面，需要注意的是，通过开放接口发起的待办，目前仅支持直接跳转ISV应用详情页（ISV在调该接口时需传入自身应用详情页链接）。</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("detailUrl")
    public String detailUrlShrink;

    /**
     * <strong>example:</strong>
     * <p>1617675000000</p>
     */
    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public String executorIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOnlyShowExecutor")
    public Boolean isOnlyShowExecutor;

    @NameInMap("notifyConfigs")
    public String notifyConfigsShrink;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("participantIds")
    public String participantIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>isv_dingtalkTodo1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>接入钉钉待办</p>
     */
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
