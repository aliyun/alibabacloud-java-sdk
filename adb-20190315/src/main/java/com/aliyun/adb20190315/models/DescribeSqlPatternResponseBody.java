// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeSqlPatternResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSqlPatternResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternResponseBody self = new DescribeSqlPatternResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSqlPatternResponseBody setItems(java.util.List<DescribeSqlPatternResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSqlPatternResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSqlPatternResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSqlPatternResponseBodyItems extends TeaModel {
        @NameInMap("AvgStageCount")
        public String avgStageCount;

        @NameInMap("MaxCpuTime")
        public String maxCpuTime;

        @NameInMap("AccessIP")
        public String accessIP;

        @NameInMap("AvgScanSize")
        public String avgScanSize;

        @NameInMap("MaxScanSize")
        public String maxScanSize;

        @NameInMap("MaxPeakMemory")
        public String maxPeakMemory;

        @NameInMap("AvgCpuTime")
        public String avgCpuTime;

        @NameInMap("User")
        public String user;

        @NameInMap("AvgPeakMemory")
        public String avgPeakMemory;

        @NameInMap("MaxStageCount")
        public String maxStageCount;

        @NameInMap("MaxTaskCount")
        public String maxTaskCount;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("QueryCount")
        public String queryCount;

        @NameInMap("ReportDate")
        public String reportDate;

        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("AvgTaskCount")
        public String avgTaskCount;

        public static DescribeSqlPatternResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlPatternResponseBodyItems self = new DescribeSqlPatternResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSqlPatternResponseBodyItems setAvgStageCount(String avgStageCount) {
            this.avgStageCount = avgStageCount;
            return this;
        }
        public String getAvgStageCount() {
            return this.avgStageCount;
        }

        public DescribeSqlPatternResponseBodyItems setMaxCpuTime(String maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public String getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSqlPatternResponseBodyItems setAccessIP(String accessIP) {
            this.accessIP = accessIP;
            return this;
        }
        public String getAccessIP() {
            return this.accessIP;
        }

        public DescribeSqlPatternResponseBodyItems setAvgScanSize(String avgScanSize) {
            this.avgScanSize = avgScanSize;
            return this;
        }
        public String getAvgScanSize() {
            return this.avgScanSize;
        }

        public DescribeSqlPatternResponseBodyItems setMaxScanSize(String maxScanSize) {
            this.maxScanSize = maxScanSize;
            return this;
        }
        public String getMaxScanSize() {
            return this.maxScanSize;
        }

        public DescribeSqlPatternResponseBodyItems setMaxPeakMemory(String maxPeakMemory) {
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }
        public String getMaxPeakMemory() {
            return this.maxPeakMemory;
        }

        public DescribeSqlPatternResponseBodyItems setAvgCpuTime(String avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public String getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeSqlPatternResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeSqlPatternResponseBodyItems setAvgPeakMemory(String avgPeakMemory) {
            this.avgPeakMemory = avgPeakMemory;
            return this;
        }
        public String getAvgPeakMemory() {
            return this.avgPeakMemory;
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

        public DescribeSqlPatternResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
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

        public DescribeSqlPatternResponseBodyItems setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeSqlPatternResponseBodyItems setAvgTaskCount(String avgTaskCount) {
            this.avgTaskCount = avgTaskCount;
            return this;
        }
        public String getAvgTaskCount() {
            return this.avgTaskCount;
        }

    }

}
