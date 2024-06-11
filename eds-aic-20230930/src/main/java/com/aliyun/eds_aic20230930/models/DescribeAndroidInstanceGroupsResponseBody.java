// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsResponseBody extends TeaModel {
    @NameInMap("InstanceGroupModel")
    public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModel> instanceGroupModel;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DiskSize")
        public Integer diskSize;

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
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("ArchitectureType")
        public String architectureType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstanceGroupsResponseBodyInstanceGroupModelDisks> disks;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtExpired")
        public String gmtExpired;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstalledAppList")
        public String installedAppList;

        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        @NameInMap("InstanceGroupName")
        public String instanceGroupName;

        @NameInMap("InstanceGroupSpec")
        public String instanceGroupSpec;

        @NameInMap("InstanceGroupSpecDescribe")
        public String instanceGroupSpecDescribe;

        @NameInMap("InstanceGroupStatus")
        public String instanceGroupStatus;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NumberOfInstances")
        public String numberOfInstances;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        @NameInMap("SaleMode")
        public String saleMode;

        @NameInMap("SystemVersion")
        public String systemVersion;

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
