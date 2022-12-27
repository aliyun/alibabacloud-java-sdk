// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportAttributesResponseBody extends TeaModel {
    @NameInMap("Attributes")
    public String attributes;

    // The time when the diagnostic report was created.
    @NameInMap("CreationTime")
    public String creationTime;

    // The end of the reporting period of the diagnostic report. The value is the EndTime value that was passed in when you called the [CreateDiagnosticReport](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/creatediagnosticreport) operation to create the diagnostic report.
    @NameInMap("EndTime")
    public String endTime;

    // The time when the diagnostic report was complete.
    @NameInMap("FinishedTime")
    public String finishedTime;

    // The results of metrics.
    @NameInMap("MetricResults")
    public DescribeDiagnosticReportAttributesResponseBodyMetricResults metricResults;

    // The ID of the diagnostic metric set.
    @NameInMap("MetricSetId")
    public String metricSetId;

    // The ID of the diagnostic report, which is the unique identifier of the report.
    @NameInMap("ReportId")
    public String reportId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the resource that was diagnosed.
    @NameInMap("ResourceId")
    public String resourceId;

    // The type of the resource. The ResourceType parameter can only be set to instance, which indicates that only instances are supported.
    @NameInMap("ResourceType")
    public String resourceType;

    // The severity level of the diagnostic report. The value of this parameter is determined by the most severe level of all diagnostic metrics. Valid values: 
    // 
    // - Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
    // - Normal: No exceptions were detected.
    // - Info: Diagnostic information was recorded and may be related to exceptions.
    // - Warn: Diagnostic information was recorded and may indicate potential exceptions.
    // - Critical: Critical exceptions were detected.
    @NameInMap("Severity")
    public String severity;

    // The beginning of the reporting period of the diagnostic report. The value is the StartTime value that was passed in when you called the [CreateDiagnosticReport](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/creatediagnosticreport) operation to create the diagnostic report.
    @NameInMap("StartTime")
    public String startTime;

    // The state of the diagnostic report. Valid values:
    // 
    // - InProgress: The diagnostic is in progress.
    // - Finished: The diagnostic is complete.
    // - Failed: The diagnostic failed.
    @NameInMap("Status")
    public String status;

    public static DescribeDiagnosticReportAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportAttributesResponseBody self = new DescribeDiagnosticReportAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportAttributesResponseBody setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public DescribeDiagnosticReportAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDiagnosticReportAttributesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosticReportAttributesResponseBody setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public DescribeDiagnosticReportAttributesResponseBody setMetricResults(DescribeDiagnosticReportAttributesResponseBodyMetricResults metricResults) {
        this.metricResults = metricResults;
        return this;
    }
    public DescribeDiagnosticReportAttributesResponseBodyMetricResults getMetricResults() {
        return this.metricResults;
    }

    public DescribeDiagnosticReportAttributesResponseBody setMetricSetId(String metricSetId) {
        this.metricSetId = metricSetId;
        return this;
    }
    public String getMetricSetId() {
        return this.metricSetId;
    }

    public DescribeDiagnosticReportAttributesResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public DescribeDiagnosticReportAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosticReportAttributesResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeDiagnosticReportAttributesResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDiagnosticReportAttributesResponseBody setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribeDiagnosticReportAttributesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnosticReportAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue extends TeaModel {
        // Additional data carried by the diagnosis of the problem to help understand more information about the problem. The data format is JSON string.
        @NameInMap("Additional")
        public String additional;

        // The ID of the diagnosed issue, which is the unique identifier of the issue.
        @NameInMap("IssueId")
        public String issueId;

        // The time when the problem occurred.
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        // Valid values:
        // 
        // - Info: Diagnostic information was recorded and may be related to exceptions.
        // - Warn: Diagnostic information was recorded and may indicate potential exceptions.
        // - Critical: Critical exceptions were detected.
        @NameInMap("Severity")
        public String severity;

        public static DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue self = new DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setAdditional(String additional) {
            this.additional = additional;
            return this;
        }
        public String getAdditional() {
            return this.additional;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues extends TeaModel {
        @NameInMap("Issue")
        public java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue> issue;

        public static DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues self = new DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues setIssue(java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue> issue) {
            this.issue = issue;
            return this;
        }
        public java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue> getIssue() {
            return this.issue;
        }

    }

    public static class DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult extends TeaModel {
        // The list of diagnostic issues.
        @NameInMap("Issues")
        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues issues;

        // The category of the diagnostic metric.
        @NameInMap("MetricCategory")
        public String metricCategory;

        // The ID of the diagnostic metric.
        @NameInMap("MetricId")
        public String metricId;

        // The severity level of the diagnostic metric. Valid values:
        // 
        // - Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
        // - Normal: No exceptions were detected.
        // - Info: Diagnostic information was recorded and may be related to exceptions.
        // - NotSupport: The version of the guest operating system does support diagnosing the metric.
        // - Warn: Diagnostic information was recorded and may indicate potential exceptions.
        // - Critical: Critical exceptions were detected.
        @NameInMap("Severity")
        public String severity;

        // The state of the diagnostic metric. Valid values:
        // 
        // - InProgress: The diagnostic is in progress.
        // - Finished: The diagnostic is complete.
        // - Failed: The diagnostic failed.
        @NameInMap("Status")
        public String status;

        public static DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult self = new DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult setIssues(DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues issues) {
            this.issues = issues;
            return this;
        }
        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues getIssues() {
            return this.issues;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult setMetricCategory(String metricCategory) {
            this.metricCategory = metricCategory;
            return this;
        }
        public String getMetricCategory() {
            return this.metricCategory;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDiagnosticReportAttributesResponseBodyMetricResults extends TeaModel {
        @NameInMap("MetricResult")
        public java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult> metricResult;

        public static DescribeDiagnosticReportAttributesResponseBodyMetricResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportAttributesResponseBodyMetricResults self = new DescribeDiagnosticReportAttributesResponseBodyMetricResults();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResults setMetricResult(java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult> metricResult) {
            this.metricResult = metricResult;
            return this;
        }
        public java.util.List<DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResult> getMetricResult() {
            return this.metricResult;
        }

    }

}
