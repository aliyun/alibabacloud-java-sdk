// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightWorkitemStatusResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightWorkitemStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemStatusResponseBody self = new ExportInsightWorkitemStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemStatusResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightWorkitemStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightWorkitemStatusResponseBody setResult(java.util.List<ExportInsightWorkitemStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightWorkitemStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightWorkitemStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightWorkitemStatusResponseBodyResult extends TeaModel {
        @NameInMap("assignedToId")
        public String assignedToId;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("expectedWorkTime")
        public Long expectedWorkTime;

        @NameInMap("gmtClosed")
        public Long gmtClosed;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtDue")
        public Long gmtDue;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("gmtTodo")
        public Long gmtTodo;

        @NameInMap("id")
        public Long id;

        @NameInMap("isArchived")
        public String isArchived;

        @NameInMap("isDeleted")
        public String isDeleted;

        @NameInMap("isDone")
        public String isDone;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("participantIds")
        public String participantIds;

        @NameInMap("phase")
        public Integer phase;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("productId")
        public String productId;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("source")
        public String source;

        @NameInMap("sprintId")
        public String sprintId;

        @NameInMap("stage")
        public Integer stage;

        @NameInMap("status")
        public String status;

        @NameInMap("statusId")
        public String statusId;

        @NameInMap("storyPoint")
        public Float storyPoint;

        @NameInMap("subType")
        public String subType;

        @NameInMap("subject")
        public String subject;

        @NameInMap("type")
        public Integer type;

        @NameInMap("versionId")
        public String versionId;

        @NameInMap("versions")
        public String versions;

        @NameInMap("workTime")
        public Long workTime;

        @NameInMap("workitemId")
        public String workitemId;

        public static ExportInsightWorkitemStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightWorkitemStatusResponseBodyResult self = new ExportInsightWorkitemStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightWorkitemStatusResponseBodyResult setAssignedToId(String assignedToId) {
            this.assignedToId = assignedToId;
            return this;
        }
        public String getAssignedToId() {
            return this.assignedToId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setExpectedWorkTime(Long expectedWorkTime) {
            this.expectedWorkTime = expectedWorkTime;
            return this;
        }
        public Long getExpectedWorkTime() {
            return this.expectedWorkTime;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtClosed(Long gmtClosed) {
            this.gmtClosed = gmtClosed;
            return this;
        }
        public Long getGmtClosed() {
            return this.gmtClosed;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtDue(Long gmtDue) {
            this.gmtDue = gmtDue;
            return this;
        }
        public Long getGmtDue() {
            return this.gmtDue;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setGmtTodo(Long gmtTodo) {
            this.gmtTodo = gmtTodo;
            return this;
        }
        public Long getGmtTodo() {
            return this.gmtTodo;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setIsArchived(String isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public String getIsArchived() {
            return this.isArchived;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setIsDone(String isDone) {
            this.isDone = isDone;
            return this;
        }
        public String getIsDone() {
            return this.isDone;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setParticipantIds(String participantIds) {
            this.participantIds = participantIds;
            return this;
        }
        public String getParticipantIds() {
            return this.participantIds;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setPhase(Integer phase) {
            this.phase = phase;
            return this;
        }
        public Integer getPhase() {
            return this.phase;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setStoryPoint(Float storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public Float getStoryPoint() {
            return this.storyPoint;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setWorkTime(Long workTime) {
            this.workTime = workTime;
            return this;
        }
        public Long getWorkTime() {
            return this.workTime;
        }

        public ExportInsightWorkitemStatusResponseBodyResult setWorkitemId(String workitemId) {
            this.workitemId = workitemId;
            return this;
        }
        public String getWorkitemId() {
            return this.workitemId;
        }

    }

}
