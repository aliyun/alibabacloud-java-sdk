// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Desktops")
    @Validation(required = true)
    public java.util.List<DescribeDesktopsResponseDesktops> desktops;

    public static DescribeDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsResponse self = new DescribeDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsResponse setDesktops(java.util.List<DescribeDesktopsResponseDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopsResponseDesktops> getDesktops() {
        return this.desktops;
    }

    public static class DescribeDesktopsResponseDesktopsDisks extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("DiskSize")
        @Validation(required = true)
        public Integer diskSize;

        @NameInMap("DiskType")
        @Validation(required = true)
        public String diskType;

        public static DescribeDesktopsResponseDesktopsDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseDesktopsDisks self = new DescribeDesktopsResponseDesktopsDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseDesktopsDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDesktopsResponseDesktopsDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeDesktopsResponseDesktopsDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeDesktopsResponseDesktopsTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDesktopsResponseDesktopsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseDesktopsTags self = new DescribeDesktopsResponseDesktopsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseDesktopsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopsResponseDesktopsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDesktopsResponseDesktopsSessions extends TeaModel {
        @NameInMap("EndUserId")
        @Validation(required = true)
        public String endUserId;

        @NameInMap("EstablishmentTime")
        @Validation(required = true)
        public String establishmentTime;

        public static DescribeDesktopsResponseDesktopsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseDesktopsSessions self = new DescribeDesktopsResponseDesktopsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseDesktopsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopsResponseDesktopsSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

    }

    public static class DescribeDesktopsResponseDesktops extends TeaModel {
        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        @Validation(required = true)
        public String officeSiteName;

        @NameInMap("DirectoryType")
        @Validation(required = true)
        public String directoryType;

        @NameInMap("OfficeSiteType")
        @Validation(required = true)
        public String officeSiteType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        @NameInMap("DesktopStatus")
        @Validation(required = true)
        public String desktopStatus;

        @NameInMap("DesktopName")
        @Validation(required = true)
        public String desktopName;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("DesktopType")
        @Validation(required = true)
        public String desktopType;

        @NameInMap("SystemDiskCategory")
        @Validation(required = true)
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        @Validation(required = true)
        public Integer systemDiskSize;

        @NameInMap("DataDiskCategory")
        @Validation(required = true)
        public String dataDiskCategory;

        @NameInMap("DataDiskSize")
        @Validation(required = true)
        public String dataDiskSize;

        @NameInMap("PolicyGroupId")
        @Validation(required = true)
        public String policyGroupId;

        @NameInMap("PolicyGroupName")
        @Validation(required = true)
        public String policyGroupName;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Integer cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Long memory;

        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("GpuCount")
        @Validation(required = true)
        public Float gpuCount;

        @NameInMap("GpuSpec")
        @Validation(required = true)
        public String gpuSpec;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("ConnectionStatus")
        @Validation(required = true)
        public String connectionStatus;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        @NameInMap("ManagementFlag")
        @Validation(required = true)
        public String managementFlag;

        @NameInMap("Disks")
        @Validation(required = true)
        public java.util.List<DescribeDesktopsResponseDesktopsDisks> disks;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<DescribeDesktopsResponseDesktopsTags> tags;

        @NameInMap("Sessions")
        @Validation(required = true)
        public java.util.List<DescribeDesktopsResponseDesktopsSessions> sessions;

        @NameInMap("EndUserIds")
        @Validation(required = true)
        public java.util.List<String> endUserIds;

        public static DescribeDesktopsResponseDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseDesktops self = new DescribeDesktopsResponseDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsResponseDesktops setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDesktopsResponseDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopsResponseDesktops setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopsResponseDesktops setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDesktopsResponseDesktops setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeDesktopsResponseDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDesktopsResponseDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopsResponseDesktops setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeDesktopsResponseDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopsResponseDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopsResponseDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsResponseDesktops setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopsResponseDesktops setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeDesktopsResponseDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopsResponseDesktops setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDesktopsResponseDesktops setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopsResponseDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopsResponseDesktops setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopsResponseDesktops setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeDesktopsResponseDesktops setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDesktopsResponseDesktops setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDesktopsResponseDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopsResponseDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDesktopsResponseDesktops setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopsResponseDesktops setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopsResponseDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDesktopsResponseDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsResponseDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsResponseDesktops setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopsResponseDesktops setDisks(java.util.List<DescribeDesktopsResponseDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseDesktopsDisks> getDisks() {
            return this.disks;
        }

        public DescribeDesktopsResponseDesktops setTags(java.util.List<DescribeDesktopsResponseDesktopsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseDesktopsTags> getTags() {
            return this.tags;
        }

        public DescribeDesktopsResponseDesktops setSessions(java.util.List<DescribeDesktopsResponseDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeDesktopsResponseDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

    }

}
