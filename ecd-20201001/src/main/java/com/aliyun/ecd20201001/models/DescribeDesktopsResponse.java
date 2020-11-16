// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

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

    public static class DescribeDesktopsResponseDesktops extends TeaModel {
        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

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

        @NameInMap("ConnectionStatus")
        @Validation(required = true)
        public String connectionStatus;

        @NameInMap("PolicyGroupId")
        @Validation(required = true)
        public String policyGroupId;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Integer cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Long memory;

        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public Long networkInterfaceId;

        @NameInMap("Disks")
        @Validation(required = true)
        public java.util.List<DescribeDesktopsResponseDesktopsDisks> disks;

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

        public DescribeDesktopsResponseDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsResponseDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
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

        public DescribeDesktopsResponseDesktops setNetworkInterfaceId(Long networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Long getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDesktopsResponseDesktops setDisks(java.util.List<DescribeDesktopsResponseDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDesktopsResponseDesktopsDisks> getDisks() {
            return this.disks;
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
