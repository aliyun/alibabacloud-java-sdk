// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponseBody extends TeaModel {
    /**
     * <p>Details of the cloud desktops.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopsResponseBodyDesktops> desktops;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud desktops.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsResponseBody self = new DescribeDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsResponseBody setDesktops(java.util.List<DescribeDesktopsResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopsResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeDesktopsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDesktopsResponseBodyDesktopsDisks extends TeaModel {
        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The performance level (PL) of the disk that is an enhanced SSD (ESSD). Valid values:</p>
         * <br>
         * <p>*   PL0</p>
         * <p>*   PL1</p>
         * <p>*   PL2</p>
         * <p>*   PL3</p>
         * <br>
         * <p>For more information about the differences between disks of different PLs, see [Enhanced SSDs](~~122389~~).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static DescribeDesktopsResponseBodyDesktopsDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsDisks self = new DescribeDesktopsResponseBodyDesktopsDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDesktopsResponseBodyDesktopsDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsFotaUpdate extends TeaModel {
        /**
         * <p>The current version of the cloud desktop.</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The version to which the cloud desktop can be updated.</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>The description of the version to which the cloud desktop can be updated.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The size of the installation package for the version to which the cloud desktop can be updated. Unit: KB.</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeDesktopsResponseBodyDesktopsFotaUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsFotaUpdate self = new DescribeDesktopsResponseBodyDesktopsFotaUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setNewAppVersion(String newAppVersion) {
            this.newAppVersion = newAppVersion;
            return this;
        }
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDesktopsResponseBodyDesktopsFotaUpdate setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsSessions extends TeaModel {
        /**
         * <p>The ID of the user that logged on to the cloud desktop.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the desktop session was established.</p>
         */
        @NameInMap("EstablishmentTime")
        public String establishmentTime;

        /**
         * <p>The name of the external user.</p>
         */
        @NameInMap("ExternalUserName")
        public String externalUserName;

        public static DescribeDesktopsResponseBodyDesktopsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsSessions self = new DescribeDesktopsResponseBodyDesktopsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        public DescribeDesktopsResponseBodyDesktopsSessions setExternalUserName(String externalUserName) {
            this.externalUserName = externalUserName;
            return this;
        }
        public String getExternalUserName() {
            return this.externalUserName;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktopsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDesktopsResponseBodyDesktopsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktopsTags self = new DescribeDesktopsResponseBodyDesktopsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktopsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopsResponseBodyDesktopsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDesktopsResponseBodyDesktops extends TeaModel {
        /**
         * <p>The number of sessions allowed for each cloud desktop in the multi-session desktop group.</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <p>The ID of the desktop template that is used to create the cloud desktop.</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the desktop template that is used to create the cloud desktop.</p>
         */
        @NameInMap("BundleName")
        public String bundleName;

        /**
         * <p>The billing method of the cloud desktop.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The connection status of the user.</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the cloud desktop was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the group to which the cloud desktop belongs. Default value: null.</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

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

        /**
         * <p>The desktop type.</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The ID is the same as the workspace ID that is indicated by the value of the OfficeSiteId parameter.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>This parameter is in invitational preview and unavailable for general users.</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>Details of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks;

        /**
         * <p>The number of times for which the cloud desktop can be downgraded.</p>
         */
        @NameInMap("DowngradeQuota")
        public Long downgradeQuota;

        /**
         * <p>The number of times for which the cloud desktop is downgraded.</p>
         */
        @NameInMap("DowngradedTimes")
        public Long downgradedTimes;

        /**
         * <p>The IDs of the users that have the permissions to connect to the cloud desktops.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The time when the subscription cloud desktop expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The information about the image version that the cloud desktop uses.</p>
         */
        @NameInMap("FotaUpdate")
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        /**
         * <p>Indicates whether the cloud desktop is of the GPU-accelerated type.</p>
         */
        @NameInMap("GpuCategory")
        public Long gpuCategory;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The version of the GPU driver with which the cloud desktop is equipped.</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The GPU model.</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("HibernationOptionsConfigured")
        public Boolean hibernationOptionsConfigured;

        /**
         * <p>The hostname of the cloud desktop.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The flag that is used for management.</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The memory size. Unit: MiB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The ID of the secondary network interface controller (NIC) created by the RAM user or Active Directory (AD) user in EDS. You do not have the permissions to modify this ID.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The IP address of the secondary NIC that is created by the RAM user or AD user in EDS.</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

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
         * <p>The account type of the workspace.</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The virtual private cloud (VPC) type of the workspace.</p>
         */
        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        /**
         * <p>The type of the OS.</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The information about the OS platform. Valid values:</p>
         * <br>
         * <p>*   CentOS</p>
         * <p>*   Ubuntu</p>
         * <p>*   Windows Server 2016</p>
         * <p>*   Windows Server 2019</p>
         * <p>*   UOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The IDs of the policies.</p>
         */
        @NameInMap("PolicyGroupIdList")
        public java.util.List<String> policyGroupIdList;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The names of the policies.</p>
         */
        @NameInMap("PolicyGroupNameList")
        public java.util.List<String> policyGroupNameList;

        /**
         * <p>The progress when the cloud desktop was created.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The type of the session.</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>Details of the desktop sessions that users hold.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions;

        /**
         * <p>The ID of the snapshot policy.</p>
         */
        @NameInMap("SnapshotPolicyId")
        public String snapshotPolicyId;

        /**
         * <p>The name of the snapshot policy.</p>
         */
        @NameInMap("SnapshotPolicyName")
        public String snapshotPolicyName;

        /**
         * <p>The first time when the cloud desktop was started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether hibernation is supported for the cloud desktop.</p>
         */
        @NameInMap("SupportHibernation")
        public Boolean supportHibernation;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to the public.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>Details of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsTags> tags;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        /**
         * <p>The type of the zone. Default value: **AvailabilityZone**. This value indicates Alibaba Cloud zones.</p>
         */
        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeDesktopsResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktops self = new DescribeDesktopsResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseBodyDesktops setBindAmount(Integer bindAmount) {
            this.bindAmount = bindAmount;
            return this;
        }
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        public DescribeDesktopsResponseBodyDesktops setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeDesktopsResponseBodyDesktops setBundleName(String bundleName) {
            this.bundleName = bundleName;
            return this;
        }
        public String getBundleName() {
            return this.bundleName;
        }

        public DescribeDesktopsResponseBodyDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDesktopsResponseBodyDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsResponseBodyDesktops setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeDesktopsResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDesktopsResponseBodyDesktops setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopsResponseBodyDesktops setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopsResponseBodyDesktops setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDesktopsResponseBodyDesktops setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDesktopsResponseBodyDesktops setDisks(java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> getDisks() {
            return this.disks;
        }

        public DescribeDesktopsResponseBodyDesktops setDowngradeQuota(Long downgradeQuota) {
            this.downgradeQuota = downgradeQuota;
            return this;
        }
        public Long getDowngradeQuota() {
            return this.downgradeQuota;
        }

        public DescribeDesktopsResponseBodyDesktops setDowngradedTimes(Long downgradedTimes) {
            this.downgradedTimes = downgradedTimes;
            return this;
        }
        public Long getDowngradedTimes() {
            return this.downgradedTimes;
        }

        public DescribeDesktopsResponseBodyDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeDesktopsResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopsResponseBodyDesktops setFotaUpdate(DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate) {
            this.fotaUpdate = fotaUpdate;
            return this;
        }
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuCategory(Long gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Long getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeDesktopsResponseBodyDesktops setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopsResponseBodyDesktops setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
            this.hibernationOptionsConfigured = hibernationOptionsConfigured;
            return this;
        }
        public Boolean getHibernationOptionsConfigured() {
            return this.hibernationOptionsConfigured;
        }

        public DescribeDesktopsResponseBodyDesktops setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDesktopsResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsResponseBodyDesktops setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopsResponseBodyDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopsResponseBodyDesktops setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDesktopsResponseBodyDesktops setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDesktopsResponseBodyDesktops setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteVpcType(String officeSiteVpcType) {
            this.officeSiteVpcType = officeSiteVpcType;
            return this;
        }
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        public DescribeDesktopsResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsResponseBodyDesktops setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupIdList(java.util.List<String> policyGroupIdList) {
            this.policyGroupIdList = policyGroupIdList;
            return this;
        }
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupNameList(java.util.List<String> policyGroupNameList) {
            this.policyGroupNameList = policyGroupNameList;
            return this;
        }
        public java.util.List<String> getPolicyGroupNameList() {
            return this.policyGroupNameList;
        }

        public DescribeDesktopsResponseBodyDesktops setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDesktopsResponseBodyDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopsResponseBodyDesktops setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeDesktopsResponseBodyDesktops setSessions(java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeDesktopsResponseBodyDesktops setSnapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        public DescribeDesktopsResponseBodyDesktops setSnapshotPolicyName(String snapshotPolicyName) {
            this.snapshotPolicyName = snapshotPolicyName;
            return this;
        }
        public String getSnapshotPolicyName() {
            return this.snapshotPolicyName;
        }

        public DescribeDesktopsResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDesktopsResponseBodyDesktops setSupportHibernation(Boolean supportHibernation) {
            this.supportHibernation = supportHibernation;
            return this;
        }
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        public DescribeDesktopsResponseBodyDesktops setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeDesktopsResponseBodyDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopsResponseBodyDesktops setTags(java.util.List<DescribeDesktopsResponseBodyDesktopsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsTags> getTags() {
            return this.tags;
        }

        public DescribeDesktopsResponseBodyDesktops setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeDesktopsResponseBodyDesktops setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public DescribeDesktopsResponseBodyDesktops setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

}
