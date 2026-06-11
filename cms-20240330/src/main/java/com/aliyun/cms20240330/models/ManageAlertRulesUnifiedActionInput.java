// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesUnifiedActionInput extends TeaModel {
    /**
     * <p>The action to perform on the alert rule. For example, <code>create</code> or <code>update</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The action integration configuration for triggering automated workflows or actions in external systems.</p>
     */
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>A collection of key-value pairs attached to the alert as annotations. Use annotations to provide additional, non-identifying information, such as descriptions or runbook links.</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>Configuration for integrating with Application Real-Time Monitoring Service (ARMS).</p>
     */
    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The condition configuration that specifies the trigger criteria for the alert.</p>
     */
    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The content template for the alert notification. You can use variables to customize the message.</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The data source configuration for the alert rule.</p>
     */
    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The display name of the alert rule, as shown in the console.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether the alert rule is enabled. A value of <code>true</code> indicates the rule is active, and <code>false</code> indicates it is inactive. Default: <code>true</code>.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>A collection of key-value pairs attached to the alert rule as labels. Use labels for categorization and filtering.</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The notification configuration that specifies how and where to send alert notifications.</p>
     */
    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The query configuration that defines the data for rule evaluation.</p>
     */
    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The schedule configuration that determines how often the system evaluates the rule.</p>
     */
    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The unique identifier (UUID) of the alert rule. This parameter is required when you update or delete an existing rule.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>A list of UUIDs. Use this parameter to perform bulk actions on multiple rules, such as batch deletion.</p>
     */
    @NameInMap("uuidList")
    public java.util.List<String> uuidList;

    /**
     * <p>The ID of the workspace that contains the alert rule.</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ManageAlertRulesUnifiedActionInput build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesUnifiedActionInput self = new ManageAlertRulesUnifiedActionInput();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesUnifiedActionInput setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ManageAlertRulesUnifiedActionInput setActionIntegrationConfig(ActionIntegrationConfig actionIntegrationConfig) {
        this.actionIntegrationConfig = actionIntegrationConfig;
        return this;
    }
    public ActionIntegrationConfig getActionIntegrationConfig() {
        return this.actionIntegrationConfig;
    }

    public ManageAlertRulesUnifiedActionInput setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public ManageAlertRulesUnifiedActionInput setArmsIntegrationConfig(ArmsIntegrationConfig armsIntegrationConfig) {
        this.armsIntegrationConfig = armsIntegrationConfig;
        return this;
    }
    public ArmsIntegrationConfig getArmsIntegrationConfig() {
        return this.armsIntegrationConfig;
    }

    public ManageAlertRulesUnifiedActionInput setConditionConfig(ConditionConfigUnified conditionConfig) {
        this.conditionConfig = conditionConfig;
        return this;
    }
    public ConditionConfigUnified getConditionConfig() {
        return this.conditionConfig;
    }

    public ManageAlertRulesUnifiedActionInput setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    public String getContentTemplate() {
        return this.contentTemplate;
    }

    public ManageAlertRulesUnifiedActionInput setDatasourceConfig(DatasourceConfigUnified datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
        return this;
    }
    public DatasourceConfigUnified getDatasourceConfig() {
        return this.datasourceConfig;
    }

    public ManageAlertRulesUnifiedActionInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ManageAlertRulesUnifiedActionInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ManageAlertRulesUnifiedActionInput setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ManageAlertRulesUnifiedActionInput setNotifyConfig(NotifyConfigUnified notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public NotifyConfigUnified getNotifyConfig() {
        return this.notifyConfig;
    }

    public ManageAlertRulesUnifiedActionInput setQueryConfig(QueryConfigUnified queryConfig) {
        this.queryConfig = queryConfig;
        return this;
    }
    public QueryConfigUnified getQueryConfig() {
        return this.queryConfig;
    }

    public ManageAlertRulesUnifiedActionInput setScheduleConfig(ScheduleConfigUnified scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public ScheduleConfigUnified getScheduleConfig() {
        return this.scheduleConfig;
    }

    public ManageAlertRulesUnifiedActionInput setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public ManageAlertRulesUnifiedActionInput setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public ManageAlertRulesUnifiedActionInput setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
