// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightExpectedWorkTimeResponseBody extends TeaModel {
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
    public java.util.List<ExportInsightExpectedWorkTimeResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1714976497000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1714976520000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>26281535</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>bd4ddc7b0ea0ef2ab52699xxxx</p>
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
         * <p>61db9af2148974246be6xxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>6c4687b0179e1d458fedf1xxxx</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>63466a385dc8531eebd7xxxx</p>
         */
        @NameInMap("recorderId")
        public String recorderId;

        /**
         * <strong>example:</strong>
         * <p>projex</p>
         */
        @NameInMap("source")
        public String source;

        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("value")
        public Double value;

        /**
         * <strong>example:</strong>
         * <p>de7c6fd3bd4b53f4d9e279xxxx</p>
         */
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
