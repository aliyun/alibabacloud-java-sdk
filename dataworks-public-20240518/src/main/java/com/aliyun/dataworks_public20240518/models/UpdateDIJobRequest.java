// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDIJobRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the Id parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("JobSettings")
    public UpdateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResourceSettings")
    public UpdateDIJobRequestResourceSettings resourceSettings;

    @NameInMap("TableMappings")
    public java.util.List<UpdateDIJobRequestTableMappings> tableMappings;

    @NameInMap("TransformationRules")
    public java.util.List<UpdateDIJobRequestTransformationRules> transformationRules;

    public static UpdateDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIJobRequest self = new UpdateDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public UpdateDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public UpdateDIJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDIJobRequest setJobSettings(UpdateDIJobRequestJobSettings jobSettings) {
        this.jobSettings = jobSettings;
        return this;
    }
    public UpdateDIJobRequestJobSettings getJobSettings() {
        return this.jobSettings;
    }

    public UpdateDIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDIJobRequest setResourceSettings(UpdateDIJobRequestResourceSettings resourceSettings) {
        this.resourceSettings = resourceSettings;
        return this;
    }
    public UpdateDIJobRequestResourceSettings getResourceSettings() {
        return this.resourceSettings;
    }

    public UpdateDIJobRequest setTableMappings(java.util.List<UpdateDIJobRequestTableMappings> tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }
    public java.util.List<UpdateDIJobRequestTableMappings> getTableMappings() {
        return this.tableMappings;
    }

    public UpdateDIJobRequest setTransformationRules(java.util.List<UpdateDIJobRequestTransformationRules> transformationRules) {
        this.transformationRules = transformationRules;
        return this;
    }
    public java.util.List<UpdateDIJobRequestTransformationRules> getTransformationRules() {
        return this.transformationRules;
    }

    public static class UpdateDIJobRequestJobSettingsColumnDataTypeSettings extends TeaModel {
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        @NameInMap("SourceDataType")
        public String sourceDataType;

        public static UpdateDIJobRequestJobSettingsColumnDataTypeSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestJobSettingsColumnDataTypeSettings self = new UpdateDIJobRequestJobSettingsColumnDataTypeSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestJobSettingsColumnDataTypeSettings setDestinationDataType(String destinationDataType) {
            this.destinationDataType = destinationDataType;
            return this;
        }
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        public UpdateDIJobRequestJobSettingsColumnDataTypeSettings setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

    }

    public static class UpdateDIJobRequestJobSettingsCycleScheduleSettings extends TeaModel {
        @NameInMap("ScheduleParameters")
        public String scheduleParameters;

        public static UpdateDIJobRequestJobSettingsCycleScheduleSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestJobSettingsCycleScheduleSettings self = new UpdateDIJobRequestJobSettingsCycleScheduleSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestJobSettingsCycleScheduleSettings setScheduleParameters(String scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

    }

    public static class UpdateDIJobRequestJobSettingsDdlHandlingSettings extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Type")
        public String type;

        public static UpdateDIJobRequestJobSettingsDdlHandlingSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestJobSettingsDdlHandlingSettings self = new UpdateDIJobRequestJobSettingsDdlHandlingSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestJobSettingsDdlHandlingSettings setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateDIJobRequestJobSettingsDdlHandlingSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDIJobRequestJobSettingsRuntimeSettings extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static UpdateDIJobRequestJobSettingsRuntimeSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestJobSettingsRuntimeSettings self = new UpdateDIJobRequestJobSettingsRuntimeSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestJobSettingsRuntimeSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDIJobRequestJobSettingsRuntimeSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDIJobRequestJobSettings extends TeaModel {
        @NameInMap("ChannelSettings")
        public String channelSettings;

        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        @NameInMap("CycleScheduleSettings")
        public UpdateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        @NameInMap("DdlHandlingSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        @NameInMap("RuntimeSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsRuntimeSettings> runtimeSettings;

        public static UpdateDIJobRequestJobSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestJobSettings self = new UpdateDIJobRequestJobSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestJobSettings setChannelSettings(String channelSettings) {
            this.channelSettings = channelSettings;
            return this;
        }
        public String getChannelSettings() {
            return this.channelSettings;
        }

        public UpdateDIJobRequestJobSettings setColumnDataTypeSettings(java.util.List<UpdateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings) {
            this.columnDataTypeSettings = columnDataTypeSettings;
            return this;
        }
        public java.util.List<UpdateDIJobRequestJobSettingsColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        public UpdateDIJobRequestJobSettings setCycleScheduleSettings(UpdateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings) {
            this.cycleScheduleSettings = cycleScheduleSettings;
            return this;
        }
        public UpdateDIJobRequestJobSettingsCycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        public UpdateDIJobRequestJobSettings setDdlHandlingSettings(java.util.List<UpdateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings) {
            this.ddlHandlingSettings = ddlHandlingSettings;
            return this;
        }
        public java.util.List<UpdateDIJobRequestJobSettingsDdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        public UpdateDIJobRequestJobSettings setRuntimeSettings(java.util.List<UpdateDIJobRequestJobSettingsRuntimeSettings> runtimeSettings) {
            this.runtimeSettings = runtimeSettings;
            return this;
        }
        public java.util.List<UpdateDIJobRequestJobSettingsRuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

    }

    public static class UpdateDIJobRequestResourceSettingsOfflineResourceSettings extends TeaModel {
        @NameInMap("RequestedCu")
        public Double requestedCu;

        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static UpdateDIJobRequestResourceSettingsOfflineResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestResourceSettingsOfflineResourceSettings self = new UpdateDIJobRequestResourceSettingsOfflineResourceSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class UpdateDIJobRequestResourceSettingsRealtimeResourceSettings extends TeaModel {
        @NameInMap("RequestedCu")
        public Double requestedCu;

        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static UpdateDIJobRequestResourceSettingsRealtimeResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestResourceSettingsRealtimeResourceSettings self = new UpdateDIJobRequestResourceSettingsRealtimeResourceSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class UpdateDIJobRequestResourceSettingsScheduleResourceSettings extends TeaModel {
        @NameInMap("RequestedCu")
        public Double requestedCu;

        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static UpdateDIJobRequestResourceSettingsScheduleResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestResourceSettingsScheduleResourceSettings self = new UpdateDIJobRequestResourceSettingsScheduleResourceSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestResourceSettingsScheduleResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public UpdateDIJobRequestResourceSettingsScheduleResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class UpdateDIJobRequestResourceSettings extends TeaModel {
        @NameInMap("OfflineResourceSettings")
        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        @NameInMap("RealtimeResourceSettings")
        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        @NameInMap("ScheduleResourceSettings")
        public UpdateDIJobRequestResourceSettingsScheduleResourceSettings scheduleResourceSettings;

        public static UpdateDIJobRequestResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestResourceSettings self = new UpdateDIJobRequestResourceSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestResourceSettings setOfflineResourceSettings(UpdateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings) {
            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        public UpdateDIJobRequestResourceSettings setRealtimeResourceSettings(UpdateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {
            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        public UpdateDIJobRequestResourceSettings setScheduleResourceSettings(UpdateDIJobRequestResourceSettingsScheduleResourceSettings scheduleResourceSettings) {
            this.scheduleResourceSettings = scheduleResourceSettings;
            return this;
        }
        public UpdateDIJobRequestResourceSettingsScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

    }

    public static class UpdateDIJobRequestTableMappingsSourceObjectSelectionRules extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("ExpressionType")
        public String expressionType;

        @NameInMap("ObjectType")
        public String objectType;

        public static UpdateDIJobRequestTableMappingsSourceObjectSelectionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestTableMappingsSourceObjectSelectionRules self = new UpdateDIJobRequestTableMappingsSourceObjectSelectionRules();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestTableMappingsSourceObjectSelectionRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateDIJobRequestTableMappingsSourceObjectSelectionRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDIJobRequestTableMappingsSourceObjectSelectionRules setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public UpdateDIJobRequestTableMappingsSourceObjectSelectionRules setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class UpdateDIJobRequestTableMappingsTransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static UpdateDIJobRequestTableMappingsTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestTableMappingsTransformationRules self = new UpdateDIJobRequestTableMappingsTransformationRules();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestTableMappingsTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public UpdateDIJobRequestTableMappingsTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateDIJobRequestTableMappingsTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class UpdateDIJobRequestTableMappings extends TeaModel {
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<UpdateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        @NameInMap("TransformationRules")
        public java.util.List<UpdateDIJobRequestTableMappingsTransformationRules> transformationRules;

        public static UpdateDIJobRequestTableMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestTableMappings self = new UpdateDIJobRequestTableMappings();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestTableMappings setSourceObjectSelectionRules(java.util.List<UpdateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules) {
            this.sourceObjectSelectionRules = sourceObjectSelectionRules;
            return this;
        }
        public java.util.List<UpdateDIJobRequestTableMappingsSourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        public UpdateDIJobRequestTableMappings setTransformationRules(java.util.List<UpdateDIJobRequestTableMappingsTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<UpdateDIJobRequestTableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

    public static class UpdateDIJobRequestTransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("RuleExpression")
        public String ruleExpression;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static UpdateDIJobRequestTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIJobRequestTransformationRules self = new UpdateDIJobRequestTransformationRules();
            return TeaModel.build(map, self);
        }

        public UpdateDIJobRequestTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public UpdateDIJobRequestTransformationRules setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public UpdateDIJobRequestTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateDIJobRequestTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

}
