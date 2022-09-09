// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Reports")
    public java.util.List<DescribeDiagnosticReportsResponseBodyReports> reports;

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

    public DescribeDiagnosticReportsResponseBody setReports(java.util.List<DescribeDiagnosticReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<DescribeDiagnosticReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public DescribeDiagnosticReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosticReportsResponseBodyReportsIssues extends TeaModel {
        @NameInMap("IssueId")
        public String issueId;

        @NameInMap("MetricCategory")
        public String metricCategory;

        @NameInMap("MetricId")
        public String metricId;

        @NameInMap("Severity")
        public String severity;

        public static DescribeDiagnosticReportsResponseBodyReportsIssues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReportsIssues self = new DescribeDiagnosticReportsResponseBodyReportsIssues();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReportsIssues setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsIssues setMetricCategory(String metricCategory) {
            this.metricCategory = metricCategory;
            return this;
        }
        public String getMetricCategory() {
            return this.metricCategory;
        }

        public DescribeDiagnosticReportsResponseBodyReportsIssues setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public DescribeDiagnosticReportsResponseBodyReportsIssues setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeDiagnosticReportsResponseBodyReports extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Issues")
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsIssues> issues;

        @NameInMap("MetricSetId")
        public String metricSetId;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeDiagnosticReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportsResponseBodyReports self = new DescribeDiagnosticReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportsResponseBodyReports setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDiagnosticReportsResponseBodyReports setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDiagnosticReportsResponseBodyReports setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeDiagnosticReportsResponseBodyReports setIssues(java.util.List<DescribeDiagnosticReportsResponseBodyReportsIssues> issues) {
            this.issues = issues;
            return this;
        }
        public java.util.List<DescribeDiagnosticReportsResponseBodyReportsIssues> getIssues() {
            return this.issues;
        }

        public DescribeDiagnosticReportsResponseBodyReports setMetricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }
        public String getMetricSetId() {
            return this.metricSetId;
        }

        public DescribeDiagnosticReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnosticReportsResponseBodyReports setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiagnosticReportsResponseBodyReports setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiagnosticReportsResponseBodyReports setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeDiagnosticReportsResponseBodyReports setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosticReportsResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
