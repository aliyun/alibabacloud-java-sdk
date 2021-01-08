// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectTaskRequest extends TeaModel {
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

    @NameInMap("ScenarioFieldConfigId")
    public String scenarioFieldConfigId;

    @NameInMap("TaskFlowStatusId")
    public String taskFlowStatusId;

    @NameInMap("Note")
    public String note;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Visible")
    public String visible;

    @NameInMap("ParentTaskId")
    public String parentTaskId;

    @NameInMap("SprintId")
    public String sprintId;

    @NameInMap("TaskListId")
    public String taskListId;

    public static CreateDevopsProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectTaskRequest self = new CreateDevopsProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectTaskRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateDevopsProjectTaskRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDevopsProjectTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDevopsProjectTaskRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public CreateDevopsProjectTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateDevopsProjectTaskRequest setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    public String getDueDate() {
        return this.dueDate;
    }

    public CreateDevopsProjectTaskRequest setScenarioFieldConfigId(String scenarioFieldConfigId) {
        this.scenarioFieldConfigId = scenarioFieldConfigId;
        return this;
    }
    public String getScenarioFieldConfigId() {
        return this.scenarioFieldConfigId;
    }

    public CreateDevopsProjectTaskRequest setTaskFlowStatusId(String taskFlowStatusId) {
        this.taskFlowStatusId = taskFlowStatusId;
        return this;
    }
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    public CreateDevopsProjectTaskRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateDevopsProjectTaskRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateDevopsProjectTaskRequest setVisible(String visible) {
        this.visible = visible;
        return this;
    }
    public String getVisible() {
        return this.visible;
    }

    public CreateDevopsProjectTaskRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public CreateDevopsProjectTaskRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

    public CreateDevopsProjectTaskRequest setTaskListId(String taskListId) {
        this.taskListId = taskListId;
        return this;
    }
    public String getTaskListId() {
        return this.taskListId;
    }

}
