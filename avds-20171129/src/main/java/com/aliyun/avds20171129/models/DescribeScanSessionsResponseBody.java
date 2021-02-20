// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeScanSessionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeScanSessionsResponseBodyList> list;

    @NameInMap("Count")
    public Integer count;

    public static DescribeScanSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanSessionsResponseBody self = new DescribeScanSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScanSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanSessionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScanSessionsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeScanSessionsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeScanSessionsResponseBody setList(java.util.List<DescribeScanSessionsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeScanSessionsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeScanSessionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public static class DescribeScanSessionsResponseBodyList extends TeaModel {
        @NameInMap("ReportStatus")
        public String reportStatus;

        @NameInMap("FinishedAt")
        public Long finishedAt;

        @NameInMap("Targets")
        public java.util.List<String> targets;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("ScanId")
        public String scanId;

        @NameInMap("Period")
        public String period;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("ReportUrl")
        public String reportUrl;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("RunPercent")
        public Float runPercent;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Name")
        public String name;

        @NameInMap("TaskId")
        public Long taskId;

        public static DescribeScanSessionsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanSessionsResponseBodyList self = new DescribeScanSessionsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeScanSessionsResponseBodyList setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public DescribeScanSessionsResponseBodyList setFinishedAt(Long finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public Long getFinishedAt() {
            return this.finishedAt;
        }

        public DescribeScanSessionsResponseBodyList setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        public DescribeScanSessionsResponseBodyList setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public DescribeScanSessionsResponseBodyList setScanId(String scanId) {
            this.scanId = scanId;
            return this;
        }
        public String getScanId() {
            return this.scanId;
        }

        public DescribeScanSessionsResponseBodyList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeScanSessionsResponseBodyList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public DescribeScanSessionsResponseBodyList setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

        public DescribeScanSessionsResponseBodyList setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public DescribeScanSessionsResponseBodyList setRunPercent(Float runPercent) {
            this.runPercent = runPercent;
            return this;
        }
        public Float getRunPercent() {
            return this.runPercent;
        }

        public DescribeScanSessionsResponseBodyList setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeScanSessionsResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeScanSessionsResponseBodyList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
