// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsRequest extends TeaModel {
    /**
     * <p>The billing method of the cloud computer.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Postpaid (default): pay-as-you-go</li>
     * <li>PrePaid: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the cloud computer pool. If you specify <code>OnlyDesktopGroup</code>, ignore <code>DesktopGroupId</code>. If you leave <code>DesktopId</code> empty, all IDs of the cloud computers in the cloud computer pool are queried.````</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The cloud computer IDs. You can specify the IDs of 1 to 100 cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The cloud computer name.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesktopName</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The cloud computer status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Stopped</li>
     * <li>Starting</li>
     * <li>Rebuilding</li>
     * <li>Running</li>
     * <li>Stopping</li>
     * <li>Expired</li>
     * <li>Deleted</li>
     * <li>Pending</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    /**
     * <p>The list of cloud computer status.</p>
     */
    @NameInMap("DesktopStatusList")
    public java.util.List<String> desktopStatusList;

    /**
     * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of all supported types.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c8g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The directory ID, which is the same as the office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The authorized users of the cloud computer. You can specify the IDs of 1 to 100 users.</p>
     * <blockquote>
     * <p> During a specific period of time, only one user can connect to and use the cloud computer.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The list of authorized users that you want to exclude from the cloud computer. You can specify the IDs of 1 to 100 users.</p>
     * 
     * <strong>example:</strong>
     * <p>andy</p>
     */
    @NameInMap("ExcludedEndUserId")
    public java.util.List<String> excludedEndUserId;

    /**
     * <p>The time when a subscription cloud computer expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-31T15:59:59Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>Specifies whether to query the information about the enterprise resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FillResourceGroup")
    public Boolean fillResourceGroup;

    /**
     * <p>Specifies whether to exclude pooled cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterDesktopGroup")
    public Boolean filterDesktopGroup;

    /**
     * <p>The ID of the elastic GPU pool.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-0bm2iz1v6m6nx****</p>
     */
    @NameInMap("GpuInstanceGroupId")
    public String gpuInstanceGroupId;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-boyczi8enfyc5****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The IDs of the images.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The flag that is used to manage the cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>NoFlag</p>
     */
    @NameInMap("ManagementFlag")
    public String managementFlag;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 100</li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether the shared group is a multi-cloud computer type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: a multi-cloud computer type.</li>
     * <li>false: a single-cloud computer type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiResource")
    public Boolean multiResource;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The office network name.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>Specifies whether to query pooled cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyDesktopGroup")
    public Boolean onlyDesktopGroup;

    /**
     * <p>The operating systems (OSs).</p>
     */
    @NameInMap("OsTypes")
    public java.util.List<String> osTypes;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the cloud computer policy.</p>
     * 
     * <strong>example:</strong>
     * <p>system-all-enabled-policy</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The protocol.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HDX: High-definition Experience (HDX) protocol</li>
     * <li>ASP: in-house Adaptive Streaming Protocol (ASP) (recommended)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the network throttling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <p>Specifies whether to query the image update information about the cloud computer.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4hsvzbbmqdzu3s****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-hb12mclyne09xw***</p>
     */
    @NameInMap("SnapshotPolicyId")
    public String snapshotPolicyId;

    /**
     * <p>The billing method of the cloud computer.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>duration: hourly plan (available for users in the whitelist)</li>
     * <li>postPaid: pay-as-you-go</li>
     * <li>monthPackage: monthly subscription (120-hour or 250-hour computing plan)</li>
     * <li>prePaid: monthly subscription (unlimited-hour computing plan)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>monthPackage</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The tags that you want to add to the cloud computer. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud computers by group. This facilitates search and batch operations. For more information, see <a href="https://help.aliyun.com/document_detail/203781.html">Use tags to manage cloud computers</a>.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDesktopsRequestTag> tag;

    /**
     * <p>The name of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
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

    public DescribeDesktopsRequest setFillResourceGroup(Boolean fillResourceGroup) {
        this.fillResourceGroup = fillResourceGroup;
        return this;
    }
    public Boolean getFillResourceGroup() {
        return this.fillResourceGroup;
    }

    public DescribeDesktopsRequest setFilterDesktopGroup(Boolean filterDesktopGroup) {
        this.filterDesktopGroup = filterDesktopGroup;
        return this;
    }
    public Boolean getFilterDesktopGroup() {
        return this.filterDesktopGroup;
    }

    public DescribeDesktopsRequest setGpuInstanceGroupId(String gpuInstanceGroupId) {
        this.gpuInstanceGroupId = gpuInstanceGroupId;
        return this;
    }
    public String getGpuInstanceGroupId() {
        return this.gpuInstanceGroupId;
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

    public DescribeDesktopsRequest setMultiResource(Boolean multiResource) {
        this.multiResource = multiResource;
        return this;
    }
    public Boolean getMultiResource() {
        return this.multiResource;
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

    public DescribeDesktopsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDesktopsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeDesktopsRequest setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
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

    public DescribeDesktopsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDesktopsRequest setSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    public DescribeDesktopsRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
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
         * <p>The tag key. If you specify the <code>Tag</code> parameter, you must also specify the <code>Key</code> parameter. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code> and contain only spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
