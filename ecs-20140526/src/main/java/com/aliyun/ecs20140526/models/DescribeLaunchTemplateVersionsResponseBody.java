// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    // Details about the launch template versions.
    @NameInMap("LaunchTemplateVersionSets")
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of launch templates.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLaunchTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsResponseBody self = new DescribeLaunchTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsResponseBody setLaunchTemplateVersionSets(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets) {
        this.launchTemplateVersionSets = launchTemplateVersionSets;
        return this;
    }
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplateVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLaunchTemplateVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("Iops")
        public Integer iops;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        @NameInMap("Size")
        public Integer size;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The category of the data disk.
        @NameInMap("Category")
        public String category;

        // Indicates whether to release the data disk when the instance is released.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of the data disk.
        @NameInMap("Description")
        public String description;

        // The device name of the data disk.
        // 
        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("Device")
        public String device;

        // The name of the data disk.
        @NameInMap("DiskName")
        public String diskName;

        // Specifies whether to encrypt the data disk.
        @NameInMap("Encrypted")
        public String encrypted;

        // The performance level of ESSD used as the data disk. This parameter is returned only when `Category` is set to cloud_essd. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The size of the data disk.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot used to create the data disk.
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks setDataDisk(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface extends TeaModel {
        // The description of the secondary ENI.
        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceType")
        public String instanceType;

        // The name of the secondary ENI.
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        // The primary private IP address of the secondary ENI.
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        // The ID of the security group to which to assign the secondary ENI. The security group and the ENI must belong to the same VPC.  
        // 
        // >  The SecurityGroupId and SecurityGroupIds parameters are mutually exclusive in the response.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The IDs of the security groups to which to assign the secondary ENI. 
        // 
        // >  The SecurityGroupId and SecurityGroupIds parameters are mutually exclusive in the response.
        @NameInMap("SecurityGroupIds")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds securityGroupIds;

        // The ID of the vSwitch to which to connect the ENI.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setSecurityGroupIds(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterfaceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces setNetworkInterface(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag extends TeaModel {
        // The tag key of the instance.
        @NameInMap("Key")
        public String key;

        // The tag value of the instance.
        @NameInMap("Value")
        public String value;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags extends TeaModel {
        @NameInMap("InstanceTag")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags setInstanceTag(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData extends TeaModel {
        @NameInMap("SystemDisk")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk;

        // The automatic release time of the instance.
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        // Details about the data disks.
        @NameInMap("DataDisks")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks;

        // The ID of the deployment set.
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        // The description of the instance.
        @NameInMap("Description")
        public String description;

        // Indicates whether to enable the operating system configuration of the instance.
        @NameInMap("EnableVmOsConfig")
        public Boolean enableVmOsConfig;

        // The hostname of the instance.
        @NameInMap("HostName")
        public String hostName;

        // The ID of the image.
        @NameInMap("ImageId")
        public String imageId;

        // The source of the image. Valid values:
        // 
        // *   system: public images provided by Alibaba Cloud.
        // *   self: custom images that you create.
        // *   others: shared images from other Alibaba Cloud accounts.
        // *   marketplace: Alibaba Cloud Marketplace images.
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        // The billing method of the instance. Valid values:
        // 
        // *   PrePaid: subscription
        // *   PostPaid: pay-as-you-go
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        // The name of the instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The instance type.
        @NameInMap("InstanceType")
        public String instanceType;

        // The billing method for network usage.
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        // The maximum inbound public bandwidth.
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        // The maximum outbound public bandwidth.
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        // Specifies whether the instance is I/O optimized.
        @NameInMap("IoOptimized")
        public String ioOptimized;

        // The number of IPv6 addresses to assign to the instance.
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        // The name of the key pair.
        @NameInMap("KeyPairName")
        public String keyPairName;

        // Details about the secondary elastic network interfaces (ENIs).
        @NameInMap("NetworkInterfaces")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces;

        // The network type. Valid values:
        // 
        // *   classic: classic network
        // *   vpc: VPC
        @NameInMap("NetworkType")
        public String networkType;

        // Indicates whether the username and password pair preset in the image is used.
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        // The subscription duration.
        @NameInMap("Period")
        public Integer period;

        // The private IP address of the instance.
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        // The name of the instance RAM role.
        @NameInMap("RamRoleName")
        public String ramRoleName;

        // The ID of the resource group to which the launch template belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether to enable security hardening.
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        // The ID of the security group to which to assign the instance.
        // 
        // >  The `SecurityGroupId` and `SecurityGroupIds` parameters are mutually exclusive in the response.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The IDs of the security groups to which to assign the instance. 
        // 
        // >  The `SecurityGroupId` and `SecurityGroupIds` parameters are mutually exclusive in the response.
        @NameInMap("SecurityGroupIds")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds securityGroupIds;

        // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
        // 
        // Take note of the following items:
        // 
        // *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
        // *   A value of 0 indicates that no protection period is configured for the preemptible instance.
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        // The maximum hourly price of the preemptible instance.
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        // The bidding policy for the pay-as-you-go instance. Valid values:
        // 
        // *   NoSpot: The instance is a regular pay-as-you-go instance.
        // *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
        // *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        // The tags of the instance.
        @NameInMap("Tags")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags;

        // The user data of the instance, which is Base64-encoded.
        @NameInMap("UserData")
        public String userData;

        // The ID of the vSwitch to which to connect the instance.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The ID of the virtual private cloud (VPC).
        @NameInMap("VpcId")
        public String vpcId;

        // The ID of the zone.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSystemDisk(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDataDisks(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setEnableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkInterfaces(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityGroupIds(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setTags(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags getTags() {
            return this.tags;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet extends TeaModel {
        // The time when the launch template was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The creator of the launch template.
        @NameInMap("CreatedBy")
        public String createdBy;

        // Indicates whether the launch template version is the default version.
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        // The configurations of the launch template.
        @NameInMap("LaunchTemplateData")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData;

        // The ID of the template.
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        // The name of the launch template.
        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        // The time when the launch template was modified.
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // The description of the launch template version.
        @NameInMap("VersionDescription")
        public String versionDescription;

        // The number of the launch template version.
        @NameInMap("VersionNumber")
        public Long versionNumber;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateData(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData) {
            this.launchTemplateData = launchTemplateData;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Long getVersionNumber() {
            return this.versionNumber;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateVersionSet")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateVersionSet(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet) {
            this.launchTemplateVersionSet = launchTemplateVersionSet;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> getLaunchTemplateVersionSet() {
            return this.launchTemplateVersionSet;
        }

    }

}
