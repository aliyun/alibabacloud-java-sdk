// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemVersionResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightWorkitemVersionResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightWorkitemVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemVersionResponseBody self = new ExportInsightWorkitemVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemVersionResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightWorkitemVersionResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightWorkitemVersionResponseBody setResult(java.util.List<ExportInsightWorkitemVersionResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightWorkitemVersionResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightWorkitemVersionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightWorkitemVersionResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("gmtPublish")
        public Long gmtPublish;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("id")
        public Long id;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("isDeleted")
        public String isDeleted;

        @NameInMap("lockStatus")
        public Integer lockStatus;

        @NameInMap("name")
        public String name;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("source")
        public String source;

        @NameInMap("status")
        public Integer status;

        @NameInMap("targetId")
        public String targetId;

        @NameInMap("targetType")
        public String targetType;

        public static ExportInsightWorkitemVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightWorkitemVersionResponseBodyResult self = new ExportInsightWorkitemVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightWorkitemVersionResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setGmtPublish(Long gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public Long getGmtPublish() {
            return this.gmtPublish;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setLockStatus(Integer lockStatus) {
            this.lockStatus = lockStatus;
            return this;
        }
        public Integer getLockStatus() {
            return this.lockStatus;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ExportInsightWorkitemVersionResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
