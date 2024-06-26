// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsResponseBody extends TeaModel {
    @NameInMap("InstanceGroupModel")
    public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel> instanceGroupModel;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
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
         * <strong>example:</strong>
         * <p>aig-48xr63m4dybjk****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ARM</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks> disks;

        /**
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2027-06-29 07:25:31</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>imgc-06zyt9m93zwax****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstalledAppList")
        public String installedAppList;

        /**
         * <strong>example:</strong>
         * <p>ag-h67a2cs0zprfdh****</p>
         */
        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        @NameInMap("InstanceGroupName")
        public String instanceGroupName;

        /**
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("InstanceGroupSpec")
        public String instanceGroupSpec;

        /**
         * <strong>example:</strong>
         * <p>ARM-2vCPU4GiB 32GiB</p>
         */
        @NameInMap("InstanceGroupSpecDescribe")
        public String instanceGroupSpecDescribe;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceGroupStatus")
        public String instanceGroupStatus;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NumberOfInstances")
        public String numberOfInstances;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-030598****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>pg-c6n38xucps8kl****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SaleMode")
        public String saleMode;

        /**
         * <strong>example:</strong>
         * <p>Android 12</p>
         */
        @NameInMap("SystemVersion")
        public String systemVersion;

        /**
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
