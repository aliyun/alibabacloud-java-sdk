// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoRequest extends TeaModel {
    /**
     * <p>The billing method of the cloud computer.</p>
     * <br>
     * <p>Default value: Postpaid. Valid values:</p>
     * <br>
     * <p>*   Postpaid: pay-as-you-go</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the cloud computers. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud computer.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The status of the cloud computers.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Stopped</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Starting</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Rebuilding</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Running</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Stopping</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Expired</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Deleted</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Pending</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    /**
     * <p>The IDs of the end users of the cloud computer. You can specify 1 to 100 IDs.</p>
     * <br>
     * <p>>  During a specific period of time, only one user can connect to and use the cloud computer.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The time when a subscription cloud computer expires.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The ID of the cloud computer pool to which the cloud computers belong.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language in which the cloud computer is displayed in the console UI. You can export the list of cloud computers in the specified language.</p>
     * <br>
     * <p>Default value: zh-CN. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Simplified Chinese</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   en-GB: British English</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the policy that is attached to the cloud computer.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags that are added to the cloud computer. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud computers by group. This facilitates search and batch operations. For more information, see [Use tags to manage cloud computers](~~203781~~).</p>
     */
    @NameInMap("Tag")
    public java.util.List<ExportDesktopListInfoRequestTag> tag;

    /**
     * <p>The username of the end user who is using the cloud computer.</p>
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
         * <p>The tag key. If you specify the `Tag` parameter, you must also specify the `Key` parameter. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun` and cannot contain only spaces.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:` or `aliyun`.</p>
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
