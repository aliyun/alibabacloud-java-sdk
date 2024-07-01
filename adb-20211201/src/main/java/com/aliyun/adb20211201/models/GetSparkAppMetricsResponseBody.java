// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppMetricsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkAppMetricsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppMetricsResponseBody self = new GetSparkAppMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppMetricsResponseBody setData(GetSparkAppMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppMetricsResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppMetricsResponseBodyDataScanMetrics extends TeaModel {
        /**
         * <p>The number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OutputRowsCount")
        public Long outputRowsCount;

        /**
         * <p>The number of scanned bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalReadFileSizeInByte")
        public Long totalReadFileSizeInByte;

        public static GetSparkAppMetricsResponseBodyDataScanMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppMetricsResponseBodyDataScanMetrics self = new GetSparkAppMetricsResponseBodyDataScanMetrics();
            return TeaModel.build(map, self);
        }

        public GetSparkAppMetricsResponseBodyDataScanMetrics setOutputRowsCount(Long outputRowsCount) {
            this.outputRowsCount = outputRowsCount;
            return this;
        }
        public Long getOutputRowsCount() {
            return this.outputRowsCount;
        }

        public GetSparkAppMetricsResponseBodyDataScanMetrics setTotalReadFileSizeInByte(Long totalReadFileSizeInByte) {
            this.totalReadFileSizeInByte = totalReadFileSizeInByte;
            return this;
        }
        public Long getTotalReadFileSizeInByte() {
            return this.totalReadFileSizeInByte;
        }

    }

    public static class GetSparkAppMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202302051515shfa865f80003691</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The attempt ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301061000hz57d797b0000201-0001</p>
         */
        @NameInMap("AttemptId")
        public String attemptId;

        /**
         * <p>The path of the event log.</p>
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
        public GetSparkAppMetricsResponseBodyDataScanMetrics scanMetrics;

        public static GetSparkAppMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppMetricsResponseBodyData self = new GetSparkAppMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppMetricsResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkAppMetricsResponseBodyData setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public GetSparkAppMetricsResponseBodyData setEventLogPath(String eventLogPath) {
            this.eventLogPath = eventLogPath;
            return this;
        }
        public String getEventLogPath() {
            return this.eventLogPath;
        }

        public GetSparkAppMetricsResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetSparkAppMetricsResponseBodyData setScanMetrics(GetSparkAppMetricsResponseBodyDataScanMetrics scanMetrics) {
            this.scanMetrics = scanMetrics;
            return this;
        }
        public GetSparkAppMetricsResponseBodyDataScanMetrics getScanMetrics() {
            return this.scanMetrics;
        }

    }

}
