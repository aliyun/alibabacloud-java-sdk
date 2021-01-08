// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateDevopsProjectTaskRequest extends TeaModel {
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

    @NameInMap("ScenarioFiieldConfigId")
    public String scenarioFiieldConfigId;

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

    @NameInMap("TaskId")
    public String taskId;

    public static UpdateDevopsProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevopsProjectTaskRequest self = new UpdateDevopsProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevopsProjectTaskRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateDevopsProjectTaskRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDevopsProjectTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDevopsProjectTaskRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public UpdateDevopsProjectTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateDevopsProjectTaskRequest setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    public String getDueDate() {
        return this.dueDate;
    }

    public UpdateDevopsProjectTaskRequest setScenarioFiieldConfigId(String scenarioFiieldConfigId) {
        this.scenarioFiieldConfigId = scenarioFiieldConfigId;
        return this;
    }
    public String getScenarioFiieldConfigId() {
        return this.scenarioFiieldConfigId;
    }

    public UpdateDevopsProjectTaskRequest setTaskFlowStatusId(String taskFlowStatusId) {
        this.taskFlowStatusId = taskFlowStatusId;
        return this;
    }
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    public UpdateDevopsProjectTaskRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateDevopsProjectTaskRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateDevopsProjectTaskRequest setVisible(String visible) {
        this.visible = visible;
        return this;
    }
    public String getVisible() {
        return this.visible;
    }

    public UpdateDevopsProjectTaskRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public UpdateDevopsProjectTaskRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

    public UpdateDevopsProjectTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
