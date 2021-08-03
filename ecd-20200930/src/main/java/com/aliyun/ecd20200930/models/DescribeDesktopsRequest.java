// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("DesktopStatus")
    public String desktopStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("DesktopName")
    public String desktopName;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    public static DescribeDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsRequest self = new DescribeDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDesktopsRequest setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    public DescribeDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeDesktopsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeDesktopsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDesktopsRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeDesktopsRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

}
