// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreatePersonalTodoTaskRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DueTime")
    public Long dueTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecutorIds")
    public java.util.List<String> executorIds;

    @NameInMap("NotifyConfigs")
    public CreatePersonalTodoTaskRequestNotifyConfigs notifyConfigs;

    @NameInMap("ParticipantIds")
    public java.util.List<String> participantIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TenantContext")
    public CreatePersonalTodoTaskRequestTenantContext tenantContext;

    public static CreatePersonalTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTodoTaskRequest self = new CreatePersonalTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTodoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalTodoTaskRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreatePersonalTodoTaskRequest setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public CreatePersonalTodoTaskRequest setNotifyConfigs(CreatePersonalTodoTaskRequestNotifyConfigs notifyConfigs) {
        this.notifyConfigs = notifyConfigs;
        return this;
    }
    public CreatePersonalTodoTaskRequestNotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
    }

    public CreatePersonalTodoTaskRequest setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

    public CreatePersonalTodoTaskRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreatePersonalTodoTaskRequest setTenantContext(CreatePersonalTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreatePersonalTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CreatePersonalTodoTaskRequestNotifyConfigs extends TeaModel {
        @NameInMap("DingNotify")
        public String dingNotify;

        public static CreatePersonalTodoTaskRequestNotifyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalTodoTaskRequestNotifyConfigs self = new CreatePersonalTodoTaskRequestNotifyConfigs();
            return TeaModel.build(map, self);
        }

        public CreatePersonalTodoTaskRequestNotifyConfigs setDingNotify(String dingNotify) {
            this.dingNotify = dingNotify;
            return this;
        }
        public String getDingNotify() {
            return this.dingNotify;
        }

    }

    public static class CreatePersonalTodoTaskRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreatePersonalTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalTodoTaskRequestTenantContext self = new CreatePersonalTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreatePersonalTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
