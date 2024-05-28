// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSprintResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightSprintResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightSprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightSprintResponseBody self = new ExportInsightSprintResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightSprintResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightSprintResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightSprintResponseBody setResult(java.util.List<ExportInsightSprintResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightSprintResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightSprintResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightSprintResponseBodyResult extends TeaModel {
        @NameInMap("actualEnd")
        public Long actualEnd;

        @NameInMap("actualStart")
        public Long actualStart;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtEnd")
        public Long gmtEnd;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("id")
        public Long id;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("isDeleted")
        public String isDeleted;

        @NameInMap("name")
        public String name;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("source")
        public String source;

        @NameInMap("status")
        public Integer status;

        @NameInMap("workTimeCapacity")
        public Double workTimeCapacity;

        public static ExportInsightSprintResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightSprintResponseBodyResult self = new ExportInsightSprintResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightSprintResponseBodyResult setActualEnd(Long actualEnd) {
            this.actualEnd = actualEnd;
            return this;
        }
        public Long getActualEnd() {
            return this.actualEnd;
        }

        public ExportInsightSprintResponseBodyResult setActualStart(Long actualStart) {
            this.actualStart = actualStart;
            return this;
        }
        public Long getActualStart() {
            return this.actualStart;
        }

        public ExportInsightSprintResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightSprintResponseBodyResult setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ExportInsightSprintResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightSprintResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ExportInsightSprintResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightSprintResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightSprintResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightSprintResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportInsightSprintResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightSprintResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportInsightSprintResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightSprintResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportInsightSprintResponseBodyResult setWorkTimeCapacity(Double workTimeCapacity) {
            this.workTimeCapacity = workTimeCapacity;
            return this;
        }
        public Double getWorkTimeCapacity() {
            return this.workTimeCapacity;
        }

    }

}
