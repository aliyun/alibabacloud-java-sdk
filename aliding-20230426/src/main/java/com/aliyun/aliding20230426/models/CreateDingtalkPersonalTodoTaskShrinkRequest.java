// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>待办备注信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1703750708595</p>
     */
    @NameInMap("DueTime")
    public Long dueTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ &quot;012345&quot; ]</p>
     */
    @NameInMap("ExecutorIds")
    public String executorIdsShrink;

    @NameInMap("NotifyConfigs")
    public String notifyConfigsShrink;

    /**
     * <strong>example:</strong>
     * <p>[ &quot;012345&quot; ]</p>
     */
    @NameInMap("ParticipantIds")
    public String participantIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>待办标题</p>
     */
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>用户token</p>
     */
    @NameInMap("UserToken")
    public String userToken;

    public static CreateDingtalkPersonalTodoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskShrinkRequest self = new CreateDingtalkPersonalTodoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setNotifyConfigsShrink(String notifyConfigsShrink) {
        this.notifyConfigsShrink = notifyConfigsShrink;
        return this;
    }
    public String getNotifyConfigsShrink() {
        return this.notifyConfigsShrink;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setParticipantIdsShrink(String participantIdsShrink) {
        this.participantIdsShrink = participantIdsShrink;
        return this;
    }
    public String getParticipantIdsShrink() {
        return this.participantIdsShrink;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateDingtalkPersonalTodoTaskShrinkRequest setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    public String getUserToken() {
        return this.userToken;
    }

}
