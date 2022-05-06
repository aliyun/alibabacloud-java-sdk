// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetFileSystemResponseBody extends TeaModel {
    @NameInMap("FileSystem")
    public GetFileSystemResponseBodyFileSystem fileSystem;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileSystemResponseBody self = new GetFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileSystemResponseBody setFileSystem(GetFileSystemResponseBodyFileSystem fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }
    public GetFileSystemResponseBodyFileSystem getFileSystem() {
        return this.fileSystem;
    }

    public GetFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileSystemResponseBodyFileSystem extends TeaModel {
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

        public static GetFileSystemResponseBodyFileSystem build(java.util.Map<String, ?> map) throws Exception {
            GetFileSystemResponseBodyFileSystem self = new GetFileSystemResponseBodyFileSystem();
            return TeaModel.build(map, self);
        }

        public GetFileSystemResponseBodyFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetFileSystemResponseBodyFileSystem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFileSystemResponseBodyFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public GetFileSystemResponseBodyFileSystem setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public GetFileSystemResponseBodyFileSystem setMeteringSpaceSize(Float meteringSpaceSize) {
            this.meteringSpaceSize = meteringSpaceSize;
            return this;
        }
        public Float getMeteringSpaceSize() {
            return this.meteringSpaceSize;
        }

        public GetFileSystemResponseBodyFileSystem setMountPointCount(Long mountPointCount) {
            this.mountPointCount = mountPointCount;
            return this;
        }
        public Long getMountPointCount() {
            return this.mountPointCount;
        }

        public GetFileSystemResponseBodyFileSystem setNumberOfDirectories(Long numberOfDirectories) {
            this.numberOfDirectories = numberOfDirectories;
            return this;
        }
        public Long getNumberOfDirectories() {
            return this.numberOfDirectories;
        }

        public GetFileSystemResponseBodyFileSystem setNumberOfFiles(Long numberOfFiles) {
            this.numberOfFiles = numberOfFiles;
            return this;
        }
        public Long getNumberOfFiles() {
            return this.numberOfFiles;
        }

        public GetFileSystemResponseBodyFileSystem setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetFileSystemResponseBodyFileSystem setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
            this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
            return this;
        }
        public Long getProvisionedThroughputInMiBps() {
            return this.provisionedThroughputInMiBps;
        }

        public GetFileSystemResponseBodyFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetFileSystemResponseBodyFileSystem setSpaceCapacity(Long spaceCapacity) {
            this.spaceCapacity = spaceCapacity;
            return this;
        }
        public Long getSpaceCapacity() {
            return this.spaceCapacity;
        }

        public GetFileSystemResponseBodyFileSystem setStoragePackageId(String storagePackageId) {
            this.storagePackageId = storagePackageId;
            return this;
        }
        public String getStoragePackageId() {
            return this.storagePackageId;
        }

        public GetFileSystemResponseBodyFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetFileSystemResponseBodyFileSystem setThroughputMode(String throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }
        public String getThroughputMode() {
            return this.throughputMode;
        }

        public GetFileSystemResponseBodyFileSystem setUsedSpaceSize(Float usedSpaceSize) {
            this.usedSpaceSize = usedSpaceSize;
            return this;
        }
        public Float getUsedSpaceSize() {
            return this.usedSpaceSize;
        }

        public GetFileSystemResponseBodyFileSystem setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetFileSystemResponseBodyFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
