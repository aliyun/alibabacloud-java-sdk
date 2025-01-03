// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemVersionResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightWorkitemVersionResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1704251228000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1704251228000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1704902400000</p>
         */
        @NameInMap("gmtPublish")
        public Long gmtPublish;

        /**
         * <strong>example:</strong>
         * <p>1704297600000</p>
         */
        @NameInMap("gmtStart")
        public Long gmtStart;

        /**
         * <strong>example:</strong>
         * <p>648131</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>7ba6e8261b973c976df76b7de1</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("isDeleted")
        public String isDeleted;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lockStatus")
        public Integer lockStatus;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>projex</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>7eee44ec7f699d4e6980faxxxx</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
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
