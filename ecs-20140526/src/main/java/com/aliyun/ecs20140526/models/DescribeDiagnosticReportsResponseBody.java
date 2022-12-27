// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    // The query token returned in this call.
    @NameInMap("NextToken")
    public String nextToken;

    // The list of reports.
    @NameInMap("Reports")
    public DescribeDiagnosticReportsResponseBodyReports reports;

    // The ID of the request.
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
        // The unique ID of the diagnosed issue.
        @NameInMap("IssueId")
        public String issueId;

        // The category of the diagnostic metric.
        @NameInMap("MetricCategory")
        public String metricCategory;

        // The ID of the diagnostic metric.
        @NameInMap("MetricId")
        public String metricId;

        // The severity level of the diagnostic metric. Valid values:
        // 
        // *   Info: Diagnostic information was recorded and may be related to exceptions.
        // *   Warn: Diagnostic information was recorded and may indicate exceptions.
        // *   Critical: Critical exceptions were detected.
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
        // The time when the diagnostic report was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The end of the reporting period of the diagnostic report. The value is the EndTime value that was passed in when you called the [CreateDiagnosticReport](~~442490~~) operation to create the diagnostic report.
        @NameInMap("EndTime")
        public String endTime;

        // The time when the diagnostic was complete.
        @NameInMap("FinishedTime")
        public String finishedTime;

        // The list of issues.
        @NameInMap("Issues")
        public DescribeDiagnosticReportsResponseBodyReportsReportIssues issues;

        // The ID of the diagnostic metric set.
        @NameInMap("MetricSetId")
        public String metricSetId;

        // The ID of the diagnostic report.
        @NameInMap("ReportId")
        public String reportId;

        // The ID of the resource.
        @NameInMap("ResourceId")
        public String resourceId;

        // The type of the resource.
        @NameInMap("ResourceType")
        public String resourceType;

        // The severity level of the diagnostic report. Valid values:
        // 
        // *   Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
        // *   Normal: No exceptions were detected.
        // *   Info: Diagnostic information was recorded and may be related to exceptions.
        // *   Warn: Diagnostic information was recorded and may indicate exceptions.
        // *   Critical: Critical exceptions were detected.
        @NameInMap("Severity")
        public String severity;

        // The beginning of the reporting period of the diagnostic report. The value is the StartTime value that was passed in when you called the [CreateDiagnosticReport](~~442490~~) operation to create the diagnostic report.
        @NameInMap("StartTime")
        public String startTime;

        // The state of the diagnostic report.
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
