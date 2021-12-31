// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDesktopsResponseBody extends TeaModel {
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopsResponseBodyDesktops> desktops;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeDesktopsResponseBodyDesktopsDisks extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("DiskType")
        public String diskType;

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

    }

    public static class DescribeDesktopsResponseBodyDesktopsSessions extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EstablishmentTime")
        public String establishmentTime;

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

    }

    public static class DescribeDesktopsResponseBodyDesktops extends TeaModel {
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

        @NameInMap("Disks")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GpuCount")
        public Float gpuCount;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Sessions")
        public java.util.List<DescribeDesktopsResponseBodyDesktopsSessions> sessions;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopsResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsResponseBodyDesktops self = new DescribeDesktopsResponseBodyDesktops();
            return TeaModel.build(map, self);
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

        public DescribeDesktopsResponseBodyDesktops setDisks(java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseBodyDesktopsDisks> getDisks() {
            return this.disks;
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

        public DescribeDesktopsResponseBodyDesktops setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopsResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsResponseBodyDesktops setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
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

        public DescribeDesktopsResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopsResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsResponseBodyDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
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

    }

}
