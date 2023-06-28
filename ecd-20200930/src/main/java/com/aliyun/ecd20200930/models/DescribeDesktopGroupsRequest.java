// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsRequest extends TeaModel {
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The desktop group ID.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The name of the desktop group that you want to query. Fuzzy search is supported.</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The authorized users.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The authorized users that you want to exclude.</p>
     */
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

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
     * <p>The workspace ID of the desktop group that you want to query.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The desktop group type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    personal desktop group</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   1</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    shared desktop group (multi-session)</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("OwnType")
    public Long ownType;

    /**
     * <p>The validity period of the desktop group. The unit is specified by the PeriodUnit parameter.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the duration.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Year</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Day</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy with which the desktop group is associated.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   ASP</p>
     * <p>*   HDX</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The payment status of the desktop group.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    unpaid</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   1</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    paid</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   2</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    overdue or expired</p>
     * <br>
     * <p>    <!-- --></p>
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
