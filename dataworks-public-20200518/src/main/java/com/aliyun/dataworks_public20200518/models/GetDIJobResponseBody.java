// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDIJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobResponseBody self = new GetDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIJobResponseBody setData(GetDIJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDIJobResponseBodyData getData() {
        return this.data;
    }

    public GetDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDIJobResponseBodyDataDestinationDataSourceSettings extends TeaModel {
        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceProperties")
        public java.util.Map<String, String> dataSourceProperties;

        public static GetDIJobResponseBodyDataDestinationDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataDestinationDataSourceSettings self = new GetDIJobResponseBodyDataDestinationDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataDestinationDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDIJobResponseBodyDataDestinationDataSourceSettings setDataSourceProperties(java.util.Map<String, String> dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public java.util.Map<String, String> getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings extends TeaModel {
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        @NameInMap("SourceDataType")
        public String sourceDataType;

        public static GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings self = new GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings setDestinationDataType(String destinationDataType) {
            this.destinationDataType = destinationDataType;
            return this;
        }
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        public GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

    }

    public static class GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings extends TeaModel {
        @NameInMap("CycleMigrationType")
        public String cycleMigrationType;

        @NameInMap("ScheduleParameters")
        public String scheduleParameters;

        public static GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings self = new GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings setCycleMigrationType(String cycleMigrationType) {
            this.cycleMigrationType = cycleMigrationType;
            return this;
        }
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        public GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings setScheduleParameters(String scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

    }

    public static class GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Type")
        public String type;

        public static GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings self = new GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDIJobResponseBodyDataJobSettingsRuntimeSettings extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetDIJobResponseBodyDataJobSettingsRuntimeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataJobSettingsRuntimeSettings self = new GetDIJobResponseBodyDataJobSettingsRuntimeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataJobSettingsRuntimeSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDIJobResponseBodyDataJobSettingsRuntimeSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDIJobResponseBodyDataJobSettings extends TeaModel {
        @NameInMap("ChannelSettings")
        public String channelSettings;

        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings cycleScheduleSettings;

        @NameInMap("DdlHandlingSettings")
        public java.util.List<GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        @NameInMap("RuntimeSettings")
        public java.util.List<GetDIJobResponseBodyDataJobSettingsRuntimeSettings> runtimeSettings;

        public static GetDIJobResponseBodyDataJobSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataJobSettings self = new GetDIJobResponseBodyDataJobSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataJobSettings setChannelSettings(String channelSettings) {
            this.channelSettings = channelSettings;
            return this;
        }
        public String getChannelSettings() {
            return this.channelSettings;
        }

        public GetDIJobResponseBodyDataJobSettings setColumnDataTypeSettings(java.util.List<GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings> columnDataTypeSettings) {
            this.columnDataTypeSettings = columnDataTypeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        public GetDIJobResponseBodyDataJobSettings setCycleScheduleSettings(GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings cycleScheduleSettings) {
            this.cycleScheduleSettings = cycleScheduleSettings;
            return this;
        }
        public GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        public GetDIJobResponseBodyDataJobSettings setDdlHandlingSettings(java.util.List<GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings> ddlHandlingSettings) {
            this.ddlHandlingSettings = ddlHandlingSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        public GetDIJobResponseBodyDataJobSettings setRuntimeSettings(java.util.List<GetDIJobResponseBodyDataJobSettingsRuntimeSettings> runtimeSettings) {
            this.runtimeSettings = runtimeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataJobSettingsRuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

    }

    public static class GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings extends TeaModel {
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings self = new GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings extends TeaModel {
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings self = new GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyDataResourceSettings extends TeaModel {
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings offlineResourceSettings;

        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        public static GetDIJobResponseBodyDataResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataResourceSettings self = new GetDIJobResponseBodyDataResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataResourceSettings setOfflineResourceSettings(GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings offlineResourceSettings) {
            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        public GetDIJobResponseBodyDataResourceSettings setRealtimeResourceSettings(GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {
            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

    }

    public static class GetDIJobResponseBodyDataSourceDataSourceSettings extends TeaModel {
        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceProperties")
        public java.util.Map<String, String> dataSourceProperties;

        public static GetDIJobResponseBodyDataSourceDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataSourceDataSourceSettings self = new GetDIJobResponseBodyDataSourceDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataSourceDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDIJobResponseBodyDataSourceDataSourceSettings setDataSourceProperties(java.util.Map<String, String> dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public java.util.Map<String, String> getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("ObjectType")
        public String objectType;

        public static GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules self = new GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetDIJobResponseBodyDataTableMappingsTransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static GetDIJobResponseBodyDataTableMappingsTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataTableMappingsTransformationRules self = new GetDIJobResponseBodyDataTableMappingsTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataTableMappingsTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyDataTableMappingsTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyDataTableMappingsTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyDataTableMappings extends TeaModel {
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyDataTableMappingsTransformationRules> transformationRules;

        public static GetDIJobResponseBodyDataTableMappings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataTableMappings self = new GetDIJobResponseBodyDataTableMappings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataTableMappings setSourceObjectSelectionRules(java.util.List<GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules) {
            this.sourceObjectSelectionRules = sourceObjectSelectionRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        public GetDIJobResponseBodyDataTableMappings setTransformationRules(java.util.List<GetDIJobResponseBodyDataTableMappingsTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataTableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

    public static class GetDIJobResponseBodyDataTransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("RuleExpression")
        public String ruleExpression;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static GetDIJobResponseBodyDataTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyDataTransformationRules self = new GetDIJobResponseBodyDataTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyDataTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyDataTransformationRules setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public GetDIJobResponseBodyDataTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyDataTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("CreatedUid")
        public String createdUid;

        @NameInMap("DIJobId")
        public Long DIJobId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyDataDestinationDataSourceSettings> destinationDataSourceSettings;

        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobSettings")
        public GetDIJobResponseBodyDataJobSettings jobSettings;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("MigrationType")
        public String migrationType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ResourceSettings")
        public GetDIJobResponseBodyDataResourceSettings resourceSettings;

        @NameInMap("RunStats")
        public java.util.Map<String, String> runStats;

        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyDataSourceDataSourceSettings> sourceDataSourceSettings;

        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        @NameInMap("StartedTime")
        public Long startedTime;

        @NameInMap("StartedUid")
        public String startedUid;

        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyDataTableMappings> tableMappings;

        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyDataTransformationRules> transformationRules;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("UpdatedUid")
        public String updatedUid;

        public static GetDIJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyData self = new GetDIJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetDIJobResponseBodyData setCreatedUid(String createdUid) {
            this.createdUid = createdUid;
            return this;
        }
        public String getCreatedUid() {
            return this.createdUid;
        }

        public GetDIJobResponseBodyData setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public GetDIJobResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDIJobResponseBodyData setDestinationDataSourceSettings(java.util.List<GetDIJobResponseBodyDataDestinationDataSourceSettings> destinationDataSourceSettings) {
            this.destinationDataSourceSettings = destinationDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataDestinationDataSourceSettings> getDestinationDataSourceSettings() {
            return this.destinationDataSourceSettings;
        }

        public GetDIJobResponseBodyData setDestinationDataSourceType(String destinationDataSourceType) {
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        public GetDIJobResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDIJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetDIJobResponseBodyData setJobSettings(GetDIJobResponseBodyDataJobSettings jobSettings) {
            this.jobSettings = jobSettings;
            return this;
        }
        public GetDIJobResponseBodyDataJobSettings getJobSettings() {
            return this.jobSettings;
        }

        public GetDIJobResponseBodyData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetDIJobResponseBodyData setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public GetDIJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDIJobResponseBodyData setResourceSettings(GetDIJobResponseBodyDataResourceSettings resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public GetDIJobResponseBodyDataResourceSettings getResourceSettings() {
            return this.resourceSettings;
        }

        public GetDIJobResponseBodyData setRunStats(java.util.Map<String, String> runStats) {
            this.runStats = runStats;
            return this;
        }
        public java.util.Map<String, String> getRunStats() {
            return this.runStats;
        }

        public GetDIJobResponseBodyData setSourceDataSourceSettings(java.util.List<GetDIJobResponseBodyDataSourceDataSourceSettings> sourceDataSourceSettings) {
            this.sourceDataSourceSettings = sourceDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataSourceDataSourceSettings> getSourceDataSourceSettings() {
            return this.sourceDataSourceSettings;
        }

        public GetDIJobResponseBodyData setSourceDataSourceType(String sourceDataSourceType) {
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        public GetDIJobResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetDIJobResponseBodyData setStartedUid(String startedUid) {
            this.startedUid = startedUid;
            return this;
        }
        public String getStartedUid() {
            return this.startedUid;
        }

        public GetDIJobResponseBodyData setTableMappings(java.util.List<GetDIJobResponseBodyDataTableMappings> tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataTableMappings> getTableMappings() {
            return this.tableMappings;
        }

        public GetDIJobResponseBodyData setTransformationRules(java.util.List<GetDIJobResponseBodyDataTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyDataTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public GetDIJobResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetDIJobResponseBodyData setUpdatedUid(String updatedUid) {
            this.updatedUid = updatedUid;
            return this;
        }
        public String getUpdatedUid() {
            return this.updatedUid;
        }

    }

}
