// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateTaskDetailRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Content")
    public String content;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ExecutorId")
    public String executorId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("DueDate")
    public String dueDate;

    @NameInMap("TaskFlowStatusId")
    public String taskFlowStatusId;

    @NameInMap("Note")
    public String note;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("SprintId")
    public String sprintId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("WorkTimes")
    public Long workTimes;

    @NameInMap("CustomFieldId")
    public String customFieldId;

    @NameInMap("CustomFieldValues")
    public String customFieldValues;

    @NameInMap("StoryPoint")
    public String storyPoint;

    @NameInMap("TagIds")
    public String tagIds;

    @NameInMap("DelInvolvers")
    public String delInvolvers;

    @NameInMap("AddInvolvers")
    public String addInvolvers;

    public static UpdateTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskDetailRequest self = new UpdateTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskDetailRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateTaskDetailRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateTaskDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateTaskDetailRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public UpdateTaskDetailRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateTaskDetailRequest setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    public String getDueDate() {
        return this.dueDate;
    }

    public UpdateTaskDetailRequest setTaskFlowStatusId(String taskFlowStatusId) {
        this.taskFlowStatusId = taskFlowStatusId;
        return this;
    }
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    public UpdateTaskDetailRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateTaskDetailRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateTaskDetailRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

    public UpdateTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateTaskDetailRequest setWorkTimes(Long workTimes) {
        this.workTimes = workTimes;
        return this;
    }
    public Long getWorkTimes() {
        return this.workTimes;
    }

    public UpdateTaskDetailRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

    public UpdateTaskDetailRequest setCustomFieldValues(String customFieldValues) {
        this.customFieldValues = customFieldValues;
        return this;
    }
    public String getCustomFieldValues() {
        return this.customFieldValues;
    }

    public UpdateTaskDetailRequest setStoryPoint(String storyPoint) {
        this.storyPoint = storyPoint;
        return this;
    }
    public String getStoryPoint() {
        return this.storyPoint;
    }

    public UpdateTaskDetailRequest setTagIds(String tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public String getTagIds() {
        return this.tagIds;
    }

    public UpdateTaskDetailRequest setDelInvolvers(String delInvolvers) {
        this.delInvolvers = delInvolvers;
        return this;
    }
    public String getDelInvolvers() {
        return this.delInvolvers;
    }

    public UpdateTaskDetailRequest setAddInvolvers(String addInvolvers) {
        this.addInvolvers = addInvolvers;
        return this;
    }
    public String getAddInvolvers() {
        return this.addInvolvers;
    }

}
