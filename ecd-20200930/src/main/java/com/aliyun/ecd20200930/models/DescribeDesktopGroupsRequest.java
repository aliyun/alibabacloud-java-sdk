// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsRequest extends TeaModel {
    // The ID of the desktop group.
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    // The name of the desktop group that you want to query. Fuzzy search is supported.
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    // The authorized user.
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    // The authorized user that you want to exclude.
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

    // The number of entries to return on each page. Maximum value: 100 Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the workspace to which the desktop group belongs.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The type of the desktop group.
    @NameInMap("OwnType")
    public Long ownType;

    // The duration during which the desktop group is valid. The unit is specified by the PeriodUnit parameter.
    @NameInMap("Period")
    public Integer period;

    // The unit of the duration.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the policy with which the desktop group is associated.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The payment status of the desktop group.
    @NameInMap("Status")
    public Integer status;

    public static DescribeDesktopGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsRequest self = new DescribeDesktopGroupsRequest();
        return TeaModel.build(map, self);
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
