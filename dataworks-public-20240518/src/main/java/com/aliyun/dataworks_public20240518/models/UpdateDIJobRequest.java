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

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the synchronization task.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("FileSpec")
    public String fileSpec;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The task-level settings, including DDL handling policies, column data type mapping between source and destination, and runtime parameters.</p>
     */
    @NameInMap("JobSettings")
    public UpdateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The task owner.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource settings.</p>
     */
    @NameInMap("ResourceSettings")
    public UpdateDIJobRequestResourceSettings resourceSettings;

    /**
     * <p>The list of synchronization object transformation mappings. Each element describes a set of source object selection rules and the transformation rules applied to those objects.</p>
     * <blockquote>
     * <p> [ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     */
    @NameInMap("TableMappings")
    public java.util.List<UpdateDIJobRequestTableMappings> tableMappings;

    /**
     * <p>The list of synchronization object transformation rule definitions.</p>
     * <blockquote>
     * <p> [ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
     * </blockquote>
     */
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

    public UpdateDIJobRequest setFileSpec(String fileSpec) {
        this.fileSpec = fileSpec;
        return this;
    }
    public String getFileSpec() {
        return this.fileSpec;
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

    public UpdateDIJobRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
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
        /**
         * <p>The destination type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. Different data sources may have different types.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The source type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. Different data sources may have different types.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
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
        /**
         * <p>The scheduling parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>bizdate=$bizdate</p>
         */
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
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>Ignore</li>
         * <li>Critical: Fail the task</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The DDL type. Valid values:</p>
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
        /**
         * <p>The setting name. Valid values:</p>
         * <ul>
         * <li>src.offline.datasource.max.connection: Specifies the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
         * <li>dst.offline.truncate: Specifies whether to clear the destination table before data writing.</li>
         * <li>runtime.offline.speed.limit.enable: Specifies whether throttling is enabled for a batch synchronization task.</li>
         * <li>runtime.offline.concurrent: Specifies the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
         * <li>runtime.enable.auto.create.schema: Specifies whether schemas are automatically created in the destination of a synchronization task.</li>
         * <li>runtime.realtime.concurrent: Specifies the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
         * <li>runtime.realtime.failover.minute.dataxcdc: Specifies the maximum waiting duration before a synchronization task retries the next restart if the previous restart fails after failover occurs. Unit: minutes.</li>
         * <li>runtime.realtime.failover.times.dataxcdc: Specifies the maximum number of failures that are allowed for restarting a synchronization task after failovers occur.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The setting value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The channel-specific settings. You can configure special settings for specific channels. Currently supported: Holo2Holo (Hologres to Hologres) and Holo2Kafka (Hologres to Kafka).</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}} kafkaClientProperties: Kafka producer parameters used when writing to Kafka.</li>
         * <li>keyColumns: The columns to write to Kafka.</li>
         * <li>writeMode: The Kafka write format. Valid values: json and canal.</li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
         * <li>conflictMode: The conflict handling policy when writing to Hologres. Valid values: replace (overwrite) and ignore.</li>
         * <li>writeMode: The write mode for Hologres. Valid values: replay and insert.</li>
         * <li>dynamicColumnAction: The dynamic column handling mode when writing to Hologres. Valid values: replay, insert, and ignore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The array of column type mappings.</p>
         * <blockquote>
         * <p> [&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The scheduled task settings.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public UpdateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The array of DDL handling settings.</p>
         * <blockquote>
         * <p> [&quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("DdlHandlingSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        /**
         * <p>The runtime settings.</p>
         */
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
        /**
         * <p>The CUs of the resource group for Data Integration used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the resource group for Data Integration that are used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
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
        /**
         * <p>The CUs of the resource group for Data Integration that are used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the resource group for Data Integration that are used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_111_222</p>
         */
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
        /**
         * <p>The CUs of the scheduling resource group for batch synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the scheduling resource group used for batch synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_235454102432001_1721021993437</p>
         */
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
        /**
         * <p>The batch synchronization resources.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The real-time synchronization resources.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The resource used for scheduling.</p>
         */
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
        /**
         * <p>Valid values: Include and Exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The expression.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_table_1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The expression type. Valid values: Exact and Regex.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule name. The rule name must be unique for a given combination of action type and target type. The name cannot exceed 50 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
        /**
         * <p>Each rule can select different object types from the source, such as source databases and source tables.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<UpdateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The transformation rules applied to source objects.</p>
         */
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
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * <li>DefineIncrementalCondition</li>
         * <li>DefineCycleScheduleSettings</li>
         * <li>DefinePartitionKey</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule expression in JSON string format.</p>
         * <ol>
         * <li>Rename rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
         * <li>expression: The rename transformation expression. Supported variables include: ${srcDatasourceName} (source data source name), ${srcDatabaseName} (source database name), and ${srcTableName} (source table name).</li>
         * </ul>
         * <ol start="2">
         * <li>AddColumn rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
         * <li>If not specified, the default behavior is to not add columns.</li>
         * <li>columnName: The name of the column to add.</li>
         * <li>columnValueType: The value type of the column to add. Valid values: Constant and Variable.</li>
         * <li>columnValue: The value of the column to add. When columnValueType is set to Constant, the value is a custom constant of the string type. When columnValueType is set to Variable, the value is a built-in variable. Built-in variables include: EXECUTE_TIME (execution time, long type), DB_NAME_SRC (source database name, string type), DATASOURCE_NAME_SRC (source data source name, string type), TABLE_NAME_SRC (source table name, string type), DB_NAME_DEST (destination database name, string type), DATASOURCE_NAME_DEST (destination data source name, string type), TABLE_NAME_DEST (destination table name, string type), and DB_NAME_SRC_TRANSED (transformed source database name, string type).</li>
         * </ul>
         * <ol start="3">
         * <li>DefinePrimaryKey</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
         * <li>If not specified, the source primary key columns are used by default.</li>
         * <li>When the destination table already exists: Data Integration does not modify the destination table structure. If the specified primary key columns are not in the destination table, the task fails to start.</li>
         * <li>When the destination table is auto-created: Data Integration automatically creates the destination table structure with the defined primary key columns. If the specified primary key columns are not in the destination table, the task fails to start.</li>
         * </ul>
         * <ol start="4">
         * <li>HandleDml rule</li>
         * </ol>
         * <ul>
         * <li>Example of a rule used to process DML messages: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}.</li>
         * <li>If not specified, the default rule is Normal for Insert, Update, and Delete.</li>
         * <li>dmlType: The DML operation type. Valid values: Insert, Update, Delete.</li>
         * <li>dmlAction: The DML handling policy. Valid values: Normal, Ignore, Filter (conditional processing, used when dmlType is Update or Delete), and LogicalDelete.</li>
         * <li>filterCondition: The DML filter condition. This parameter is used when dmlAction is set to Filter.</li>
         * </ul>
         * <ol start="5">
         * <li>DefineIncrementalCondition</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
         * <li>Specifies the incremental filter condition.</li>
         * </ul>
         * <ol start="6">
         * <li>DefineCycleScheduleSettings</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;cronExpress&quot;:&quot; \* \* \* \* \* \*&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
         * <li>Specifies the scheduled task parameters.</li>
         * </ul>
         * <ol start="7">
         * <li>DefinePartitionKey</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
         * <li>Specifies the partition key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The rule name. When the action type and target type are the same, the rule name must be unique. The name cannot exceed 50 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target type for the action. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
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
