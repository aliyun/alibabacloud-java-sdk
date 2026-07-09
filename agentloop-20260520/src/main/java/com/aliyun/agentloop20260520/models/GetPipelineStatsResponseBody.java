// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineStatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The name of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The request ID, which is used to locate the request during troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1735574400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("summary")
    public GetPipelineStatsResponseBodySummary summary;

    @NameInMap("timeSeries")
    public java.util.List<GetPipelineStatsResponseBodyTimeSeries> timeSeries;

    public static GetPipelineStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStatsResponseBody self = new GetPipelineStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineStatsResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPipelineStatsResponseBody setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetPipelineStatsResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public GetPipelineStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineStatsResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetPipelineStatsResponseBody setSummary(GetPipelineStatsResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public GetPipelineStatsResponseBodySummary getSummary() {
        return this.summary;
    }

    public GetPipelineStatsResponseBody setTimeSeries(java.util.List<GetPipelineStatsResponseBodyTimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }
    public java.util.List<GetPipelineStatsResponseBodyTimeSeries> getTimeSeries() {
        return this.timeSeries;
    }

    public static class GetPipelineStatsResponseBodySummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("avgElapsedMs")
        public Long avgElapsedMs;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cancelledRuns")
        public Long cancelledRuns;

        /**
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("committedWatermark")
        public Long committedWatermark;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failedRuns")
        public Long failedRuns;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("scheduleLagSeconds")
        public Long scheduleLagSeconds;

        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("succeededRuns")
        public Long succeededRuns;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("successRate")
        public Double successRate;

        /**
         * <strong>example:</strong>
         * <p>3221225472</p>
         */
        @NameInMap("totalOutputBytes")
        public Long totalOutputBytes;

        /**
         * <strong>example:</strong>
         * <p>1200000</p>
         */
        @NameInMap("totalOutputRows")
        public Long totalOutputRows;

        /**
         * <strong>example:</strong>
         * <p>5368709120</p>
         */
        @NameInMap("totalProcessedBytes")
        public Long totalProcessedBytes;

        /**
         * <strong>example:</strong>
         * <p>1500000</p>
         */
        @NameInMap("totalProcessedRows")
        public Long totalProcessedRows;

        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("totalRuns")
        public Long totalRuns;

        public static GetPipelineStatsResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineStatsResponseBodySummary self = new GetPipelineStatsResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public GetPipelineStatsResponseBodySummary setAvgElapsedMs(Long avgElapsedMs) {
            this.avgElapsedMs = avgElapsedMs;
            return this;
        }
        public Long getAvgElapsedMs() {
            return this.avgElapsedMs;
        }

        public GetPipelineStatsResponseBodySummary setCancelledRuns(Long cancelledRuns) {
            this.cancelledRuns = cancelledRuns;
            return this;
        }
        public Long getCancelledRuns() {
            return this.cancelledRuns;
        }

        public GetPipelineStatsResponseBodySummary setCommittedWatermark(Long committedWatermark) {
            this.committedWatermark = committedWatermark;
            return this;
        }
        public Long getCommittedWatermark() {
            return this.committedWatermark;
        }

        public GetPipelineStatsResponseBodySummary setFailedRuns(Long failedRuns) {
            this.failedRuns = failedRuns;
            return this;
        }
        public Long getFailedRuns() {
            return this.failedRuns;
        }

        public GetPipelineStatsResponseBodySummary setScheduleLagSeconds(Long scheduleLagSeconds) {
            this.scheduleLagSeconds = scheduleLagSeconds;
            return this;
        }
        public Long getScheduleLagSeconds() {
            return this.scheduleLagSeconds;
        }

        public GetPipelineStatsResponseBodySummary setSucceededRuns(Long succeededRuns) {
            this.succeededRuns = succeededRuns;
            return this;
        }
        public Long getSucceededRuns() {
            return this.succeededRuns;
        }

        public GetPipelineStatsResponseBodySummary setSuccessRate(Double successRate) {
            this.successRate = successRate;
            return this;
        }
        public Double getSuccessRate() {
            return this.successRate;
        }

        public GetPipelineStatsResponseBodySummary setTotalOutputBytes(Long totalOutputBytes) {
            this.totalOutputBytes = totalOutputBytes;
            return this;
        }
        public Long getTotalOutputBytes() {
            return this.totalOutputBytes;
        }

        public GetPipelineStatsResponseBodySummary setTotalOutputRows(Long totalOutputRows) {
            this.totalOutputRows = totalOutputRows;
            return this;
        }
        public Long getTotalOutputRows() {
            return this.totalOutputRows;
        }

        public GetPipelineStatsResponseBodySummary setTotalProcessedBytes(Long totalProcessedBytes) {
            this.totalProcessedBytes = totalProcessedBytes;
            return this;
        }
        public Long getTotalProcessedBytes() {
            return this.totalProcessedBytes;
        }

        public GetPipelineStatsResponseBodySummary setTotalProcessedRows(Long totalProcessedRows) {
            this.totalProcessedRows = totalProcessedRows;
            return this;
        }
        public Long getTotalProcessedRows() {
            return this.totalProcessedRows;
        }

        public GetPipelineStatsResponseBodySummary setTotalRuns(Long totalRuns) {
            this.totalRuns = totalRuns;
            return this;
        }
        public Long getTotalRuns() {
            return this.totalRuns;
        }

    }

    public static class GetPipelineStatsResponseBodyTimeSeries extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("avgElapsedMs")
        public Long avgElapsedMs;

        /**
         * <strong>example:</strong>
         * <p>322122547</p>
         */
        @NameInMap("outputBytes")
        public Long outputBytes;

        /**
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("outputRows")
        public Long outputRows;

        /**
         * <strong>example:</strong>
         * <p>536870912</p>
         */
        @NameInMap("processedBytes")
        public Long processedBytes;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("processedRows")
        public Long processedRows;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("runs")
        public Long runs;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("succeededRuns")
        public Long succeededRuns;

        /**
         * <strong>example:</strong>
         * <p>1735574400</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        public static GetPipelineStatsResponseBodyTimeSeries build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineStatsResponseBodyTimeSeries self = new GetPipelineStatsResponseBodyTimeSeries();
            return TeaModel.build(map, self);
        }

        public GetPipelineStatsResponseBodyTimeSeries setAvgElapsedMs(Long avgElapsedMs) {
            this.avgElapsedMs = avgElapsedMs;
            return this;
        }
        public Long getAvgElapsedMs() {
            return this.avgElapsedMs;
        }

        public GetPipelineStatsResponseBodyTimeSeries setOutputBytes(Long outputBytes) {
            this.outputBytes = outputBytes;
            return this;
        }
        public Long getOutputBytes() {
            return this.outputBytes;
        }

        public GetPipelineStatsResponseBodyTimeSeries setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public GetPipelineStatsResponseBodyTimeSeries setProcessedBytes(Long processedBytes) {
            this.processedBytes = processedBytes;
            return this;
        }
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        public GetPipelineStatsResponseBodyTimeSeries setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public GetPipelineStatsResponseBodyTimeSeries setRuns(Long runs) {
            this.runs = runs;
            return this;
        }
        public Long getRuns() {
            return this.runs;
        }

        public GetPipelineStatsResponseBodyTimeSeries setSucceededRuns(Long succeededRuns) {
            this.succeededRuns = succeededRuns;
            return this;
        }
        public Long getSucceededRuns() {
            return this.succeededRuns;
        }

        public GetPipelineStatsResponseBodyTimeSeries setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
