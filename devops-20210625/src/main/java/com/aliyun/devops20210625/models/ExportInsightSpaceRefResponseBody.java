// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSpaceRefResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightSpaceRefResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightSpaceRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightSpaceRefResponseBody self = new ExportInsightSpaceRefResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightSpaceRefResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightSpaceRefResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightSpaceRefResponseBody setResult(java.util.List<ExportInsightSpaceRefResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightSpaceRefResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightSpaceRefResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightSpaceRefResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65659358c319d2a0f912xxxx</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>7bc2be989727d0d4c9801fxxxx</p>
         */
        @NameInMap("fromId")
        public String fromId;

        /**
         * <strong>example:</strong>
         * <p>1704267849000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1704267849000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>356525</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>49565</p>
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
         * <p>65659358c319d2a0f912xxxx</p>
         */
        @NameInMap("modifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>732026500a48d7a74f8b43xxxx</p>
         */
        @NameInMap("toId")
        public String toId;

        /**
         * <strong>example:</strong>
         * <p>ASSOCIATED</p>
         */
        @NameInMap("type")
        public String type;

        public static ExportInsightSpaceRefResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightSpaceRefResponseBodyResult self = new ExportInsightSpaceRefResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightSpaceRefResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ExportInsightSpaceRefResponseBodyResult setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public ExportInsightSpaceRefResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightSpaceRefResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightSpaceRefResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightSpaceRefResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightSpaceRefResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightSpaceRefResponseBodyResult setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ExportInsightSpaceRefResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightSpaceRefResponseBodyResult setToId(String toId) {
            this.toId = toId;
            return this;
        }
        public String getToId() {
            return this.toId;
        }

        public ExportInsightSpaceRefResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
