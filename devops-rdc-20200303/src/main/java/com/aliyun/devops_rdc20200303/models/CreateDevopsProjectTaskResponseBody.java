// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public CreateDevopsProjectTaskResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static CreateDevopsProjectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectTaskResponseBody self = new CreateDevopsProjectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDevopsProjectTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateDevopsProjectTaskResponseBody setObject(CreateDevopsProjectTaskResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public CreateDevopsProjectTaskResponseBodyObject getObject() {
        return this.object;
    }

    public CreateDevopsProjectTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDevopsProjectTaskResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class CreateDevopsProjectTaskResponseBodyObject extends TeaModel {
        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ScenarioFieldConfigId")
        public String scenarioFieldConfigId;

        @NameInMap("AncestorIds")
        public String ancestorIds;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TasklistId")
        public String tasklistId;

        @NameInMap("TaskflowstatusId")
        public String taskflowstatusId;

        @NameInMap("Note")
        public String note;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("UniqueId")
        public Integer uniqueId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Rating")
        public Integer rating;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("StoryPoint")
        public String storyPoint;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Source")
        public String source;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Visible")
        public String visible;

        @NameInMap("IsDone")
        public Boolean isDone;

        @NameInMap("SprintId")
        public String sprintId;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("Created")
        public String created;

        @NameInMap("Id")
        public String id;

        public static CreateDevopsProjectTaskResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            CreateDevopsProjectTaskResponseBodyObject self = new CreateDevopsProjectTaskResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public CreateDevopsProjectTaskResponseBodyObject setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateDevopsProjectTaskResponseBodyObject setScenarioFieldConfigId(String scenarioFieldConfigId) {
            this.scenarioFieldConfigId = scenarioFieldConfigId;
            return this;
        }
        public String getScenarioFieldConfigId() {
            return this.scenarioFieldConfigId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setAncestorIds(String ancestorIds) {
            this.ancestorIds = ancestorIds;
            return this;
        }
        public String getAncestorIds() {
            return this.ancestorIds;
        }

        public CreateDevopsProjectTaskResponseBodyObject setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public CreateDevopsProjectTaskResponseBodyObject setTasklistId(String tasklistId) {
            this.tasklistId = tasklistId;
            return this;
        }
        public String getTasklistId() {
            return this.tasklistId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setTaskflowstatusId(String taskflowstatusId) {
            this.taskflowstatusId = taskflowstatusId;
            return this;
        }
        public String getTaskflowstatusId() {
            return this.taskflowstatusId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateDevopsProjectTaskResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public CreateDevopsProjectTaskResponseBodyObject setUniqueId(Integer uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Integer getUniqueId() {
            return this.uniqueId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDevopsProjectTaskResponseBodyObject setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

        public CreateDevopsProjectTaskResponseBodyObject setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public CreateDevopsProjectTaskResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public CreateDevopsProjectTaskResponseBodyObject setStoryPoint(String storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public String getStoryPoint() {
            return this.storyPoint;
        }

        public CreateDevopsProjectTaskResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateDevopsProjectTaskResponseBodyObject setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

        public CreateDevopsProjectTaskResponseBodyObject setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public CreateDevopsProjectTaskResponseBodyObject setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public CreateDevopsProjectTaskResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public CreateDevopsProjectTaskResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public CreateDevopsProjectTaskResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
