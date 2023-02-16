// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    @NameInMap("Performances")
    public java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> performances;

    @NameInMap("PerformancesThreshold")
    public Integer performancesThreshold;

    @NameInMap("PerformancesTruncated")
    public Boolean performancesTruncated;

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
        @NameInMap("Cost")
        public Long cost;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("RcHost")
        public String rcHost;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("ScanSize")
        public Long scanSize;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

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
