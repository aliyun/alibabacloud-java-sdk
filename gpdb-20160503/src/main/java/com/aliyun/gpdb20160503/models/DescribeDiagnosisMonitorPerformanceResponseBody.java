// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

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
        public Integer cost;

        @NameInMap("Database")
        public String database;

        @NameInMap("QueryID")
        public String queryID;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("User")
        public String user;

        public static DescribeDiagnosisMonitorPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisMonitorPerformanceResponseBodyPerformances self = new DescribeDiagnosisMonitorPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setQueryID(String queryID) {
            this.queryID = queryID;
            return this;
        }
        public String getQueryID() {
            return this.queryID;
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

        public DescribeDiagnosisMonitorPerformanceResponseBodyPerformances setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
