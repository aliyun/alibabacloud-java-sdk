// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIJobResponseBody extends TeaModel {
    /**
     * <p>The information about the synchronization task.</p>
     */
    @NameInMap("Data")
    public GetDIJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
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
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>holo_datasource_1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The properties of the data source.</p>
         */
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
        /**
         * <p>The data type of a destination field.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The data type of a source field.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
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
        /**
         * <p>The synchronization type that requires periodic scheduling. Valid values:</p>
         * <ul>
         * <li>Full: full synchronization</li>
         * <li>OfflineIncremental: batch incremental synchronization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("CycleMigrationType")
        public String cycleMigrationType;

        /**
         * <p>The scheduling parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>bizdate=$bizdate</p>
         */
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
        /**
         * <p>The processing policy. Valid values:</p>
         * <ul>
         * <li>Ignore: ignores a DDL message.</li>
         * <li>Critical: reports an error for a DDL message.</li>
         * <li>Normal: normally processes a DDL message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the DDL operation. Valid values:</p>
         * <ul>
         * <li>RenameColumn</li>
         * <li>ModifyColumn</li>
         * <li>CreateTable</li>
         * <li>TruncateTable</li>
         * <li>DropTable</li>
         * <li>DropColumn</li>
         * <li>AddColumn</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AddColumn</p>
         */
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
        /**
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li>runtime.offline.speed.limit.mb: indicates the maximum transmission rate that is allowed for a batch synchronization task. This configuration item takes effect only when runtime.offline.speed.limit.enable is set to true.</li>
         * <li>runtime.offline.speed.limit.enable: indicates whether throttling is enabled for a batch synchronization task.</li>
         * <li>dst.offline.connection.max: indicates the maximum number of connections that are allowed for writing data to the destination of a batch synchronization task.</li>
         * <li>runtime.offline.concurrent: indicates the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
         * <li>dst.realtime.connection.max: indicates the maximum number of connections that are allowed for writing data to the destination of a real-time synchronization task.</li>
         * <li>runtime.enable.auto.create.schema: indicates whether schemas are automatically created in the destination of a synchronization task.</li>
         * <li>src.offline.datasource.max.connection: indicates the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
         * <li>runtime.realtime.concurrent: indicates the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The channel control settings for the synchronization task. The value of this parameter is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The settings for data type mappings between source fields and destination fields. The value of this parameter is an array.</p>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyDataJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The settings for periodic scheduling.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyDataJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The settings for processing DDL messages. The value of this parameter is an array.</p>
         */
        @NameInMap("DdlHandlingSettings")
        public java.util.List<GetDIJobResponseBodyDataJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        /**
         * <p>The runtime settings. The value of this parameter is an array.</p>
         */
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
        /**
         * <p>The identifier of the resource group for Data Integration used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
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
        /**
         * <p>The identifier of the resource group for Data Integration used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
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
        /**
         * <p>The resource used for batch synchronization.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyDataResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resource used for real-time synchronization.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyDataResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The number of compute units (CUs) in the resource group that are used for incremental and full synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Float requestedCu;

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

        public GetDIJobResponseBodyDataResourceSettings setRequestedCu(Float requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Float getRequestedCu() {
            return this.requestedCu;
        }

    }

    public static class GetDIJobResponseBodyDataSourceDataSourceSettings extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_datasource_1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The properties of the data source.</p>
         */
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
        /**
         * <p>The expression.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_table_1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * <li>DefineIncrementalCondition</li>
         * <li>DefineCycleScheduleSettings</li>
         * <li>DefineRuntimeSettings</li>
         * <li>DefinePartitionKey</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object on which the action is performed. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
        /**
         * <p>The list of rules used to select synchronization objects in the source.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyDataTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The list of transformation rules that are applied to the synchronization objects selected from the source.</p>
         */
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
        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * <li>DefineIncrementalCondition</li>
         * <li>DefineCycleScheduleSettings</li>
         * <li>DefineRuntimeSettings</li>
         * <li>DefinePartitionKey</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The expression of the rule. The expression is a JSON string.</p>
         * <ul>
         * <li><p>Example of a renaming rule: <code>{&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;,&quot;variables&quot;:[{&quot;variableName&quot;:&quot;srcDatabaseName&quot;,&quot;variableRules&quot;:[{&quot;from&quot;:&quot;fromdb&quot;,&quot;to&quot;:&quot;todb&quot;}\\]}\\]}</code>.</p>
         * <ul>
         * <li><p>expression: the expression of the renaming rule. The expression may contain the following variables:</p>
         * <ul>
         * <li>${srcDatasourceName}</li>
         * <li>${srcDatabaseName}</li>
         * <li>${srcTableName}</li>
         * </ul>
         * </li>
         * <li><p>variables: the generation rule for a variable used in the expression of the renaming rule. The default value of the specified variable is the original value of the object indicated by the variable. A group of string replacement rules used to change the original values may be returned.</p>
         * <ul>
         * <li>variableName: the name of the variable. The variable name is not enclosed in ${}.</li>
         * <li>variableRules: the string replacement rules for variables. The system runs the string replacement rules in sequence. from indicates the original string. to indicates the new string.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Example of a rule used to add a specific field to the destination and assign a value to the field: <code>{&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}\\]}</code>.</p>
         * <p>If no rule of this type is configured, no fields are added to the destination and no values are assigned by default.</p>
         * <ul>
         * <li><p>columnName: the name of the field that is added.</p>
         * </li>
         * <li><p>columnValueType: the value type of the field. Valid values: Constant and Variable.</p>
         * </li>
         * <li><p>columnValue: the value of the field.</p>
         * <ul>
         * <li>If the value of the columnValueType parameter is Constant, the value of the columnValue parameter is a constant of the STRING data type.</li>
         * <li>If the value of the columnValueType parameter is Variable, the value of the columnValue parameter is a built-in variable. The following built-in variables are supported: EXECUTE_TIME (LONG data type), DB_NAME_SRC (STRING data type), DATASOURCE_NAME_SRC (STRING data type), TABLE_NAME_SRC (STRING data type), DB_NAME_DEST (STRING data type), DATASOURCE_NAME_DEST (STRING data type), TABLE_NAME_DEST (STRING data type), and DB_NAME_SRC_TRANSED (STRING data type). EXECUTE_TIME indicates the execution time. DB_NAME_SRC indicates the name of a source database. DATASOURCE_NAME_SRC indicates the name of the source. TABLE_NAME_SRC indicates the name of a source table. DB_NAME_DEST indicates the name of a destination database. DATASOURCE_NAME_DEST indicates the name of the destination. TABLE_NAME_DEST indicates the name of a destination table. DB_NAME_SRC_TRANSED indicates the database name obtained after a transformation.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Example of a rule used to specify primary key fields for a destination table: <code>{&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;\\]}</code>.</p>
         * <p>If no rule of this type is configured, the primary key fields in the mapped source table are used for the destination table by default.</p>
         * <ul>
         * <li>If the destination table is an existing table, Data Integration does not modify the schema of the destination table. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * <li>If the destination table is automatically created by the system, Data Integration automatically creates the schema of the destination table. The schema contains the primary key fields that you specify. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * </ul>
         * </li>
         * <li><p>Example of a rule used to process DML messages: <code>{&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}\\]}</code>.</p>
         * <p>If no rule of this type is configured, the default processing policy for messages generated for insert, update, and delete operations is Normal.</p>
         * <ul>
         * <li>dmlType: the DML operation. Valid values: Insert, Update, and Delete.</li>
         * <li>dmlAction: the processing policy for DML messages. Valid values: Normal, Ignore, Filter, and LogicalDelete. Filter indicates conditional processing. The value Filter is returned for the dmlAction parameter only when the value of the dmlType parameter is Update or Delete.</li>
         * <li>filterCondition: the condition used to filter DML messages. This parameter is returned only when the value of the dmlAction parameter is Filter.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object on which the action is performed. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
        /**
         * <p>The timestamp when the synchronization task was created. The timestamp is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1671516776</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the user who creates the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        @NameInMap("CreatedUid")
        public String createdUid;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>11588</p>
         */
        @NameInMap("DIJobId")
        public Long DIJobId;

        /**
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>Synchronize mysql to hologres</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The settings of the destination. Only a single destination is supported.</p>
         */
        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyDataDestinationDataSourceSettings> destinationDataSourceSettings;

        /**
         * <p>The destination type. Valid values: Hologres and Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The error message returned if the value of the JobStatus parameter is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>error details xxx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_to_holo_sync_445</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The settings for the dimension of the synchronization task. The settings include processing policies for DDL messages, policies for data type mappings between source fields and destination fields, and runtime parameters of the synchronization task.</p>
         */
        @NameInMap("JobSettings")
        public GetDIJobResponseBodyDataJobSettings jobSettings;

        /**
         * <p>The status of the synchronization task. Valid values:</p>
         * <ul>
         * <li>Finished</li>
         * <li>Initialized</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Stopping</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li>FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization</li>
         * <li>RealtimeIncremental: real-time incremental synchronization</li>
         * <li>Full: full synchronization</li>
         * <li>OfflineIncremental: batch incremental synchronization</li>
         * <li>FullAndOfflineIncremental: one-time full synchronization and batch incremental synchronization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource settings.</p>
         */
        @NameInMap("ResourceSettings")
        public GetDIJobResponseBodyDataResourceSettings resourceSettings;

        /**
         * <p>The information about the running of the synchronization task.</p>
         */
        @NameInMap("RunStats")
        public java.util.Map<String, String> runStats;

        /**
         * <p>The settings of the source. Only a single source is supported.</p>
         */
        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyDataSourceDataSourceSettings> sourceDataSourceSettings;

        /**
         * <p>The source type. The value MySQL is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        /**
         * <p>The timestamp when the synchronization task was last started. The timestamp is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1673859999</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The ID of the user who last starts the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        @NameInMap("StartedUid")
        public String startedUid;

        /**
         * <p>The list of mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. Each entry in the list displays a mapping between a rule used to select synchronization objects and a transformation rule applied to the selected synchronization objects.</p>
         */
        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyDataTableMappings> tableMappings;

        /**
         * <p>The list of transformation rules that are applied to the synchronization objects selected from the source. Each entry in the list defines a transformation rule.</p>
         */
        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyDataTransformationRules> transformationRules;

        /**
         * <p>The timestamp when the synchronization task was last modified. The timestamp is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1673859985</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the user who last modifies the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
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
