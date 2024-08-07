// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If this parameter is left empty, the default value is 10.</li>
     * <li>If this parameter is set to a value greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the <code>NextToken</code> value returned in the last call to the DescribeDiagnosticReports operation. Leave this parameter empty the first time you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the diagnostic report. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
     * <ul>
     * <li>Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.</li>
     * <li>Normal: No exceptions are detected.</li>
     * <li>Info: Diagnostic information is recorded and may be related to exceptions.</li>
     * <li>Warn: Diagnostic information is recorded and may indicate exceptions.</li>
     * <li>Critical: Critical exceptions are detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The state of the diagnostic report. Valid values:</p>
     * <ul>
     * <li>InProgress: The diagnostic is in progress.</li>
     * <li>Failed: The diagnostic failed.</li>
     * <li>Finished: The diagnostic is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
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
