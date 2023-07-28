// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The queried SQL patterns.</p>
     */
    @NameInMap("PatternDetails")
    public java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> patternDetails;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSQLPatternsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternsResponseBody self = new DescribeSQLPatternsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLPatternsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLPatternsResponseBody setPatternDetails(java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> patternDetails) {
        this.patternDetails = patternDetails;
        return this;
    }
    public java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> getPatternDetails() {
        return this.patternDetails;
    }

    public DescribeSQLPatternsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLPatternsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSQLPatternsResponseBodyPatternDetails extends TeaModel {
        /**
         * <p>The IP address of the SQL client that commits the SQL pattern.</p>
         */
        @NameInMap("AccessIp")
        public String accessIp;

        /**
         * <p>The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         */
        @NameInMap("AverageExecutionTime")
        public Double averageExecutionTime;

        /**
         * <p>The average peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
         */
        @NameInMap("AveragePeakMemory")
        public Double averagePeakMemory;

        /**
         * <p>The average total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
         */
        @NameInMap("AverageQueryTime")
        public Double averageQueryTime;

        /**
         * <p>The average amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
         */
        @NameInMap("AverageScanSize")
        public Double averageScanSize;

        /**
         * <p>Indicates whether the execution of the SQL pattern can be blocked. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> Only SELECT and INSERT statements can be blocked.</p>
         */
        @NameInMap("Blockable")
        public Boolean blockable;

        /**
         * <p>The number of failed queries executed in association with the SQL pattern within the query time range.</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         */
        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        /**
         * <p>The maximum peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
         */
        @NameInMap("MaxPeakMemory")
        public Long maxPeakMemory;

        /**
         * <p>The maximum total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
         */
        @NameInMap("MaxQueryTime")
        public Long maxQueryTime;

        /**
         * <p>The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
         */
        @NameInMap("MaxScanSize")
        public Long maxScanSize;

        /**
         * <p>The earliest commit time of the SQL pattern within the query time range. Unit: milliseconds.</p>
         */
        @NameInMap("PatternCreationTime")
        public String patternCreationTime;

        /**
         * <p>The ID of the SQL pattern.</p>
         */
        @NameInMap("PatternId")
        public String patternId;

        /**
         * <p>The number of queries executed in association with the SQL pattern within the query time range.</p>
         */
        @NameInMap("QueryCount")
        public Long queryCount;

        /**
         * <p>The statement of the SQL pattern.</p>
         */
        @NameInMap("SQLPattern")
        public String SQLPattern;

        /**
         * <p>The tables scanned based on the SQL pattern.</p>
         */
        @NameInMap("Tables")
        public String tables;

        /**
         * <p>The database username that is used to commit the SQL pattern.</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeSQLPatternsResponseBodyPatternDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPatternsResponseBodyPatternDetails self = new DescribeSQLPatternsResponseBodyPatternDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageExecutionTime(Double averageExecutionTime) {
            this.averageExecutionTime = averageExecutionTime;
            return this;
        }
        public Double getAverageExecutionTime() {
            return this.averageExecutionTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAveragePeakMemory(Double averagePeakMemory) {
            this.averagePeakMemory = averagePeakMemory;
            return this;
        }
        public Double getAveragePeakMemory() {
            return this.averagePeakMemory;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageQueryTime(Double averageQueryTime) {
            this.averageQueryTime = averageQueryTime;
            return this;
        }
        public Double getAverageQueryTime() {
            return this.averageQueryTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageScanSize(Double averageScanSize) {
            this.averageScanSize = averageScanSize;
            return this;
        }
        public Double getAverageScanSize() {
            return this.averageScanSize;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setBlockable(Boolean blockable) {
            this.blockable = blockable;
            return this;
        }
        public Boolean getBlockable() {
            return this.blockable;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxPeakMemory(Long maxPeakMemory) {
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }
        public Long getMaxPeakMemory() {
            return this.maxPeakMemory;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxQueryTime(Long maxQueryTime) {
            this.maxQueryTime = maxQueryTime;
            return this;
        }
        public Long getMaxQueryTime() {
            return this.maxQueryTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxScanSize(Long maxScanSize) {
            this.maxScanSize = maxScanSize;
            return this;
        }
        public Long getMaxScanSize() {
            return this.maxScanSize;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setPatternCreationTime(String patternCreationTime) {
            this.patternCreationTime = patternCreationTime;
            return this;
        }
        public String getPatternCreationTime() {
            return this.patternCreationTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }
        public String getPatternId() {
            return this.patternId;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setSQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
