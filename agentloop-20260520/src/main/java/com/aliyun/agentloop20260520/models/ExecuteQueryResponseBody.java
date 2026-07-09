// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExecuteQueryResponseBody extends TeaModel {
    /**
     * <p>The result column types.</p>
     */
    @NameInMap("columnTypes")
    public java.util.List<String> columnTypes;

    /**
     * <p>The result column information.</p>
     */
    @NameInMap("columns")
    public java.util.List<String> columns;

    /**
     * <p>The metadata of the returned data.</p>
     */
    @NameInMap("meta")
    public ExecuteQueryResponseBodyMeta meta;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB27D183-8F6C-5C5A-A6A3-E0508AF54F78</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result rows.</p>
     */
    @NameInMap("rows")
    public java.util.List<java.util.List<?>> rows;

    public static ExecuteQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryResponseBody self = new ExecuteQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryResponseBody setColumnTypes(java.util.List<String> columnTypes) {
        this.columnTypes = columnTypes;
        return this;
    }
    public java.util.List<String> getColumnTypes() {
        return this.columnTypes;
    }

    public ExecuteQueryResponseBody setColumns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    public ExecuteQueryResponseBody setMeta(ExecuteQueryResponseBodyMeta meta) {
        this.meta = meta;
        return this;
    }
    public ExecuteQueryResponseBodyMeta getMeta() {
        return this.meta;
    }

    public ExecuteQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteQueryResponseBody setRows(java.util.List<java.util.List<?>> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<java.util.List<?>> getRows() {
        return this.rows;
    }

    public static class ExecuteQueryResponseBodyMetaTruncation extends TeaModel {
        @NameInMap("truncated")
        public Boolean truncated;

        @NameInMap("truncatedColumnIndexes")
        public java.util.List<java.util.List<Integer>> truncatedColumnIndexes;

        public static ExecuteQueryResponseBodyMetaTruncation build(java.util.Map<String, ?> map) throws Exception {
            ExecuteQueryResponseBodyMetaTruncation self = new ExecuteQueryResponseBodyMetaTruncation();
            return TeaModel.build(map, self);
        }

        public ExecuteQueryResponseBodyMetaTruncation setTruncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }
        public Boolean getTruncated() {
            return this.truncated;
        }

        public ExecuteQueryResponseBodyMetaTruncation setTruncatedColumnIndexes(java.util.List<java.util.List<Integer>> truncatedColumnIndexes) {
            this.truncatedColumnIndexes = truncatedColumnIndexes;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getTruncatedColumnIndexes() {
            return this.truncatedColumnIndexes;
        }

    }

    public static class ExecuteQueryResponseBodyMeta extends TeaModel {
        /**
         * <p>The number of log rows scanned or processed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("affectedRows")
        public Integer affectedRows;

        /**
         * <p>The number of log rows returned by this query request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The time consumed by this execution, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        /**
         * <p>Indicates whether the query result is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        @NameInMap("truncation")
        public ExecuteQueryResponseBodyMetaTruncation truncation;

        public static ExecuteQueryResponseBodyMeta build(java.util.Map<String, ?> map) throws Exception {
            ExecuteQueryResponseBodyMeta self = new ExecuteQueryResponseBodyMeta();
            return TeaModel.build(map, self);
        }

        public ExecuteQueryResponseBodyMeta setAffectedRows(Integer affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Integer getAffectedRows() {
            return this.affectedRows;
        }

        public ExecuteQueryResponseBodyMeta setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ExecuteQueryResponseBodyMeta setElapsedMillisecond(Long elapsedMillisecond) {
            this.elapsedMillisecond = elapsedMillisecond;
            return this;
        }
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        public ExecuteQueryResponseBodyMeta setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ExecuteQueryResponseBodyMeta setTruncation(ExecuteQueryResponseBodyMetaTruncation truncation) {
            this.truncation = truncation;
            return this;
        }
        public ExecuteQueryResponseBodyMetaTruncation getTruncation() {
            return this.truncation;
        }

    }

}
