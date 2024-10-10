// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationDataSourceSettings")
    public java.util.List<CreateDIJobRequestDestinationDataSourceSettings> destinationDataSourceSettings;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobSettings")
    public CreateDIJobRequestJobSettings jobSettings;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSettings")
    public CreateDIJobRequestResourceSettings resourceSettings;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public java.util.List<CreateDIJobRequestSourceDataSourceSettings> sourceDataSourceSettings;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMappings")
    public java.util.List<CreateDIJobRequestTableMappings> tableMappings;

    @NameInMap("TransformationRules")
    public java.util.List<CreateDIJobRequestTransformationRules> transformationRules;

    public static CreateDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobRequest self = new CreateDIJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDIJobRequest setDestinationDataSourceSettings(java.util.List<CreateDIJobRequestDestinationDataSourceSettings> destinationDataSourceSettings) {
        this.destinationDataSourceSettings = destinationDataSourceSettings;
        return this;
    }
    public java.util.List<CreateDIJobRequestDestinationDataSourceSettings> getDestinationDataSourceSettings() {
        return this.destinationDataSourceSettings;
    }

    public CreateDIJobRequest setDestinationDataSourceType(String destinationDataSourceType) {
        this.destinationDataSourceType = destinationDataSourceType;
        return this;
    }
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    public CreateDIJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateDIJobRequest setJobSettings(CreateDIJobRequestJobSettings jobSettings) {
        this.jobSettings = jobSettings;
        return this;
    }
    public CreateDIJobRequestJobSettings getJobSettings() {
        return this.jobSettings;
    }

    public CreateDIJobRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public CreateDIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDIJobRequest setResourceSettings(CreateDIJobRequestResourceSettings resourceSettings) {
        this.resourceSettings = resourceSettings;
        return this;
    }
    public CreateDIJobRequestResourceSettings getResourceSettings() {
        return this.resourceSettings;
    }

    public CreateDIJobRequest setSourceDataSourceSettings(java.util.List<CreateDIJobRequestSourceDataSourceSettings> sourceDataSourceSettings) {
        this.sourceDataSourceSettings = sourceDataSourceSettings;
        return this;
    }
    public java.util.List<CreateDIJobRequestSourceDataSourceSettings> getSourceDataSourceSettings() {
        return this.sourceDataSourceSettings;
    }

    public CreateDIJobRequest setSourceDataSourceType(String sourceDataSourceType) {
        this.sourceDataSourceType = sourceDataSourceType;
        return this;
    }
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    public CreateDIJobRequest setTableMappings(java.util.List<CreateDIJobRequestTableMappings> tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }
    public java.util.List<CreateDIJobRequestTableMappings> getTableMappings() {
        return this.tableMappings;
    }

    public CreateDIJobRequest setTransformationRules(java.util.List<CreateDIJobRequestTransformationRules> transformationRules) {
        this.transformationRules = transformationRules;
        return this;
    }
    public java.util.List<CreateDIJobRequestTransformationRules> getTransformationRules() {
        return this.transformationRules;
    }

    public static class CreateDIJobRequestDestinationDataSourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>holo_datasource_1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        public static CreateDIJobRequestDestinationDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestDestinationDataSourceSettings self = new CreateDIJobRequestDestinationDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestDestinationDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

    }

    public static class CreateDIJobRequestJobSettingsColumnDataTypeSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("SourceDataType")
        public String sourceDataType;

        public static CreateDIJobRequestJobSettingsColumnDataTypeSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestJobSettingsColumnDataTypeSettings self = new CreateDIJobRequestJobSettingsColumnDataTypeSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestJobSettingsColumnDataTypeSettings setDestinationDataType(String destinationDataType) {
            this.destinationDataType = destinationDataType;
            return this;
        }
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        public CreateDIJobRequestJobSettingsColumnDataTypeSettings setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

    }

    public static class CreateDIJobRequestJobSettingsCycleScheduleSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("CycleMigrationType")
        public String cycleMigrationType;

        /**
         * <strong>example:</strong>
         * <p>bizdate=$bizdate</p>
         */
        @NameInMap("ScheduleParameters")
        public String scheduleParameters;

        public static CreateDIJobRequestJobSettingsCycleScheduleSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestJobSettingsCycleScheduleSettings self = new CreateDIJobRequestJobSettingsCycleScheduleSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestJobSettingsCycleScheduleSettings setCycleMigrationType(String cycleMigrationType) {
            this.cycleMigrationType = cycleMigrationType;
            return this;
        }
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        public CreateDIJobRequestJobSettingsCycleScheduleSettings setScheduleParameters(String scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

    }

    public static class CreateDIJobRequestJobSettingsDdlHandlingSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>AddColumn</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDIJobRequestJobSettingsDdlHandlingSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestJobSettingsDdlHandlingSettings self = new CreateDIJobRequestJobSettingsDdlHandlingSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestJobSettingsDdlHandlingSettings setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateDIJobRequestJobSettingsDdlHandlingSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDIJobRequestJobSettingsRuntimeSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDIJobRequestJobSettingsRuntimeSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestJobSettingsRuntimeSettings self = new CreateDIJobRequestJobSettingsRuntimeSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestJobSettingsRuntimeSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDIJobRequestJobSettingsRuntimeSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDIJobRequestJobSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        @NameInMap("CycleScheduleSettings")
        public CreateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        @NameInMap("DdlHandlingSettings")
        public java.util.List<CreateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        @NameInMap("RuntimeSettings")
        public java.util.List<CreateDIJobRequestJobSettingsRuntimeSettings> runtimeSettings;

        public static CreateDIJobRequestJobSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestJobSettings self = new CreateDIJobRequestJobSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestJobSettings setChannelSettings(String channelSettings) {
            this.channelSettings = channelSettings;
            return this;
        }
        public String getChannelSettings() {
            return this.channelSettings;
        }

        public CreateDIJobRequestJobSettings setColumnDataTypeSettings(java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings) {
            this.columnDataTypeSettings = columnDataTypeSettings;
            return this;
        }
        public java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        public CreateDIJobRequestJobSettings setCycleScheduleSettings(CreateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings) {
            this.cycleScheduleSettings = cycleScheduleSettings;
            return this;
        }
        public CreateDIJobRequestJobSettingsCycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        public CreateDIJobRequestJobSettings setDdlHandlingSettings(java.util.List<CreateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings) {
            this.ddlHandlingSettings = ddlHandlingSettings;
            return this;
        }
        public java.util.List<CreateDIJobRequestJobSettingsDdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        public CreateDIJobRequestJobSettings setRuntimeSettings(java.util.List<CreateDIJobRequestJobSettingsRuntimeSettings> runtimeSettings) {
            this.runtimeSettings = runtimeSettings;
            return this;
        }
        public java.util.List<CreateDIJobRequestJobSettingsRuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

    }

    public static class CreateDIJobRequestResourceSettingsOfflineResourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static CreateDIJobRequestResourceSettingsOfflineResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestResourceSettingsOfflineResourceSettings self = new CreateDIJobRequestResourceSettingsOfflineResourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestResourceSettingsOfflineResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public CreateDIJobRequestResourceSettingsOfflineResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class CreateDIJobRequestResourceSettingsRealtimeResourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static CreateDIJobRequestResourceSettingsRealtimeResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestResourceSettingsRealtimeResourceSettings self = new CreateDIJobRequestResourceSettingsRealtimeResourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class CreateDIJobRequestResourceSettingsScheduleResourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_235454102432001_1579085295030</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static CreateDIJobRequestResourceSettingsScheduleResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestResourceSettingsScheduleResourceSettings self = new CreateDIJobRequestResourceSettingsScheduleResourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestResourceSettingsScheduleResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public CreateDIJobRequestResourceSettingsScheduleResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class CreateDIJobRequestResourceSettings extends TeaModel {
        @NameInMap("OfflineResourceSettings")
        public CreateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        @NameInMap("RealtimeResourceSettings")
        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        @NameInMap("ScheduleResourceSettings")
        public CreateDIJobRequestResourceSettingsScheduleResourceSettings scheduleResourceSettings;

        public static CreateDIJobRequestResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestResourceSettings self = new CreateDIJobRequestResourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestResourceSettings setOfflineResourceSettings(CreateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings) {
            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        public CreateDIJobRequestResourceSettingsOfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        public CreateDIJobRequestResourceSettings setRealtimeResourceSettings(CreateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {
            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        public CreateDIJobRequestResourceSettings setScheduleResourceSettings(CreateDIJobRequestResourceSettingsScheduleResourceSettings scheduleResourceSettings) {
            this.scheduleResourceSettings = scheduleResourceSettings;
            return this;
        }
        public CreateDIJobRequestResourceSettingsScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

    }

    public static class CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties self = new CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class CreateDIJobRequestSourceDataSourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mysql_datasource_1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceProperties")
        public CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties dataSourceProperties;

        public static CreateDIJobRequestSourceDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestSourceDataSourceSettings self = new CreateDIJobRequestSourceDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestSourceDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public CreateDIJobRequestSourceDataSourceSettings setDataSourceProperties(CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class CreateDIJobRequestTableMappingsSourceObjectSelectionRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>mysql_table_1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        public static CreateDIJobRequestTableMappingsSourceObjectSelectionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestTableMappingsSourceObjectSelectionRules self = new CreateDIJobRequestTableMappingsSourceObjectSelectionRules();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestTableMappingsSourceObjectSelectionRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateDIJobRequestTableMappingsSourceObjectSelectionRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDIJobRequestTableMappingsSourceObjectSelectionRules setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public CreateDIJobRequestTableMappingsSourceObjectSelectionRules setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class CreateDIJobRequestTableMappingsTransformationRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static CreateDIJobRequestTableMappingsTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestTableMappingsTransformationRules self = new CreateDIJobRequestTableMappingsTransformationRules();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestTableMappingsTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public CreateDIJobRequestTableMappingsTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateDIJobRequestTableMappingsTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class CreateDIJobRequestTableMappings extends TeaModel {
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        @NameInMap("TransformationRules")
        public java.util.List<CreateDIJobRequestTableMappingsTransformationRules> transformationRules;

        public static CreateDIJobRequestTableMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestTableMappings self = new CreateDIJobRequestTableMappings();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestTableMappings setSourceObjectSelectionRules(java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules) {
            this.sourceObjectSelectionRules = sourceObjectSelectionRules;
            return this;
        }
        public java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        public CreateDIJobRequestTableMappings setTransformationRules(java.util.List<CreateDIJobRequestTableMappingsTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<CreateDIJobRequestTableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

    public static class CreateDIJobRequestTransformationRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static CreateDIJobRequestTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestTransformationRules self = new CreateDIJobRequestTransformationRules();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public CreateDIJobRequestTransformationRules setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public CreateDIJobRequestTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateDIJobRequestTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

}
