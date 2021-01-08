// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectSprintInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public GetDevopsProjectSprintInfoResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static GetDevopsProjectSprintInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectSprintInfoResponseBody self = new GetDevopsProjectSprintInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectSprintInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevopsProjectSprintInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDevopsProjectSprintInfoResponseBody setObject(GetDevopsProjectSprintInfoResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetDevopsProjectSprintInfoResponseBodyObject getObject() {
        return this.object;
    }

    public GetDevopsProjectSprintInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDevopsProjectSprintInfoResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo extends TeaModel {
        @NameInMap("Tasks")
        public Integer tasks;

        @NameInMap("WorkTimes")
        public Integer workTimes;

        @NameInMap("StoryPoints")
        public Integer storyPoints;

        public static GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo self = new GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo();
            return TeaModel.build(map, self);
        }

        public GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo setTasks(Integer tasks) {
            this.tasks = tasks;
            return this;
        }
        public Integer getTasks() {
            return this.tasks;
        }

        public GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo setWorkTimes(Integer workTimes) {
            this.workTimes = workTimes;
            return this;
        }
        public Integer getWorkTimes() {
            return this.workTimes;
        }

        public GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo setStoryPoints(Integer storyPoints) {
            this.storyPoints = storyPoints;
            return this;
        }
        public Integer getStoryPoints() {
            return this.storyPoints;
        }

    }

    public static class GetDevopsProjectSprintInfoResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("CreatorId")
        public String creatorId;

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
        public GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo planToDo;

        @NameInMap("Id")
        public String id;

        public static GetDevopsProjectSprintInfoResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsProjectSprintInfoResponseBodyObject self = new GetDevopsProjectSprintInfoResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setAccomplished(String accomplished) {
            this.accomplished = accomplished;
            return this;
        }
        public String getAccomplished() {
            return this.accomplished;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setPlanToDo(GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo planToDo) {
            this.planToDo = planToDo;
            return this;
        }
        public GetDevopsProjectSprintInfoResponseBodyObjectPlanToDo getPlanToDo() {
            return this.planToDo;
        }

        public GetDevopsProjectSprintInfoResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
