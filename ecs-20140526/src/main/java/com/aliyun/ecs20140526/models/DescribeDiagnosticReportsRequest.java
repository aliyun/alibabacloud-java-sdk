// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsRequest extends TeaModel {
    // The maximum number of entries to return on each page. Maximum value: 100.
    // 
    // Default value:
    // 
    // *   If this parameter is left empty, the default value is 10.
    // *   If this parameter is set to a value greater than 100, the default value is 100.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticReports operation. Leave this parameter empty the first time you call this operation.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the diagnostic report. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The IDs of diagnostic reports. You can specify up to 100 report IDs.
    @NameInMap("ReportIds")
    public java.util.List<String> reportIds;

    // The IDs of resources. You can specify up to 100 resource IDs.
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    // The severity level of the diagnostic report. Valid values:
    // 
    // * Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
    // * Normal: No exceptions are detected.
    // * Info: Diagnostic information is recorded and may be related to exceptions.
    // * Warn: Diagnostic information is recorded and may indicate exceptions.
    // * Critical: Critical exceptions are detected.
    @NameInMap("Severity")
    public String severity;

    // The state of the diagnostic report. Valid values:
    // 
    // *   InProgress: The diagnostic is in progress.
    // *   Failed: The diagnostic failed.
    // *   Finished: The diagnostic is complete.
    @NameInMap("Status")
    public String status;

    public static DescribeDiagnosticReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportsRequest self = new DescribeDiagnosticReportsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiagnosticReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticReportsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosticReportsRequest setReportIds(java.util.List<String> reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public java.util.List<String> getReportIds() {
        return this.reportIds;
    }

    public DescribeDiagnosticReportsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeDiagnosticReportsRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribeDiagnosticReportsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
