// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightFieldResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightFieldResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightFieldResponseBody self = new ExportInsightFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightFieldResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightFieldResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightFieldResponseBody setResult(java.util.List<ExportInsightFieldResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightFieldResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightFieldResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightFieldResponseBodyResult extends TeaModel {
        @NameInMap("fieldId")
        public String fieldId;

        @NameInMap("fieldName")
        public String fieldName;

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

        @NameInMap("isSystem")
        public String isSystem;

        @NameInMap("optionValue")
        public String optionValue;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("position")
        public Integer position;

        @NameInMap("scope")
        public String scope;

        @NameInMap("source")
        public String source;

        @NameInMap("targetId")
        public String targetId;

        @NameInMap("targetType")
        public String targetType;

        @NameInMap("type")
        public String type;

        public static ExportInsightFieldResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightFieldResponseBodyResult self = new ExportInsightFieldResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightFieldResponseBodyResult setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public ExportInsightFieldResponseBodyResult setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ExportInsightFieldResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightFieldResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightFieldResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightFieldResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightFieldResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightFieldResponseBodyResult setIsSystem(String isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public String getIsSystem() {
            return this.isSystem;
        }

        public ExportInsightFieldResponseBodyResult setOptionValue(String optionValue) {
            this.optionValue = optionValue;
            return this;
        }
        public String getOptionValue() {
            return this.optionValue;
        }

        public ExportInsightFieldResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightFieldResponseBodyResult setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ExportInsightFieldResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ExportInsightFieldResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportInsightFieldResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ExportInsightFieldResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ExportInsightFieldResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
