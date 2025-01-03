// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightCustomValueResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightCustomValueResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>66.6</p>
         */
        @NameInMap("doubleValue")
        public Double doubleValue;

        /**
         * <strong>example:</strong>
         * <p>34dde3dfa5e3750151a7c4xxxx</p>
         */
        @NameInMap("fieldId")
        public String fieldId;

        /**
         * <strong>example:</strong>
         * <p>1704950971000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1714669494000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>320737507</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>442d4a6a9980e841dc192a411080xxxx</p>
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
         * <p>66</p>
         */
        @NameInMap("longValue")
        public Long longValue;

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>1ee00fcb1a18c2dc83dafdxxxx</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>Workitem</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
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
