// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionWithScheduleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
     */
    @NameInMap("alertEmailAddress")
    public String alertEmailAddress;

    /**
     * <strong>example:</strong>
     * <p>ods batch workflow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PARALLEL</p>
     */
    @NameInMap("executionType")
    public String executionType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_batch_workflow</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("publish")
    public Boolean publish;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("releaseState")
    public String releaseState;

    /**
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("resourceQueue")
    public String resourceQueue;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retryTimes")
    public Integer retryTimes;

    /**
     * <strong>example:</strong>
     * <p>113***************</p>
     */
    @NameInMap("runAs")
    public String runAs;

    @NameInMap("schedule")
    public String scheduleShrink;

    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskDefinitionJson")
    public String taskDefinitionJsonShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskParallelism")
    public Integer taskParallelism;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskRelationJson")
    public String taskRelationJsonShrink;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateProcessDefinitionWithScheduleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionWithScheduleShrinkRequest self = new UpdateProcessDefinitionWithScheduleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setAlertEmailAddress(String alertEmailAddress) {
        this.alertEmailAddress = alertEmailAddress;
        return this;
    }
    public String getAlertEmailAddress() {
        return this.alertEmailAddress;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setProductNamespace(String productNamespace) {
        this.productNamespace = productNamespace;
        return this;
    }
    public String getProductNamespace() {
        return this.productNamespace;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
    public Boolean getPublish() {
        return this.publish;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setReleaseState(String releaseState) {
        this.releaseState = releaseState;
        return this;
    }
    public String getReleaseState() {
        return this.releaseState;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setResourceQueue(String resourceQueue) {
        this.resourceQueue = resourceQueue;
        return this;
    }
    public String getResourceQueue() {
        return this.resourceQueue;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setRunAs(String runAs) {
        this.runAs = runAs;
        return this;
    }
    public String getRunAs() {
        return this.runAs;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setTaskDefinitionJsonShrink(String taskDefinitionJsonShrink) {
        this.taskDefinitionJsonShrink = taskDefinitionJsonShrink;
        return this;
    }
    public String getTaskDefinitionJsonShrink() {
        return this.taskDefinitionJsonShrink;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setTaskParallelism(Integer taskParallelism) {
        this.taskParallelism = taskParallelism;
        return this;
    }
    public Integer getTaskParallelism() {
        return this.taskParallelism;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setTaskRelationJsonShrink(String taskRelationJsonShrink) {
        this.taskRelationJsonShrink = taskRelationJsonShrink;
        return this;
    }
    public String getTaskRelationJsonShrink() {
        return this.taskRelationJsonShrink;
    }

    public UpdateProcessDefinitionWithScheduleShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
