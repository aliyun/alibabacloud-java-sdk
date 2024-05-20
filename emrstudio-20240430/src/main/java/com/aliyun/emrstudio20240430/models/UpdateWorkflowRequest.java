// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowRequest extends TeaModel {
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

    @NameInMap("taskDefinitionJson")
    public String taskDefinitionJson;

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

    public static UpdateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowRequest self = new UpdateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowRequest setAlertGroupId(String alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    public UpdateWorkflowRequest setAlertStrategy(String alertStrategy) {
        this.alertStrategy = alertStrategy;
        return this;
    }
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    public UpdateWorkflowRequest setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }
    public String getCronExpr() {
        return this.cronExpr;
    }

    public UpdateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public UpdateWorkflowRequest setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public UpdateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public UpdateWorkflowRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateWorkflowRequest setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    public String getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    public UpdateWorkflowRequest setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    public String getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    public UpdateWorkflowRequest setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
        return this;
    }
    public String getScheduleState() {
        return this.scheduleState;
    }

    public UpdateWorkflowRequest setTaskDefinitionJson(String taskDefinitionJson) {
        this.taskDefinitionJson = taskDefinitionJson;
        return this;
    }
    public String getTaskDefinitionJson() {
        return this.taskDefinitionJson;
    }

    public UpdateWorkflowRequest setTaskRelationJson(String taskRelationJson) {
        this.taskRelationJson = taskRelationJson;
        return this;
    }
    public String getTaskRelationJson() {
        return this.taskRelationJson;
    }

    public UpdateWorkflowRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public UpdateWorkflowRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateWorkflowRequest setWorkflowInstancePriority(String workflowInstancePriority) {
        this.workflowInstancePriority = workflowInstancePriority;
        return this;
    }
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    public UpdateWorkflowRequest setWorkflowParams(String workflowParams) {
        this.workflowParams = workflowParams;
        return this;
    }
    public String getWorkflowParams() {
        return this.workflowParams;
    }

    public UpdateWorkflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
