// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoRequest extends TeaModel {
    // The billing method of the cloud desktop. Valid values:
    // 
    // *   PostPaid: pay-as-you-go
    // *   PrePaid: subscription
    // 
    // Default value: PostPaid.
    @NameInMap("ChargeType")
    public String chargeType;

    // The IDs of the cloud desktops. You can specify 1 to 100 cloud desktop IDs.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The name of the cloud desktop.
    @NameInMap("DesktopName")
    public String desktopName;

    // The status of the cloud desktop. Valid values:
    // 
    // *   Pending
    // *   Starting
    // *   Running
    // *   Stopping
    // *   Rebuilding
    // *   Stopped
    // *   Expired
    // *   Deleted
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    // The IDs of the users which the cloud desktop is assigned. You can specify 1 to 100 user IDs.
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    // The time when the subscription cloud desktop expires.
    @NameInMap("ExpiredTime")
    public String expiredTime;

    // The ID of the group to which the cloud desktop belongs.
    @NameInMap("GroupId")
    public String groupId;

    // The language that you want to use.
    @NameInMap("LangType")
    public String langType;

    // The maximum number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the policy that is associated with the cloud desktop.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<ExportDesktopListInfoRequestTag> tag;

    // The username of the current user of the cloud desktop.
    @NameInMap("UserName")
    public String userName;

    public static ExportDesktopListInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopListInfoRequest self = new ExportDesktopListInfoRequest();
        return TeaModel.build(map, self);
    }

    public ExportDesktopListInfoRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ExportDesktopListInfoRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ExportDesktopListInfoRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public ExportDesktopListInfoRequest setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    public ExportDesktopListInfoRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ExportDesktopListInfoRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ExportDesktopListInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExportDesktopListInfoRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public ExportDesktopListInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExportDesktopListInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportDesktopListInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExportDesktopListInfoRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ExportDesktopListInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportDesktopListInfoRequest setTag(java.util.List<ExportDesktopListInfoRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ExportDesktopListInfoRequestTag> getTag() {
        return this.tag;
    }

    public ExportDesktopListInfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class ExportDesktopListInfoRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExportDesktopListInfoRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ExportDesktopListInfoRequestTag self = new ExportDesktopListInfoRequestTag();
            return TeaModel.build(map, self);
        }

        public ExportDesktopListInfoRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExportDesktopListInfoRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
