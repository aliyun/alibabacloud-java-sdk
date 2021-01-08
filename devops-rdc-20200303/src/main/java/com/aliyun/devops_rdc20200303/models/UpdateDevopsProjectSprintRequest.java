// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateDevopsProjectSprintRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ExecutorId")
    public String executorId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("DueDate")
    public String dueDate;

    @NameInMap("SprintId")
    public String sprintId;

    public static UpdateDevopsProjectSprintRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevopsProjectSprintRequest self = new UpdateDevopsProjectSprintRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevopsProjectSprintRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateDevopsProjectSprintRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDevopsProjectSprintRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDevopsProjectSprintRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDevopsProjectSprintRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public UpdateDevopsProjectSprintRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateDevopsProjectSprintRequest setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    public String getDueDate() {
        return this.dueDate;
    }

    public UpdateDevopsProjectSprintRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

}
