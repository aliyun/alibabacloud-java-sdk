// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsRequest extends TeaModel {
    /**
     * <p>The region ID. Call <a href="t2167755.xdita#"></a>to list regions that support Elastic Desktop Service (EDS).</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The expiration time for subscription desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The list of authorized users for the desktop. You can specify 1 to 100 users.</p>
     * <blockquote>
     * <p>Only one user can connect to and use the desktop at a time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The directory ID. This is the same as the office site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoComputer01</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The number of entries to return on each page in a paged query.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DesktopStatus")
    public String desktopStatus;

    /**
     * <p>The elastic GPU pool ID.</p>
     */
    @NameInMap("DesktopStatusList")
    public java.util.List<String> desktopStatusList;

    /**
     * <p>The list of image IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c8g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The office site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The list of authorized users to exclude from the desktop. You can specify 1 to 100 users.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>Whether to exclude pooled desktops (desktops in a desktop pool).</p>
     * 
     * <strong>example:</strong>
     * <p>andy</p>
     */
    @NameInMap("ExcludedEndUserId")
    public java.util.List<String> excludedEndUserId;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-31T15:59:59Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FillResourceGroup")
    public Boolean fillResourceGroup;

    /**
     * <p>The management flag.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterDesktopGroup")
    public Boolean filterDesktopGroup;

    /**
     * <p>The public network bandwidth throttling rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-0bm2iz1v6m6nx****</p>
     */
    @NameInMap("GpuInstanceGroupId")
    public String gpuInstanceGroupId;

    /**
     * <p>The cloud computer status.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-boyczi8enfyc5****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of desktop statuses.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    @NameInMap("IncludeAutoSnapshotPolicy")
    public Boolean includeAutoSnapshotPolicy;

    /**
     * <p>Whether to query image version information for the desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>NoFlag</p>
     */
    @NameInMap("ManagementFlag")
    public String managementFlag;

    /**
     * <p>The token that starts the next query. An empty NextToken means no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiResource")
    public Boolean multiResource;

    /**
     * <p>The user name.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The desktop policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The desktop pool ID. If you specify <code>DesktopId</code>, this parameter is ignored. If <code>DesktopId</code> is empty, the system uses <code>DesktopGroupId</code> to retrieve all desktop IDs in the pool.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyDesktopGroup")
    public Boolean onlyDesktopGroup;

    /**
     * <p>The desktop instance type. Call <a href="t2167746.xdita#"></a>to list supported instance types.</p>
     */
    @NameInMap("OsTypes")
    public java.util.List<String> osTypes;

    /**
     * <p>The maximum number of entries to return on each page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Whether multiple resources exist.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method for the desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>system-all-enabled-policy</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The desktop IDs. You can specify 1 to 100 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The purchase method for the desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <p>The list of tags. Each tag is a key-value pair used to label resources. Use tags to group and manage desktops, making them easier to search and operate on in bulk. For more information, see <a href="t2042630.xdita#"></a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    /**
     * <p>The cloud computer pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Whether to query enterprise resource group information.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4hsvzbbmqdzu3s****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Whether to query only pooled desktops (desktops in a desktop pool).</p>
     * 
     * <strong>example:</strong>
     * <p>sp-hb12mclyne09xw***</p>
     */
    @NameInMap("SnapshotPolicyId")
    public String snapshotPolicyId;

    /**
     * <p>The enterprise resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>monthPackage</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The snapshot policy ID.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDesktopsRequestTag> tag;

    /**
     * <p>The desktop name.</p>
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

    public DescribeDesktopsRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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

    public DescribeDesktopsRequest setIncludeAutoSnapshotPolicy(Boolean includeAutoSnapshotPolicy) {
        this.includeAutoSnapshotPolicy = includeAutoSnapshotPolicy;
        return this;
    }
    public Boolean getIncludeAutoSnapshotPolicy() {
        return this.includeAutoSnapshotPolicy;
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
         * <p>The tag key. If you specify <code>Tag</code>, then <code>Key</code> is required. The key can be up to 128 characters long. It cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It cannot consist only of whitespace.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters long. It cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
