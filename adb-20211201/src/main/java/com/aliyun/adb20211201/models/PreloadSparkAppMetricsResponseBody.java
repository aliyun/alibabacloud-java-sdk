// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public PreloadSparkAppMetricsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84489769-3065-5A28-A4CB-977CD426F1C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreloadSparkAppMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadSparkAppMetricsResponseBody self = new PreloadSparkAppMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadSparkAppMetricsResponseBody setData(PreloadSparkAppMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreloadSparkAppMetricsResponseBodyData getData() {
        return this.data;
    }

    public PreloadSparkAppMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreloadSparkAppMetricsResponseBodyDataScanMetrics extends TeaModel {
        /**
         * <p>The number of rows scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OutputRowsCount")
        public Long outputRowsCount;

        /**
         * <p>The size of the scanned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalReadFileSizeInByte")
        public Long totalReadFileSizeInByte;

        public static PreloadSparkAppMetricsResponseBodyDataScanMetrics build(java.util.Map<String, ?> map) throws Exception {
            PreloadSparkAppMetricsResponseBodyDataScanMetrics self = new PreloadSparkAppMetricsResponseBodyDataScanMetrics();
            return TeaModel.build(map, self);
        }

        public PreloadSparkAppMetricsResponseBodyDataScanMetrics setOutputRowsCount(Long outputRowsCount) {
            this.outputRowsCount = outputRowsCount;
            return this;
        }
        public Long getOutputRowsCount() {
            return this.outputRowsCount;
        }

        public PreloadSparkAppMetricsResponseBodyDataScanMetrics setTotalReadFileSizeInByte(Long totalReadFileSizeInByte) {
            this.totalReadFileSizeInByte = totalReadFileSizeInByte;
            return this;
        }
        public Long getTotalReadFileSizeInByte() {
            return this.totalReadFileSizeInByte;
        }

    }

    public static class PreloadSparkAppMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202212181815shaccb8be0000253</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The retry ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301061000hz57d797b0000201-0001</p>
         */
        @NameInMap("AttemptId")
        public String attemptId;

        /**
         * <p>The event log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://path/to/eventLog</p>
         */
        @NameInMap("EventLogPath")
        public String eventLogPath;

        /**
         * <p>Indicates whether parsing is complete. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Finished")
        public Boolean finished;

        /**
         * <p>The metrics.</p>
         */
        @NameInMap("ScanMetrics")
        public PreloadSparkAppMetricsResponseBodyDataScanMetrics scanMetrics;

        public static PreloadSparkAppMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreloadSparkAppMetricsResponseBodyData self = new PreloadSparkAppMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreloadSparkAppMetricsResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public PreloadSparkAppMetricsResponseBodyData setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public PreloadSparkAppMetricsResponseBodyData setEventLogPath(String eventLogPath) {
            this.eventLogPath = eventLogPath;
            return this;
        }
        public String getEventLogPath() {
            return this.eventLogPath;
        }

        public PreloadSparkAppMetricsResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public PreloadSparkAppMetricsResponseBodyData setScanMetrics(PreloadSparkAppMetricsResponseBodyDataScanMetrics scanMetrics) {
            this.scanMetrics = scanMetrics;
            return this;
        }
        public PreloadSparkAppMetricsResponseBodyDataScanMetrics getScanMetrics() {
            return this.scanMetrics;
        }

    }

}
