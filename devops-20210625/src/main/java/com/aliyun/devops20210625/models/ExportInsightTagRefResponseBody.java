// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightTagRefResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightTagRefResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightTagRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightTagRefResponseBody self = new ExportInsightTagRefResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightTagRefResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightTagRefResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightTagRefResponseBody setResult(java.util.List<ExportInsightTagRefResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightTagRefResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightTagRefResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightTagRefResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1696660187000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1696660187000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>41317426</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>8545272</p>
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
         * <p>1</p>
         */
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
         * <p>19e0bc5348ccbe6c0d00fbxxxx</p>
         */
        @NameInMap("tagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>bde89961b5a4acc8cf54eaxxxx</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>Workitem</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static ExportInsightTagRefResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightTagRefResponseBodyResult self = new ExportInsightTagRefResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightTagRefResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightTagRefResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightTagRefResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightTagRefResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightTagRefResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightTagRefResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportInsightTagRefResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightTagRefResponseBodyResult setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ExportInsightTagRefResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ExportInsightTagRefResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
