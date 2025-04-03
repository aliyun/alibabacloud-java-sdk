// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsResponseBody extends TeaModel {
    /**
     * <p>The instance group.</p>
     */
    @NameInMap("InstanceGroupModel")
    public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel> instanceGroupModel;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAndroidInstanceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstanceGroupsResponseBody self = new DescribeAndroidInstanceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstanceGroupsResponseBody setInstanceGroupModel(java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel> instanceGroupModel) {
        this.instanceGroupModel = instanceGroupModel;
        return this;
    }
    public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel> getInstanceGroupModel() {
        return this.instanceGroupModel;
    }

    public DescribeAndroidInstanceGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstanceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAndroidInstanceGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks extends TeaModel {
        /**
         * <p>The size of the disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        public static DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks self = new DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel extends TeaModel {
        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-48xr63m4dybjk****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The type of the architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>ARM</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The number of available instances.</p>
         * <blockquote>
         * <p> Available instances are those not in the Deleting or Deleted state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks> disks;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        /**
         * <p>The cause of the creation failure.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The time when the instance group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the subscription instance group expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-06-29 07:25:31</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the instance group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-06zyt9m93zwax****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The list of installed applications.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;TikTok&quot;,&quot;WeChat&quot;</p>
         */
        @NameInMap("InstalledAppList")
        public String installedAppList;

        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-h67a2cs0zprfdh****</p>
         */
        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        /**
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceGroup</p>
         */
        @NameInMap("InstanceGroupName")
        public String instanceGroupName;

        /**
         * <p>The specifications of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("InstanceGroupSpec")
        public String instanceGroupSpec;

        /**
         * <p>The description of the instance group specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>ARM-2vCPU4GiB 32GiB</p>
         */
        @NameInMap("InstanceGroupSpecDescribe")
        public String instanceGroupSpecDescribe;

        /**
         * <p>The status of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceGroupStatus")
        public String instanceGroupStatus;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Ipv6Bandwidth")
        public Integer ipv6Bandwidth;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The number of instances in the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NumberOfInstances")
        public String numberOfInstances;

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-030598****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-c6n38xucps8kl****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The rendering mode of the instance group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>GPURemote: GPU remote rendering.</li>
         * <li>CPU: CPU rendering.</li>
         * <li>GPUocal: GPU local rendering.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("RenderingType")
        public String renderingType;

        /**
         * <p>The height of the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The width of the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The sales mode.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SaleMode")
        public String saleMode;

        /**
         * <p>The version of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Android 12</p>
         */
        @NameInMap("SystemVersion")
        public String systemVersion;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4n0yqs009ho024wt****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel self = new DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setDisks(java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks> getDisks() {
            return this.disks;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setGmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstalledAppList(String installedAppList) {
            this.installedAppList = installedAppList;
            return this;
        }
        public String getInstalledAppList() {
            return this.installedAppList;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstanceGroupId(String instanceGroupId) {
            this.instanceGroupId = instanceGroupId;
            return this;
        }
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstanceGroupName(String instanceGroupName) {
            this.instanceGroupName = instanceGroupName;
            return this;
        }
        public String getInstanceGroupName() {
            return this.instanceGroupName;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstanceGroupSpec(String instanceGroupSpec) {
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }
        public String getInstanceGroupSpec() {
            return this.instanceGroupSpec;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstanceGroupSpecDescribe(String instanceGroupSpecDescribe) {
            this.instanceGroupSpecDescribe = instanceGroupSpecDescribe;
            return this;
        }
        public String getInstanceGroupSpecDescribe() {
            return this.instanceGroupSpecDescribe;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setInstanceGroupStatus(String instanceGroupStatus) {
            this.instanceGroupStatus = instanceGroupStatus;
            return this;
        }
        public String getInstanceGroupStatus() {
            return this.instanceGroupStatus;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setIpv6Bandwidth(Integer ipv6Bandwidth) {
            this.ipv6Bandwidth = ipv6Bandwidth;
            return this;
        }
        public Integer getIpv6Bandwidth() {
            return this.ipv6Bandwidth;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setNumberOfInstances(String numberOfInstances) {
            this.numberOfInstances = numberOfInstances;
            return this;
        }
        public String getNumberOfInstances() {
            return this.numberOfInstances;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setRenderingType(String renderingType) {
            this.renderingType = renderingType;
            return this;
        }
        public String getRenderingType() {
            return this.renderingType;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setSaleMode(String saleMode) {
            this.saleMode = saleMode;
            return this;
        }
        public String getSaleMode() {
            return this.saleMode;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
