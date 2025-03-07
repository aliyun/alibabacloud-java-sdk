// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionWithScheduleShrinkRequest extends TeaModel {
    /**
     * <p>The email address to receive alerts.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
     */
    @NameInMap("alertEmailAddress")
    public String alertEmailAddress;

    /**
     * <p>The description of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods batch workflow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The execution policy</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PARALLEL</p>
     */
    @NameInMap("executionType")
    public String executionType;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_batch_workflow</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <p>Specifies whether to publish the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("publish")
    public Boolean publish;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource queue.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("resourceQueue")
    public String resourceQueue;

    /**
     * <p>The number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retryTimes")
    public Integer retryTimes;

    /**
     * <p>The ID of the Alibaba Cloud account used by the user who creates the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>113***************</p>
     */
    @NameInMap("runAs")
    public String runAs;

    /**
     * <p>The scheduling settings.</p>
     */
    @NameInMap("schedule")
    public String scheduleShrink;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <p>The descriptions of all nodes in the workflow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskDefinitionJson")
    public String taskDefinitionJsonShrink;

    /**
     * <p>The node parallelism.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskParallelism")
    public Integer taskParallelism;

    /**
     * <p>The dependencies of all nodes in the workflow. preTaskCode specifies the ID of an upstream node, and postTaskCode specifies the ID of a downstream node. The ID of each node is unique. If a node does not have an upstream node, set preTaskCode to 0.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskRelationJson")
    public String taskRelationJsonShrink;

    /**
     * <p>The default timeout period of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static CreateProcessDefinitionWithScheduleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionWithScheduleShrinkRequest self = new CreateProcessDefinitionWithScheduleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setAlertEmailAddress(String alertEmailAddress) {
        this.alertEmailAddress = alertEmailAddress;
        return this;
    }
    public String getAlertEmailAddress() {
        return this.alertEmailAddress;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setProductNamespace(String productNamespace) {
        this.productNamespace = productNamespace;
        return this;
    }
    public String getProductNamespace() {
        return this.productNamespace;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
    public Boolean getPublish() {
        return this.publish;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setResourceQueue(String resourceQueue) {
        this.resourceQueue = resourceQueue;
        return this;
    }
    public String getResourceQueue() {
        return this.resourceQueue;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setRunAs(String runAs) {
        this.runAs = runAs;
        return this;
    }
    public String getRunAs() {
        return this.runAs;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setTaskDefinitionJsonShrink(String taskDefinitionJsonShrink) {
        this.taskDefinitionJsonShrink = taskDefinitionJsonShrink;
        return this;
    }
    public String getTaskDefinitionJsonShrink() {
        return this.taskDefinitionJsonShrink;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setTaskParallelism(Integer taskParallelism) {
        this.taskParallelism = taskParallelism;
        return this;
    }
    public Integer getTaskParallelism() {
        return this.taskParallelism;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setTaskRelationJsonShrink(String taskRelationJsonShrink) {
        this.taskRelationJsonShrink = taskRelationJsonShrink;
        return this;
    }
    public String getTaskRelationJsonShrink() {
        return this.taskRelationJsonShrink;
    }

    public CreateProcessDefinitionWithScheduleShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
