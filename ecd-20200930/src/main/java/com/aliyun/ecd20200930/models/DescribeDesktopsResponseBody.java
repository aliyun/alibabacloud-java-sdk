// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponseBody extends TeaModel {
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopsResponseBodyDesktops> desktops;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("DiskType")
        public String diskType;

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
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        @NameInMap("NewAppVersion")
        public String newAppVersion;

        @NameInMap("ReleaseNote")
        public String releaseNote;

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
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EstablishmentTime")
        public String establishmentTime;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("BundleName")
        public String bundleName;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DesktopStatus")
        public String desktopStatus;

        @NameInMap("DesktopType")
        public String desktopType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DirectoryType")
        public String directoryType;

        @NameInMap("Disks")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks;

        @NameInMap("DowngradeQuota")
        public Long downgradeQuota;

        @NameInMap("DowngradedTimes")
        public Long downgradedTimes;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("FotaUpdate")
        public DescribeDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        @NameInMap("GpuCategory")
        public Long gpuCategory;

        @NameInMap("GpuCount")
        public Float gpuCount;

        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        @NameInMap("GpuSpec")
        public String gpuSpec;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ManagementFlag")
        public String managementFlag;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Sessions")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Tags")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsTags> tags;

        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeDesktopsResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktops self = new DescribeDesktopsResponseBodyDesktops();
            return TeaModel.build(map, self);
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

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
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

        public DescribeDesktopsResponseBodyDesktops setSessions(java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeDesktopsResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

        public DescribeDesktopsResponseBodyDesktops setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

}
