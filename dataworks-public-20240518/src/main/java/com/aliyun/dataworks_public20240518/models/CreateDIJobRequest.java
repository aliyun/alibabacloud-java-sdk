// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobRequest extends TeaModel {
    /**
     * <p>The description of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the synchronization task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The settings of the destination. Only a single destination is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationDataSourceSettings")
    public java.util.List<CreateDIJobRequestDestinationDataSourceSettings> destinationDataSourceSettings;

    /**
     * <p>The destination type. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB for MySQL, Kafka, and Hive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>This parameter is deprecated and is replaced by the Name parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("JobName")
    @Deprecated
    public String jobName;

    /**
     * <p>The settings for the dimension of the synchronization task. The settings include processing policies for DDL messages, policies for data type mappings between source fields and destination fields, and runtime parameters of the synchronization task.</p>
     */
    @NameInMap("JobSettings")
    public CreateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The type of the task. This parameter is optional. Valid values:</p>
     * <ul>
     * <li>DatabaseRealtimeMigration: A real-time synchronization task used to synchronize only full data, only incremental data, or full and incremental data in multiple tables of multiple databases at the source.</li>
     * <li>DatabaseOfflineMigration: A batch synchronization task used to synchronize only full data, only incremental data, or full and incremental data in multiple tables of multiple databases at the source.</li>
     * <li>SingleTableRealtimeMigration: A real-time synchronization task used to synchronize only data in single table at the source.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DatabaseRealtimeMigration</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The synchronization type. Valid values:</p>
     * <ul>
     * <li>FullAndRealtimeIncremental: full synchronization and real-time incremental synchronization of data in an entire database</li>
     * <li>RealtimeIncremental: real-time incremental synchronization of data in a single table</li>
     * <li>Full: full batch synchronization of data in an entire database</li>
     * <li>OfflineIncremental: batch incremental synchronization of data in an entire database</li>
     * <li>FullAndOfflineIncremental: full synchronization and batch incremental synchronization of data in an entire database</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The name of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSettings")
    public CreateDIJobRequestResourceSettings resourceSettings;

    /**
     * <p>The settings of the source. Only a single source is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public java.util.List<CreateDIJobRequestSourceDataSourceSettings> sourceDataSourceSettings;

    /**
     * <p>The source type. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, Redshift, Hive, SQL Server, Doris, and ClickHouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>The list of mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. Each entry in the list displays a mapping between a rule used to select synchronization objects and a transformation rule applied to the selected synchronization objects.</p>
     * <blockquote>
     * <p> [ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMappings")
    public java.util.List<CreateDIJobRequestTableMappings> tableMappings;

    /**
     * <p>The list of transformation rules for objects involved in the synchronization task.</p>
     * <blockquote>
     * <p> [ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
     * </blockquote>
     */
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

    @Deprecated
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

    public CreateDIJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateDIJobRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public CreateDIJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
         * <p>The name of the data source.</p>
         * 
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
         * <p>The data type of the destination field. Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The data type of the source field. Valid values: Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
         * 
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
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li>src.offline.datasource.max.connection: specifies the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
         * <li>dst.offline.truncate: specifies whether to clear the destination table before data writing.</li>
         * <li>runtime.offline.speed.limit.enable: specifies whether throttling is enabled for a batch synchronization task.</li>
         * <li>runtime.offline.concurrent: specifies the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
         * <li>runtime.enable.auto.create.schema: specifies whether schemas are automatically created in the destination of a synchronization task.</li>
         * <li>runtime.realtime.concurrent: specifies the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
         * <li>runtime.realtime.failover.minute.dataxcdc: specifies the maximum waiting duration before a synchronization task retries the next restart if the previous restart fails after failover occurs. Unit: minutes.</li>
         * <li>runtime.realtime.failover.times.dataxcdc: specifies the maximum number of failures that are allowed for restarting a synchronization task after failovers occur.</li>
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
         * <p>The channel control settings for the synchronization task. You can configure special channel control settings for the following synchronization links: data synchronization between Hologres data sources and data synchronization from Hologres to Kafka.</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
         * <li>kafkaClientProperties: the parameters related to a Kafka producer, which are used when you write data to a Kafka data source.</li>
         * <li>keyColumns: the names of Kafka columns to which you want to write data.</li>
         * <li>writeMode: the writing format of the Kafka data source. Valid values: json and canal.</li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
         * <li>conflictMode: the policy used to handle a conflict that occurs during data writing to Hologres. Valid values: replace and ignore.</li>
         * <li>writeMode: the mode in which you want to write data to Hologres. Valid values: replay and insert.</li>
         * <li>dynamicColumnAction: the mode in which you want to write data to dynamic columns in a Hologres table. Valid values: replay, insert, and ignore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The data type mappings between source fields and destination fields.</p>
         * <blockquote>
         * <p> &quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The settings for periodic scheduling.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public CreateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The processing settings for DDL messages.</p>
         * <blockquote>
         * <p> &quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("DdlHandlingSettings")
        public java.util.List<CreateDIJobRequestJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        /**
         * <p>The runtime settings.</p>
         */
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
         * <p>The number of compute units (CUs) in the resource group for Data Integration that are used for batch synchronization.</p>
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
         * <p>The number of CUs in the resource group for Data Integration that are used for real-time synchronization.</p>
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
         * <p>The number of CUs in the resource group for scheduling that are used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the resource group for scheduling that is used for batch synchronization.</p>
         * 
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
        /**
         * <p>The resource settings for batch synchronization.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public CreateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resource settings for real-time synchronization.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The resource settings for scheduling.</p>
         */
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
         * <p>The encoding format of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The time zone.</p>
         * 
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
         * <p>The operation that is performed to select objects. Valid values: Include and Exclude.</p>
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
         * <p>The type of the object on which you want to perform the action. Valid values:</p>
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
        /**
         * <p>The list of rules used to select synchronization objects in the source.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The list of transformation rules that you want to apply to the synchronization objects selected from the source. Each entry in the list defines a transformation rule.</p>
         */
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
         * <p>The action type. Valid values:</p>
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
         * <p>The expression of the rule. The expression must be a JSON string.</p>
         * <ol>
         * <li>Example of a renaming rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
         * <li>expression: the expression of the renaming rule. You can use the following variables in an expression: ${srcDatasourceName}, ${srcDatabaseName}, and ${srcTableName}. ${srcDatasourceName} specifies the name of the source. ${srcDatabaseName} specifies the name of a source database. ${srcTableName} specifies the name of a source table.</li>
         * </ul>
         * <ol start="2">
         * <li>Example of a column addition rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
         * <li>If you do not configure such a rule, no fields are added to the destination and no values are assigned by default.</li>
         * <li>columnName: the name of the field that is added.</li>
         * <li>columnValueType: the value type of the field. Valid values: Constant and Variable.</li>
         * <li>columnValue: the value of the field. If the columnValueType parameter is set to Constant, set the columnValue parameter to a constant of the STRING data type. If the columnValueType parameter is set to Variable, set the columnValue parameter to a built-in variable. The following built-in variables are supported: EXECUTE_TIME (LONG data type), DB_NAME_SRC (STRING data type), DATASOURCE_NAME_SRC (STRING data type), TABLE_NAME_SRC (STRING data type), DB_NAME_DEST (STRING data type), DATASOURCE_NAME_DEST (STRING data type), TABLE_NAME_DEST (STRING data type), and DB_NAME_SRC_TRANSED (STRING data type). EXECUTE_TIME specifies the execution time. DB_NAME_SRC specifies the name of a source database. DATASOURCE_NAME_SRC specifies the name of the source. TABLE_NAME_SRC specifies the name of a source table. DB_NAME_DEST specifies the name of a destination database. DATASOURCE_NAME_DEST specifies the name of the destination. TABLE_NAME_DEST specifies the name of a destination table. DB_NAME_SRC_TRANSED specifies the database name obtained after a transformation.</li>
         * </ul>
         * <ol start="3">
         * <li>Example of a rule used to specify primary key fields for a destination table</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
         * <li>If you do not configure such a rule, the primary key fields in the mapped source table are used for the destination table by default.</li>
         * <li>If the destination table is an existing table, Data Integration does not modify the schema of the destination table. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * <li>If the destination table is automatically created by the system, Data Integration automatically creates the schema of the destination table. The schema contains the primary key fields that you specify. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * </ul>
         * <ol start="4">
         * <li>Example of a rule used to process DML messages</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
         * <li>If you do not configure such a rule, the default processing policy for messages generated for insert, update, and delete operations is Normal.</li>
         * <li>dmlType: the DML operation. Valid values: Insert, Update, and Delete.</li>
         * <li>dmlAction: the processing policy for DML messages. Valid values: Normal, Ignore, Filter, and LogicalDelete. Filter indicates conditional processing. You can set the dmlAction parameter to Filter only when the dmlType parameter is set to Update or Delete.</li>
         * <li>filterCondition: the condition used to filter DML messages. This parameter is required only when the dmlAction parameter is set to Filter.</li>
         * </ul>
         * <ol start="5">
         * <li>Example of a rule used to perform incremental synchronization</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
         * <li>You can configure such a rule to perform incremental synchronization.</li>
         * </ul>
         * <ol start="6">
         * <li>Example of a rule used to configure scheduling parameters for an auto triggered task</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;cronExpress&quot;:&quot; \* \* \* \* \* \*&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
         * <li>You can configure such a rule to configure scheduling parameters for an auto triggered task.</li>
         * </ul>
         * <ol start="7">
         * <li>Example of a rule used to specify a partition key</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
         * <li>You can configure such a rule to specify a partition key.</li>
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
         * <p>The type of the object on which you want to perform the action. Valid values:</p>
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
