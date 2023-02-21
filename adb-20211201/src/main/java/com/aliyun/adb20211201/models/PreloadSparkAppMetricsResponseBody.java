// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    public PreloadSparkAppMetricsResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("OutputRowsCount")
        public Long outputRowsCount;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AttemptId")
        public String attemptId;

        @NameInMap("EventLogPath")
        public String eventLogPath;

        @NameInMap("Finished")
        public Boolean finished;

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
