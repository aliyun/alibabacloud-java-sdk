// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportsResponseBody extends TeaModel {
    /**
     * <p>The list of reports on the current page. An empty array is returned if no reports match the conditions.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSqlPatternCompareReportsResponseBodyItems> items;

    /**
     * <p>The number of rows per page used in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6Mjo1MA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number used in this query. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page used in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of reports that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSqlPatternCompareReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportsResponseBody self = new DescribeSqlPatternCompareReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportsResponseBody setItems(java.util.List<DescribeSqlPatternCompareReportsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSqlPatternCompareReportsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSqlPatternCompareReportsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSqlPatternCompareReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSqlPatternCompareReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternCompareReportsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternCompareReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlPatternCompareReportsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSqlPatternCompareReportsResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the report can be canceled. The value is true when the report is in the PENDING or RUNNING state.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CancelAvailable")
        public Boolean cancelAvailable;

        /**
         * <p>The end time of time range 2. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T01:00Z</p>
         */
        @NameInMap("CompareEndTime")
        public String compareEndTime;

        /**
         * <p>The start time of time range 2. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T00:00Z</p>
         */
        @NameInMap("CompareStartTime")
        public String compareStartTime;

        /**
         * <p>The time when the report was created. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T01:05Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>Indicates whether report details can be queried. The value is true when the report is in the SUCCESS state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DetailEnabled")
        public Boolean detailEnabled;

        /**
         * <p>The end time of time range 1. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T01:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the SQL Pattern comparison report.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ReportId")
        public Long reportId;

        /**
         * <p>The report type. Valid values:</p>
         * <ul>
         * <li><code>NEW</code>: new patterns.</li>
         * <li><code>CHANGED</code>: patterns with increased metrics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHANGED</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The name of the report type.</p>
         * 
         * <strong>example:</strong>
         * <p>Changed Pattern Comparison Report</p>
         */
        @NameInMap("ReportTypeName")
        public String reportTypeName;

        /**
         * <p>The sequence number in the current sorted result. The value starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RowNumber")
        public Integer rowNumber;

        /**
         * <p>The start time of time range 1. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The report status. Valid values:</p>
         * <ul>
         * <li><code>PENDING</code>: waiting to be generated.</li>
         * <li><code>RUNNING</code>: being generated.</li>
         * <li><code>SUCCESS</code>: generated.</li>
         * <li><code>FAILED</code>: failed to be generated.</li>
         * <li><code>CANCELED</code>: canceled.</li>
         * <li><code>EXPIRED</code>: expired.</li>
         * </ul>
         * <blockquote>
         * <p>The current list returns only reports in the <code>PENDING</code>, <code>RUNNING</code>, or <code>SUCCESS</code> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSqlPatternCompareReportsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlPatternCompareReportsResponseBodyItems self = new DescribeSqlPatternCompareReportsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setCancelAvailable(Boolean cancelAvailable) {
            this.cancelAvailable = cancelAvailable;
            return this;
        }
        public Boolean getCancelAvailable() {
            return this.cancelAvailable;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setCompareEndTime(String compareEndTime) {
            this.compareEndTime = compareEndTime;
            return this;
        }
        public String getCompareEndTime() {
            return this.compareEndTime;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setCompareStartTime(String compareStartTime) {
            this.compareStartTime = compareStartTime;
            return this;
        }
        public String getCompareStartTime() {
            return this.compareStartTime;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setDetailEnabled(Boolean detailEnabled) {
            this.detailEnabled = detailEnabled;
            return this;
        }
        public Boolean getDetailEnabled() {
            return this.detailEnabled;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setReportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }
        public Long getReportId() {
            return this.reportId;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setReportTypeName(String reportTypeName) {
            this.reportTypeName = reportTypeName;
            return this;
        }
        public String getReportTypeName() {
            return this.reportTypeName;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setRowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }
        public Integer getRowNumber() {
            return this.rowNumber;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSqlPatternCompareReportsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
