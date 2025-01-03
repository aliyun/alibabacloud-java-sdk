// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightWorkitemStatusResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>1713430241000</p>
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

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>c3640ab6233fcc10a7e3aaxxxx</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>6135b21fb383ef39551cxxxx,63466a385dc8531eebd7xxxx</p>
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
         * <p>0</p>
         */
        @NameInMap("priority")
        public Integer priority;

        @NameInMap("productId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>505ac6433dfbda8df0b08bxxxx</p>
         */
        @NameInMap("projectId")
        public String projectId;

        @NameInMap("serialNumber")
        public Integer serialNumber;

        /**
         * <strong>example:</strong>
         * <p>projex</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>505ac6433dfbda8df0b08bxxxx</p>
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

        @NameInMap("versionId")
        public String versionId;

        /**
         * <strong>example:</strong>
         * <p>[6a8cdda167415bea1506c7262c]</p>
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

        public ExportInsightWorkitemStatusResponseBodyResult setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
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
