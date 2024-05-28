// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightCustomValueResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ExportInsightCustomValueResponseBodyResult> result;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportInsightCustomValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightCustomValueResponseBody self = new ExportInsightCustomValueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportInsightCustomValueResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightCustomValueResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightCustomValueResponseBody setResult(java.util.List<ExportInsightCustomValueResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportInsightCustomValueResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportInsightCustomValueResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportInsightCustomValueResponseBodyResult extends TeaModel {
        @NameInMap("doubleValue")
        public Double doubleValue;

        @NameInMap("fieldId")
        public String fieldId;

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

        @NameInMap("longValue")
        public Long longValue;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("targetId")
        public String targetId;

        @NameInMap("targetType")
        public String targetType;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static ExportInsightCustomValueResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportInsightCustomValueResponseBodyResult self = new ExportInsightCustomValueResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportInsightCustomValueResponseBodyResult setDoubleValue(Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }
        public Double getDoubleValue() {
            return this.doubleValue;
        }

        public ExportInsightCustomValueResponseBodyResult setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public ExportInsightCustomValueResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportInsightCustomValueResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportInsightCustomValueResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportInsightCustomValueResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportInsightCustomValueResponseBodyResult setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public String getIsDeleted() {
            return this.isDeleted;
        }

        public ExportInsightCustomValueResponseBodyResult setLongValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }
        public Long getLongValue() {
            return this.longValue;
        }

        public ExportInsightCustomValueResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportInsightCustomValueResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ExportInsightCustomValueResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ExportInsightCustomValueResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExportInsightCustomValueResponseBodyResult setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
