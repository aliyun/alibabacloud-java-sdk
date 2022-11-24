// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportAttributesResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FinishedTime")
    public String finishedTime;

    @NameInMap("MetricResults")
    public DescribeDiagnosticReportAttributesResponseBodyMetricResults metricResults;

    @NameInMap("MetricSetId")
    public String metricSetId;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeDiagnosticReportAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportAttributesResponseBody self = new DescribeDiagnosticReportAttributesResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Additional")
        public String additional;

        @NameInMap("IssueId")
        public String issueId;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

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
        @NameInMap("Issues")
        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssues issues;

        @NameInMap("MetricCategory")
        public String metricCategory;

        @NameInMap("MetricId")
        public String metricId;

        @NameInMap("Severity")
        public String severity;

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
