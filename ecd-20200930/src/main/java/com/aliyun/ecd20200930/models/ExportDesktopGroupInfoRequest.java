// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoRequest extends TeaModel {
    // The billing method of cloud desktops in a desktop group.
    @NameInMap("ChargeType")
    public String chargeType;

    // The IDs of the desktop groups. You can specify 1 to 100 desktop groups.
    @NameInMap("DesktopGroupId")
    public java.util.List<String> desktopGroupId;

    // The name of the desktop group.
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    // The IDs of the users authorized to use the desktop group. You can specify 1 to 100 users.
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    // The time when the subscription cloud desktop expires.
    @NameInMap("ExpiredTime")
    public String expiredTime;

    // The language that you want to use.
    @NameInMap("LangType")
    public String langType;

    // The number of entries to return on each page.
    // 
    // *   Maximum value: 100.
    // *   Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the workspace to which the desktop group belongs.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of policy with which the desktop group is associated.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    // The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    public static ExportDesktopGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopGroupInfoRequest self = new ExportDesktopGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public ExportDesktopGroupInfoRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ExportDesktopGroupInfoRequest setDesktopGroupId(java.util.List<String> desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public java.util.List<String> getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ExportDesktopGroupInfoRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public ExportDesktopGroupInfoRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ExportDesktopGroupInfoRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ExportDesktopGroupInfoRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public ExportDesktopGroupInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExportDesktopGroupInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportDesktopGroupInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExportDesktopGroupInfoRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ExportDesktopGroupInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
