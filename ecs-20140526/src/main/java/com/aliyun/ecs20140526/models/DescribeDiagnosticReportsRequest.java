// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If this parameter is left empty, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 100, the default value is 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticReports operation. Leave this parameter empty the first time you call this operation.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the diagnostic report. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of diagnostic reports. You can specify up to 100 report IDs.</p>
     */
    @NameInMap("ReportIds")
    public java.util.List<String> reportIds;

    /**
     * <p>The IDs of resources. You can specify up to 100 resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The severity level of the diagnostic report. Valid values:</p>
     * <br>
     * <p>* Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.</p>
     * <p>* Normal: No exceptions are detected.</p>
     * <p>* Info: Diagnostic information is recorded and may be related to exceptions.</p>
     * <p>* Warn: Diagnostic information is recorded and may indicate exceptions.</p>
     * <p>* Critical: Critical exceptions are detected.</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The state of the diagnostic report. Valid values:</p>
     * <br>
     * <p>*   InProgress: The diagnostic is in progress.</p>
     * <p>*   Failed: The diagnostic failed.</p>
     * <p>*   Finished: The diagnostic is complete.</p>
     */
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
