// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class CreateWorkflowRequest extends TeaModel {
    @NameInMap("alertGroupId")
    public String alertGroupId;

    @NameInMap("alertStrategy")
    public String alertStrategy;

    @NameInMap("cronExpr")
    public String cronExpr;

    @NameInMap("description")
    public String description;

    @NameInMap("executionType")
    public String executionType;

    @NameInMap("failureStrategy")
    public String failureStrategy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("scheduleEndTime")
    public String scheduleEndTime;

    @NameInMap("scheduleStartTime")
    public String scheduleStartTime;

    @NameInMap("scheduleState")
    public String scheduleState;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskDefinitionJson")
    public String taskDefinitionJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskRelationJson")
    public String taskRelationJson;

    @NameInMap("timeZone")
    public String timeZone;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("workflowInstancePriority")
    public String workflowInstancePriority;

    @NameInMap("workflowParams")
    public String workflowParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowRequest self = new CreateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowRequest setAlertGroupId(String alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    public CreateWorkflowRequest setAlertStrategy(String alertStrategy) {
        this.alertStrategy = alertStrategy;
        return this;
    }
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    public CreateWorkflowRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public CreateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkflowRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public CreateWorkflowRequest setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public CreateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkflowRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateWorkflowRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWorkflowRequest setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    public String getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    public CreateWorkflowRequest setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    public String getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    public CreateWorkflowRequest setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
        return this;
    }
    public String getScheduleState() {
        return this.scheduleState;
    }

    public CreateWorkflowRequest setTaskDefinitionJson(String taskDefinitionJson) {
        this.taskDefinitionJson = taskDefinitionJson;
        return this;
    }
    public String getTaskDefinitionJson() {
        return this.taskDefinitionJson;
    }

    public CreateWorkflowRequest setTaskRelationJson(String taskRelationJson) {
        this.taskRelationJson = taskRelationJson;
        return this;
    }
    public String getTaskRelationJson() {
        return this.taskRelationJson;
    }

    public CreateWorkflowRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateWorkflowRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateWorkflowRequest setWorkflowInstancePriority(String workflowInstancePriority) {
        this.workflowInstancePriority = workflowInstancePriority;
        return this;
    }
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    public CreateWorkflowRequest setWorkflowParams(String workflowParams) {
        this.workflowParams = workflowParams;
        return this;
    }
    public String getWorkflowParams() {
        return this.workflowParams;
    }

    public CreateWorkflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
