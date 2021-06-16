// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskListFilterResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public String successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public GetTaskListFilterResponseBodyObject object;

    public static GetTaskListFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListFilterResponseBody self = new GetTaskListFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskListFilterResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTaskListFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskListFilterResponseBody setSuccessful(String successful) {
        this.successful = successful;
        return this;
    }
    public String getSuccessful() {
        return this.successful;
    }

    public GetTaskListFilterResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskListFilterResponseBody setObject(GetTaskListFilterResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetTaskListFilterResponseBodyObject getObject() {
        return this.object;
    }

    public static class GetTaskListFilterResponseBodyObjectResultCustomfieldsValue extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Title")
        public String title;

        public static GetTaskListFilterResponseBodyObjectResultCustomfieldsValue build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultCustomfieldsValue self = new GetTaskListFilterResponseBodyObjectResultCustomfieldsValue();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfieldsValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfieldsValue setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultCustomfields extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CustomfieldId")
        public String customfieldId;

        @NameInMap("Values")
        public String values;

        @NameInMap("Value")
        public java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfieldsValue> value;

        public static GetTaskListFilterResponseBodyObjectResultCustomfields build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultCustomfields self = new GetTaskListFilterResponseBodyObjectResultCustomfields();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfields setCustomfieldId(String customfieldId) {
            this.customfieldId = customfieldId;
            return this;
        }
        public String getCustomfieldId() {
            return this.customfieldId;
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfields setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

        public GetTaskListFilterResponseBodyObjectResultCustomfields setValue(java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfieldsValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfieldsValue> getValue() {
            return this.value;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultWorkTime extends TeaModel {
        @NameInMap("UsedTime")
        public Integer usedTime;

        @NameInMap("TotalTime")
        public Integer totalTime;

        @NameInMap("Unit")
        public String unit;

        public static GetTaskListFilterResponseBodyObjectResultWorkTime build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultWorkTime self = new GetTaskListFilterResponseBodyObjectResultWorkTime();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultWorkTime setUsedTime(Integer usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Integer getUsedTime() {
            return this.usedTime;
        }

        public GetTaskListFilterResponseBodyObjectResultWorkTime setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Integer getTotalTime() {
            return this.totalTime;
        }

        public GetTaskListFilterResponseBodyObjectResultWorkTime setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultBadges extends TeaModel {
        @NameInMap("LikesCount")
        public Integer likesCount;

        @NameInMap("ObjectlinksCount")
        public Integer objectlinksCount;

        @NameInMap("AttachmentsCount")
        public Integer attachmentsCount;

        @NameInMap("CommentsCount")
        public Integer commentsCount;

        public static GetTaskListFilterResponseBodyObjectResultBadges build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultBadges self = new GetTaskListFilterResponseBodyObjectResultBadges();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultBadges setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
            return this;
        }
        public Integer getLikesCount() {
            return this.likesCount;
        }

        public GetTaskListFilterResponseBodyObjectResultBadges setObjectlinksCount(Integer objectlinksCount) {
            this.objectlinksCount = objectlinksCount;
            return this;
        }
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        public GetTaskListFilterResponseBodyObjectResultBadges setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
            return this;
        }
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        public GetTaskListFilterResponseBodyObjectResultBadges setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultSubtaskCount extends TeaModel {
        @NameInMap("Done")
        public Integer done;

        @NameInMap("Total")
        public Integer total;

        public static GetTaskListFilterResponseBodyObjectResultSubtaskCount build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultSubtaskCount self = new GetTaskListFilterResponseBodyObjectResultSubtaskCount();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultSubtaskCount setDone(Integer done) {
            this.done = done;
            return this;
        }
        public Integer getDone() {
            return this.done;
        }

        public GetTaskListFilterResponseBodyObjectResultSubtaskCount setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultReminder extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Date")
        public String date;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Rules")
        public java.util.List<String> rules;

        public static GetTaskListFilterResponseBodyObjectResultReminder build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultReminder self = new GetTaskListFilterResponseBodyObjectResultReminder();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultReminder setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskListFilterResponseBodyObjectResultReminder setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetTaskListFilterResponseBodyObjectResultReminder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetTaskListFilterResponseBodyObjectResultReminder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public GetTaskListFilterResponseBodyObjectResultReminder setRules(java.util.List<String> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<String> getRules() {
            return this.rules;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultCreator extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public String id;

        public static GetTaskListFilterResponseBodyObjectResultCreator build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultCreator self = new GetTaskListFilterResponseBodyObjectResultCreator();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskListFilterResponseBodyObjectResultCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetTaskListFilterResponseBodyObjectResultCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultStage extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskListFilterResponseBodyObjectResultStage build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultStage self = new GetTaskListFilterResponseBodyObjectResultStage();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultStage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskListFilterResponseBodyObjectResultStage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultExecutor extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public String id;

        public static GetTaskListFilterResponseBodyObjectResultExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultExecutor self = new GetTaskListFilterResponseBodyObjectResultExecutor();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultExecutor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskListFilterResponseBodyObjectResultExecutor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetTaskListFilterResponseBodyObjectResultExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResultTaskFlowStatus extends TeaModel {
        @NameInMap("TaskFlowId")
        public String taskFlowId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Id")
        public String id;

        public static GetTaskListFilterResponseBodyObjectResultTaskFlowStatus build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResultTaskFlowStatus self = new GetTaskListFilterResponseBodyObjectResultTaskFlowStatus();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus setTaskFlowId(String taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }
        public String getTaskFlowId() {
            return this.taskFlowId;
        }

        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskListFilterResponseBodyObjectResult extends TeaModel {
        @NameInMap("IsFavorite")
        public Boolean isFavorite;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("IsTopInProject")
        public Boolean isTopInProject;

        @NameInMap("ScenariofFeldConfigId")
        public String scenariofFeldConfigId;

        @NameInMap("ShareStatus")
        public Integer shareStatus;

        @NameInMap("Accomplished")
        public String accomplished;

        @NameInMap("TaskListId")
        public String taskListId;

        @NameInMap("Note")
        public String note;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("UniqueId")
        public Integer uniqueId;

        @NameInMap("IsArchived")
        public Boolean isArchived;

        @NameInMap("Content")
        public String content;

        @NameInMap("Rating")
        public Integer rating;

        @NameInMap("CommentsCount")
        public Integer commentsCount;

        @NameInMap("TaskFlowStatusId")
        public String taskFlowStatusId;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("UntilDate")
        public String untilDate;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("StoryPoint")
        public String storyPoint;

        @NameInMap("ObjectlinksCount")
        public Integer objectlinksCount;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Sprint")
        public String sprint;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("SourceDate")
        public String sourceDate;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("LikesCount")
        public Integer likesCount;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Visible")
        public String visible;

        @NameInMap("IsDone")
        public Boolean isDone;

        @NameInMap("Parent")
        public String parent;

        @NameInMap("SprintId")
        public String sprintId;

        @NameInMap("AttachmentsCount")
        public Integer attachmentsCount;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("TaskUniqueId")
        public String taskUniqueId;

        @NameInMap("Created")
        public String created;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Customfields")
        public java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfields> customfields;

        @NameInMap("InvolveMembers")
        public java.util.List<String> involveMembers;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Divisions")
        public java.util.List<String> divisions;

        @NameInMap("AncestorIds")
        public java.util.List<String> ancestorIds;

        @NameInMap("WorkTime")
        public GetTaskListFilterResponseBodyObjectResultWorkTime workTime;

        @NameInMap("Badges")
        public GetTaskListFilterResponseBodyObjectResultBadges badges;

        @NameInMap("SubtaskCount")
        public GetTaskListFilterResponseBodyObjectResultSubtaskCount subtaskCount;

        @NameInMap("Reminder")
        public GetTaskListFilterResponseBodyObjectResultReminder reminder;

        @NameInMap("Creator")
        public GetTaskListFilterResponseBodyObjectResultCreator creator;

        @NameInMap("Stage")
        public GetTaskListFilterResponseBodyObjectResultStage stage;

        @NameInMap("Executor")
        public GetTaskListFilterResponseBodyObjectResultExecutor executor;

        @NameInMap("TaskFlowStatus")
        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus taskFlowStatus;

        public static GetTaskListFilterResponseBodyObjectResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObjectResult self = new GetTaskListFilterResponseBodyObjectResult();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObjectResult setIsFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            return this;
        }
        public Boolean getIsFavorite() {
            return this.isFavorite;
        }

        public GetTaskListFilterResponseBodyObjectResult setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public GetTaskListFilterResponseBodyObjectResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetTaskListFilterResponseBodyObjectResult setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskListFilterResponseBodyObjectResult setIsTopInProject(Boolean isTopInProject) {
            this.isTopInProject = isTopInProject;
            return this;
        }
        public Boolean getIsTopInProject() {
            return this.isTopInProject;
        }

        public GetTaskListFilterResponseBodyObjectResult setScenariofFeldConfigId(String scenariofFeldConfigId) {
            this.scenariofFeldConfigId = scenariofFeldConfigId;
            return this;
        }
        public String getScenariofFeldConfigId() {
            return this.scenariofFeldConfigId;
        }

        public GetTaskListFilterResponseBodyObjectResult setShareStatus(Integer shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }
        public Integer getShareStatus() {
            return this.shareStatus;
        }

        public GetTaskListFilterResponseBodyObjectResult setAccomplished(String accomplished) {
            this.accomplished = accomplished;
            return this;
        }
        public String getAccomplished() {
            return this.accomplished;
        }

        public GetTaskListFilterResponseBodyObjectResult setTaskListId(String taskListId) {
            this.taskListId = taskListId;
            return this;
        }
        public String getTaskListId() {
            return this.taskListId;
        }

        public GetTaskListFilterResponseBodyObjectResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetTaskListFilterResponseBodyObjectResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetTaskListFilterResponseBodyObjectResult setUniqueId(Integer uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Integer getUniqueId() {
            return this.uniqueId;
        }

        public GetTaskListFilterResponseBodyObjectResult setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        public GetTaskListFilterResponseBodyObjectResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskListFilterResponseBodyObjectResult setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

        public GetTaskListFilterResponseBodyObjectResult setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

        public GetTaskListFilterResponseBodyObjectResult setTaskFlowStatusId(String taskFlowStatusId) {
            this.taskFlowStatusId = taskFlowStatusId;
            return this;
        }
        public String getTaskFlowStatusId() {
            return this.taskFlowStatusId;
        }

        public GetTaskListFilterResponseBodyObjectResult setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskListFilterResponseBodyObjectResult setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetTaskListFilterResponseBodyObjectResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetTaskListFilterResponseBodyObjectResult setUntilDate(String untilDate) {
            this.untilDate = untilDate;
            return this;
        }
        public String getUntilDate() {
            return this.untilDate;
        }

        public GetTaskListFilterResponseBodyObjectResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public GetTaskListFilterResponseBodyObjectResult setStoryPoint(String storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public String getStoryPoint() {
            return this.storyPoint;
        }

        public GetTaskListFilterResponseBodyObjectResult setObjectlinksCount(Integer objectlinksCount) {
            this.objectlinksCount = objectlinksCount;
            return this;
        }
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        public GetTaskListFilterResponseBodyObjectResult setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetTaskListFilterResponseBodyObjectResult setSprint(String sprint) {
            this.sprint = sprint;
            return this;
        }
        public String getSprint() {
            return this.sprint;
        }

        public GetTaskListFilterResponseBodyObjectResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetTaskListFilterResponseBodyObjectResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTaskListFilterResponseBodyObjectResult setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetTaskListFilterResponseBodyObjectResult setSourceDate(String sourceDate) {
            this.sourceDate = sourceDate;
            return this;
        }
        public String getSourceDate() {
            return this.sourceDate;
        }

        public GetTaskListFilterResponseBodyObjectResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetTaskListFilterResponseBodyObjectResult setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
            return this;
        }
        public Integer getLikesCount() {
            return this.likesCount;
        }

        public GetTaskListFilterResponseBodyObjectResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetTaskListFilterResponseBodyObjectResult setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

        public GetTaskListFilterResponseBodyObjectResult setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public GetTaskListFilterResponseBodyObjectResult setParent(String parent) {
            this.parent = parent;
            return this;
        }
        public String getParent() {
            return this.parent;
        }

        public GetTaskListFilterResponseBodyObjectResult setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public GetTaskListFilterResponseBodyObjectResult setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
            return this;
        }
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        public GetTaskListFilterResponseBodyObjectResult setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public GetTaskListFilterResponseBodyObjectResult setTaskUniqueId(String taskUniqueId) {
            this.taskUniqueId = taskUniqueId;
            return this;
        }
        public String getTaskUniqueId() {
            return this.taskUniqueId;
        }

        public GetTaskListFilterResponseBodyObjectResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetTaskListFilterResponseBodyObjectResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskListFilterResponseBodyObjectResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskListFilterResponseBodyObjectResult setCustomfields(java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfields> customfields) {
            this.customfields = customfields;
            return this;
        }
        public java.util.List<GetTaskListFilterResponseBodyObjectResultCustomfields> getCustomfields() {
            return this.customfields;
        }

        public GetTaskListFilterResponseBodyObjectResult setInvolveMembers(java.util.List<String> involveMembers) {
            this.involveMembers = involveMembers;
            return this;
        }
        public java.util.List<String> getInvolveMembers() {
            return this.involveMembers;
        }

        public GetTaskListFilterResponseBodyObjectResult setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public GetTaskListFilterResponseBodyObjectResult setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetTaskListFilterResponseBodyObjectResult setDivisions(java.util.List<String> divisions) {
            this.divisions = divisions;
            return this;
        }
        public java.util.List<String> getDivisions() {
            return this.divisions;
        }

        public GetTaskListFilterResponseBodyObjectResult setAncestorIds(java.util.List<String> ancestorIds) {
            this.ancestorIds = ancestorIds;
            return this;
        }
        public java.util.List<String> getAncestorIds() {
            return this.ancestorIds;
        }

        public GetTaskListFilterResponseBodyObjectResult setWorkTime(GetTaskListFilterResponseBodyObjectResultWorkTime workTime) {
            this.workTime = workTime;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultWorkTime getWorkTime() {
            return this.workTime;
        }

        public GetTaskListFilterResponseBodyObjectResult setBadges(GetTaskListFilterResponseBodyObjectResultBadges badges) {
            this.badges = badges;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultBadges getBadges() {
            return this.badges;
        }

        public GetTaskListFilterResponseBodyObjectResult setSubtaskCount(GetTaskListFilterResponseBodyObjectResultSubtaskCount subtaskCount) {
            this.subtaskCount = subtaskCount;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultSubtaskCount getSubtaskCount() {
            return this.subtaskCount;
        }

        public GetTaskListFilterResponseBodyObjectResult setReminder(GetTaskListFilterResponseBodyObjectResultReminder reminder) {
            this.reminder = reminder;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultReminder getReminder() {
            return this.reminder;
        }

        public GetTaskListFilterResponseBodyObjectResult setCreator(GetTaskListFilterResponseBodyObjectResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultCreator getCreator() {
            return this.creator;
        }

        public GetTaskListFilterResponseBodyObjectResult setStage(GetTaskListFilterResponseBodyObjectResultStage stage) {
            this.stage = stage;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultStage getStage() {
            return this.stage;
        }

        public GetTaskListFilterResponseBodyObjectResult setExecutor(GetTaskListFilterResponseBodyObjectResultExecutor executor) {
            this.executor = executor;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultExecutor getExecutor() {
            return this.executor;
        }

        public GetTaskListFilterResponseBodyObjectResult setTaskFlowStatus(GetTaskListFilterResponseBodyObjectResultTaskFlowStatus taskFlowStatus) {
            this.taskFlowStatus = taskFlowStatus;
            return this;
        }
        public GetTaskListFilterResponseBodyObjectResultTaskFlowStatus getTaskFlowStatus() {
            return this.taskFlowStatus;
        }

    }

    public static class GetTaskListFilterResponseBodyObject extends TeaModel {
        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("Result")
        public java.util.List<GetTaskListFilterResponseBodyObjectResult> result;

        public static GetTaskListFilterResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListFilterResponseBodyObject self = new GetTaskListFilterResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetTaskListFilterResponseBodyObject setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public GetTaskListFilterResponseBodyObject setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public GetTaskListFilterResponseBodyObject setResult(java.util.List<GetTaskListFilterResponseBodyObjectResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetTaskListFilterResponseBodyObjectResult> getResult() {
            return this.result;
        }

    }

}
