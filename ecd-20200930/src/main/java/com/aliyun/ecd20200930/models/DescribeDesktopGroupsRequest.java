// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computer templates.</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The ID of the cloud computer pool.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The name of the cloud computer pool to query. Fuzzy search is supported.</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The authorized user IDs of cloud computer pools.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The authorized users that you want to exclude.</p>
     */
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

    /**
     * <p>The IDs of the images.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network to which the cloud computer pool belongs.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the cloud computer pool.</p>
     * <br>
     * <p>>  This parameter is not publicly available.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0: individual (single session)</p>
     * <p>*   1: shared (multiple sessions)</p>
     */
    @NameInMap("OwnType")
    public Long ownType;

    /**
     * <p>The subscription duration of the cloud computer pool. The unit is specified by the `PeriodUnit` parameter.</p>
     * <br>
     * <p>*   Valid values if the `PeriodUnit` parameter is set to `Month`:</p>
     * <br>
     * <p>    *   1</p>
     * <p>    *   2</p>
     * <p>    *   3</p>
     * <p>    *   6</p>
     * <br>
     * <p>*   Valid values if the `PeriodUnit` parameter is set to `Year`:</p>
     * <br>
     * <p>    *   1</p>
     * <p>    *   2</p>
     * <p>    *   3</p>
     * <p>    *   4</p>
     * <p>    *   5</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy that you want to associate with the cloud computer pool.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The protocol type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   High-definition Experience (HDX)</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Adaptive Streaming Protocol (ASP)</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The payment status of the cloud computer pool.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0: unpaid</p>
     * <p>*   1: paid</p>
     * <p>*   2: overdue or expired</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeDesktopGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsRequest self = new DescribeDesktopGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupsRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    public DescribeDesktopGroupsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeDesktopGroupsRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public DescribeDesktopGroupsRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeDesktopGroupsRequest setExcludedEndUserIds(java.util.List<String> excludedEndUserIds) {
        this.excludedEndUserIds = excludedEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludedEndUserIds() {
        return this.excludedEndUserIds;
    }

    public DescribeDesktopGroupsRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public DescribeDesktopGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopGroupsRequest setOwnType(Long ownType) {
        this.ownType = ownType;
        return this;
    }
    public Long getOwnType() {
        return this.ownType;
    }

    public DescribeDesktopGroupsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeDesktopGroupsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeDesktopGroupsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeDesktopGroupsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDesktopGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopGroupsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
