// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectSprintResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public CreateDevopsProjectSprintResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static CreateDevopsProjectSprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectSprintResponseBody self = new CreateDevopsProjectSprintResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectSprintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDevopsProjectSprintResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateDevopsProjectSprintResponseBody setObject(CreateDevopsProjectSprintResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public CreateDevopsProjectSprintResponseBodyObject getObject() {
        return this.object;
    }

    public CreateDevopsProjectSprintResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDevopsProjectSprintResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class CreateDevopsProjectSprintResponseBodyObjectPlanToDo extends TeaModel {
        @NameInMap("Tasks")
        public Integer tasks;

        @NameInMap("WorkTimes")
        public Integer workTimes;

        @NameInMap("StoryPoints")
        public Integer storyPoints;

        public static CreateDevopsProjectSprintResponseBodyObjectPlanToDo build(java.util.Map<String, ?> map) throws Exception {
            CreateDevopsProjectSprintResponseBodyObjectPlanToDo self = new CreateDevopsProjectSprintResponseBodyObjectPlanToDo();
            return TeaModel.build(map, self);
        }

        public CreateDevopsProjectSprintResponseBodyObjectPlanToDo setTasks(Integer tasks) {
            this.tasks = tasks;
            return this;
        }
        public Integer getTasks() {
            return this.tasks;
        }

        public CreateDevopsProjectSprintResponseBodyObjectPlanToDo setWorkTimes(Integer workTimes) {
            this.workTimes = workTimes;
            return this;
        }
        public Integer getWorkTimes() {
            return this.workTimes;
        }

        public CreateDevopsProjectSprintResponseBodyObjectPlanToDo setStoryPoints(Integer storyPoints) {
            this.storyPoints = storyPoints;
            return this;
        }
        public Integer getStoryPoints() {
            return this.storyPoints;
        }

    }

    public static class CreateDevopsProjectSprintResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Executor")
        public String executor;

        @NameInMap("Description")
        public String description;

        @NameInMap("Accomplished")
        public String accomplished;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public String created;

        @NameInMap("PlanToDo")
        public CreateDevopsProjectSprintResponseBodyObjectPlanToDo planToDo;

        @NameInMap("Id")
        public String id;

        public static CreateDevopsProjectSprintResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            CreateDevopsProjectSprintResponseBodyObject self = new CreateDevopsProjectSprintResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public CreateDevopsProjectSprintResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDevopsProjectSprintResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateDevopsProjectSprintResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public CreateDevopsProjectSprintResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CreateDevopsProjectSprintResponseBodyObject setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public CreateDevopsProjectSprintResponseBodyObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDevopsProjectSprintResponseBodyObject setAccomplished(String accomplished) {
            this.accomplished = accomplished;
            return this;
        }
        public String getAccomplished() {
            return this.accomplished;
        }

        public CreateDevopsProjectSprintResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public CreateDevopsProjectSprintResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public CreateDevopsProjectSprintResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public CreateDevopsProjectSprintResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDevopsProjectSprintResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public CreateDevopsProjectSprintResponseBodyObject setPlanToDo(CreateDevopsProjectSprintResponseBodyObjectPlanToDo planToDo) {
            this.planToDo = planToDo;
            return this;
        }
        public CreateDevopsProjectSprintResponseBodyObjectPlanToDo getPlanToDo() {
            return this.planToDo;
        }

        public CreateDevopsProjectSprintResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
