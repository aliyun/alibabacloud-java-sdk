// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportWorkitemActivityResponseBody extends TeaModel {
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
    public java.util.List<ExportWorkitemActivityResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ExportWorkitemActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkitemActivityResponseBody self = new ExportWorkitemActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportWorkitemActivityResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportWorkitemActivityResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportWorkitemActivityResponseBody setResult(java.util.List<ExportWorkitemActivityResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExportWorkitemActivityResponseBodyResult> getResult() {
        return this.result;
    }

    public ExportWorkitemActivityResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ExportWorkitemActivityResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1714961337000</p>
         */
        @NameInMap("gmtEvent")
        public Long gmtEvent;

        /**
         * <strong>example:</strong>
         * <p>4406380356</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>254662353</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("newValue")
        public String newValue;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("oldValue")
        public String oldValue;

        /**
         * <strong>example:</strong>
         * <p>61db9af2148974246bexxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>2a62349afcbef7f23d8f31xxxx</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>projex</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>workitem.update.priority</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>ec69eae498acce08ff7260xxxx</p>
         */
        @NameInMap("workitemId")
        public String workitemId;

        public static ExportWorkitemActivityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExportWorkitemActivityResponseBodyResult self = new ExportWorkitemActivityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExportWorkitemActivityResponseBodyResult setGmtEvent(Long gmtEvent) {
            this.gmtEvent = gmtEvent;
            return this;
        }
        public Long getGmtEvent() {
            return this.gmtEvent;
        }

        public ExportWorkitemActivityResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportWorkitemActivityResponseBodyResult setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ExportWorkitemActivityResponseBodyResult setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public ExportWorkitemActivityResponseBodyResult setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public ExportWorkitemActivityResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ExportWorkitemActivityResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ExportWorkitemActivityResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExportWorkitemActivityResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExportWorkitemActivityResponseBodyResult setWorkitemId(String workitemId) {
            this.workitemId = workitemId;
            return this;
        }
        public String getWorkitemId() {
            return this.workitemId;
        }

    }

}
