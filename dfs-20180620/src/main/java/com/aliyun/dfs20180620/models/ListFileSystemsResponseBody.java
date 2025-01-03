// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    public java.util.List<ListFileSystemsResponseBodyFileSystems> fileSystems;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public ListFileSystemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

        /**
         * <strong>example:</strong>
         * <p>MyFirstHDFS</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("MeteringSpaceSize")
        public Float meteringSpaceSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MountPointCount")
        public Long mountPointCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NumberOfDirectories")
        public Long numberOfDirectories;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NumberOfFiles")
        public Long numberOfFiles;

        /**
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ProvisionedThroughputInMiBps")
        public Long provisionedThroughputInMiBps;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceCapacity")
        public Long spaceCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StoragePackageId")
        public String storagePackageId;

        /**
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("ThroughputMode")
        public String throughputMode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedSpaceSize")
        public Float usedSpaceSize;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
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
