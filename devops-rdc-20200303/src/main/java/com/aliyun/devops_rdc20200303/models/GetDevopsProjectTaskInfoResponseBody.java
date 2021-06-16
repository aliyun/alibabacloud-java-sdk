// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectTaskInfoResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public GetDevopsProjectTaskInfoResponseBodyObject object;

    public static GetDevopsProjectTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectTaskInfoResponseBody self = new GetDevopsProjectTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectTaskInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDevopsProjectTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevopsProjectTaskInfoResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public GetDevopsProjectTaskInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDevopsProjectTaskInfoResponseBody setObject(GetDevopsProjectTaskInfoResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetDevopsProjectTaskInfoResponseBodyObject getObject() {
        return this.object;
    }

    public static class GetDevopsProjectTaskInfoResponseBodyObject extends TeaModel {
        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("StoryPoint")
        public String storyPoint;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("IsTopInProject")
        public Boolean isTopInProject;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Visible")
        public String visible;

        @NameInMap("TasklistId")
        public String tasklistId;

        @NameInMap("IsDone")
        public Boolean isDone;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("TaskflowstatusId")
        public String taskflowstatusId;

        @NameInMap("Note")
        public String note;

        @NameInMap("SprintId")
        public String sprintId;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("Created")
        public String created;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        @NameInMap("InvolveMembers")
        public java.util.List<String> involveMembers;

        public static GetDevopsProjectTaskInfoResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsProjectTaskInfoResponseBodyObject self = new GetDevopsProjectTaskInfoResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setStoryPoint(String storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public String getStoryPoint() {
            return this.storyPoint;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setIsTopInProject(Boolean isTopInProject) {
            this.isTopInProject = isTopInProject;
            return this;
        }
        public Boolean getIsTopInProject() {
            return this.isTopInProject;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setTasklistId(String tasklistId) {
            this.tasklistId = tasklistId;
            return this;
        }
        public String getTasklistId() {
            return this.tasklistId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setTaskflowstatusId(String taskflowstatusId) {
            this.taskflowstatusId = taskflowstatusId;
            return this;
        }
        public String getTaskflowstatusId() {
            return this.taskflowstatusId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDevopsProjectTaskInfoResponseBodyObject setInvolveMembers(java.util.List<String> involveMembers) {
            this.involveMembers = involveMembers;
            return this;
        }
        public java.util.List<String> getInvolveMembers() {
            return this.involveMembers;
        }

    }

}
