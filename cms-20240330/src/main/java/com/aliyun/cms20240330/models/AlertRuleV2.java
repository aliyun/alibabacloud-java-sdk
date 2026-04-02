// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleV2 extends TeaModel {
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>注解</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>内容模板</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>创建时间（只读），ISO 8601</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>显示名称</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>是否启用</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>标签</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>告警状态（只读）</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>更新时间（只读），ISO 8601</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>规则 UUID（系统生成，只读）</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>工作空间</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static AlertRuleV2 build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleV2 self = new AlertRuleV2();
        return TeaModel.build(map, self);
    }

    public AlertRuleV2 setActionIntegrationConfig(ActionIntegrationConfig actionIntegrationConfig) {
        this.actionIntegrationConfig = actionIntegrationConfig;
        return this;
    }
    public ActionIntegrationConfig getActionIntegrationConfig() {
        return this.actionIntegrationConfig;
    }

    public AlertRuleV2 setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public AlertRuleV2 setArmsIntegrationConfig(ArmsIntegrationConfig armsIntegrationConfig) {
        this.armsIntegrationConfig = armsIntegrationConfig;
        return this;
    }
    public ArmsIntegrationConfig getArmsIntegrationConfig() {
        return this.armsIntegrationConfig;
    }

    public AlertRuleV2 setConditionConfig(ConditionConfigUnified conditionConfig) {
        this.conditionConfig = conditionConfig;
        return this;
    }
    public ConditionConfigUnified getConditionConfig() {
        return this.conditionConfig;
    }

    public AlertRuleV2 setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    public String getContentTemplate() {
        return this.contentTemplate;
    }

    public AlertRuleV2 setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AlertRuleV2 setDatasourceConfig(DatasourceConfigUnified datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
        return this;
    }
    public DatasourceConfigUnified getDatasourceConfig() {
        return this.datasourceConfig;
    }

    public AlertRuleV2 setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AlertRuleV2 setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public AlertRuleV2 setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public AlertRuleV2 setNotifyConfig(NotifyConfigUnified notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public NotifyConfigUnified getNotifyConfig() {
        return this.notifyConfig;
    }

    public AlertRuleV2 setQueryConfig(QueryConfigUnified queryConfig) {
        this.queryConfig = queryConfig;
        return this;
    }
    public QueryConfigUnified getQueryConfig() {
        return this.queryConfig;
    }

    public AlertRuleV2 setScheduleConfig(ScheduleConfigUnified scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public ScheduleConfigUnified getScheduleConfig() {
        return this.scheduleConfig;
    }

    public AlertRuleV2 setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AlertRuleV2 setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public AlertRuleV2 setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public AlertRuleV2 setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
