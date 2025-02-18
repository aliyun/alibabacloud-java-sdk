// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobShrinkRequest extends TeaModel {
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
    public String destinationDataSourceSettingsShrink;

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
    public String jobSettingsShrink;

    /**
     * <p>The synchronization type. Valid values:</p>
     * <ul>
     * <li>FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization</li>
     * <li>RealtimeIncremental: real-time incremental synchronization</li>
     * <li>Full: full synchronization</li>
     * <li>OfflineIncremental: batch incremental synchronization</li>
     * <li>FullAndOfflineIncremental: one-time full synchronization and batch incremental synchronization</li>
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
    public String resourceSettingsShrink;

    /**
     * <p>The settings of the source. Only a single source is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public String sourceDataSourceSettingsShrink;

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
    public String tableMappingsShrink;

    /**
     * <p>The list of transformation rules for objects involved in the synchronization task.</p>
     * <blockquote>
     * <p> [ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
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
