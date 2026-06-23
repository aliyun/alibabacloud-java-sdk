// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobRequest extends TeaModel {
    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>DI Job Demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Settings for the destination data sources.</p>
     */
    @NameInMap("DestinationDataSourceSettings")
    public java.util.List<CreateDIJobRequestDestinationDataSourceSettings> destinationDataSourceSettings;

    /**
     * <p>The type of the destination data source. Valid values: <code>Hologres</code>, <code>OSS-HDFS</code>, <code>OSS</code>, <code>MaxCompute</code>, <code>LogHub</code>, <code>StarRocks</code>, <code>DataHub</code>, <code>AnalyticDB for MySQL</code>, <code>Kafka</code>, and <code>Hive</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>The code for a job created in script mode.</p>
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
     * <p>This parameter is deprecated. Use the <code>Name</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("JobName")
    @Deprecated
    public String jobName;

    /**
     * <p>The settings for the synchronization job, including DDL processing policies, data type mappings between source and destination columns, and runtime parameters.</p>
     */
    @NameInMap("JobSettings")
    public CreateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li><p><code>DatabaseRealtimeMigration</code>: Synchronizes multiple tables from multiple source databases in real time (stream synchronization). This type supports full, incremental, or both full and incremental synchronization.</p>
     * </li>
     * <li><p><code>DatabaseOfflineMigration</code>: Synchronizes multiple tables from multiple source databases in batches. This type supports full, incremental, or both full and incremental synchronization.</p>
     * </li>
     * <li><p><code>SingleTableRealtimeMigration</code>: Synchronizes a single source table in real time (stream synchronization).</p>
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
     * <li><p><code>FullAndRealtimeIncremental</code>: Full and real-time incremental synchronization for an entire database.</p>
     * </li>
     * <li><p><code>RealtimeIncremental</code>: Real-time incremental synchronization for a single table.</p>
     * </li>
     * <li><p><code>Full</code>: Full batch synchronization for an entire database.</p>
     * </li>
     * <li><p><code>OfflineIncremental</code>: Incremental synchronization in batch mode.</p>
     * </li>
     * <li><p><code>FullAndOfflineIncremental</code>: Full and incremental batch synchronization for an entire database.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The job owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace for this API call. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page.</p>
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
     * <p>Settings for the source data sources.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public java.util.List<CreateDIJobRequestSourceDataSourceSettings> sourceDataSourceSettings;

    /**
     * <p>The type of the source data source. Valid values: <code>PolarDB</code>, <code>MySQL</code>, <code>Kafka</code>, <code>LogHub</code>, <code>Hologres</code>, <code>Oracle</code>, <code>OceanBase</code>, <code>MongoDB</code>, <code>Redshift</code>, <code>Hive</code>, <code>SQL Server</code>, <code>Doris</code>, and <code>ClickHouse</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>Transformation mappings for the objects to be synchronized. Each mapping defines selection rules for a group of source objects and the transformation rules to apply to them.</p>
     * <blockquote>
     * <p>[ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     */
    @NameInMap("TableMappings")
    public java.util.List<CreateDIJobRequestTableMappings> tableMappings;

    /**
     * <p>A list of transformation rules for the objects to be synchronized.</p>
     * <blockquote>
     * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{\\&quot;expression\\&quot;:\\&quot;${srcDatasoureName}_${srcDatabaseName}\\&quot;}&quot; } ]</p>
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
         * <p>Custom connection settings for the data source, such as instance ID, access credentials, and instance region. You must specify this parameter or <code>DataSourceName</code>.</p>
         * <p>This parameter applies only when the data source is configured in instance mode (<code>ConnectionPropertiesMode</code>). The property format varies by data source. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">ConnectionProperties for data sources</a>.</p>
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
         * <p>The destination data type. For example: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, or <code>binary</code>. Available data types vary by data source.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The source data type. For example: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, or <code>binary</code>. Available data types vary by data source.</p>
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
         * <p>The synchronization type for periodic scheduling. Valid values:</p>
         * <ul>
         * <li><p><code>Full</code>: Full synchronization.</p>
         * </li>
         * <li><p><code>OfflineIncremental</code>: Incremental synchronization in batch mode.</p>
         * </li>
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
         * <li><p><code>Ignore</code>: Ignores the DDL message.</p>
         * </li>
         * <li><p><code>Critical</code>: Reports an error.</p>
         * </li>
         * <li><p><code>Normal</code>: Processes the DDL message normally.</p>
         * </li>
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
         * <li><p><code>RenameColumn</code>: Renames a column.</p>
         * </li>
         * <li><p><code>ModifyColumn</code>: Modifies a column.</p>
         * </li>
         * <li><p><code>CreateTable</code>: Creates a table.</p>
         * </li>
         * <li><p><code>TruncateTable</code>: Truncates a table.</p>
         * </li>
         * <li><p><code>DropTable</code>: Drops a table.</p>
         * </li>
         * <li><p><code>DropColumn</code>: Drops a column.</p>
         * </li>
         * <li><p><code>AddColumn</code>: Adds a column.</p>
         * </li>
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
         * <p>The name of the setting. Valid values:</p>
         * <ul>
         * <li><p><code>src.offline.datasource.max.connection</code>: The maximum number of connections to the source of a batch synchronization job.</p>
         * </li>
         * <li><p><code>dst.offline.truncate</code>: Specifies whether to truncate the destination table before a batch job starts.</p>
         * </li>
         * <li><p><code>runtime.offline.speed.limit.enable</code>: Specifies whether to enable throttling for a batch synchronization job.</p>
         * </li>
         * <li><p><code>runtime.offline.concurrent</code>: The concurrency level of a batch synchronization job.</p>
         * </li>
         * <li><p><code>runtime.enable.auto.create.schema</code>: Specifies whether to automatically create a destination schema.</p>
         * </li>
         * <li><p><code>runtime.realtime.concurrent</code>: The concurrency level of a real-time synchronization job.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.minute.dataxcdc</code>: The wait time in minutes for a failover restart.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.times.dataxcdc</code>: The number of failover restart attempts.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the setting.</p>
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
         * <p>Settings for data synchronization channels. You can configure special settings for specific channels. The following channels are supported: synchronization from Hologres to Hologres (Holo2Holo) and from Hologres to Kafka (Holo2Kafka).</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</code>
         * <code>kafkaClientProperties</code>: Parameters for the Kafka producer.</p>
         * </li>
         * <li><p><code>keyColumns</code>: The columns whose values are used as keys for data written to Kafka.</p>
         * </li>
         * <li><p><code>writeMode</code>: The data format for writing to Kafka. Valid values: <code>json</code> and <code>canal</code>.</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</code></p>
         * </li>
         * <li><p><code>conflictMode</code>: The conflict handling policy for writing data to Hologres. Valid values: <code>replace</code> (overwrite) and <code>ignore</code>.</p>
         * </li>
         * <li><p><code>writeMode</code>: The method for writing data to Hologres. Valid values: <code>replay</code> and <code>insert</code>.</p>
         * </li>
         * <li><p><code>dynamicColumnAction</code>: The method for handling dynamic columns when writing data to Hologres. Valid values: <code>replay</code>, <code>insert</code>, and <code>ignore</code>.</p>
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
         * <p>Column data type mappings.</p>
         * <blockquote>
         * <p>&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<CreateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The periodic scheduling settings.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public CreateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>DDL handling settings.</p>
         * <blockquote>
         * <p>&quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
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
         * <p>The number of CUs for the resource group for data integration that is used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the resource group for data integration used for batch synchronization.</p>
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
         * <p>The number of CUs for the resource group for data integration that is used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the resource group for data integration used for real-time synchronization.</p>
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
         * <p>The number of CUs for the scheduling resource group that is used for batch synchronization jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the scheduling resource group used for batch synchronization jobs.</p>
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
         * <p>Resource settings for batch synchronization.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public CreateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resources for real-time synchronization.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public CreateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The scheduling resources.</p>
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
         * <p>Custom connection settings for the data source, such as instance ID, access credentials, and instance region. You must specify this parameter or <code>DataSourceName</code>.</p>
         * <p>This parameter applies only when the data source is configured in instance mode (<code>ConnectionPropertiesMode</code>). The property format varies by data source. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">ConnectionProperties for data sources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;instanceId&quot;: &quot;rm-2ze09gn3x6xxx&quot;, &quot;password&quot;: &quot;xxxx&quot;, &quot;database&quot;: &quot;agent&quot;, &quot;username&quot;: &quot;zmtest&quot; &quot;regionId&quot;: &quot;cn-beijing&quot; }</p>
         */
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        /**
         * <p>The database encoding format.</p>
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
         * <p>The selection action. Valid values: <code>Include</code> and <code>Exclude</code>.</p>
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
         * <p>The expression type. Valid values: <code>Exact</code> and <code>Regex</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
         * <li><p><code>DefinePrimaryKey</code>: Defines a primary key.</p>
         * </li>
         * <li><p><code>Rename</code>: Renames an object.</p>
         * </li>
         * <li><p><code>AddColumn</code>: Adds a column.</p>
         * </li>
         * <li><p><code>HandleDml</code>: Handles DML operations.</p>
         * </li>
         * <li><p><code>DefineIncrementalCondition</code>: Defines an incremental condition.</p>
         * </li>
         * <li><p><code>DefineCycleScheduleSettings</code>: Defines periodic scheduling settings.</p>
         * </li>
         * <li><p><code>DefinePartitionKey</code>: Defines a partition key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The name of the transformation rule. The rule name must be unique for a specific action type and target object type. Maximum length: 50 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object to which the action applies. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
         * <p>Each rule can select a set of source objects to synchronize. Multiple rules combine to select one table.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<CreateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The names of the transformation rules to apply to the selected objects.</p>
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
         * <li><p><code>DefinePrimaryKey</code>: Defines a primary key.</p>
         * </li>
         * <li><p><code>Rename</code>: Renames an object.</p>
         * </li>
         * <li><p><code>AddColumn</code>: Adds a column.</p>
         * </li>
         * <li><p><code>HandleDml</code>: Handles DML operations.</p>
         * </li>
         * <li><p><code>DefineIncrementalCondition</code>: Defines an incremental condition.</p>
         * </li>
         * <li><p><code>DefineCycleScheduleSettings</code>: Defines periodic scheduling settings.</p>
         * </li>
         * <li><p><code>DefinePartitionKey</code>: Defines a partition key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule expression, specified as a JSON string.</p>
         * <ol>
         * <li>Renaming rule (<code>Rename</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</code></p>
         * </li>
         * <li><p><code>expression</code>: The renaming expression. You can use the following variables: <code>${srcDatasourceName}</code> (name of the source data source), <code>${srcDatabaseName}</code> (name of the source database), and <code>${srcTableName}</code> (name of the source table).</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>Rule for adding a column (<code>AddColumn</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</code></p>
         * </li>
         * <li><p>If you do not specify this rule, no columns are added.</p>
         * </li>
         * <li><p><code>columnName</code>: The name of the column to add.</p>
         * </li>
         * <li><p><code>columnValueType</code>: The value type of the added column. Valid values: <code>Constant</code> and <code>Variable</code>.</p>
         * </li>
         * <li><p><code>columnValue</code>: The value of the added column. If <code>columnValueType</code> is <code>Constant</code>, the value is a custom string constant. If <code>columnValueType</code> is <code>Variable</code>, the value is a built-in variable. Valid built-in variables include: <code>EXECUTE_TIME</code> (execution time, Long), <code>DB_NAME_SRC</code> (source database name, String), <code>DATASOURCE_NAME_SRC</code> (source data source name, String), <code>TABLE_NAME_SRC</code> (source table name, String), <code>DB_NAME_DEST</code> (destination database name, String), <code>DATASOURCE_NAME_DEST</code> (destination data source name, String), <code>TABLE_NAME_DEST</code> (destination table name, String), and <code>DB_NAME_SRC_TRANSED</code> (transformed database name, String).</p>
         * </li>
         * </ul>
         * <ol start="3">
         * <li>Rule for defining the primary key columns of a destination table (<code>DefinePrimaryKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</code></p>
         * </li>
         * <li><p>If you do not specify this rule, the primary key columns of the source table are used by default.</p>
         * </li>
         * <li><p>If the destination is an existing table, Data Integration does not modify its schema. If a specified primary key column does not exist in the destination table, the job fails to start and an error is reported.</p>
         * </li>
         * <li><p>If the destination table is automatically created, Data Integration automatically creates its schema with the defined primary key columns. If a specified primary key column does not exist in the source table, the job fails to start and an error is reported.</p>
         * </li>
         * </ul>
         * <ol start="4">
         * <li>DML handling rule (<code>HandleDml</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</code></p>
         * </li>
         * <li><p>If you do not specify this rule, the default <code>dmlAction</code> is <code>Normal</code> for <code>Insert</code>, <code>Update</code>, and <code>Delete</code> operations.</p>
         * </li>
         * <li><p><code>dmlType</code>: The DML operation type. Valid values: <code>Insert</code>, <code>Update</code>, and <code>Delete</code>.</p>
         * </li>
         * <li><p><code>dmlAction</code>: The DML handling policy. Valid values: <code>Normal</code> (normal processing), <code>Ignore</code>, <code>Filter</code> (conditional processing, used when <code>dmlType</code> is <code>Update</code> or <code>Delete</code>), and <code>LogicalDelete</code> (logical deletion).</p>
         * </li>
         * <li><p><code>filterCondition</code>: The DML filter condition, used when <code>dmlAction</code> is <code>Filter</code>.</p>
         * </li>
         * </ul>
         * <ol start="5">
         * <li>Incremental condition (<code>DefineIncrementalCondition</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;where&quot;:&quot;id &gt; 0&quot;}</code></p>
         * </li>
         * <li><p>Specifies the filter condition for incremental synchronization.</p>
         * </li>
         * </ul>
         * <ol start="6">
         * <li>Parameters for periodic scheduling (<code>DefineCycleScheduleSettings</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</code></p>
         * </li>
         * <li><p>Specifies the parameters for periodically scheduling a job.</p>
         * </li>
         * </ul>
         * <ol start="7">
         * <li>Rule to define a partition key (<code>DefinePartitionKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;id&quot;]}</code></p>
         * </li>
         * <li><p>Specifies a partition key.</p>
         * </li>
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
         * <p>The name of the rule. The rule name must be unique for a specific action type and target object type. Maximum length: 50 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object to which the action applies. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
