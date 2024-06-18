// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskRequest extends TeaModel {
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
    public java.util.List<String> executorIds;

    @NameInMap("NotifyConfigs")
    public CreateDingtalkPersonalTodoTaskRequestNotifyConfigs notifyConfigs;

    /**
     * <strong>example:</strong>
     * <p>[ &quot;012345&quot; ]</p>
     */
    @NameInMap("ParticipantIds")
    public java.util.List<String> participantIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>待办标题</p>
     */
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TenantContext")
    public CreateDingtalkPersonalTodoTaskRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>用户token</p>
     */
    @NameInMap("UserToken")
    public String userToken;

    public static CreateDingtalkPersonalTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskRequest self = new CreateDingtalkPersonalTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDingtalkPersonalTodoTaskRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreateDingtalkPersonalTodoTaskRequest setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public CreateDingtalkPersonalTodoTaskRequest setNotifyConfigs(CreateDingtalkPersonalTodoTaskRequestNotifyConfigs notifyConfigs) {
        this.notifyConfigs = notifyConfigs;
        return this;
    }
    public CreateDingtalkPersonalTodoTaskRequestNotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
    }

    public CreateDingtalkPersonalTodoTaskRequest setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

    public CreateDingtalkPersonalTodoTaskRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateDingtalkPersonalTodoTaskRequest setTenantContext(CreateDingtalkPersonalTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateDingtalkPersonalTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateDingtalkPersonalTodoTaskRequest setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    public String getUserToken() {
        return this.userToken;
    }

    public static class CreateDingtalkPersonalTodoTaskRequestNotifyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DingNotify")
        public String dingNotify;

        public static CreateDingtalkPersonalTodoTaskRequestNotifyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateDingtalkPersonalTodoTaskRequestNotifyConfigs self = new CreateDingtalkPersonalTodoTaskRequestNotifyConfigs();
            return TeaModel.build(map, self);
        }

        public CreateDingtalkPersonalTodoTaskRequestNotifyConfigs setDingNotify(String dingNotify) {
            this.dingNotify = dingNotify;
            return this;
        }
        public String getDingNotify() {
            return this.dingNotify;
        }

    }

    public static class CreateDingtalkPersonalTodoTaskRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateDingtalkPersonalTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateDingtalkPersonalTodoTaskRequestTenantContext self = new CreateDingtalkPersonalTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateDingtalkPersonalTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
