// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The list of data quality rules associated with the data quality monitoring task. If DataQualityRule.Id is specified, the rule corresponding to the ID is associated with the new quality monitoring task. If DataQualityRule.Id is not specified, a new rule is created based on the other fields and associated with the new quality monitoring task.</p>
     */
    @NameInMap("DataQualityRules")
    public String dataQualityRulesShrink;

    /**
     * <p>The data source ID. You can call <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> to obtain the data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the data quality monitor task.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI create a data quality monitoring test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The callback settings.</p>
     */
    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <p>The name of the data quality monitor task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI create a data quality monitoring test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification subscription configuration.</p>
     */
    @NameInMap("Notifications")
    public String notificationsShrink;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The extended configuration. The value is a JSON-formatted string. This parameter takes effect only for EMR-type data quality monitors.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>The monitored object of the data quality monitor.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    /**
     * <p>The trigger configuration of the data quality check task.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static CreateDataQualityEvaluationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskShrinkRequest self = new CreateDataQualityEvaluationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setDataQualityRulesShrink(String dataQualityRulesShrink) {
        this.dataQualityRulesShrink = dataQualityRulesShrink;
        return this;
    }
    public String getDataQualityRulesShrink() {
        return this.dataQualityRulesShrink;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setHooksShrink(String hooksShrink) {
        this.hooksShrink = hooksShrink;
        return this;
    }
    public String getHooksShrink() {
        return this.hooksShrink;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setNotificationsShrink(String notificationsShrink) {
        this.notificationsShrink = notificationsShrink;
        return this;
    }
    public String getNotificationsShrink() {
        return this.notificationsShrink;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

    public CreateDataQualityEvaluationTaskShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
