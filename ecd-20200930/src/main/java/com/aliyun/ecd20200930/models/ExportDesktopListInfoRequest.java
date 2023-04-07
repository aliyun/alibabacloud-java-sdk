// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoRequest extends TeaModel {
    /**
     * <p>The billing method of the cloud desktop. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of cloud desktop N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The status of the cloud desktop. Valid values:</p>
     * <br>
     * <p>*   Pending: The cloud desktop is pending.</p>
     * <p>*   Starting: The cloud desktop is being started.</p>
     * <p>*   Running: The cloud desktop is running.</p>
     * <p>*   Stopping: The cloud desktop is being stopped.</p>
     * <p>*   Rebuilding: The cloud desktop is being rebuilt.</p>
     * <p>*   Stopped: The cloud desktop is stopped.</p>
     * <p>*   Expired: The cloud desktop expired.</p>
     * <p>*   Deleted: The cloud desktop is deleted.</p>
     */
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    /**
     * <p>The ID of end user N that is assigned the cloud desktop. Valid values of N: 1 to 100.</p>
     * <br>
     * <p>> Only one end user can use the cloud desktop at a time.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The time when the subscription cloud desktop expires.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language in which the cloud desktop is displayed in the console UI. You can export the list of cloud desktops in the specified language. Valid values:</p>
     * <br>
     * <p>*   `zh-CN`: Simplified Chinese</p>
     * <p>*   `en-GB`: English (United Kingdom)</p>
     * <br>
     * <p>Default value: `zh-CN`.</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the policy that is associated with the cloud desktop.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud desktops by group for easy searching and batch operations. For more information, see [Use tags to manage cloud desktops](~~203781~~).</p>
     */
    @NameInMap("Tag")
    public java.util.List<ExportDesktopListInfoRequestTag> tag;

    /**
     * <p>The username of the end user that is using the cloud desktop.</p>
     */
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
        /**
         * <p>The key of the tag. If you specify the `Tag` parameter, you must also specify the `Key` parameter. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`. You cannot specify an empty string as a tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.</p>
         */
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
