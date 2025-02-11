// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * 
     * <strong>example:</strong>
     * <p>F3174013-5B7A-5A47-9FE0-6B5D397BD86B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSQLPatternsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternsResponseBody self = new DescribeSQLPatternsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("AccessIp")
        public String accessIp;

        /**
         * <p>The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>234.78</p>
         */
        @NameInMap("AverageExecutionTime")
        public Double averageExecutionTime;

        @NameInMap("AverageOperatorCost")
        public Double averageOperatorCost;

        /**
         * <p>The average peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234.22</p>
         */
        @NameInMap("AveragePeakMemory")
        public Double averagePeakMemory;

        /**
         * <p>The average total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AverageQueryTime")
        public Double averageQueryTime;

        @NameInMap("AverageScanCost")
        public Double averageScanCost;

        /**
         * <p>The average amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234149.23</p>
         */
        @NameInMap("AverageScanSize")
        public Double averageScanSize;

        /**
         * <p>Indicates whether the execution of the SQL pattern can be intercepted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only SELECT and INSERT statements can be intercepted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Blockable")
        public Boolean blockable;

        /**
         * <p>The number of failed queries executed in association with the SQL pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2142</p>
         */
        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        @NameInMap("MaxOperatorCost")
        public Double maxOperatorCost;

        /**
         * <p>The maximum peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234149</p>
         */
        @NameInMap("MaxPeakMemory")
        public Long maxPeakMemory;

        /**
         * <p>The maximum total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("MaxQueryTime")
        public Long maxQueryTime;

        @NameInMap("MaxScanCost")
        public Double maxScanCost;

        /**
         * <p>The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>32212254</p>
         */
        @NameInMap("MaxScanSize")
        public Long maxScanSize;

        @NameInMap("OperatorCostPercentage")
        public Double operatorCostPercentage;

        @NameInMap("OperatorCostSum")
        public Double operatorCostSum;

        /**
         * <p>The earliest commit time of the SQL pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06 05:06:00</p>
         */
        @NameInMap("PatternCreationTime")
        public String patternCreationTime;

        /**
         * <p>The ID of the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>5575924945138******</p>
         */
        @NameInMap("PatternId")
        public String patternId;

        @NameInMap("PeakMemoryPercentage")
        public Double peakMemoryPercentage;

        @NameInMap("PeakMemorySum")
        public Double peakMemorySum;

        /**
         * <p>The number of queries executed in association with the SQL pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("QueryCount")
        public Long queryCount;

        @NameInMap("QueryTimePercentage")
        public Double queryTimePercentage;

        @NameInMap("QueryTimeSum")
        public Double queryTimeSum;

        /**
         * <p>The statement of the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM KEPLER_META_NODE_STATIC_INFO WHERE elastic_node = ? OR (elastic_node = ? AND enable = ?)</p>
         */
        @NameInMap("SQLPattern")
        public String SQLPattern;

        @NameInMap("ScanCostPercentage")
        public Double scanCostPercentage;

        @NameInMap("ScanCostSum")
        public Double scanCostSum;

        @NameInMap("ScanSizePercentage")
        public Double scanSizePercentage;

        @NameInMap("ScanSizeSum")
        public Double scanSizeSum;

        /**
         * <p>The tables scanned based on the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch.orders</p>
         */
        @NameInMap("Tables")
        public String tables;

        /**
         * <p>The name of the database account that is used to commit the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageOperatorCost(Double averageOperatorCost) {
            this.averageOperatorCost = averageOperatorCost;
            return this;
        }
        public Double getAverageOperatorCost() {
            return this.averageOperatorCost;
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

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageScanCost(Double averageScanCost) {
            this.averageScanCost = averageScanCost;
            return this;
        }
        public Double getAverageScanCost() {
            return this.averageScanCost;
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

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxOperatorCost(Double maxOperatorCost) {
            this.maxOperatorCost = maxOperatorCost;
            return this;
        }
        public Double getMaxOperatorCost() {
            return this.maxOperatorCost;
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

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxScanCost(Double maxScanCost) {
            this.maxScanCost = maxScanCost;
            return this;
        }
        public Double getMaxScanCost() {
            return this.maxScanCost;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setMaxScanSize(Long maxScanSize) {
            this.maxScanSize = maxScanSize;
            return this;
        }
        public Long getMaxScanSize() {
            return this.maxScanSize;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setOperatorCostPercentage(Double operatorCostPercentage) {
            this.operatorCostPercentage = operatorCostPercentage;
            return this;
        }
        public Double getOperatorCostPercentage() {
            return this.operatorCostPercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setOperatorCostSum(Double operatorCostSum) {
            this.operatorCostSum = operatorCostSum;
            return this;
        }
        public Double getOperatorCostSum() {
            return this.operatorCostSum;
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

        public DescribeSQLPatternsResponseBodyPatternDetails setPeakMemoryPercentage(Double peakMemoryPercentage) {
            this.peakMemoryPercentage = peakMemoryPercentage;
            return this;
        }
        public Double getPeakMemoryPercentage() {
            return this.peakMemoryPercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setPeakMemorySum(Double peakMemorySum) {
            this.peakMemorySum = peakMemorySum;
            return this;
        }
        public Double getPeakMemorySum() {
            return this.peakMemorySum;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryTimePercentage(Double queryTimePercentage) {
            this.queryTimePercentage = queryTimePercentage;
            return this;
        }
        public Double getQueryTimePercentage() {
            return this.queryTimePercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryTimeSum(Double queryTimeSum) {
            this.queryTimeSum = queryTimeSum;
            return this;
        }
        public Double getQueryTimeSum() {
            return this.queryTimeSum;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setSQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setScanCostPercentage(Double scanCostPercentage) {
            this.scanCostPercentage = scanCostPercentage;
            return this;
        }
        public Double getScanCostPercentage() {
            return this.scanCostPercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setScanCostSum(Double scanCostSum) {
            this.scanCostSum = scanCostSum;
            return this;
        }
        public Double getScanCostSum() {
            return this.scanCostSum;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setScanSizePercentage(Double scanSizePercentage) {
            this.scanSizePercentage = scanSizePercentage;
            return this;
        }
        public Double getScanSizePercentage() {
            return this.scanSizePercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setScanSizeSum(Double scanSizeSum) {
            this.scanSizeSum = scanSizeSum;
            return this;
        }
        public Double getScanSizeSum() {
            return this.scanSizeSum;
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
