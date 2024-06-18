// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskRequest extends TeaModel {
    @NameInMap("TenantContext")
    public CreateTodoTaskRequestTenantContext tenantContext;

    @NameInMap("contentFieldList")
    public java.util.List<CreateTodoTaskRequestContentFieldList> contentFieldList;

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
    public CreateTodoTaskRequestDetailUrl detailUrl;

    /**
     * <strong>example:</strong>
     * <p>1617675000000</p>
     */
    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public java.util.List<String> executorIds;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOnlyShowExecutor")
    public Boolean isOnlyShowExecutor;

    @NameInMap("notifyConfigs")
    public CreateTodoTaskRequestNotifyConfigs notifyConfigs;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("participantIds")
    public java.util.List<String> participantIds;

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

    public static CreateTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoTaskRequest self = new CreateTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTodoTaskRequest setTenantContext(CreateTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateTodoTaskRequest setContentFieldList(java.util.List<CreateTodoTaskRequestContentFieldList> contentFieldList) {
        this.contentFieldList = contentFieldList;
        return this;
    }
    public java.util.List<CreateTodoTaskRequestContentFieldList> getContentFieldList() {
        return this.contentFieldList;
    }

    public CreateTodoTaskRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateTodoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTodoTaskRequest setDetailUrl(CreateTodoTaskRequestDetailUrl detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }
    public CreateTodoTaskRequestDetailUrl getDetailUrl() {
        return this.detailUrl;
    }

    public CreateTodoTaskRequest setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreateTodoTaskRequest setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public CreateTodoTaskRequest setIsOnlyShowExecutor(Boolean isOnlyShowExecutor) {
        this.isOnlyShowExecutor = isOnlyShowExecutor;
        return this;
    }
    public Boolean getIsOnlyShowExecutor() {
        return this.isOnlyShowExecutor;
    }

    public CreateTodoTaskRequest setNotifyConfigs(CreateTodoTaskRequestNotifyConfigs notifyConfigs) {
        this.notifyConfigs = notifyConfigs;
        return this;
    }
    public CreateTodoTaskRequestNotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
    }

    public CreateTodoTaskRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateTodoTaskRequest setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

    public CreateTodoTaskRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTodoTaskRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateTodoTaskRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public static class CreateTodoTaskRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskRequestTenantContext self = new CreateTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateTodoTaskRequestContentFieldList extends TeaModel {
        /**
         * <p>fieldKey</p>
         * 
         * <strong>example:</strong>
         * <p>fieldKey</p>
         */
        @NameInMap("fieldKey")
        public String fieldKey;

        /**
         * <p>fieldValue</p>
         * 
         * <strong>example:</strong>
         * <p>fieldValue</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        public static CreateTodoTaskRequestContentFieldList build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskRequestContentFieldList self = new CreateTodoTaskRequestContentFieldList();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskRequestContentFieldList setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public CreateTodoTaskRequestContentFieldList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class CreateTodoTaskRequestDetailUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://www.dingtalk.com">https://www.dingtalk.com</a></p>
         */
        @NameInMap("appUrl")
        public String appUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.dingtalk.com">https://www.dingtalk.com</a></p>
         */
        @NameInMap("pcUrl")
        public String pcUrl;

        public static CreateTodoTaskRequestDetailUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskRequestDetailUrl self = new CreateTodoTaskRequestDetailUrl();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskRequestDetailUrl setAppUrl(String appUrl) {
            this.appUrl = appUrl;
            return this;
        }
        public String getAppUrl() {
            return this.appUrl;
        }

        public CreateTodoTaskRequestDetailUrl setPcUrl(String pcUrl) {
            this.pcUrl = pcUrl;
            return this;
        }
        public String getPcUrl() {
            return this.pcUrl;
        }

    }

    public static class CreateTodoTaskRequestNotifyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dingNotify")
        public String dingNotify;

        public static CreateTodoTaskRequestNotifyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskRequestNotifyConfigs self = new CreateTodoTaskRequestNotifyConfigs();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskRequestNotifyConfigs setDingNotify(String dingNotify) {
            this.dingNotify = dingNotify;
            return this;
        }
        public String getDingNotify() {
            return this.dingNotify;
        }

    }

}
