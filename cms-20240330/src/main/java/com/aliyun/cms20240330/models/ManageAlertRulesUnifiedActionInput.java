// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesUnifiedActionInput extends TeaModel {
    /**
     * <p>The action type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The action integration configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:true,&quot;actions&quot;:[]}</p>
     */
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>The annotations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;summary&quot;:&quot;CPU usage exceeds 90%&quot;}</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>The ARMS integration configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:false}</p>
     */
    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The business source (optional). Examples: managed_service_for_prometheus, umodel, application_insights, cloud_monitoring, sls. Provide as needed for CREATE/UPDATE/PATCH.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("bizSource")
    public String bizSource;

    /**
     * <p>The aggregated condition configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;PROMETHEUS_SIMPLE_CONDITION&quot;,&quot;durationSecs&quot;:0,&quot;severity&quot;:&quot;CRITICAL&quot;}</p>
     */
    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The content template.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance {{instance}} CPU usage exceeds {{threshold}}%</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The aggregated data source configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;PROMETHEUS&quot;,&quot;instanceId&quot;:&quot;prom-cn-hangzhou-xxxxx&quot;}</p>
     */
    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>1783728000000</p>
     */
    @NameInMap("drillEvalTime")
    public Long drillEvalTime;

    /**
     * <strong>example:</strong>
     * <p>ONE_SHOT</p>
     */
    @NameInMap("drillMode")
    public String drillMode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;startTime&quot;:1783728000000,&quot;endTime&quot;:1783814400000}</p>
     */
    @NameInMap("drillTimeRange")
    public ManageAlertRulesUnifiedActionInputDrillTimeRange drillTimeRange;

    /**
     * <p>Specifies whether the rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;production&quot;}</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The aggregated notification configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;DIRECT_NOTIFY&quot;,&quot;channels&quot;:[{&quot;type&quot;:&quot;GROUP&quot;,&quot;identifiers&quot;:[&quot;<contact-group-id>&quot;]}]}</p>
     */
    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The observable resource configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;relationType&quot;:&quot;CLOUD_INSTANCE&quot;,&quot;resources&quot;:[]}</p>
     */
    @NameInMap("observeResourceConfig")
    public ObserveResourceConfig observeResourceConfig;

    /**
     * <p><strong>[Deprecated]</strong> The monitored object instance ID. Use observeResourceConfig.resources instead. Retained only for backward compatibility with legacy SDKs.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("observeResourceInstanceId")
    @Deprecated
    public String observeResourceInstanceId;

    /**
     * <p><strong>[Deprecated]</strong> The monitored object resource type. Use observeResourceConfig.entityType instead. Retained only for backward compatibility with legacy SDKs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("observeResourceType")
    @Deprecated
    public String observeResourceType;

    /**
     * <p>The aggregated query configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;PROMETHEUS_SINGLE_QUERY&quot;,&quot;expr&quot;:&quot;up &gt; 0&quot;}</p>
     */
    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The root cause analysis (RCA) configuration (optional). Provide as needed for CREATE/UPDATE/PATCH.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:false}</p>
     */
    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    /**
     * <p>The region ID. Aligned with V1 AlertRule.regionId. If not provided, the gateway callerRegionId is used.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The aggregated schedule configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;FIXED&quot;,&quot;intervalSecs&quot;:60}</p>
     */
    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The UUID of the rule. Required for UPDATE/PATCH.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The list of rule UUIDs to delete (BATCH_DELETE).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cms_v2_81d01768-fee9-459f-af49-ab2704f1db2b&quot;]</p>
     */
    @NameInMap("uuidList")
    public java.util.List<String> uuidList;

    /**
     * <p>The workspace. Required for CREATE/UPDATE and other actions.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
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

    public ManageAlertRulesUnifiedActionInput setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
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

    public ManageAlertRulesUnifiedActionInput setDrillEvalTime(Long drillEvalTime) {
        this.drillEvalTime = drillEvalTime;
        return this;
    }
    public Long getDrillEvalTime() {
        return this.drillEvalTime;
    }

    public ManageAlertRulesUnifiedActionInput setDrillMode(String drillMode) {
        this.drillMode = drillMode;
        return this;
    }
    public String getDrillMode() {
        return this.drillMode;
    }

    public ManageAlertRulesUnifiedActionInput setDrillTimeRange(ManageAlertRulesUnifiedActionInputDrillTimeRange drillTimeRange) {
        this.drillTimeRange = drillTimeRange;
        return this;
    }
    public ManageAlertRulesUnifiedActionInputDrillTimeRange getDrillTimeRange() {
        return this.drillTimeRange;
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

    public ManageAlertRulesUnifiedActionInput setObserveResourceConfig(ObserveResourceConfig observeResourceConfig) {
        this.observeResourceConfig = observeResourceConfig;
        return this;
    }
    public ObserveResourceConfig getObserveResourceConfig() {
        return this.observeResourceConfig;
    }

    @Deprecated
    public ManageAlertRulesUnifiedActionInput setObserveResourceInstanceId(String observeResourceInstanceId) {
        this.observeResourceInstanceId = observeResourceInstanceId;
        return this;
    }
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    @Deprecated
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

    public ManageAlertRulesUnifiedActionInput setRcaConfig(AlertRuleRcaConfig rcaConfig) {
        this.rcaConfig = rcaConfig;
        return this;
    }
    public AlertRuleRcaConfig getRcaConfig() {
        return this.rcaConfig;
    }

    public ManageAlertRulesUnifiedActionInput setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public static class ManageAlertRulesUnifiedActionInputDrillTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1783814400000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1783728000000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static ManageAlertRulesUnifiedActionInputDrillTimeRange build(java.util.Map<String, ?> map) throws Exception {
            ManageAlertRulesUnifiedActionInputDrillTimeRange self = new ManageAlertRulesUnifiedActionInputDrillTimeRange();
            return TeaModel.build(map, self);
        }

        public ManageAlertRulesUnifiedActionInputDrillTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ManageAlertRulesUnifiedActionInputDrillTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
