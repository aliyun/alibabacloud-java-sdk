// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExecuteQueryResponseBody extends TeaModel {
    /**
     * <p>An array of log entries. Each object in the array represents a log entry.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    /**
     * <p>Metadata about the query execution.</p>
     */
    @NameInMap("meta")
    public ExecuteQueryResponseBodyMeta meta;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExecuteQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryResponseBody self = new ExecuteQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
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

    public static class ExecuteQueryResponseBodyMeta extends TeaModel {
        /**
         * <p>The number of scanned or processed log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("affectedRows")
        public Integer affectedRows;

        /**
         * <p>The number of log entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The query execution time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1231243</p>
         */
        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        /**
         * <p>The query completion status. A value of <code>Complete</code> indicates that the query has finished.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

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

    }

}
