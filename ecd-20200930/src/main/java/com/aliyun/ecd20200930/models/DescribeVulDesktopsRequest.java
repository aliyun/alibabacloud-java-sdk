// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDesktopsRequest extends TeaModel {
    /**
     * <p>The CVE ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2026-43284</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>The list of cloud computer IDs.</p>
     */
    @NameInMap("DesktopIdList")
    public java.util.List<String> desktopIdList;

    /**
     * <p>Specifies whether to include patch update results.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeFixResult")
    public Boolean includeFixResult;

    /**
     * <p>The language type of the returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>ch</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to include only cloud computers on which fix tasks were executed in the current month.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyCurrentMonthFixAttempted")
    public Boolean onlyCurrentMonthFixAttempted;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The patch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>KB5082063</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-f3s3dgt8dtb0vlqc8</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region ID used to filter cloud computer information for a specific region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The list of vulnerability status details.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The security level of the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><strong>low</strong>: Low risk.</li>
     * <li><strong>medium</strong>: Medium risk.</li>
     * <li><strong>critical</strong>: High risk.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, vulnerabilities of all security levels are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("VulLevel")
    public String vulLevel;

    public static DescribeVulDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDesktopsRequest self = new DescribeVulDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulDesktopsRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeVulDesktopsRequest setDesktopIdList(java.util.List<String> desktopIdList) {
        this.desktopIdList = desktopIdList;
        return this;
    }
    public java.util.List<String> getDesktopIdList() {
        return this.desktopIdList;
    }

    public DescribeVulDesktopsRequest setIncludeFixResult(Boolean includeFixResult) {
        this.includeFixResult = includeFixResult;
        return this;
    }
    public Boolean getIncludeFixResult() {
        return this.includeFixResult;
    }

    public DescribeVulDesktopsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeVulDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVulDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVulDesktopsRequest setOnlyCurrentMonthFixAttempted(Boolean onlyCurrentMonthFixAttempted) {
        this.onlyCurrentMonthFixAttempted = onlyCurrentMonthFixAttempted;
        return this;
    }
    public Boolean getOnlyCurrentMonthFixAttempted() {
        return this.onlyCurrentMonthFixAttempted;
    }

    public DescribeVulDesktopsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVulDesktopsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulDesktopsRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public DescribeVulDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVulDesktopsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVulDesktopsRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeVulDesktopsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public DescribeVulDesktopsRequest setVulLevel(String vulLevel) {
        this.vulLevel = vulLevel;
        return this;
    }
    public String getVulLevel() {
        return this.vulLevel;
    }

}
