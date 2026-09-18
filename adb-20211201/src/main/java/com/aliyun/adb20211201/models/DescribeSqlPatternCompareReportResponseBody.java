// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportResponseBody extends TeaModel {
    /**
     * <p>The Pattern details on the current page. An empty array is returned if no results match the conditions.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSqlPatternCompareReportResponseBodyItems> items;

    /**
     * <p>The analysis metric. Valid values:</p>
     * <ul>
     * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
     * <li><code>CPU_COST</code>: the CPU consumption.</li>
     * <li><code>SHUFFLE_SIZE</code>: the amount of shuffle data.</li>
     * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
     * <li><code>SCAN_SIZE</code>: the amount of scanned data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU_COST</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The page number of the returned page, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the SQL Pattern comparison report.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of Patterns that match the current report, analysis dimension, and change rate filter conditions. This is not the number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSqlPatternCompareReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportResponseBody self = new DescribeSqlPatternCompareReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportResponseBody setItems(java.util.List<DescribeSqlPatternCompareReportResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSqlPatternCompareReportResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSqlPatternCompareReportResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeSqlPatternCompareReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternCompareReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternCompareReportResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeSqlPatternCompareReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlPatternCompareReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSqlPatternCompareReportResponseBodyItems extends TeaModel {
        /**
         * <p>The display string of the average execution duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4s</p>
         */
        @NameInMap("AvgExecutionTime")
        public String avgExecutionTime;

        /**
         * <p>The display string of the average planning duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1s</p>
         */
        @NameInMap("AvgPlanningTime")
        public String avgPlanningTime;

        /**
         * <p>The display string of the average query response time for Time 2, in seconds. This field is returned for all analysis dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5s</p>
         */
        @NameInMap("AvgRt")
        public String avgRt;

        /**
         * <p>The display string of the maximum execution duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8s</p>
         */
        @NameInMap("MaxExecutionTime")
        public String maxExecutionTime;

        /**
         * <p>The display string of the maximum planning duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2s</p>
         */
        @NameInMap("MaxPlanningTime")
        public String maxPlanningTime;

        /**
         * <p>The display string of the maximum query response time for Time 2, in seconds. This field is returned for all analysis dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>2s</p>
         */
        @NameInMap("MaxRt")
        public String maxRt;

        /**
         * <p>The primary metric mapping for the current analysis dimension. Valid keys:</p>
         * <ul>
         * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
         * <li><code>CPU_COST</code>: the CPU consumption.</li>
         * <li><code>SHUFFLE_SIZE</code>: the shuffle data volume.</li>
         * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
         * <li><code>SCAN_SIZE</code>: the scan data volume.</li>
         * </ul>
         * <blockquote>
         * <p>Each result contains only one key that matches the <code>MetricType</code> request parameter.</p>
         * </blockquote>
         */
        @NameInMap("MetricValues")
        public java.util.Map<String, ItemsMetricValuesValue> metricValues;

        /**
         * <p>The parameterized SQL Pattern text. This field is empty or not returned when IncludePattern is set to false. When the text is unavailable, a prompt containing a hash identifier may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM orders WHERE order_id = ?</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The number of query executions for Time 2, in count. This field is returned for the CPU_COST, SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("QueryCount")
        public Long queryCount;

        /**
         * <p>The display string of the number of query executions for Time 2. The applicable scope is the same as QueryCount.</p>
         * 
         * <strong>example:</strong>
         * <p>120 times</p>
         */
        @NameInMap("QueryCountDisplayValue")
        public String queryCountDisplayValue;

        /**
         * <p>The global sequence number in the current filtered and sorted results, starting from 1 and numbered continuously across pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rank")
        public Long rank;

        /**
         * <p>The change level for the current analysis dimension. Valid values:</p>
         * <ul>
         * <li><code>NEW</code>: A new Pattern. Returned only for NEW reports.</li>
         * <li><code>SLIGHT</code>: A slight change. The average change rate is in the range of (0%, 20%].</li>
         * <li><code>MODERATE</code>: A moderate change. The average change rate is in the range of (20%, 50%].</li>
         * <li><code>HIGH</code>: A high change. The average change rate is in the range of (50%, 100%].</li>
         * <li><code>SEVERE</code>: A severe change. The average change rate is greater than 100%, or the change represents zero-baseline growth.</li>
         * </ul>
         * <blockquote>
         * <p>The change level only indicates the magnitude of metric growth and cannot be used alone to determine the cause of a fault.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SEVERE</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The hash identifier of the SQL Pattern, returned as a string. Store and pass this value as a string to avoid precision loss caused by numeric conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456789</p>
         */
        @NameInMap("SqlPatternHash")
        public String sqlPatternHash;

        /**
         * <p>The display string of the total query duration for Time 2, in seconds. This field is returned only for the QUERY_COUNT dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("TotalQueryTime")
        public String totalQueryTime;

        /**
         * <p>The display string of the total scan duration for Time 2, in seconds. This field is returned only for the SCAN_SIZE dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>12s</p>
         */
        @NameInMap("TotalScanCost")
        public String totalScanCost;

        public static DescribeSqlPatternCompareReportResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlPatternCompareReportResponseBodyItems self = new DescribeSqlPatternCompareReportResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setAvgExecutionTime(String avgExecutionTime) {
            this.avgExecutionTime = avgExecutionTime;
            return this;
        }
        public String getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setAvgPlanningTime(String avgPlanningTime) {
            this.avgPlanningTime = avgPlanningTime;
            return this;
        }
        public String getAvgPlanningTime() {
            return this.avgPlanningTime;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setAvgRt(String avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public String getAvgRt() {
            return this.avgRt;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setMaxExecutionTime(String maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public String getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setMaxPlanningTime(String maxPlanningTime) {
            this.maxPlanningTime = maxPlanningTime;
            return this;
        }
        public String getMaxPlanningTime() {
            return this.maxPlanningTime;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setMaxRt(String maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public String getMaxRt() {
            return this.maxRt;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setMetricValues(java.util.Map<String, ItemsMetricValuesValue> metricValues) {
            this.metricValues = metricValues;
            return this;
        }
        public java.util.Map<String, ItemsMetricValuesValue> getMetricValues() {
            return this.metricValues;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setQueryCountDisplayValue(String queryCountDisplayValue) {
            this.queryCountDisplayValue = queryCountDisplayValue;
            return this;
        }
        public String getQueryCountDisplayValue() {
            return this.queryCountDisplayValue;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setSqlPatternHash(String sqlPatternHash) {
            this.sqlPatternHash = sqlPatternHash;
            return this;
        }
        public String getSqlPatternHash() {
            return this.sqlPatternHash;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setTotalQueryTime(String totalQueryTime) {
            this.totalQueryTime = totalQueryTime;
            return this;
        }
        public String getTotalQueryTime() {
            return this.totalQueryTime;
        }

        public DescribeSqlPatternCompareReportResponseBodyItems setTotalScanCost(String totalScanCost) {
            this.totalScanCost = totalScanCost;
            return this;
        }
        public String getTotalScanCost() {
            return this.totalScanCost;
        }

    }

}
