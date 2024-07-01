// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternResponseBody extends TeaModel {
    /**
     * <p>The queried SQL pattern.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSqlPatternResponseBodyItems> items;

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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB1F6C23-CBCA-5260-9366-BA7BB5EBF6F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSqlPatternResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternResponseBody self = new DescribeSqlPatternResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternResponseBody setItems(java.util.List<DescribeSqlPatternResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSqlPatternResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSqlPatternResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlPatternResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSqlPatternResponseBodyItems extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         * <blockquote>
         * <p> This parameter is returned only when <strong>Type</strong> is set to <strong>accessip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100.104.xx.xx</p>
         */
        @NameInMap("AccessIP")
        public String accessIP;

        /**
         * <p>The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0625</p>
         */
        @NameInMap("AvgCpuTime")
        public String avgCpuTime;

        /**
         * <p>The average peak memory usage of the SQL pattern within the query time range. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>240048</p>
         */
        @NameInMap("AvgPeakMemory")
        public String avgPeakMemory;

        /**
         * <p>The average amount of data scanned based on the SQL pattern within the query time range. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>244</p>
         */
        @NameInMap("AvgScanSize")
        public String avgScanSize;

        /**
         * <p>The average number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvgStageCount")
        public String avgStageCount;

        /**
         * <p>The average number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvgTaskCount")
        public String avgTaskCount;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1ej1nq9n6****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("MaxCpuTime")
        public String maxCpuTime;

        /**
         * <p>The maximum peak memory usage of the SQL pattern within the query time range. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>480096</p>
         */
        @NameInMap("MaxPeakMemory")
        public String maxPeakMemory;

        /**
         * <p>The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MaxScanSize")
        public String maxScanSize;

        /**
         * <p>The maximum number of stages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxStageCount")
        public String maxStageCount;

        /**
         * <p>The maximum number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxTaskCount")
        public String maxTaskCount;

        /**
         * <p>The SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT table_name, table_schema AS schema_name, create_time, create_time AS last_ddl_time, table_comment AS description , ceil((data_length + index_length) / ? / ?) AS store_capacity , data_length AS data_bytes, index_length AS index_bytes, table_collation AS collation, auto_increment, table_rows AS num_rows , engine FROM information_schema.tables WHERE table_type != ? AND table_schema = ? AND table_name IN (?) ORDER BY 1</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The number of queries performed in association with the SQL pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("QueryCount")
        public String queryCount;

        /**
         * <p>The start date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-30</p>
         */
        @NameInMap("ReportDate")
        public String reportDate;

        /**
         * <p>The username.</p>
         * <blockquote>
         * <p> This parameter is returned only when <strong>Type</strong> is left empty or set to <strong>user</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_acc</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeSqlPatternResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlPatternResponseBodyItems self = new DescribeSqlPatternResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSqlPatternResponseBodyItems setAccessIP(String accessIP) {
            this.accessIP = accessIP;
            return this;
        }
        public String getAccessIP() {
            return this.accessIP;
        }

        public DescribeSqlPatternResponseBodyItems setAvgCpuTime(String avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public String getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeSqlPatternResponseBodyItems setAvgPeakMemory(String avgPeakMemory) {
            this.avgPeakMemory = avgPeakMemory;
            return this;
        }
        public String getAvgPeakMemory() {
            return this.avgPeakMemory;
        }

        public DescribeSqlPatternResponseBodyItems setAvgScanSize(String avgScanSize) {
            this.avgScanSize = avgScanSize;
            return this;
        }
        public String getAvgScanSize() {
            return this.avgScanSize;
        }

        public DescribeSqlPatternResponseBodyItems setAvgStageCount(String avgStageCount) {
            this.avgStageCount = avgStageCount;
            return this;
        }
        public String getAvgStageCount() {
            return this.avgStageCount;
        }

        public DescribeSqlPatternResponseBodyItems setAvgTaskCount(String avgTaskCount) {
            this.avgTaskCount = avgTaskCount;
            return this;
        }
        public String getAvgTaskCount() {
            return this.avgTaskCount;
        }

        public DescribeSqlPatternResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSqlPatternResponseBodyItems setMaxCpuTime(String maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public String getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSqlPatternResponseBodyItems setMaxPeakMemory(String maxPeakMemory) {
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }
        public String getMaxPeakMemory() {
            return this.maxPeakMemory;
        }

        public DescribeSqlPatternResponseBodyItems setMaxScanSize(String maxScanSize) {
            this.maxScanSize = maxScanSize;
            return this;
        }
        public String getMaxScanSize() {
            return this.maxScanSize;
        }

        public DescribeSqlPatternResponseBodyItems setMaxStageCount(String maxStageCount) {
            this.maxStageCount = maxStageCount;
            return this;
        }
        public String getMaxStageCount() {
            return this.maxStageCount;
        }

        public DescribeSqlPatternResponseBodyItems setMaxTaskCount(String maxTaskCount) {
            this.maxTaskCount = maxTaskCount;
            return this;
        }
        public String getMaxTaskCount() {
            return this.maxTaskCount;
        }

        public DescribeSqlPatternResponseBodyItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeSqlPatternResponseBodyItems setQueryCount(String queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public String getQueryCount() {
            return this.queryCount;
        }

        public DescribeSqlPatternResponseBodyItems setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public String getReportDate() {
            return this.reportDate;
        }

        public DescribeSqlPatternResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
