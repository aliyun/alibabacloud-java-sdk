// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskDetailBaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public GetTaskDetailBaseResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static GetTaskDetailBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailBaseResponseBody self = new GetTaskDetailBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskDetailBaseResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTaskDetailBaseResponseBody setObject(GetTaskDetailBaseResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetTaskDetailBaseResponseBodyObject getObject() {
        return this.object;
    }

    public GetTaskDetailBaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskDetailBaseResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class GetTaskDetailBaseResponseBodyObjectTasklist extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectTasklist build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectTasklist self = new GetTaskDetailBaseResponseBodyObjectTasklist();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectTasklist setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTaskDetailBaseResponseBodyObjectTasklist setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectBadges extends TeaModel {
        @NameInMap("LikesCount")
        public Integer likesCount;

        @NameInMap("ObjectlinksCount")
        public Integer objectlinksCount;

        @NameInMap("AttachmentsCount")
        public Integer attachmentsCount;

        @NameInMap("CommentsCount")
        public Integer commentsCount;

        public static GetTaskDetailBaseResponseBodyObjectBadges build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectBadges self = new GetTaskDetailBaseResponseBodyObjectBadges();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectBadges setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
            return this;
        }
        public Integer getLikesCount() {
            return this.likesCount;
        }

        public GetTaskDetailBaseResponseBodyObjectBadges setObjectlinksCount(Integer objectlinksCount) {
            this.objectlinksCount = objectlinksCount;
            return this;
        }
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        public GetTaskDetailBaseResponseBodyObjectBadges setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
            return this;
        }
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        public GetTaskDetailBaseResponseBodyObjectBadges setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectReminder extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Date")
        public String date;

        @NameInMap("MemberRoles")
        public java.util.List<String> memberRoles;

        @NameInMap("Method")
        public String method;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Rules")
        public java.util.List<String> rules;

        public static GetTaskDetailBaseResponseBodyObjectReminder build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectReminder self = new GetTaskDetailBaseResponseBodyObjectReminder();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setMemberRoles(java.util.List<String> memberRoles) {
            this.memberRoles = memberRoles;
            return this;
        }
        public java.util.List<String> getMemberRoles() {
            return this.memberRoles;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetTaskDetailBaseResponseBodyObjectReminder setRules(java.util.List<String> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<String> getRules() {
            return this.rules;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectStage extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectStage build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectStage self = new GetTaskDetailBaseResponseBodyObjectStage();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectStage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectStage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectScenariofieldconfig extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("ProTemplateConfigType")
        public String proTemplateConfigType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectScenariofieldconfig build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectScenariofieldconfig self = new GetTaskDetailBaseResponseBodyObjectScenariofieldconfig();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig setProTemplateConfigType(String proTemplateConfigType) {
            this.proTemplateConfigType = proTemplateConfigType;
            return this;
        }
        public String getProTemplateConfigType() {
            return this.proTemplateConfigType;
        }

        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectWorkTime extends TeaModel {
        @NameInMap("UsedTime")
        public Integer usedTime;

        @NameInMap("TotalTime")
        public Integer totalTime;

        @NameInMap("Unit")
        public String unit;

        public static GetTaskDetailBaseResponseBodyObjectWorkTime build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectWorkTime self = new GetTaskDetailBaseResponseBodyObjectWorkTime();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectWorkTime setUsedTime(Integer usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Integer getUsedTime() {
            return this.usedTime;
        }

        public GetTaskDetailBaseResponseBodyObjectWorkTime setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Integer getTotalTime() {
            return this.totalTime;
        }

        public GetTaskDetailBaseResponseBodyObjectWorkTime setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectCreator extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectCreator build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectCreator self = new GetTaskDetailBaseResponseBodyObjectCreator();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectExecutor extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectExecutor self = new GetTaskDetailBaseResponseBodyObjectExecutor();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectExecutor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetTaskDetailBaseResponseBodyObjectExecutor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectSubtaskCount extends TeaModel {
        @NameInMap("Done")
        public Integer done;

        @NameInMap("Total")
        public Integer total;

        public static GetTaskDetailBaseResponseBodyObjectSubtaskCount build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectSubtaskCount self = new GetTaskDetailBaseResponseBodyObjectSubtaskCount();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectSubtaskCount setDone(Integer done) {
            this.done = done;
            return this;
        }
        public Integer getDone() {
            return this.done;
        }

        public GetTaskDetailBaseResponseBodyObjectSubtaskCount setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectInvolvers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectInvolvers build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectInvolvers self = new GetTaskDetailBaseResponseBodyObjectInvolvers();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectInvolvers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectInvolvers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectSubtasks extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectSubtasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectSubtasks self = new GetTaskDetailBaseResponseBodyObjectSubtasks();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectSubtasks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskDetailBaseResponseBodyObjectSubtasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectCustomfieldsValue extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectCustomfieldsValue build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectCustomfieldsValue self = new GetTaskDetailBaseResponseBodyObjectCustomfieldsValue();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfieldsValue setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfieldsValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectCustomfields extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfieldsValue> value;

        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("CustomfieldId")
        public String customfieldId;

        public static GetTaskDetailBaseResponseBodyObjectCustomfields build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectCustomfields self = new GetTaskDetailBaseResponseBodyObjectCustomfields();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfields setValue(java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfieldsValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfieldsValue> getValue() {
            return this.value;
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfields setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public GetTaskDetailBaseResponseBodyObjectCustomfields setCustomfieldId(String customfieldId) {
            this.customfieldId = customfieldId;
            return this;
        }
        public String getCustomfieldId() {
            return this.customfieldId;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObjectTaskflowstatus extends TeaModel {
        @NameInMap("TaskflowId")
        public String taskflowId;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObjectTaskflowstatus build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObjectTaskflowstatus self = new GetTaskDetailBaseResponseBodyObjectTaskflowstatus();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus setTaskflowId(String taskflowId) {
            this.taskflowId = taskflowId;
            return this;
        }
        public String getTaskflowId() {
            return this.taskflowId;
        }

        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetTaskDetailBaseResponseBodyObject extends TeaModel {
        @NameInMap("Organization")
        public String organization;

        @NameInMap("ScenariofieldconfigId")
        public String scenariofieldconfigId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("IsTopInProject")
        public Boolean isTopInProject;

        @NameInMap("Tasklist")
        public GetTaskDetailBaseResponseBodyObjectTasklist tasklist;

        @NameInMap("Badges")
        public GetTaskDetailBaseResponseBodyObjectBadges badges;

        @NameInMap("AncestorIds")
        public java.util.List<String> ancestorIds;

        @NameInMap("ShareStatus")
        public Integer shareStatus;

        @NameInMap("Reminder")
        public GetTaskDetailBaseResponseBodyObjectReminder reminder;

        @NameInMap("Ancestors")
        public java.util.List<String> ancestors;

        @NameInMap("TaskflowstatusId")
        public String taskflowstatusId;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("Note")
        public String note;

        @NameInMap("IsArchived")
        public Boolean isArchived;

        @NameInMap("Content")
        public String content;

        @NameInMap("Rating")
        public Integer rating;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Stage")
        public GetTaskDetailBaseResponseBodyObjectStage stage;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Sprint")
        public String sprint;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("SourceDate")
        public String sourceDate;

        @NameInMap("IsFavorite")
        public Boolean isFavorite;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("Scenariofieldconfig")
        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig scenariofieldconfig;

        @NameInMap("WorkTime")
        public GetTaskDetailBaseResponseBodyObjectWorkTime workTime;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Creator")
        public GetTaskDetailBaseResponseBodyObjectCreator creator;

        @NameInMap("Executor")
        public GetTaskDetailBaseResponseBodyObjectExecutor executor;

        @NameInMap("Accomplished")
        public String accomplished;

        @NameInMap("InvolveMembers")
        public java.util.List<String> involveMembers;

        @NameInMap("UniqueId")
        public Integer uniqueId;

        @NameInMap("CommentsCount")
        public Integer commentsCount;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("SubtaskCount")
        public GetTaskDetailBaseResponseBodyObjectSubtaskCount subtaskCount;

        @NameInMap("UntilDate")
        public String untilDate;

        @NameInMap("StoryPoint")
        public String storyPoint;

        @NameInMap("ObjectlinksCount")
        public Integer objectlinksCount;

        @NameInMap("Source")
        public String source;

        @NameInMap("LikesCount")
        public Integer likesCount;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Divisions")
        public java.util.List<String> divisions;

        @NameInMap("Visible")
        public String visible;

        @NameInMap("IsDone")
        public Boolean isDone;

        @NameInMap("Involvers")
        public java.util.List<GetTaskDetailBaseResponseBodyObjectInvolvers> involvers;

        @NameInMap("Parent")
        public String parent;

        @NameInMap("SprintId")
        public String sprintId;

        @NameInMap("DueDate")
        public String dueDate;

        @NameInMap("AttachmentsCount")
        public Integer attachmentsCount;

        @NameInMap("Subtasks")
        public java.util.List<GetTaskDetailBaseResponseBodyObjectSubtasks> subtasks;

        @NameInMap("Customfields")
        public java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfields> customfields;

        @NameInMap("Created")
        public String created;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Taskflowstatus")
        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus taskflowstatus;

        @NameInMap("Id")
        public String id;

        public static GetTaskDetailBaseResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailBaseResponseBodyObject self = new GetTaskDetailBaseResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailBaseResponseBodyObject setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public GetTaskDetailBaseResponseBodyObject setScenariofieldconfigId(String scenariofieldconfigId) {
            this.scenariofieldconfigId = scenariofieldconfigId;
            return this;
        }
        public String getScenariofieldconfigId() {
            return this.scenariofieldconfigId;
        }

        public GetTaskDetailBaseResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetTaskDetailBaseResponseBodyObject setIsTopInProject(Boolean isTopInProject) {
            this.isTopInProject = isTopInProject;
            return this;
        }
        public Boolean getIsTopInProject() {
            return this.isTopInProject;
        }

        public GetTaskDetailBaseResponseBodyObject setTasklist(GetTaskDetailBaseResponseBodyObjectTasklist tasklist) {
            this.tasklist = tasklist;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectTasklist getTasklist() {
            return this.tasklist;
        }

        public GetTaskDetailBaseResponseBodyObject setBadges(GetTaskDetailBaseResponseBodyObjectBadges badges) {
            this.badges = badges;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectBadges getBadges() {
            return this.badges;
        }

        public GetTaskDetailBaseResponseBodyObject setAncestorIds(java.util.List<String> ancestorIds) {
            this.ancestorIds = ancestorIds;
            return this;
        }
        public java.util.List<String> getAncestorIds() {
            return this.ancestorIds;
        }

        public GetTaskDetailBaseResponseBodyObject setShareStatus(Integer shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }
        public Integer getShareStatus() {
            return this.shareStatus;
        }

        public GetTaskDetailBaseResponseBodyObject setReminder(GetTaskDetailBaseResponseBodyObjectReminder reminder) {
            this.reminder = reminder;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectReminder getReminder() {
            return this.reminder;
        }

        public GetTaskDetailBaseResponseBodyObject setAncestors(java.util.List<String> ancestors) {
            this.ancestors = ancestors;
            return this;
        }
        public java.util.List<String> getAncestors() {
            return this.ancestors;
        }

        public GetTaskDetailBaseResponseBodyObject setTaskflowstatusId(String taskflowstatusId) {
            this.taskflowstatusId = taskflowstatusId;
            return this;
        }
        public String getTaskflowstatusId() {
            return this.taskflowstatusId;
        }

        public GetTaskDetailBaseResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetTaskDetailBaseResponseBodyObject setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetTaskDetailBaseResponseBodyObject setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        public GetTaskDetailBaseResponseBodyObject setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskDetailBaseResponseBodyObject setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

        public GetTaskDetailBaseResponseBodyObject setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetTaskDetailBaseResponseBodyObject setStage(GetTaskDetailBaseResponseBodyObjectStage stage) {
            this.stage = stage;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectStage getStage() {
            return this.stage;
        }

        public GetTaskDetailBaseResponseBodyObject setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetTaskDetailBaseResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetTaskDetailBaseResponseBodyObject setSprint(String sprint) {
            this.sprint = sprint;
            return this;
        }
        public String getSprint() {
            return this.sprint;
        }

        public GetTaskDetailBaseResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetTaskDetailBaseResponseBodyObject setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetTaskDetailBaseResponseBodyObject setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetTaskDetailBaseResponseBodyObject setSourceDate(String sourceDate) {
            this.sourceDate = sourceDate;
            return this;
        }
        public String getSourceDate() {
            return this.sourceDate;
        }

        public GetTaskDetailBaseResponseBodyObject setIsFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            return this;
        }
        public Boolean getIsFavorite() {
            return this.isFavorite;
        }

        public GetTaskDetailBaseResponseBodyObject setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public GetTaskDetailBaseResponseBodyObject setScenariofieldconfig(GetTaskDetailBaseResponseBodyObjectScenariofieldconfig scenariofieldconfig) {
            this.scenariofieldconfig = scenariofieldconfig;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectScenariofieldconfig getScenariofieldconfig() {
            return this.scenariofieldconfig;
        }

        public GetTaskDetailBaseResponseBodyObject setWorkTime(GetTaskDetailBaseResponseBodyObjectWorkTime workTime) {
            this.workTime = workTime;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectWorkTime getWorkTime() {
            return this.workTime;
        }

        public GetTaskDetailBaseResponseBodyObject setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public GetTaskDetailBaseResponseBodyObject setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskDetailBaseResponseBodyObject setCreator(GetTaskDetailBaseResponseBodyObjectCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectCreator getCreator() {
            return this.creator;
        }

        public GetTaskDetailBaseResponseBodyObject setExecutor(GetTaskDetailBaseResponseBodyObjectExecutor executor) {
            this.executor = executor;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectExecutor getExecutor() {
            return this.executor;
        }

        public GetTaskDetailBaseResponseBodyObject setAccomplished(String accomplished) {
            this.accomplished = accomplished;
            return this;
        }
        public String getAccomplished() {
            return this.accomplished;
        }

        public GetTaskDetailBaseResponseBodyObject setInvolveMembers(java.util.List<String> involveMembers) {
            this.involveMembers = involveMembers;
            return this;
        }
        public java.util.List<String> getInvolveMembers() {
            return this.involveMembers;
        }

        public GetTaskDetailBaseResponseBodyObject setUniqueId(Integer uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Integer getUniqueId() {
            return this.uniqueId;
        }

        public GetTaskDetailBaseResponseBodyObject setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

        public GetTaskDetailBaseResponseBodyObject setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskDetailBaseResponseBodyObject setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetTaskDetailBaseResponseBodyObject setSubtaskCount(GetTaskDetailBaseResponseBodyObjectSubtaskCount subtaskCount) {
            this.subtaskCount = subtaskCount;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectSubtaskCount getSubtaskCount() {
            return this.subtaskCount;
        }

        public GetTaskDetailBaseResponseBodyObject setUntilDate(String untilDate) {
            this.untilDate = untilDate;
            return this;
        }
        public String getUntilDate() {
            return this.untilDate;
        }

        public GetTaskDetailBaseResponseBodyObject setStoryPoint(String storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public String getStoryPoint() {
            return this.storyPoint;
        }

        public GetTaskDetailBaseResponseBodyObject setObjectlinksCount(Integer objectlinksCount) {
            this.objectlinksCount = objectlinksCount;
            return this;
        }
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        public GetTaskDetailBaseResponseBodyObject setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTaskDetailBaseResponseBodyObject setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
            return this;
        }
        public Integer getLikesCount() {
            return this.likesCount;
        }

        public GetTaskDetailBaseResponseBodyObject setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetTaskDetailBaseResponseBodyObject setDivisions(java.util.List<String> divisions) {
            this.divisions = divisions;
            return this;
        }
        public java.util.List<String> getDivisions() {
            return this.divisions;
        }

        public GetTaskDetailBaseResponseBodyObject setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

        public GetTaskDetailBaseResponseBodyObject setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public GetTaskDetailBaseResponseBodyObject setInvolvers(java.util.List<GetTaskDetailBaseResponseBodyObjectInvolvers> involvers) {
            this.involvers = involvers;
            return this;
        }
        public java.util.List<GetTaskDetailBaseResponseBodyObjectInvolvers> getInvolvers() {
            return this.involvers;
        }

        public GetTaskDetailBaseResponseBodyObject setParent(String parent) {
            this.parent = parent;
            return this;
        }
        public String getParent() {
            return this.parent;
        }

        public GetTaskDetailBaseResponseBodyObject setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public GetTaskDetailBaseResponseBodyObject setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public String getDueDate() {
            return this.dueDate;
        }

        public GetTaskDetailBaseResponseBodyObject setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
            return this;
        }
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        public GetTaskDetailBaseResponseBodyObject setSubtasks(java.util.List<GetTaskDetailBaseResponseBodyObjectSubtasks> subtasks) {
            this.subtasks = subtasks;
            return this;
        }
        public java.util.List<GetTaskDetailBaseResponseBodyObjectSubtasks> getSubtasks() {
            return this.subtasks;
        }

        public GetTaskDetailBaseResponseBodyObject setCustomfields(java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfields> customfields) {
            this.customfields = customfields;
            return this;
        }
        public java.util.List<GetTaskDetailBaseResponseBodyObjectCustomfields> getCustomfields() {
            return this.customfields;
        }

        public GetTaskDetailBaseResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetTaskDetailBaseResponseBodyObject setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskDetailBaseResponseBodyObject setTaskflowstatus(GetTaskDetailBaseResponseBodyObjectTaskflowstatus taskflowstatus) {
            this.taskflowstatus = taskflowstatus;
            return this;
        }
        public GetTaskDetailBaseResponseBodyObjectTaskflowstatus getTaskflowstatus() {
            return this.taskflowstatus;
        }

        public GetTaskDetailBaseResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
