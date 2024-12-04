// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskShrinkRequest extends TeaModel {
    @NameInMap("DataQualityRules")
    public String dataQualityRulesShrink;

    /**
     * <strong>example:</strong>
     * <p>358750</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>质量监控任务描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>数据质量校验任务实例生命周期中的回调设置，目前只支持一个阻塞调度任务的Hook</p>
     */
    @NameInMap("Hooks")
    public String hooksShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7227061794</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>质量监控任务名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>数据质量校验任务通知订阅配置</p>
     */
    @NameInMap("Notifications")
    public String notificationsShrink;

    /**
     * <p>项目空间Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>使用数据源时的一些设置，目前只支持指定EMR的yarn队列、采集EMR表时把SQL引擎指定为SPARK-SQL</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>参看 DataQualityTarget示例	数据质量校验任务的监控对象，参考 DataQualityTarget</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    /**
     * <p>数据质量校验任务的触发配置</p>
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
