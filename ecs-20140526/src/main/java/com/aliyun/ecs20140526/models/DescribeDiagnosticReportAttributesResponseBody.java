// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportAttributesResponseBody extends TeaModel {
    /**
     * <p>The extended attributes of the diagnostic report.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OfflineDiagReportStatus&quot;:&quot;CONFIRMED&quot;}</p>
     */
    @NameInMap("Attributes")
    public String attributes;

    /**
     * <p>The time when the diagnostic report was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T12:00:00Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The end of the diagnostic time range. This value corresponds to the <code>EndTime</code> parameter you provided when calling the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T14:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the diagnosis was complete.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T14:00:00Z</p>
     */
    @NameInMap("FinishedTime")
    public String finishedTime;

    /**
     * <p>The diagnostic results for the metrics.</p>
     */
    @NameInMap("MetricResults")
    public DescribeDiagnosticReportAttributesResponseBodyMetricResults metricResults;

    /**
     * <p>The metric set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dms-bp17p0qwtr72zmu*****</p>
     */
    @NameInMap("MetricSetId")
    public String metricSetId;

    /**
     * <p>The unique ID of the diagnostic report.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Only <code>instance</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The overall severity level of the diagnostic report. This is the highest severity level among all metrics in the report. Valid values are listed below, from lowest to highest severity:</p>
     * <ul>
     * <li><p>Unknown: The initial state. The diagnosis has not started or exited unexpectedly, so the result is inconclusive.</p>
     * </li>
     * <li><p>Normal: The resource is healthy, and no issues were found.</p>
     * </li>
     * <li><p>Info: Informational messages were found that may be relevant to an issue.</p>
     * </li>
     * <li><p>Warn: Warnings were found that may lead to an issue.</p>
     * </li>
     * <li><p>Critical: Critical issues were found.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The start of the diagnostic time range. This value corresponds to the <code>StartTime</code> parameter you provided when calling the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the diagnostic report. Possible values:</p>
     * <ul>
     * <li><p>InProgress: The diagnosis is in progress.</p>
     * </li>
     * <li><p>Finished: The diagnosis is complete.</p>
     * </li>
     * <li><p>Failed: The diagnosis failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
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
        @NameInMap("Additional")
        public String additional;

        @NameInMap("IssueId")
        public String issueId;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("RepairStatus")
        public String repairStatus;

        @NameInMap("Repairable")
        public Boolean repairable;

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

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setRepairStatus(String repairStatus) {
            this.repairStatus = repairStatus;
            return this;
        }
        public String getRepairStatus() {
            return this.repairStatus;
        }

        public DescribeDiagnosticReportAttributesResponseBodyMetricResultsMetricResultIssuesIssue setRepairable(Boolean repairable) {
            this.repairable = repairable;
            return this;
        }
        public Boolean getRepairable() {
            return this.repairable;
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
