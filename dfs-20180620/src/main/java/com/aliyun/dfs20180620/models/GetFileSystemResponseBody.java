// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetFileSystemResponseBody extends TeaModel {
    /**
     * <p>The file system information.</p>
     */
    @NameInMap("FileSystem")
    public GetFileSystemResponseBodyFileSystem fileSystem;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
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
        /**
         * <p>The time when the file system was created. The time is in UTC and follows the ISO 8601 format. Example: 2022-04-18T06:03:15.836222Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T06:03:15.836222Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the first Apsara File Storage for HDFS instance of our company</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The name of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>MyFirstHDFS</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The metering mode of the file system. Valid values:</p>
         * <ul>
         * <li>UsageBased: metered and reported based on actual usage (default value)</li>
         * <li>CapacityBased: metered and reported based on the requested capacity specified by SpaceCapacity, with QoS provisioned at the maximum specifications</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UsageBased,CapacityBased</p>
         */
        @NameInMap("MeteringMode")
        public String meteringMode;

        /**
         * <p>The billable capacity of the file system. Unit: bytes.</p>
         * <p>Billable capacity = MAX [(Number of files + Number of directories) × 5 MiB, Used capacity].</p>
         * <p>This is statistical data for reference only and is not used for billing. File Storage for HDFS is billed based on the peak billable capacity in the previous hour. For more detailed metering data, refer to <a href="https://help.aliyun.com/document_detail/419001.html">View billing details</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("MeteringSpaceSize")
        public Float meteringSpaceSize;

        /**
         * <p>The number of mount points.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MountPointCount")
        public Long mountPointCount;

        /**
         * <p>The number of directories.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NumberOfDirectories")
        public Long numberOfDirectories;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NumberOfFiles")
        public Long numberOfFiles;

        /**
         * <p>The protocol type.</p>
         * <p>Only Hadoop Distributed File System (HDFS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The provisioned throughput.</p>
         * <p>Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ProvisionedThroughputInMiBps")
        public Long provisionedThroughputInMiBps;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The capacity of the file system.</p>
         * <p>Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceCapacity")
        public Long spaceCapacity;

        /**
         * <p>The ID of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StoragePackageId")
        public String storagePackageId;

        /**
         * <p>The storage medium type. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard</li>
         * <li>PERFORMANCE: performance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The throughput mode. Valid values:</p>
         * <ul>
         * <li>Standard: standard throughput</li>
         * <li>Provisioned: provisioned throughput</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("ThroughputMode")
        public String throughputMode;

        /**
         * <p>The used storage space.</p>
         * <p>Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedSpaceSize")
        public Float usedSpaceSize;

        /**
         * <p>The version of Apsara File Storage for HDFS. This is not the Hadoop version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
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

        public GetFileSystemResponseBodyFileSystem setMeteringMode(String meteringMode) {
            this.meteringMode = meteringMode;
            return this;
        }
        public String getMeteringMode() {
            return this.meteringMode;
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
