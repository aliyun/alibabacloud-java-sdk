// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody self = new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody setResult(java.util.List<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult extends TeaModel {
        @NameInMap("assignedToId")
        public String assignedToId;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("expectedWorkTime")
        public Long expectedWorkTime;

        @NameInMap("extraId")
        public Long extraId;

        @NameInMap("extraIsDeleted")
        public String extraIsDeleted;

        @NameInMap("foundPhase")
        public Integer foundPhase;

        @NameInMap("gmtClosed")
        public Long gmtClosed;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtDue")
        public Long gmtDue;

        @NameInMap("gmtFixed")
        public String gmtFixed;

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

        @NameInMap("isStupid")
        public String isStupid;

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

        @NameInMap("reopenNum")
        public Integer reopenNum;

        @NameInMap("seriousLevel")
        public Integer seriousLevel;

        @NameInMap("solution")
        public String solution;

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

        @NameInMap("verifierId")
        public String verifierId;

        @NameInMap("versionId")
        public String versionId;

        @NameInMap("versions")
        public String versions;

        @NameInMap("workTime")
        public Long workTime;

        @NameInMap("workitemId")
        public String workitemId;

        public static ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult self = new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setAssignedToId(String assignedToId) {
            this.assignedToId = assignedToId;
            return this;
        }
        public String getAssignedToId() {
            return this.assignedToId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setExpectedWorkTime(Long expectedWorkTime) {
            this.expectedWorkTime = expectedWorkTime;
            return this;
        }
        public Long getExpectedWorkTime() {
            return this.expectedWorkTime;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setExtraId(Long extraId) {
            this.extraId = extraId;
            return this;
        }
        public Long getExtraId() {
            return this.extraId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setExtraIsDeleted(String extraIsDeleted) {
            this.extraIsDeleted = extraIsDeleted;
            return this;
        }
        public String getExtraIsDeleted() {
            return this.extraIsDeleted;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setFoundPhase(Integer foundPhase) {
            this.foundPhase = foundPhase;
            return this;
        }
        public Integer getFoundPhase() {
            return this.foundPhase;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtClosed(Long gmtClosed) {
            this.gmtClosed = gmtClosed;
            return this;
        }
        public Long getGmtClosed() {
            return this.gmtClosed;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtDue(Long gmtDue) {
            this.gmtDue = gmtDue;
            return this;
        }
        public Long getGmtDue() {
            return this.gmtDue;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtFixed(String gmtFixed) {
            this.gmtFixed = gmtFixed;
            return this;
        }
        public String getGmtFixed() {
            return this.gmtFixed;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setGmtTodo(Long gmtTodo) {
            this.gmtTodo = gmtTodo;
            return this;
        }
        public Long getGmtTodo() {
            return this.gmtTodo;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setIsArchived(String isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public String getIsArchived() {
            return this.isArchived;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setIsDone(String isDone) {
            this.isDone = isDone;
            return this;
        }
        public String getIsDone() {
            return this.isDone;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setIsStupid(String isStupid) {
            this.isStupid = isStupid;
            return this;
        }
        public String getIsStupid() {
            return this.isStupid;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setParticipantIds(String participantIds) {
            this.participantIds = participantIds;
            return this;
        }
        public String getParticipantIds() {
            return this.participantIds;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setPhase(Integer phase) {
            this.phase = phase;
            return this;
        }
        public Integer getPhase() {
            return this.phase;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setReopenNum(Integer reopenNum) {
            this.reopenNum = reopenNum;
            return this;
        }
        public Integer getReopenNum() {
            return this.reopenNum;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSeriousLevel(Integer seriousLevel) {
            this.seriousLevel = seriousLevel;
            return this;
        }
        public Integer getSeriousLevel() {
            return this.seriousLevel;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSprintId(String sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public String getSprintId() {
            return this.sprintId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setStoryPoint(Float storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }
        public Float getStoryPoint() {
            return this.storyPoint;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setVerifierId(String verifierId) {
            this.verifierId = verifierId;
            return this;
        }
        public String getVerifierId() {
            return this.verifierId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setWorkTime(Long workTime) {
            this.workTime = workTime;
            return this;
        }
        public Long getWorkTime() {
            return this.workTime;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setWorkitemId(String workitemId) {
            this.workitemId = workitemId;
            return this;
        }
        public String getWorkitemId() {
            return this.workitemId;
        }

    }

}
