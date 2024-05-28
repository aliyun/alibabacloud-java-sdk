// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSpaceRefResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightSpaceRefResponseBodyResult> result;

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
        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("fromId")
        public String fromId;

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

        @NameInMap("modifierId")
        public String modifierId;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("toId")
        public String toId;

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
