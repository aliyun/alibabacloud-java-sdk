// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobShrinkRequest extends TeaModel {
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
    public String destinationDataSourceSettingsShrink;

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
    public String jobSettingsShrink;

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
    public String resourceSettingsShrink;

    /**
     * <p>Settings for the source data sources.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public String sourceDataSourceSettingsShrink;

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
    public String tableMappingsShrink;

    /**
     * <p>A list of transformation rules for the objects to be synchronized.</p>
     * <blockquote>
     * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{\\&quot;expression\\&quot;:\\&quot;${srcDatasoureName}_${srcDatabaseName}\\&quot;}&quot; } ]</p>
     * </blockquote>
     */
    @NameInMap("TransformationRules")
    public String transformationRulesShrink;

    public static CreateDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobShrinkRequest self = new CreateDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDIJobShrinkRequest setDestinationDataSourceSettingsShrink(String destinationDataSourceSettingsShrink) {
        this.destinationDataSourceSettingsShrink = destinationDataSourceSettingsShrink;
        return this;
    }
    public String getDestinationDataSourceSettingsShrink() {
        return this.destinationDataSourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setDestinationDataSourceType(String destinationDataSourceType) {
        this.destinationDataSourceType = destinationDataSourceType;
        return this;
    }
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    public CreateDIJobShrinkRequest setFileSpec(String fileSpec) {
        this.fileSpec = fileSpec;
        return this;
    }
    public String getFileSpec() {
        return this.fileSpec;
    }

    @Deprecated
    public CreateDIJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateDIJobShrinkRequest setJobSettingsShrink(String jobSettingsShrink) {
        this.jobSettingsShrink = jobSettingsShrink;
        return this;
    }
    public String getJobSettingsShrink() {
        return this.jobSettingsShrink;
    }

    public CreateDIJobShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateDIJobShrinkRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public CreateDIJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDIJobShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDIJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDIJobShrinkRequest setResourceSettingsShrink(String resourceSettingsShrink) {
        this.resourceSettingsShrink = resourceSettingsShrink;
        return this;
    }
    public String getResourceSettingsShrink() {
        return this.resourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setSourceDataSourceSettingsShrink(String sourceDataSourceSettingsShrink) {
        this.sourceDataSourceSettingsShrink = sourceDataSourceSettingsShrink;
        return this;
    }
    public String getSourceDataSourceSettingsShrink() {
        return this.sourceDataSourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setSourceDataSourceType(String sourceDataSourceType) {
        this.sourceDataSourceType = sourceDataSourceType;
        return this;
    }
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    public CreateDIJobShrinkRequest setTableMappingsShrink(String tableMappingsShrink) {
        this.tableMappingsShrink = tableMappingsShrink;
        return this;
    }
    public String getTableMappingsShrink() {
        return this.tableMappingsShrink;
    }

    public CreateDIJobShrinkRequest setTransformationRulesShrink(String transformationRulesShrink) {
        this.transformationRulesShrink = transformationRulesShrink;
        return this;
    }
    public String getTransformationRulesShrink() {
        return this.transformationRulesShrink;
    }

}
