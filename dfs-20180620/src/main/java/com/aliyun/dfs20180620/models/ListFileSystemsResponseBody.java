// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    public java.util.List<ListFileSystemsResponseBodyFileSystems> fileSystems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemsResponseBody self = new ListFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileSystemsResponseBody setFileSystems(java.util.List<ListFileSystemsResponseBodyFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<ListFileSystemsResponseBodyFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public ListFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFileSystemsResponseBodyFileSystems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemName")
        public String fileSystemName;

        @NameInMap("MeteringSpaceSize")
        public Float meteringSpaceSize;

        @NameInMap("MountPointCount")
        public Long mountPointCount;

        @NameInMap("NumberOfDirectories")
        public Long numberOfDirectories;

        @NameInMap("NumberOfFiles")
        public Long numberOfFiles;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("ProvisionedThroughputInMiBps")
        public Long provisionedThroughputInMiBps;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SpaceCapacity")
        public Long spaceCapacity;

        @NameInMap("StoragePackageId")
        public String storagePackageId;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("ThroughputMode")
        public String throughputMode;

        @NameInMap("UsedSpaceSize")
        public Float usedSpaceSize;

        @NameInMap("Version")
        public String version;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemsResponseBodyFileSystems self = new ListFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public ListFileSystemsResponseBodyFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFileSystemsResponseBodyFileSystems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFileSystemsResponseBodyFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListFileSystemsResponseBodyFileSystems setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public ListFileSystemsResponseBodyFileSystems setMeteringSpaceSize(Float meteringSpaceSize) {
            this.meteringSpaceSize = meteringSpaceSize;
            return this;
        }
        public Float getMeteringSpaceSize() {
            return this.meteringSpaceSize;
        }

        public ListFileSystemsResponseBodyFileSystems setMountPointCount(Long mountPointCount) {
            this.mountPointCount = mountPointCount;
            return this;
        }
        public Long getMountPointCount() {
            return this.mountPointCount;
        }

        public ListFileSystemsResponseBodyFileSystems setNumberOfDirectories(Long numberOfDirectories) {
            this.numberOfDirectories = numberOfDirectories;
            return this;
        }
        public Long getNumberOfDirectories() {
            return this.numberOfDirectories;
        }

        public ListFileSystemsResponseBodyFileSystems setNumberOfFiles(Long numberOfFiles) {
            this.numberOfFiles = numberOfFiles;
            return this;
        }
        public Long getNumberOfFiles() {
            return this.numberOfFiles;
        }

        public ListFileSystemsResponseBodyFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListFileSystemsResponseBodyFileSystems setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
            this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
            return this;
        }
        public Long getProvisionedThroughputInMiBps() {
            return this.provisionedThroughputInMiBps;
        }

        public ListFileSystemsResponseBodyFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFileSystemsResponseBodyFileSystems setSpaceCapacity(Long spaceCapacity) {
            this.spaceCapacity = spaceCapacity;
            return this;
        }
        public Long getSpaceCapacity() {
            return this.spaceCapacity;
        }

        public ListFileSystemsResponseBodyFileSystems setStoragePackageId(String storagePackageId) {
            this.storagePackageId = storagePackageId;
            return this;
        }
        public String getStoragePackageId() {
            return this.storagePackageId;
        }

        public ListFileSystemsResponseBodyFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListFileSystemsResponseBodyFileSystems setThroughputMode(String throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }
        public String getThroughputMode() {
            return this.throughputMode;
        }

        public ListFileSystemsResponseBodyFileSystems setUsedSpaceSize(Float usedSpaceSize) {
            this.usedSpaceSize = usedSpaceSize;
            return this;
        }
        public Float getUsedSpaceSize() {
            return this.usedSpaceSize;
        }

        public ListFileSystemsResponseBodyFileSystems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListFileSystemsResponseBodyFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
