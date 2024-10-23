// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    /**
     * <p>The monitoring information about queries displayed in Gantt charts.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The threshold for the number of queries displayed in a Gantt chart. Default value: 10000.</p>
     * <blockquote>
     * <p> Up to 10,000 queries can be displayed in a Gantt chart even if more queries exist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("PerformancesThreshold")
    public Integer performancesThreshold;

    /**
     * <p>Indicates whether all queries are returned. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PerformancesTruncated")
    public Boolean performancesTruncated;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F1AC5FD-16E9-5399-B81F-5AC434B1D9F8</p>
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
         * <p>The total execution duration. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This value is the cumulative value of the <code>QueuedTime</code>, <code>TotalPlanningTime</code>, and <code>ExecutionTime</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>252</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The peak memory of the query. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202210311015270330101470300315153****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The IP address of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("RcHost")
        public String rcHost;

        /**
         * <p>The number of rows scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of scanned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The execution start time of the SQL statement. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1669011260000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The database account that is used to submit the query.</p>
         * 
         * <strong>example:</strong>
         * <p>rpt</p>
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
