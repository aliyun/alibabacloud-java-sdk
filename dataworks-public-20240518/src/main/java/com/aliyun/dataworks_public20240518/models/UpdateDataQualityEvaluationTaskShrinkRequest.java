// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The list of data quality rules associated with data quality monitoring.</p>
     */
    @NameInMap("DataQualityRules")
    public String dataQualityRulesShrink;

    /**
     * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to obtain the data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>358750</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the quality monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI data quality monitoring test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hook settings.</p>
     */
    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <p>The ID of the data quality monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7227061794</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the quality monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI data quality monitoring test.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification subscription configuration.</p>
     */
    @NameInMap("Notifications")
    public String notificationsShrink;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The extension configuration. This parameter is a character string in JSON format and takes effect only for EMR data quality monitoring.</p>
     * <ul>
     * <li>queue: the YARN queue used when you execute EMR data validation. Default value: the queue configured for the current project.</li>
     * <li>sqlEngine: the SQL DPI engine used when you execute EMR data validation. Valid values:<ul>
     * <li>HIVE_SQL</li>
     * <li>SPARK_SQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>The monitored object for data quality monitoring.</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    /**
     * <p>The trigger configuration of the data quality check task.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static UpdateDataQualityEvaluationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityEvaluationTaskShrinkRequest self = new UpdateDataQualityEvaluationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setDataQualityRulesShrink(String dataQualityRulesShrink) {
        this.dataQualityRulesShrink = dataQualityRulesShrink;
        return this;
    }
    public String getDataQualityRulesShrink() {
        return this.dataQualityRulesShrink;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setHooksShrink(String hooksShrink) {
        this.hooksShrink = hooksShrink;
        return this;
    }
    public String getHooksShrink() {
        return this.hooksShrink;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setNotificationsShrink(String notificationsShrink) {
        this.notificationsShrink = notificationsShrink;
        return this;
    }
    public String getNotificationsShrink() {
        return this.notificationsShrink;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

    public UpdateDataQualityEvaluationTaskShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
