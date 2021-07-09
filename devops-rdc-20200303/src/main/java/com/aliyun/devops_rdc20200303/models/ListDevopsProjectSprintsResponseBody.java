// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectSprintsResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<ListDevopsProjectSprintsResponseBodyObject> object;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    public static ListDevopsProjectSprintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectSprintsResponseBody self = new ListDevopsProjectSprintsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectSprintsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectSprintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectSprintsResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public ListDevopsProjectSprintsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectSprintsResponseBody setObject(java.util.List<ListDevopsProjectSprintsResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListDevopsProjectSprintsResponseBodyObject> getObject() {
        return this.object;
    }

    public ListDevopsProjectSprintsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static class ListDevopsProjectSprintsResponseBodyObjectPlanToDo extends TeaModel {
        @NameInMap("Tasks")
        public Integer tasks;

        @NameInMap("WorkTimes")
        public Integer workTimes;

        @NameInMap("StoryPoints")
        public Integer storyPoints;

        public static ListDevopsProjectSprintsResponseBodyObjectPlanToDo build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectSprintsResponseBodyObjectPlanToDo self = new ListDevopsProjectSprintsResponseBodyObjectPlanToDo();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectSprintsResponseBodyObjectPlanToDo setTasks(Integer tasks) {
            this.tasks = tasks;
            return this;
        }
        public Integer getTasks() {
            return this.tasks;
        }

        public ListDevopsProjectSprintsResponseBodyObjectPlanToDo setWorkTimes(Integer workTimes) {
            this.workTimes = workTimes;
            return this;
        }
        public Integer getWorkTimes() {
            return this.workTimes;
        }

        public ListDevopsProjectSprintsResponseBodyObjectPlanToDo setStoryPoints(Integer storyPoints) {
            this.storyPoints = storyPoints;
            return this;
        }
        public Integer getStoryPoints() {
            return this.storyPoints;
        }

    }

    public static class ListDevopsProjectSprintsResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Accomplished")
        public String accomplished;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public String created;

        @NameInMap("Id")
        public String id;

        @NameInMap("PlanToDo")
        public ListDevopsProjectSprintsResponseBodyObjectPlanToDo planToDo;

        public static ListDevopsProjectSprintsResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectSprintsResponseBodyObject self = new ListDevopsProjectSprintsResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectSprintsResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDevopsProjectSprintsResponseBodyObject setAccomplished(String accomplished) {
            this.accomplished = accomplished;
            return this;
        }
        public String getAccomplished() {
            return this.accomplished;
        }

        public ListDevopsProjectSprintsResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDevopsProjectSprintsResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListDevopsProjectSprintsResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListDevopsProjectSprintsResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public ListDevopsProjectSprintsResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDevopsProjectSprintsResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public ListDevopsProjectSprintsResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevopsProjectSprintsResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListDevopsProjectSprintsResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDevopsProjectSprintsResponseBodyObject setPlanToDo(ListDevopsProjectSprintsResponseBodyObjectPlanToDo planToDo) {
            this.planToDo = planToDo;
            return this;
        }
        public ListDevopsProjectSprintsResponseBodyObjectPlanToDo getPlanToDo() {
            return this.planToDo;
        }

    }

}
