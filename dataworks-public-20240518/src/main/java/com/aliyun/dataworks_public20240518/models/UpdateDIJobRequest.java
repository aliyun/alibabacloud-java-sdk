// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDIJobRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the <code>Id</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>The description of the synchronization job.</p>
     * 
     * <strong>example:</strong>
     * <p>DI Job Demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The job configuration in script mode.</p>
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
     * <p>The ID of the synchronization job.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The settings for the synchronization job. This includes DDL handling settings, data type mappings for columns between the source and destination, and runtime parameters.</p>
     */
    @NameInMap("JobSettings")
    public UpdateDIJobRequestJobSettings jobSettings;

    /**
     * <p>The owner of the synchronization job.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to get the workspace ID.</p>
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
     * <p>A list of object transformation mappings. Each mapping specifies a set of selection rules for source objects and a list of transformation rules that apply to the selected objects.</p>
     * <blockquote>
     * <p>[ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     */
    @NameInMap("TableMappings")
    public java.util.List<UpdateDIJobRequestTableMappings> tableMappings;

    /**
     * <p>A list of transformation rule definitions.</p>
     * <blockquote>
     * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
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
         * <p>The destination data type. Examples: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. The supported data types depend on the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The source data type. Examples: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. The supported data types depend on the source data source.</p>
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
         * <p>The handling action. Valid values:</p>
         * <ul>
         * <li><p><code>Ignore</code>: Ignores the DDL message.</p>
         * </li>
         * <li><p><code>Critical</code>: Reports an error and terminates the synchronization job.</p>
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
         * <li><p><code>RenameColumn</code></p>
         * </li>
         * <li><p><code>ModifyColumn</code></p>
         * </li>
         * <li><p><code>CreateTable</code></p>
         * </li>
         * <li><p><code>TruncateTable</code></p>
         * </li>
         * <li><p><code>DropTable</code></p>
         * </li>
         * <li><p><code>DropColumn</code></p>
         * </li>
         * <li><p><code>AddColumn</code></p>
         * </li>
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
         * <p>The name of the setting. Valid values:</p>
         * <ul>
         * <li><p><code>src.offline.datasource.max.connection</code>: The maximum number of concurrent connections to the source for an offline synchronization job.</p>
         * </li>
         * <li><p><code>dst.offline.truncate</code>: Specifies whether to truncate the destination table before an offline synchronization job.</p>
         * </li>
         * <li><p><code>runtime.offline.speed.limit.enable</code>: Specifies whether to enable speed limiting for an offline synchronization job.</p>
         * </li>
         * <li><p><code>runtime.offline.concurrent</code>: The concurrency level for an offline synchronization job.</p>
         * </li>
         * <li><p><code>runtime.enable.auto.create.schema</code>: Specifies whether to automatically create a schema at the destination.</p>
         * </li>
         * <li><p><code>runtime.realtime.concurrent</code>: The concurrency level for a real-time synchronization job.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.minute.dataxcdc</code>: The number of minutes to wait before a failover retry.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.times.dataxcdc</code>: The number of failover retries.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>src.offline.datasource.max.connection</p>
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
         * <p>The job settings for specific data synchronization channels. You can apply special configurations to certain channels. Currently, <code>Holo2Holo</code> (synchronization from Hologres to Hologres) and <code>Holo2Kafka</code> (synchronization from Hologres to Kafka) are supported.</p>
         * <ol>
         * <li><code>Holo2Kafka</code></li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</code>
         * <code>kafkaClientProperties</code>: The Kafka producer parameters used when writing to Kafka.</p>
         * </li>
         * <li><p><code>keyColumns</code>: The columns whose values are written to the key of a Kafka message.</p>
         * </li>
         * <li><p><code>writeMode</code>: The format for writing data to Kafka. Valid values: <code>json</code> and <code>canal</code>.</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li><code>Holo2Holo</code></li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</code></p>
         * </li>
         * <li><p><code>conflictMode</code>: The conflict handling policy for writing data to Hologres. Valid values: <code>replace</code> (overwrite) and <code>ignore</code> (ignore).</p>
         * </li>
         * <li><p><code>writeMode</code>: The method for writing data to Hologres. Valid values: <code>replay</code> and <code>insert</code>.</p>
         * </li>
         * <li><p><code>dynamicColumnAction</code>: The action for handling dynamic columns when writing data to Hologres. Valid values: <code>replay</code>, <code>insert</code>, and <code>ignore</code>.</p>
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
         * <p>An array of column data type mappings.</p>
         * <blockquote>
         * <p>[&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
         * </blockquote>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<UpdateDIJobRequestJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The settings for periodic scheduling.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public UpdateDIJobRequestJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>An array of DDL handling settings.</p>
         * <blockquote>
         * <p>[&quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
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
         * <p>The number of CUs for the Data Integration resource group used by the offline synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the Data Integration resource group used by the offline synchronization job.</p>
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
         * <p>The number of CUs for the Data Integration resource group used by the real-time synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the Data Integration resource group used by the real-time synchronization job.</p>
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
         * <p>The number of CUs for the scheduling resource group used by the offline synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the scheduling resource group used by the offline synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_222_333</p>
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
         * <p>The resource settings for the offline synchronization job.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public UpdateDIJobRequestResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resource settings for the real-time synchronization job.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public UpdateDIJobRequestResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The scheduling resource settings.</p>
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
         * <p>The type of the expression. Valid values: <code>Exact</code> and <code>Regex</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code> (table)</p>
         * </li>
         * <li><p><code>Schema</code> (schema)</p>
         * </li>
         * <li><p><code>Database</code> (database)</p>
         * </li>
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
         * <p>The type of the action. Valid values:</p>
         * <ul>
         * <li><p><code>DefinePrimaryKey</code>: Defines a primary key.</p>
         * </li>
         * <li><p><code>Rename</code>: Renames an object.</p>
         * </li>
         * <li><p><code>AddColumn</code>: Adds a column.</p>
         * </li>
         * <li><p><code>HandleDml</code>: Handles DML operations.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The name of the transformation rule. The name must be unique for a specific combination of <code>RuleActionType</code> and <code>RuleTargetType</code> and can be up to 50 characters long.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the target object. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code> (table)</p>
         * </li>
         * <li><p><code>Schema</code> (schema)</p>
         * </li>
         * <li><p><code>Database</code> (database)</p>
         * </li>
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
         * <p>The rules for selecting source objects. Each rule can select a different type of source object to synchronize, such as a source database or table.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<UpdateDIJobRequestTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The transformation rules for the source objects.</p>
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
         * <p>The type of the action. Valid values:</p>
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
         * <li>Rename rule (<code>Rename</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;}</code></p>
         * </li>
         * <li><p><code>expression</code>: The expression for the rename transformation rule. The expression supports variables, including <code>${srcDatasourceName}</code> (source data source name), <code>${srcDatabaseName}</code> (source database name), and <code>${srcTableName}</code> (source table name).</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>Add column rule (<code>AddColumn</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</code></p>
         * </li>
         * <li><p>If this rule is not specified, no columns are added.</p>
         * </li>
         * <li><p><code>columnName</code>: The name of the column to add.</p>
         * </li>
         * <li><p><code>columnValueType</code>: The value type of the added column. Valid values: <code>Constant</code> and <code>Variable</code>.</p>
         * </li>
         * <li><p><code>columnValue</code>: The value of the added column. If <code>columnValueType</code> is <code>Constant</code>, the value is a custom constant of the string type. If <code>columnValueType</code> is <code>Variable</code>, the value is a built-in variable. Valid built-in variables: <code>EXECUTE_TIME</code> (execution time, Long type), <code>DB_NAME_SRC</code> (source database name, String type), <code>DATASOURCE_NAME_SRC</code> (source data source name, String type), <code>TABLE_NAME_SRC</code> (source table name, String type), <code>DB_NAME_DEST</code> (destination database name, String type), <code>DATASOURCE_NAME_DEST</code> (destination data source name, String type), <code>TABLE_NAME_DEST</code> (destination table name, String type), and <code>DB_NAME_SRC_TRANSED</code> (transformed database name, String type).</p>
         * </li>
         * </ul>
         * <ol start="3">
         * <li>Define primary key rule (<code>DefinePrimaryKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</code></p>
         * </li>
         * <li><p>If this rule is not specified, the primary key of the source is used by default.</p>
         * </li>
         * <li><p>Data Integration does not modify the structure of an existing destination table. If a specified primary key column does not exist in the table, the synchronization job fails.</p>
         * </li>
         * <li><p>When a destination table is automatically created, Data Integration includes the defined primary key columns in the structure. If a specified primary key column is not in the destination column set, the synchronization job fails.</p>
         * </li>
         * </ul>
         * <ol start="4">
         * <li>DML handling rule (<code>HandleDml</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</code></p>
         * </li>
         * <li><p>If this rule is not specified, the default action for <code>Insert</code>, <code>Update</code>, and <code>Delete</code> operations is <code>Normal</code>.</p>
         * </li>
         * <li><p><code>dmlType</code>: The DML operation type. Valid values: <code>Insert</code>, <code>Update</code>, and <code>Delete</code>.</p>
         * </li>
         * <li><p><code>dmlAction</code>: The DML handling policy. Valid values: <code>Normal</code> (process the operation), <code>Ignore</code> (ignore the operation), <code>Filter</code> (conditionally process the operation, used when <code>dmlType</code> is <code>Update</code> or <code>Delete</code>), and <code>LogicalDelete</code> (perform a logical delete).</p>
         * </li>
         * <li><p><code>filterCondition</code>: The DML filter condition, used when <code>dmlAction</code> is <code>Filter</code>.</p>
         * </li>
         * </ul>
         * <ol start="5">
         * <li>Incremental condition rule (<code>DefineIncrementalCondition</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;where&quot;:&quot;id &gt; 0&quot;}</code></p>
         * </li>
         * <li><p>The <code>WHERE</code> clause for the incremental condition.</p>
         * </li>
         * </ul>
         * <ol start="6">
         * <li>Periodic scheduling rule (<code>DefineCycleScheduleSettings</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</code></p>
         * </li>
         * <li><p>Specifies the scheduling parameters for a periodic job.</p>
         * </li>
         * </ul>
         * <ol start="7">
         * <li>Define partition key rule (<code>DefinePartitionKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;id&quot;]}</code></p>
         * </li>
         * <li><p>Specifies the partition key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The name of the transformation rule. The name must be unique for a specific combination of <code>RuleActionType</code> and <code>RuleTargetType</code> and can be up to 50 characters long.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the target object. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code> (table)</p>
         * </li>
         * <li><p><code>Schema</code> (schema)</p>
         * </li>
         * <li><p><code>Database</code> (database)</p>
         * </li>
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
