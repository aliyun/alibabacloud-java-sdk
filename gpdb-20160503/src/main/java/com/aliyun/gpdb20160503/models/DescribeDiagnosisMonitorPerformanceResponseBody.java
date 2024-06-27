// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    /**
     * <p>Details of query execution.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDiagnosisMonitorPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The threshold for the number of queries.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("PerformancesThreshold")
    public Integer performancesThreshold;

    /**
     * <p>Indicates whether the queries are truncated when the number of queries exceeds the threshold. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The queries are truncated.</li>
     * <li><strong>false</strong>: The queries are not truncated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PerformancesTruncated")
    public Boolean performancesTruncated;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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
         * <p>The execution duration of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cost")
        public Integer cost;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The ID of the query. It is a unique identifier of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2022042612465401000000012903151998970</p>
         */
        @NameInMap("QueryID")
        public String queryID;

        /**
         * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1651877940000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The execution state of the query. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: The query is being executed.</li>
         * <li><strong>finished</strong>: The query is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpguser</p>
         */
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
