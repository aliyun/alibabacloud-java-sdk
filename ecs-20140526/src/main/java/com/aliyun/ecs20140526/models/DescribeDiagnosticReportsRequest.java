// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsRequest extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If this parameter is not specified, the default value is 10.</li>
     * <li>If the specified value is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the <code>NextToken</code> value returned in the previous call. You do not need to set this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of diagnostic report IDs.</p>
     */
    @NameInMap("ReportIds")
    public java.util.List<String> reportIds;

    /**
     * <p>The list of resource IDs. A maximum of 100 IDs are supported.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The severity level. Valid values:</p>
     * <ul>
     * <li>Unknown: The initial state, which indicates that the diagnosis has not started or the diagnosis process exited unexpectedly. No diagnostic conclusion is available.</li>
     * <li>Normal: The diagnosis is normal. No issues are found.</li>
     * <li>Info: Related information is available and may be associated with exceptions.</li>
     * <li>Warn: Related information is available and may cause exceptions.</li>
     * <li>Critical: Critical exceptions exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The report status. Valid values:</p>
     * <ul>
     * <li>InProgress: The diagnosis is in progress.</li>
     * <li>Failed: The diagnosis failed.</li>
     * <li>Finished: The diagnosis is complete.</li>
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
