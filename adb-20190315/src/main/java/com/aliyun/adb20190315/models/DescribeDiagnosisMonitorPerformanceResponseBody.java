// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    /**
     * <p>The monitoring information of queries displayed in Gantt charts.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The threshold for the number of queries displayed in a Gantt chart. The default value is 10000.</p>
     * <br>
     * <p>>  A maximum of 10,000 queries can be displayed in a Gantt chart even if more queries exist.</p>
     */
    @NameInMap("PerformancesThreshold")
    public Integer performancesThreshold;

    /**
     * <p>Indicates whether all queries are returned. Valid values:</p>
     * <br>
     * <p>*   true: All queries are returned.</p>
     * <p>*   false: Only a specified number of queries are returned.</p>
     */
    @NameInMap("PerformancesTruncated")
    public Boolean performancesTruncated;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosisMonitorPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisMonitorPerformanceResponseBody self = new DescribeDiagnosisMonitorPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisMonitorPerformanceResponseBody setPerformances(java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDiagnosisMonitorPerformanceResponseBody setPerformancesThreshold(Integer performancesThreshold) {
        this.performancesThreshold = performancesThreshold;
        return this;
    }
    public Integer getPerformancesThreshold() {
        return this.performancesThreshold;
    }

    public DescribeDiagnosisMonitorPerformanceResponseBody setPerformancesTruncated(Boolean performancesTruncated) {
        this.performancesTruncated = performancesTruncated;
        return this;
    }
    public Boolean getPerformancesTruncated() {
        return this.performancesTruncated;
    }

    public DescribeDiagnosisMonitorPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosisMonitorPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The total amount of time consumed by the query. Unit: milliseconds.</p>
         * <br>
         * <p>>  This parameter indicates the sum of `QueuedTime`, `TotalPlanningTime`, and `ExecutionTime`.</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The peak memory of the query. Unit: bytes.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The ID of the query.</p>
         * <br>
         * <p>>  You can call the [DescribeProcessList](~~143382~~) operation to query the IDs of queries that are being executed.</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The IP address of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
         */
        @NameInMap("RcHost")
        public String rcHost;

        /**
         * <p>The number of entries scanned.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of scanned data. Unit: bytes.</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The execution start time of the SQL statement. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **running**</p>
         * <p>*   **finished**</p>
         * <p>*   **failed**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The database account that is used to submit the query.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeDiagnosisMonitorPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisMonitorPerformanceResponseBodyPerformances self = new DescribeDiagnosisMonitorPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setRcHost(String rcHost) {
            this.rcHost = rcHost;
            return this;
        }
        public String getRcHost() {
            return this.rcHost;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
