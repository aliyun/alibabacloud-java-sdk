// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesUnifiedActionInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("action")
    public String action;

    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    @NameInMap("contentTemplate")
    public String contentTemplate;

    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    @NameInMap("observeResourceInstanceId")
    public String observeResourceInstanceId;

    @NameInMap("observeResourceType")
    public String observeResourceType;

    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    @NameInMap("uuid")
    public String uuid;

    @NameInMap("uuidList")
    public java.util.List<String> uuidList;

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

    public ManageAlertRulesUnifiedActionInput setObserveResourceInstanceId(String observeResourceInstanceId) {
        this.observeResourceInstanceId = observeResourceInstanceId;
        return this;
    }
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    public ManageAlertRulesUnifiedActionInput setObserveResourceType(String observeResourceType) {
        this.observeResourceType = observeResourceType;
        return this;
    }
    public String getObserveResourceType() {
        return this.observeResourceType;
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
