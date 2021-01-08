// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectSprintRequest extends TeaModel {
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

    public static CreateDevopsProjectSprintRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectSprintRequest self = new CreateDevopsProjectSprintRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectSprintRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateDevopsProjectSprintRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDevopsProjectSprintRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDevopsProjectSprintRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDevopsProjectSprintRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public CreateDevopsProjectSprintRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateDevopsProjectSprintRequest setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    public String getDueDate() {
        return this.dueDate;
    }

}
