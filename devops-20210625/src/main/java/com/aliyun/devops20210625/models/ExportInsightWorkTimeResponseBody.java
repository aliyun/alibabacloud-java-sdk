// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkTimeResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightWorkTimeResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightWorkTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkTimeResponseBody self = new ExportInsightWorkTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkTimeResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightWorkTimeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightWorkTimeResponseBody setResult(java.util.List<ExportInsightWorkTimeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightWorkTimeResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightWorkTimeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightWorkTimeResponseBodyResult extends TeaModel {
        @NameInMap("actualValue")
        public Double actualValue;

        @NameInMap("description")
        public String description;

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

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("recorderId")
        public String recorderId;

        @NameInMap("source")
        public String source;

        @NameInMap("type")
        public String type;

        @NameInMap("uuid")
        public String uuid;

        @NameInMap("value")
        public Long value;

        @NameInMap("workitemId")
        public String workitemId;

        public static ExportInsightWorkTimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightWorkTimeResponseBodyResult self = new ExportInsightWorkTimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightWorkTimeResponseBodyResult setActualValue(Double actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public Double getActualValue() {
            return this.actualValue;
        }

        public ExportInsightWorkTimeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportInsightWorkTimeResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightWorkTimeResponseBodyResult setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ExportInsightWorkTimeResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightWorkTimeResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ExportInsightWorkTimeResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightWorkTimeResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightWorkTimeResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightWorkTimeResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightWorkTimeResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportInsightWorkTimeResponseBodyResult setRecorderId(String recorderId) {
            this.recorderId = recorderId;
            return this;
        }
        public String getRecorderId() {
            return this.recorderId;
        }

        public ExportInsightWorkTimeResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightWorkTimeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExportInsightWorkTimeResponseBodyResult setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ExportInsightWorkTimeResponseBodyResult setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

        public ExportInsightWorkTimeResponseBodyResult setWorkitemId(String workitemId) {
            this.workitemId = workitemId;
            return this;
        }
        public String getWorkitemId() {
            return this.workitemId;
        }

    }

}
