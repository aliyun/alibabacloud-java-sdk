// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsRequest extends TeaModel {
    /**
     * <p>The billing method of the cloud desktop.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the desktop group. If you specify the `DesktopId` parameter, ignore the `DesktopGroupId` parameter. If you do not specify the `DesktopId` parameter, specify the `DesktopGroupId` parameter in the call to request all IDs of the cloud desktops in the specified desktop group.``</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The IDs of the cloud desktops. You can specify 1 to 100 IDs of cloud desktops.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The state of the cloud desktop.</p>
     */
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    @NameInMap("DesktopStatusList")
    public java.util.List<String> desktopStatusList;

    /**
     * <p>The new desktop type. You can call the [DescribeDesktopTypes](~~188882~~) operation to query the IDs of supported desktop types.</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The ID of the directory. The ID is the same as the workspace ID.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The IDs of the users that are assigned the cloud desktop. You can specify IDs of 1 to 100 users.</p>
     * <br>
     * <p>> Only one user can use the cloud desktop at a time.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The IDs of the users that are excluded from the users that are assigned the cloud desktop. You can specify IDs of 1 to 100 users.</p>
     */
    @NameInMap("ExcludedEndUserId")
    public java.util.List<String> excludedEndUserId;

    /**
     * <p>The time when the subscription cloud desktop expires.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>Specifies whether to filter cloud desktops in the desktop group.</p>
     */
    @NameInMap("FilterDesktopGroup")
    public Boolean filterDesktopGroup;

    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>镜像ID列表。</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The flag that is used for management.</p>
     */
    @NameInMap("ManagementFlag")
    public String managementFlag;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100</p>
     * <p>*   Default value: 10</p>
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
     * <p>The name of the workspace.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>Specifies whether to query cloud desktops in the desktop group.</p>
     */
    @NameInMap("OnlyDesktopGroup")
    public Boolean onlyDesktopGroup;

    /**
     * <p>The types of the OSs.</p>
     */
    @NameInMap("OsTypes")
    public java.util.List<String> osTypes;

    /**
     * <p>The ID of the policy.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The type of the protocol.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>Specifies whether to query the information about image version of the cloud desktop.</p>
     */
    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("SnapshotPolicyId")
    public String snapshotPolicyId;

    /**
     * <p>The tags that you want to add. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud desktops by group for easy searching and batch operations. For more information, see [Use tags to manage cloud desktops](~~203781~~).</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDesktopsRequestTag> tag;

    /**
     * <p>The name of the user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DescribeDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsRequest self = new DescribeDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDesktopsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeDesktopsRequest setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    public DescribeDesktopsRequest setDesktopStatusList(java.util.List<String> desktopStatusList) {
        this.desktopStatusList = desktopStatusList;
        return this;
    }
    public java.util.List<String> getDesktopStatusList() {
        return this.desktopStatusList;
    }

    public DescribeDesktopsRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public DescribeDesktopsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDesktopsRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopsRequest setExcludedEndUserId(java.util.List<String> excludedEndUserId) {
        this.excludedEndUserId = excludedEndUserId;
        return this;
    }
    public java.util.List<String> getExcludedEndUserId() {
        return this.excludedEndUserId;
    }

    public DescribeDesktopsRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDesktopsRequest setFilterDesktopGroup(Boolean filterDesktopGroup) {
        this.filterDesktopGroup = filterDesktopGroup;
        return this;
    }
    public Boolean getFilterDesktopGroup() {
        return this.filterDesktopGroup;
    }

    public DescribeDesktopsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDesktopsRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public DescribeDesktopsRequest setManagementFlag(String managementFlag) {
        this.managementFlag = managementFlag;
        return this;
    }
    public String getManagementFlag() {
        return this.managementFlag;
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

    public DescribeDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopsRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public DescribeDesktopsRequest setOnlyDesktopGroup(Boolean onlyDesktopGroup) {
        this.onlyDesktopGroup = onlyDesktopGroup;
        return this;
    }
    public Boolean getOnlyDesktopGroup() {
        return this.onlyDesktopGroup;
    }

    public DescribeDesktopsRequest setOsTypes(java.util.List<String> osTypes) {
        this.osTypes = osTypes;
        return this;
    }
    public java.util.List<String> getOsTypes() {
        return this.osTypes;
    }

    public DescribeDesktopsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeDesktopsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDesktopsRequest setQueryFotaUpdate(Boolean queryFotaUpdate) {
        this.queryFotaUpdate = queryFotaUpdate;
        return this;
    }
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    public DescribeDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopsRequest setSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    public DescribeDesktopsRequest setTag(java.util.List<DescribeDesktopsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDesktopsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDesktopsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class DescribeDesktopsRequestTag extends TeaModel {
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

        public static DescribeDesktopsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsRequestTag self = new DescribeDesktopsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
