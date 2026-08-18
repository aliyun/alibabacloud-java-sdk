// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobRequest extends TeaModel {
    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>DI Job Demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of destination data source settings.</p>
     */
    @NameInMap("DestinationDataSourceSettings")
    public java.util.List<CreateDIJobRequestDestinationDataSourceSettings> destinationDataSourceSettings;

    /**
     * <p>The type of the destination data source. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>The code content in script mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;resourceSettings&quot;: {
     *         &quot;realtimeResourceSettings&quot;: {
     *             &quot;requestedCu&quot;: 2,
     *             &quot;resourceGroupIdentifier&quot;: &quot;Serverless_res_group_123_456&quot;
     *         },
     *         &quot;offlineResourceSettings&quot;: {
     *             &quot;requestedCu&quot;: 2,
     *             &quot;resourceGroupIdentifier&quot;: &quot;Serverless_res_group_123_456&quot;
     *         }
     *     },
     *     &quot;tableMappings&quot;: [
     *         {
     *             &quot;sourceObjectSelectionRules&quot;: [
     *                 {
     *                     &quot;expression&quot;: &quot;autotest_hologres&quot;,
     *                     &quot;action&quot;: &quot;Include&quot;,
     *                     &quot;expressionType&quot;: &quot;Exact&quot;,
     *                     &quot;objectType&quot;: &quot;Datasource&quot;
     *                 },
     *                 {
     *                     &quot;expression&quot;: &quot;auto_holo_2661647&quot;,
     *                     &quot;action&quot;: &quot;Include&quot;,
     *                     &quot;expressionType&quot;: &quot;Exact&quot;,
     *                     &quot;objectType&quot;: &quot;Table&quot;
     *                 },
     *                 {
     *                     &quot;expression&quot;: &quot;public&quot;,
     *                     &quot;action&quot;: &quot;Include&quot;,
     *                     &quot;expressionType&quot;: &quot;Exact&quot;,
     *                     &quot;objectType&quot;: &quot;Schema&quot;
     *                 }
     *             ],
     *             &quot;transformationRules&quot;: [
     *                 {
     *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *                     &quot;ruleActionType&quot;: &quot;SourceSchema&quot;,
     *                     &quot;ruleName&quot;: &quot;SourceSchema_Table_BStf8aXPSCJjOWGe&quot;
     *                 },
     *                 {
     *                     &quot;ruleTargetType&quot;: &quot;Schema&quot;,
     *                     &quot;ruleActionType&quot;: &quot;Rename&quot;,
     *                     &quot;ruleName&quot;: &quot;Rename_Schema_3qWNOIsljtInvKJy&quot;
     *                 },
     *                 {
     *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *                     &quot;ruleActionType&quot;: &quot;Rename&quot;,
     *                     &quot;ruleName&quot;: &quot;Rename_Table_o3PVQq1aIKDGoVVW&quot;
     *                 },
     *                 {
     *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *                     &quot;ruleActionType&quot;: &quot;DefineDstTableSettings&quot;,
     *                     &quot;ruleName&quot;: &quot;DefineDstTableSettings_Table_BhJltOmOCIc81fzi&quot;
     *                 },
     *                 {
     *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *                     &quot;ruleActionType&quot;: &quot;ColumnMapping&quot;,
     *                     &quot;ruleName&quot;: &quot;ColumnMapping_Table_nP4hJPX1wh2W3fpo&quot;
     *                 }
     *             ]
     *         }
     *     ],
     *     &quot;sourceDataSourceSettings&quot;: [
     *         {
     *             &quot;dataSourceProperties&quot;: {
     *                 &quot;timeZone&quot;: &quot;Asia/Shanghai&quot;
     *             },
     *             &quot;dataSourceName&quot;: &quot;autotest_hologres&quot;
     *         }
     *     ],
     *     &quot;jobSettings&quot;: {
     *         &quot;runtimeSettings&quot;: [</p>
     * <pre><code>    ],
     *     &quot;ddlHandlingSettings&quot;: [
     * 
     *     ],
     *     &quot;columnDataTypeSettings&quot;: [
     * 
     *     ],
     *     &quot;cycleScheduleSettings&quot;: {
     * 
     *     },
     *     &quot;channelSettings&quot;: {
     *         &quot;destinationChannelSettings&quot;: {
     *             &quot;conflictMode&quot;: &quot;replace&quot;,
     *             &quot;dynamicColumnAction&quot;: &quot;replay&quot;,
     *             &quot;writeMode&quot;: &quot;replay&quot;
     *         },
     *         &quot;sourceChannelSettings&quot;: {
     * 
     *         }
     *     }
     * },
     * &quot;destinationDataSourceType&quot;: &quot;Hologres&quot;,
     * &quot;transformationRules&quot;: [
     *     {
     *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *         &quot;ruleName&quot;: &quot;SourceSchema_Table_BStf8aXPSCJjOWGe&quot;,
     *         &quot;ruleActionType&quot;: &quot;SourceSchema&quot;,
     *         &quot;ruleExpression&quot;: {
     *             &quot;columns&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;id&quot;,
     *                     &quot;category&quot;: &quot;normal&quot;,
     *                     &quot;type&quot;: &quot;BIGINT&quot;
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;decimal&quot;,
     *                     &quot;category&quot;: &quot;normal&quot;,
     *                     &quot;type&quot;: &quot;DECIMAL&quot;
     *                 }
     *             ]
     *         }
     *     },
     *     {
     *         &quot;ruleTargetType&quot;: &quot;Schema&quot;,
     *         &quot;ruleName&quot;: &quot;Rename_Schema_3qWNOIsljtInvKJy&quot;,
     *         &quot;ruleActionType&quot;: &quot;Rename&quot;,
     *         &quot;ruleExpression&quot;: {
     *             &quot;expression&quot;: &quot;public&quot;
     *         }
     *     },
     *     {
     *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *         &quot;ruleName&quot;: &quot;Rename_Table_o3PVQq1aIKDGoVVW&quot;,
     *         &quot;ruleActionType&quot;: &quot;Rename&quot;,
     *         &quot;ruleExpression&quot;: {
     *             &quot;expression&quot;: &quot;auto_holo_2661647_dst&quot;
     *         }
     *     },
     *     {
     *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *         &quot;ruleName&quot;: &quot;DefineDstTableSettings_Table_BhJltOmOCIc81fzi&quot;,
     *         &quot;ruleActionType&quot;: &quot;DefineDstTableSettings&quot;,
     *         &quot;ruleExpression&quot;: {
     *             &quot;ddlString&quot;: &quot;BEGIN;
     * </code></pre>
     * <p>CREATE TABLE IF NOT EXISTS public.auto_holo_2661647_dst (
     *    id          BIGINT PRIMARY KEY,
     *    &quot;decimal&quot;   DECIMAL(38,18)
     * );
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;time_to_live_in_seconds\&quot;, \&quot;3153600000\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;orientation\&quot;, \&quot;column\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;binlog.level\&quot;, \&quot;replica\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;binlog.ttl\&quot;, \&quot;2592000\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;bitmap_columns\&quot;, \&quot;&quot;text&quot;,&quot;char&quot;,&quot;varchar&quot;\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;dictionary_encoding_columns\&quot;, \&quot;&quot;text&quot;:auto,&quot;bytea&quot;:auto,&quot;char&quot;:auto,&quot;varchar&quot;:auto\&quot;);
     * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;distribution_key\&quot;, \&quot;&quot;id&quot;\&quot;);
     * COMMIT;
     * &quot;,
     *                 &quot;ddlType&quot;: &quot;STRUCT&quot;
     *             }
     *         },
     *         {
     *             &quot;ruleTargetType&quot;: &quot;Table&quot;,
     *             &quot;ruleName&quot;: &quot;ColumnMapping_Table_nP4hJPX1wh2W3fpo&quot;,
     *             &quot;ruleActionType&quot;: &quot;ColumnMapping&quot;,
     *             &quot;ruleExpression&quot;: {
     *                 &quot;columnMapping&quot;: [
     *                     {
     *                         &quot;sourceColName&quot;: &quot;id&quot;,
     *                         &quot;dstColName&quot;: &quot;id&quot;
     *                     },
     *                     {
     *                         &quot;sourceColName&quot;: &quot;decimal&quot;,
     *                         &quot;dstColName&quot;: &quot;decimal&quot;
     *                     }
     *                 ]
     *             }
     *         }
     *     ],
     *     &quot;migrationType&quot;: &quot;FullAndRealtimeIncremental&quot;,
     *     &quot;destinationDataSourceSettings&quot;: [
     *         {
     *             &quot;dataSourceProperties&quot;: {</p>
     * <pre><code>        },
     *         &quot;dataSourceName&quot;: &quot;autotest_hologres&quot;
     *     }
     * ],
     * &quot;sourceDataSourceType&quot;: &quot;Hologres&quot;
     * </code></pre>
     * <p>}</p>
     */
    @NameInMap("FileSpec")
    public String fileSpec;

    /**
     * <p><strong>[Deprecated]</strong> Use the Name parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("JobName")
    @Deprecated
    public String jobName;

    /**
     * <p>The task-level settings, including DDL handling policies, source-to-destination column data type mapping policies, and task runtime parameters.</p>
     */
    @NameInMap("JobSettings")
    public CreateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><p>DatabaseRealtimeMigration: real-time migration of entire databases. Performs streaming synchronization of multiple tables from multiple source databases. Supports full-only, incremental-only, or full and incremental synchronization.</p>
     * </li>
     * <li><p>DatabaseOfflineMigration: offline migration of entire databases. Performs batch synchronization of multiple tables from multiple source databases. Supports full-only, incremental-only, or full and incremental synchronization.</p>
     * </li>
     * <li><p>SingleTableRealtimeMigration: real-time migration of a single table. Performs streaming synchronization of a single source table.</p>
     * </li>
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
     * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization for entire databases in real time.</li>
     * <li>RealtimeIncremental: real-time incremental synchronization for single tables in real time.</li>
     * <li>Full: full synchronization for entire databases offline.</li>
     * <li>OfflineIncremental: offline incremental synchronization for entire databases offline.</li>
     * <li>FullAndOfflineIncremental: full and offline incremental synchronization for entire databases offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call.</p>
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
    public CreateDIJobRequestResourceSettings resourceSettings;

    /**
     * <p>The list of source data source settings.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public java.util.List<CreateDIJobRequestSourceDataSourceSettings> sourceDataSourceSettings;

    /**
     * <p>The type of the source data source. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, ClickHouse.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>The list of synchronization object transformation mappings. Each element describes a group of source object selection rules and the transformation rules applied to that group.</p>
     * <blockquote>
     * <p>[ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     */
    @NameInMap("TableMappings")
    public java.util.List<CreateDIJobRequestTableMappings> tableMappings;

    /**
     * <p>The list of synchronization object transformation rule definitions.</p>
     * <blockquote>
     * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
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

    public CreateDIJobRequest setFileSpec(String fileSpec) {
        this.fileSpec = fileSpec;
        return this;
    }
    public String getFileSpec() {
        return this.fileSpec;
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

    public CreateDIJobRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
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

    public static class CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties extends TeaModel {
        /**
         * <p>Specify either this parameter or DataSourceName. This parameter specifies custom data source connection configuration information, including the instance ID, access identity, and instance region.</p>
         * <p>This parameter supports only datasource config in instance pattern (ConnectionPropertiesMode). Different data sources have different property specifications. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information ConnectionProperties</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;instanceId&quot;: &quot;rm-2ze09gn3x6xxx&quot;, &quot;password&quot;: &quot;xxxx&quot;, &quot;database&quot;: &quot;agent&quot;, &quot;username&quot;: &quot;zmtest&quot; &quot;regionId&quot;: &quot;cn-beijing&quot; }</p>
         */
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        public static CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties self = new CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

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

        /**
         * <p>The properties of the data source.</p>
         */
        @NameInMap("DataSourceProperties")
        public CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties dataSourceProperties;

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

        public CreateDIJobRequestDestinationDataSourceSettings setDataSourceProperties(CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public CreateDIJobRequestDestinationDataSourceSettingsDataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class CreateDIJobRequestJobSettingsColumnDataTypeSettings extends TeaModel {
        /**
         * <p>The destination data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. The available types vary by data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The source data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. The available types vary by data source type.</p>
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
         * <p>The synchronization type that requires cycle scheduling. Valid values:</p>
         * <ul>
         * <li>Full: full synchronization.</li>
         * <li>OfflineIncremental: offline incremental synchronization.</li>
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
         * <p>The handling action. Valid values:</p>
         * <ul>
         * <li>Ignore: ignores the DDL operation.</li>
         * <li>Critical: reports an error.</li>
         * <li>Normal: processes the DDL operation normally.</li>
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
         * <li>RenameColumn: renames a column.</li>
         * <li>ModifyColumn: modifies a column.</li>
         * <li>CreateTable: creates a table.</li>
         * <li>TruncateTable: truncates a table.</li>
         * <li>DropTable: drops a table.</li>
         * <li>DropColumn: drops a column.</li>
         * <li>AddColumn: adds a column.</li>
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
         * <p>The setting name. Valid values:</p>
         * <ul>
         * <li>src.offline.datasource.max.connection: the maximum number of connections to the source for offline batch tasks.</li>
         * <li>dst.offline.truncate: specifies whether to truncate the destination table.</li>
         * <li>runtime.offline.speed.limit.enable: specifies whether to enable throttling for offline batch tasks.</li>
         * <li>runtime.offline.concurrent: the concurrency of offline batch synchronization tasks.</li>
         * <li>runtime.enable.auto.create.schema: specifies whether to automatically create a schema on the destination.</li>
         * <li>runtime.realtime.concurrent: the concurrency of real-time tasks.</li>
         * <li>runtime.realtime.failover.minute.dataxcdc: the wait time in minutes before restarting after a failover failure.</li>
         * <li>runtime.realtime.failover.times.dataxcdc: the number of restart attempts after a failover failure.</li>
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
         * <p>The channel-related task settings. You can configure special settings for specific channels. Currently supported channels include Holo2Holo (synchronization from Hologres to Hologres) and Holo2Kafka (synchronization from Hologres to Kafka).</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
         * <li>kafkaClientProperties: Kafka producer parameters used when writing to Kafka.</li>
         * <li>keyColumns: the columns whose values are written to Kafka.</li>
         * <li>writeMode: the Kafka write format. Currently supports json and canal.</li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li><p>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</p>
         * </li>
         * <li><p>conflictMode: the conflict handling policy when writing to Hologres. Valid values: replace (overwrite) and ignore.</p>
         * </li>
         * <li><p>writeMode: the write mode for Hologres. Valid values: replay and insert.</p>
         * </li>
         * <li><p>dynamicColumnAction: the dynamic column handling mode when writing to Hologres. Valid values: replay, insert, and ignore.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;structInfo&quot;: &quot;MANAGED&quot;,
         *       &quot;storageType&quot;: &quot;TEXTFILE&quot;,
         *       &quot;writeMode&quot;: &quot;APPEND&quot;,
         *       &quot;partitionColumns&quot;: [
         *             {
         *                   &quot;columnName&quot;: &quot;pt&quot;,
         *                   &quot;columnType&quot;: &quot;STRING&quot;,
         *                   &quot;comment&quot;: &quot;&quot;
         *             }
         *       ],
         *       &quot;fieldDelimiter&quot;: &quot;&quot;
         * }</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The column data type mapping array.</p>
         * <blockquote>
         * <p>[&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The cycle scheduling settings.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public CreateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The DDL handling settings array.</p>
         * <blockquote>
         * <p>[&quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
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
         * <p>The number of compute units (CUs) of the data integration resource group used for offline synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used for offline synchronization.</p>
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
         * <p>The number of CUs of the data integration resource group used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used for real-time synchronization.</p>
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
         * <p>The number of CUs of the scheduling resource group used for offline synchronization nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the scheduling resource group used for offline synchronization nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_222_333</p>
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
         * <p>The offline synchronization resource settings.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public CreateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The real-time synchronization resource settings.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The schedule resource settings.</p>
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
         * <p>Specify either this parameter or DataSourceName. This parameter specifies custom data source connection configuration information, including the instance ID, access identity, and instance region.</p>
         * <p>This parameter supports only datasource config in instance pattern (ConnectionPropertiesMode). Different data sources have different property specifications. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information ConnectionProperties</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;instanceId&quot;: &quot;rm-2ze09gn3x6xxx&quot;, &quot;password&quot;: &quot;xxxx&quot;, &quot;database&quot;: &quot;agent&quot;, &quot;username&quot;: &quot;zmtest&quot; &quot;regionId&quot;: &quot;cn-beijing&quot; }</p>
         */
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        /**
         * <p>The database encoding.</p>
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
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties self = new CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties();
            return TeaModel.build(map, self);
        }

        public CreateDIJobRequestSourceDataSourceSettingsDataSourceProperties setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
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
         * <p>The selection action. Valid values: Include and Exclude.</p>
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
         * <li>DefinePrimaryKey: defines a primary key.</li>
         * <li>Rename: renames an object.</li>
         * <li>AddColumn: adds a column.</li>
         * <li>HandleDml: handles DML operations.</li>
         * <li>DefineIncrementalCondition: defines an incremental condition.</li>
         * <li>DefineCycleScheduleSettings: defines cycle scheduling settings.</li>
         * <li>DefinePartitionKey: defines a partition key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule name. The name must be unique within the same action type and target type combination. The name cannot exceed 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target type on which the action is applied. Valid values:</p>
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
         * <p>Each rule selects a set of source objects to synchronize. Multiple rules together select a single table.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The list of synchronization object transformation rule definitions. Each element represents one transformation rule.</p>
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
         * <li>DefinePrimaryKey: defines a primary key.</li>
         * <li>Rename: renames an object.</li>
         * <li>AddColumn: adds a column.</li>
         * <li>HandleDml: handles DML operations.</li>
         * <li>DefineIncrementalCondition: defines an incremental condition.</li>
         * <li>DefineCycleScheduleSettings: defines cycle scheduling settings.</li>
         * <li>DefinePartitionKey: defines a partition key.</li>
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
         * <li>Rename rule (Rename)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
         * <li>expression: the rename transformation rule expression. The expression supports the following variables: ${srcDatasourceName} (source data source name), ${srcDatabaseName} (source database name), and ${srcTableName} (source table name).</li>
         * </ul>
         * <ol start="2">
         * <li>Add column rule (AddColumn)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
         * <li>If not specified, the default rule is to neither add columns nor perform replication.</li>
         * <li>columnName: the name of the additional column.</li>
         * <li>columnValueType: the value type of the additional column. Valid values: Constant and Variable.</li>
         * <li>columnValue: the value of the additional column. When columnValueType is set to Constant, the value is a custom constant of the String type. When columnValueType is set to Variable, the value is a built-in variable. Valid built-in variables: EXECUTE_TIME (execution time, Long type), DB_NAME_SRC (source database name, String type), DATASOURCE_NAME_SRC (source data source name, String type), TABLE_NAME_SRC (source table name, String type), DB_NAME_DEST (destination database name, String type), DATASOURCE_NAME_DEST (destination data source name, String type), TABLE_NAME_DEST (destination table name, String type), and DB_NAME_SRC_TRANSED (transformed database name, String type).</li>
         * </ul>
         * <ol start="3">
         * <li>Define primary key columns for the destination table (DefinePrimaryKey)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
         * <li>If not specified, the source primary key columns are used by default.</li>
         * <li>When the destination table already exists: the data integration system does not modify the destination table schema. If the specified primary key columns are not in the destination column set, the node reports an error upon startup.</li>
         * <li>When the destination table uses automatic creation: the data integration system automatically creates the destination table schema, which includes the defined primary key columns. If the specified primary key columns are not in the destination column set, the node reports an error upon startup.</li>
         * </ul>
         * <ol start="4">
         * <li>DML operations handling rule (HandleDml)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
         * <li>If not specified, the default rule is Normal for Insert, Update, and Delete.</li>
         * <li>dmlType: the DML operations type. Valid values: Insert, Update, and Delete.</li>
         * <li>dmlAction: the DML operations handling policy. Valid values: Normal (process normally), Ignore (ignore), Filter (conditionally process normally, used when dmlType is Update or Delete), and LogicalDelete (logical delete).</li>
         * <li>filterCondition: the DML filter condition, used when dmlAction is set to Filter.</li>
         * </ul>
         * <ol start="5">
         * <li>Incremental condition (DefineIncrementalCondition)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
         * <li>Specifies the incremental filter condition.</li>
         * </ul>
         * <ol start="6">
         * <li>Cycle scheduling parameters (DefineCycleScheduleSettings)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
         * <li>Specifies the cycle node scheduling parameters.</li>
         * </ul>
         * <ol start="7">
         * <li>Define partition key (DefinePartitionKey)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
         * <li>Specifies the partition key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;expression&quot;: &quot;${srcDatasoureName}_${srcDatabaseName}&quot;
         * }</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The rule name. When the action type and target type are the same, the rule name must be unique. The name cannot exceed 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target type on which the action is applied. Valid values:</p>
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
