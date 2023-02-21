// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkAppMetricsResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("OutputRowsCount")
        public Long outputRowsCount;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AttemptId")
        public String attemptId;

        @NameInMap("EventLogPath")
        public String eventLogPath;

        @NameInMap("Finished")
        public Boolean finished;

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
