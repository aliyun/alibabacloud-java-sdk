// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PreviewPipelineResponseBody extends TeaModel {
    /**
     * <p>The <code>data</code> field is a collection of sample rows (an array of maps) that contains only the first N rows (up to 5 by default) and does not reflect the complete write plan.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    /**
     * <p>The query metadata.</p>
     */
    @NameInMap("meta")
    public PreviewPipelineResponseBodyMeta meta;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PreviewPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewPipelineResponseBody self = new PreviewPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewPipelineResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public PreviewPipelineResponseBody setMeta(PreviewPipelineResponseBodyMeta meta) {
        this.meta = meta;
        return this;
    }
    public PreviewPipelineResponseBodyMeta getMeta() {
        return this.meta;
    }

    public PreviewPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreviewPipelineResponseBodyMeta extends TeaModel {
        /**
         * <p>The aggregation analysis SPL statement.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| SELECT status, count(*) AS cnt GROUP BY status</li>
         * </ul>
         */
        @NameInMap("aggQuery")
        public String aggQuery;

        /**
         * <p>The <code>meta.columnTypes</code> field provides a mapping from column names to data types (string / long / double / json).</p>
         */
        @NameInMap("columnTypes")
        public java.util.List<String> columnTypes;

        /**
         * <p>The number of matched log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The number of CPU cores consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpuCores")
        public Integer cpuCores;

        /**
         * <p>The CPU time consumed, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("cpuSec")
        public Double cpuSec;

        /**
         * <p>The query duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        /**
         * <p>Indicates whether the query is an SQL query.</p>
         */
        @NameInMap("hasSQL")
        public Boolean hasSQL;

        /**
         * <p>Indicates whether nanosecond-level ordering is enabled.</p>
         */
        @NameInMap("isAccurate")
        public Boolean isAccurate;

        /**
         * <p>The list of result column names.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The maximum number of result rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("limited")
        public Integer limited;

        /**
         * <p>The query mode identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("mode")
        public Integer mode;

        /**
         * <p>The number of processed data bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>524288</p>
         */
        @NameInMap("processedBytes")
        public Long processedBytes;

        /**
         * <p>The number of processed log rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("processedRows")
        public Long processedRows;

        /**
         * <p>The SLS query progress. A value of Complete indicates that the query is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        /**
         * <p>The number of raw data bytes scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("scanBytes")
        public Long scanBytes;

        /**
         * <p>The column type and aggregation information.</p>
         */
        @NameInMap("terms")
        public java.util.List<java.util.Map<String, ?>> terms;

        /**
         * <p>The filter condition SPL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>status: 200</p>
         */
        @NameInMap("whereQuery")
        public String whereQuery;

        public static PreviewPipelineResponseBodyMeta build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineResponseBodyMeta self = new PreviewPipelineResponseBodyMeta();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineResponseBodyMeta setAggQuery(String aggQuery) {
            this.aggQuery = aggQuery;
            return this;
        }
        public String getAggQuery() {
            return this.aggQuery;
        }

        public PreviewPipelineResponseBodyMeta setColumnTypes(java.util.List<String> columnTypes) {
            this.columnTypes = columnTypes;
            return this;
        }
        public java.util.List<String> getColumnTypes() {
            return this.columnTypes;
        }

        public PreviewPipelineResponseBodyMeta setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public PreviewPipelineResponseBodyMeta setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public PreviewPipelineResponseBodyMeta setCpuSec(Double cpuSec) {
            this.cpuSec = cpuSec;
            return this;
        }
        public Double getCpuSec() {
            return this.cpuSec;
        }

        public PreviewPipelineResponseBodyMeta setElapsedMillisecond(Long elapsedMillisecond) {
            this.elapsedMillisecond = elapsedMillisecond;
            return this;
        }
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        public PreviewPipelineResponseBodyMeta setHasSQL(Boolean hasSQL) {
            this.hasSQL = hasSQL;
            return this;
        }
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        public PreviewPipelineResponseBodyMeta setIsAccurate(Boolean isAccurate) {
            this.isAccurate = isAccurate;
            return this;
        }
        public Boolean getIsAccurate() {
            return this.isAccurate;
        }

        public PreviewPipelineResponseBodyMeta setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public PreviewPipelineResponseBodyMeta setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public PreviewPipelineResponseBodyMeta setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public PreviewPipelineResponseBodyMeta setProcessedBytes(Long processedBytes) {
            this.processedBytes = processedBytes;
            return this;
        }
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        public PreviewPipelineResponseBodyMeta setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public PreviewPipelineResponseBodyMeta setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public PreviewPipelineResponseBodyMeta setScanBytes(Long scanBytes) {
            this.scanBytes = scanBytes;
            return this;
        }
        public Long getScanBytes() {
            return this.scanBytes;
        }

        public PreviewPipelineResponseBodyMeta setTerms(java.util.List<java.util.Map<String, ?>> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTerms() {
            return this.terms;
        }

        public PreviewPipelineResponseBodyMeta setWhereQuery(String whereQuery) {
            this.whereQuery = whereQuery;
            return this;
        }
        public String getWhereQuery() {
            return this.whereQuery;
        }

    }

}
