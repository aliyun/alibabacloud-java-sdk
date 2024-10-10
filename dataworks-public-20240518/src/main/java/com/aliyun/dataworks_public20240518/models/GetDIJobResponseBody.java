// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public GetDIJobResponseBodyPagingInfo pagingInfo;

    /**
     * <p>代表创建时间的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobResponseBody self = new GetDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIJobResponseBody setPagingInfo(GetDIJobResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public GetDIJobResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public GetDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dw_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        public static GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings self = new GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings setDestinationDataType(String destinationDataType) {
            this.destinationDataType = destinationDataType;
            return this;
        }
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings setCycleMigrationType(String cycleMigrationType) {
            this.cycleMigrationType = cycleMigrationType;
            return this;
        }
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings setScheduleParameters(String scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>CreateTable</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings;

        @NameInMap("DdlHandlingSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        @NameInMap("RuntimeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> runtimeSettings;

        public static GetDIJobResponseBodyPagingInfoJobSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettings self = new GetDIJobResponseBodyPagingInfoJobSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setChannelSettings(String channelSettings) {
            this.channelSettings = channelSettings;
            return this;
        }
        public String getChannelSettings() {
            return this.channelSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setColumnDataTypeSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings) {
            this.columnDataTypeSettings = columnDataTypeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setCycleScheduleSettings(GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings) {
            this.cycleScheduleSettings = cycleScheduleSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setDdlHandlingSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> ddlHandlingSettings) {
            this.ddlHandlingSettings = ddlHandlingSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setRuntimeSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> runtimeSettings) {
            this.runtimeSettings = runtimeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_7708_1667792816832</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_235454102432001_1718359176885</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettings extends TeaModel {
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings;

        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        @NameInMap("ScheduleResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings scheduleResourceSettings;

        public static GetDIJobResponseBodyPagingInfoResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setOfflineResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings) {
            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setRealtimeResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {
            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setScheduleResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings scheduleResourceSettings) {
            this.scheduleResourceSettings = scheduleResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties self = new GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoSourceDataSourceSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dw_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceProperties")
        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties dataSourceProperties;

        public static GetDIJobResponseBodyPagingInfoSourceDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoSourceDataSourceSettings self = new GetDIJobResponseBodyPagingInfoSourceDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettings setDataSourceProperties(GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules self = new GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AddColumn</p>
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

        public static GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules self = new GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappings extends TeaModel {
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> transformationRules;

        public static GetDIJobResponseBodyPagingInfoTableMappings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappings self = new GetDIJobResponseBodyPagingInfoTableMappings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappings setSourceObjectSelectionRules(java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules) {
            this.sourceObjectSelectionRules = sourceObjectSelectionRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        public GetDIJobResponseBodyPagingInfoTableMappings setTransformationRules(java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTransformationRules extends TeaModel {
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

        public static GetDIJobResponseBodyPagingInfoTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTransformationRules self = new GetDIJobResponseBodyPagingInfoTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("DIJobId")
        public String DIJobId;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings;

        /**
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <strong>example:</strong>
         * <p>imp_ods_dms_det_dealer_info_df</p>
         */
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobSettings")
        public GetDIJobResponseBodyPagingInfoJobSettings jobSettings;

        /**
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettings resourceSettings;

        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings;

        /**
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings;

        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> transformationRules;

        public static GetDIJobResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfo self = new GetDIJobResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfo setDIJobId(String DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public String getDIJobId() {
            return this.DIJobId;
        }

        public GetDIJobResponseBodyPagingInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDIJobResponseBodyPagingInfo setDestinationDataSourceSettings(java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings) {
            this.destinationDataSourceSettings = destinationDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> getDestinationDataSourceSettings() {
            return this.destinationDataSourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setDestinationDataSourceType(String destinationDataSourceType) {
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        public GetDIJobResponseBodyPagingInfo setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetDIJobResponseBodyPagingInfo setJobSettings(GetDIJobResponseBodyPagingInfoJobSettings jobSettings) {
            this.jobSettings = jobSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoJobSettings getJobSettings() {
            return this.jobSettings;
        }

        public GetDIJobResponseBodyPagingInfo setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public GetDIJobResponseBodyPagingInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDIJobResponseBodyPagingInfo setResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettings resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettings getResourceSettings() {
            return this.resourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setSourceDataSourceSettings(java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings) {
            this.sourceDataSourceSettings = sourceDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> getSourceDataSourceSettings() {
            return this.sourceDataSourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setSourceDataSourceType(String sourceDataSourceType) {
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        public GetDIJobResponseBodyPagingInfo setTableMappings(java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> getTableMappings() {
            return this.tableMappings;
        }

        public GetDIJobResponseBodyPagingInfo setTransformationRules(java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

}
