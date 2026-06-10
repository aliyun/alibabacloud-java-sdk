// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetadataResponseBody extends TeaModel {
    /**
     * <p>The details of the cloud desktops.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopMetadataResponseBodyDesktops> desktops;

    /**
     * <p>The token used to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetadataResponseBody self = new DescribeDesktopMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetadataResponseBody setDesktops(java.util.List<DescribeDesktopMetadataResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopMetadataResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeDesktopMetadataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopMetadataResponseBodyDesktops extends TeaModel {
        /**
         * <p>A list of agents that the cloud computer supports.</p>
         */
        @NameInMap("AgentProviderList")
        public java.util.List<String> agentProviderList;

        /**
         * <p>The billing method of the cloud desktop. Valid values:</p>
         * <ul>
         * <li><p><code>PostPaid</code>: pay-as-you-go</p>
         * </li>
         * <li><p><code>PrePaid</code>: subscription</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The creation time of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud desktop. Valid values:</p>
         * <ul>
         * <li><p><code>Stopped</code></p>
         * </li>
         * <li><p><code>Starting</code></p>
         * </li>
         * <li><p><code>Rebuilding</code></p>
         * </li>
         * <li><p><code>Running</code></p>
         * </li>
         * <li><p><code>Stopping</code></p>
         * </li>
         * <li><p><code>Expired</code></p>
         * </li>
         * <li><p><code>Deleted</code></p>
         * </li>
         * <li><p><code>Pending</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The instance type of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.general.2c8g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The expiration time of the cloud desktop. This parameter is returned only for cloud desktops that use the subscription billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>华东2（上海）</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The management flags for the cloud computer.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The private IP address of the instance\&quot;s network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.1</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The operating system of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-f3s3dgt8dtb0vlqc8</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless_new</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The time when the cloud desktop started.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:31Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDesktopMetadataResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopMetadataResponseBodyDesktops self = new DescribeDesktopMetadataResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopMetadataResponseBodyDesktops setAgentProviderList(java.util.List<String> agentProviderList) {
            this.agentProviderList = agentProviderList;
            return this;
        }
        public java.util.List<String> getAgentProviderList() {
            return this.agentProviderList;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setMemberEniIp(String memberEniIp) {
            this.memberEniIp = memberEniIp;
            return this;
        }
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
