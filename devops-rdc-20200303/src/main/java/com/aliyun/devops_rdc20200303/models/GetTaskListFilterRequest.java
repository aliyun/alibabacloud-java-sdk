// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskListFilterRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ScenarioFieldConfigId")
    public String scenarioFieldConfigId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderCondition")
    public String orderCondition;

    @NameInMap("Order")
    public String order;

    @NameInMap("ExecutorId")
    public String executorId;

    @NameInMap("TagId")
    public String tagId;

    @NameInMap("DueDateStart")
    public String dueDateStart;

    @NameInMap("DueDateEnd")
    public String dueDateEnd;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("InvolveMembers")
    public String involveMembers;

    @NameInMap("IsDone")
    public Boolean isDone;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageToken")
    public String pageToken;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("TaskFlowStatusId")
    public String taskFlowStatusId;

    @NameInMap("SprintId")
    public String sprintId;

    @NameInMap("Extra")
    public String extra;

    public static GetTaskListFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListFilterRequest self = new GetTaskListFilterRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskListFilterRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetTaskListFilterRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetTaskListFilterRequest setScenarioFieldConfigId(String scenarioFieldConfigId) {
        this.scenarioFieldConfigId = scenarioFieldConfigId;
        return this;
    }
    public String getScenarioFieldConfigId() {
        return this.scenarioFieldConfigId;
    }

    public GetTaskListFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTaskListFilterRequest setOrderCondition(String orderCondition) {
        this.orderCondition = orderCondition;
        return this;
    }
    public String getOrderCondition() {
        return this.orderCondition;
    }

    public GetTaskListFilterRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetTaskListFilterRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public GetTaskListFilterRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public GetTaskListFilterRequest setDueDateStart(String dueDateStart) {
        this.dueDateStart = dueDateStart;
        return this;
    }
    public String getDueDateStart() {
        return this.dueDateStart;
    }

    public GetTaskListFilterRequest setDueDateEnd(String dueDateEnd) {
        this.dueDateEnd = dueDateEnd;
        return this;
    }
    public String getDueDateEnd() {
        return this.dueDateEnd;
    }

    public GetTaskListFilterRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetTaskListFilterRequest setInvolveMembers(String involveMembers) {
        this.involveMembers = involveMembers;
        return this;
    }
    public String getInvolveMembers() {
        return this.involveMembers;
    }

    public GetTaskListFilterRequest setIsDone(Boolean isDone) {
        this.isDone = isDone;
        return this;
    }
    public Boolean getIsDone() {
        return this.isDone;
    }

    public GetTaskListFilterRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public GetTaskListFilterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTaskListFilterRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public GetTaskListFilterRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetTaskListFilterRequest setTaskFlowStatusId(String taskFlowStatusId) {
        this.taskFlowStatusId = taskFlowStatusId;
        return this;
    }
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    public GetTaskListFilterRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

    public GetTaskListFilterRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
