// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightExpectedWorkTimeResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightExpectedWorkTimeResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightExpectedWorkTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightExpectedWorkTimeResponseBody self = new ExportInsightExpectedWorkTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightExpectedWorkTimeResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightExpectedWorkTimeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightExpectedWorkTimeResponseBody setResult(java.util.List<ExportInsightExpectedWorkTimeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightExpectedWorkTimeResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightExpectedWorkTimeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightExpectedWorkTimeResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

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

        @NameInMap("value")
        public Double value;

        @NameInMap("workitemId")
        public String workitemId;

        public static ExportInsightExpectedWorkTimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightExpectedWorkTimeResponseBodyResult self = new ExportInsightExpectedWorkTimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setRecorderId(String recorderId) {
            this.recorderId = recorderId;
            return this;
        }
        public String getRecorderId() {
            return this.recorderId;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

        public ExportInsightExpectedWorkTimeResponseBodyResult setWorkitemId(String workitemId) {
            this.workitemId = workitemId;
            return this;
        }
        public String getWorkitemId() {
            return this.workitemId;
        }

    }

}
