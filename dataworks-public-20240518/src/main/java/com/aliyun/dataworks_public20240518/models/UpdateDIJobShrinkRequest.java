// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDIJobShrinkRequest extends TeaModel {
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
    public String jobSettingsShrink;

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
    public String resourceSettingsShrink;

    /**
     * <p>A list of object transformation mappings. Each mapping specifies a set of selection rules for source objects and a list of transformation rules that apply to the selected objects.</p>
     * <blockquote>
     * <p>[ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
     * </blockquote>
     */
    @NameInMap("TableMappings")
    public String tableMappingsShrink;

    /**
     * <p>A list of transformation rule definitions.</p>
     * <blockquote>
     * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
     * </blockquote>
     */
    @NameInMap("TransformationRules")
    public String transformationRulesShrink;

    public static UpdateDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIJobShrinkRequest self = new UpdateDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public UpdateDIJobShrinkRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public UpdateDIJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDIJobShrinkRequest setFileSpec(String fileSpec) {
        this.fileSpec = fileSpec;
        return this;
    }
    public String getFileSpec() {
        return this.fileSpec;
    }

    public UpdateDIJobShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDIJobShrinkRequest setJobSettingsShrink(String jobSettingsShrink) {
        this.jobSettingsShrink = jobSettingsShrink;
        return this;
    }
    public String getJobSettingsShrink() {
        return this.jobSettingsShrink;
    }

    public UpdateDIJobShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDIJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDIJobShrinkRequest setResourceSettingsShrink(String resourceSettingsShrink) {
        this.resourceSettingsShrink = resourceSettingsShrink;
        return this;
    }
    public String getResourceSettingsShrink() {
        return this.resourceSettingsShrink;
    }

    public UpdateDIJobShrinkRequest setTableMappingsShrink(String tableMappingsShrink) {
        this.tableMappingsShrink = tableMappingsShrink;
        return this;
    }
    public String getTableMappingsShrink() {
        return this.tableMappingsShrink;
    }

    public UpdateDIJobShrinkRequest setTransformationRulesShrink(String transformationRulesShrink) {
        this.transformationRulesShrink = transformationRulesShrink;
        return this;
    }
    public String getTransformationRulesShrink() {
        return this.transformationRulesShrink;
    }

}
