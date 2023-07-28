// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternResponseBody extends TeaModel {
    /**
     * <p>Details about the SQL pattern.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSqlPatternResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <br>
         * <p>>  This parameter is returned only when the `Type` parameter is set to `accessip`.</p>
         */
        @NameInMap("AccessIP")
        public String accessIP;

        /**
         * <p>The average CPU time. Unit: milliseconds.</p>
         */
        @NameInMap("AvgCpuTime")
        public String avgCpuTime;

        /**
         * <p>The average peak memory. Unit: KB.</p>
         */
        @NameInMap("AvgPeakMemory")
        public String avgPeakMemory;

        /**
         * <p>The average scan size. Unit: KB.</p>
         */
        @NameInMap("AvgScanSize")
        public String avgScanSize;

        /**
         * <p>The average number of stages.</p>
         */
        @NameInMap("AvgStageCount")
        public String avgStageCount;

        /**
         * <p>The average number of tasks.</p>
         */
        @NameInMap("AvgTaskCount")
        public String avgTaskCount;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum CPU time. Unit: milliseconds.</p>
         */
        @NameInMap("MaxCpuTime")
        public String maxCpuTime;

        /**
         * <p>The maximum peak memory. Unit: KB.</p>
         */
        @NameInMap("MaxPeakMemory")
        public String maxPeakMemory;

        /**
         * <p>The maximum scan size. Unit: KB.</p>
         */
        @NameInMap("MaxScanSize")
        public String maxScanSize;

        /**
         * <p>The maximum number of stages.</p>
         */
        @NameInMap("MaxStageCount")
        public String maxStageCount;

        /**
         * <p>The maximum number of tasks.</p>
         */
        @NameInMap("MaxTaskCount")
        public String maxTaskCount;

        /**
         * <p>The SQL pattern.</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The total number of queries.</p>
         */
        @NameInMap("QueryCount")
        public String queryCount;

        /**
         * <p>The query date.</p>
         */
        @NameInMap("ReportDate")
        public String reportDate;

        /**
         * <p>The username.</p>
         * <br>
         * <p>>  This parameter is returned only when the `Type` parameter is left empty or set to `user`.</p>
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
