// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>65e836b981d758be7a25xxxx</p>
         */
        @NameInMap("assignedToId")
        public String assignedToId;

        /**
         * <strong>example:</strong>
         * <p>65e836b981d758be7a25xxxx</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("expectedWorkTime")
        public Long expectedWorkTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("extraId")
        public Long extraId;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("extraIsDeleted")
        public String extraIsDeleted;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("foundPhase")
        public Integer foundPhase;

        /**
         * <strong>example:</strong>
         * <p>33166339200000</p>
         */
        @NameInMap("gmtClosed")
        public Long gmtClosed;

        /**
         * <strong>example:</strong>
         * <p>1713430241000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>33166339200000</p>
         */
        @NameInMap("gmtDue")
        public Long gmtDue;

        @NameInMap("gmtFixed")
        public String gmtFixed;

        /**
         * <strong>example:</strong>
         * <p>1714755985000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>33166339200000</p>
         */
        @NameInMap("gmtStart")
        public Long gmtStart;

        /**
         * <strong>example:</strong>
         * <p>33166339200000</p>
         */
        @NameInMap("gmtTodo")
        public Long gmtTodo;

        /**
         * <strong>example:</strong>
         * <p>701615370</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("isArchived")
        public String isArchived;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("isDeleted")
        public String isDeleted;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("isDone")
        public String isDone;

        @NameInMap("isStupid")
        public String isStupid;

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>a80a203a9078a7a1b1f2c6xxxx</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>6135b21fb383ef39551cf02e,63466a385dc8531eebd764e9</p>
         */
        @NameInMap("participantIds")
        public String participantIds;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("phase")
        public Integer phase;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("priority")
        public Integer priority;

        @NameInMap("productId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>6732a29d846bf998dc09e7xxxx</p>
         */
        @NameInMap("projectId")
        public String projectId;

        @NameInMap("reopenNum")
        public Integer reopenNum;

        @NameInMap("serialNumber")
        public Integer serialNumber;

        @NameInMap("seriousLevel")
        public Integer seriousLevel;

        @NameInMap("solution")
        public String solution;

        /**
         * <strong>example:</strong>
         * <p>projex</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>731c83a40bbf3c2f080e07xxxx</p>
         */
        @NameInMap("sprintId")
        public String sprintId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("stage")
        public Integer stage;

        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>100005</p>
         */
        @NameInMap("statusId")
        public String statusId;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("storyPoint")
        public Float storyPoint;

        /**
         * <strong>example:</strong>
         * <p>9uy29901re573f561d69xxxx</p>
         */
        @NameInMap("subType")
        public String subType;

        @NameInMap("subject")
        public String subject;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>65e836b981d758be7a25xxxx</p>
         */
        @NameInMap("verifierId")
        public String verifierId;

        @NameInMap("versionId")
        public String versionId;

        /**
         * <strong>example:</strong>
         * <p>{6a8cdda167415bea1506c7262c}</p>
         */
        @NameInMap("versions")
        public String versions;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("workTime")
        public Long workTime;

        /**
         * <strong>example:</strong>
         * <p>636f661a612a945bbcdb4cxxxx</p>
         */
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

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBodyResult setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
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
