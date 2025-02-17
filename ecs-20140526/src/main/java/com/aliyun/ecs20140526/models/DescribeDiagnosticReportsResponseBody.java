// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The diagnostic reports.</p>
     */
    @NameInMap("Reports")
    public DescribeDiagnosticReportsResponseBodyReports reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportsResponseBody self = new DescribeDiagnosticReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticReportsResponseBody setReports(DescribeDiagnosticReportsResponseBodyReports reports) {
        this.reports = reports;
        return this;
    }
    public DescribeDiagnosticReportsResponseBodyReports getReports() {
        return this.reports;
    }

    public DescribeDiagnosticReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue extends TeaModel {
        /**
         * <p>The ID of the diagnosed issue, which is the unique identifier of the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>GuestOS.CPU.HighUtiliz*****</p>
         */
        @NameInMap("IssueId")
        public String issueId;

        /**
         * <p>The category of the diagnostic metric.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSService.GuestOS</p>
         */
        @NameInMap("MetricCategory")
        public String metricCategory;

        /**
         * <p>The ID of the diagnostic metric.</p>
         * 
         * <strong>example:</strong>
         * <p>GuestOS.WinFirewall</p>
         */
        @NameInMap("MetricId")
        public String metricId;

        /**
         * <p>The severity level of the diagnostic metric. Valid values:</p>
         * <ul>
         * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
         * <li>Warn: Diagnostic information was recorded and may indicate exceptions.</li>
         * <li>Critical: Critical exceptions were detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Info</p>
         */
        @NameInMap("Severity")
        public String severity;

        public static DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue self = new DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue setMetricCategory(String metricCategory) {
            this.metricCategory = metricCategory;
            return this;
        }
        public String getMetricCategory() {
            return this.metricCategory;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeDiagnosticReportsResponseBodyReportsReportIssues extends TeaModel {
        @NameInMap("Issue")
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue> issue;

        public static DescribeDiagnosticReportsResponseBodyReportsReportIssues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReportsReportIssues self = new DescribeDiagnosticReportsResponseBodyReportsReportIssues();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReportsReportIssues setIssue(java.util.List<DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue> issue) {
            this.issue = issue;
            return this;
        }
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsReportIssuesIssue> getIssue() {
            return this.issue;
        }

    }

    public static class DescribeDiagnosticReportsResponseBodyReportsReport extends TeaModel {
        /**
         * <p>The time when the diagnostic report was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The end of the time range during which data was queried. The value is the EndTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T14:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the diagnostic was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T14:00:00Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The diagnosed issues.</p>
         */
        @NameInMap("Issues")
        public DescribeDiagnosticReportsResponseBodyReportsReportIssues issues;

        /**
         * <p>The ID of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>dms-bp17p0qwtr72zmu*****</p>
         */
        @NameInMap("MetricSetId")
        public String metricSetId;

        /**
         * <p>The ID of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-uf6i0tv2refv8wz*****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6i0tv2refv8wz*****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The severity level of the diagnostic report. Valid values:</p>
         * <ul>
         * <li>Unknown: The diagnostic did not start, failed to run, or unexpectedly exited without a diagnosis.</li>
         * <li>Normal: No exceptions were detected.</li>
         * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
         * <li>Warn: Diagnostic information was recorded and may indicate exceptions.</li>
         * <li>Critical: Critical exceptions were detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The beginning of the time range during which data was queried. The value is the StartTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDiagnosticReportsResponseBodyReportsReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReportsReport self = new DescribeDiagnosticReportsResponseBodyReportsReport();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setIssues(DescribeDiagnosticReportsResponseBodyReportsReportIssues issues) {
            this.issues = issues;
            return this;
        }
        public DescribeDiagnosticReportsResponseBodyReportsReportIssues getIssues() {
            return this.issues;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setMetricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }
        public String getMetricSetId() {
            return this.metricSetId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosticReportsResponseBodyReportsReport setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDiagnosticReportsResponseBodyReports extends TeaModel {
        @NameInMap("Report")
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsReport> report;

        public static DescribeDiagnosticReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReports self = new DescribeDiagnosticReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReports setReport(java.util.List<DescribeDiagnosticReportsResponseBodyReportsReport> report) {
            this.report = report;
            return this;
        }
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsReport> getReport() {
            return this.report;
        }

    }

}
