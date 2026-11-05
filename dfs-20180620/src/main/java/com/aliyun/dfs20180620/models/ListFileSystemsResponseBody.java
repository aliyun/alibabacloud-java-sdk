// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The collection of file system information.</p>
     */
    @NameInMap("FileSystems")
    public java.util.List<ListFileSystemsResponseBodyFileSystems> fileSystems;

    /**
     * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-k47g</p>
     * 
     * <strong>example:</strong>
     * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned results.</p>
     * 
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
        /**
         * <p>The creation time of the file system. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T06:03:15.836222Z.</p>
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
         * <p>This is the first Apsara File Storage for HDFS instance of my company</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the file system.</p>
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
         * <p>The billing method of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>UsageBased,CapacityBased</p>
         */
        @NameInMap("MeteringMode")
        public String meteringMode;

        /**
         * <p>The billable capacity of the file system. Unit: bytes.
         * Billable capacity = MAX [(Number of files + Number of directories) × 5 MiB, Used capacity].
         * This is statistical data and is for reference only, and is not used for billing. Apsara File Storage for HDFS is billed based on the peak billable capacity of the previous hour. For more detailed metering data, see <a href="https://help.aliyun.com/document_detail/419001.html">View billing details</a>.</p>
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
         * <p>The protocol type. Only Hadoop Distributed File System (HDFS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The provisioned throughput. Unit: MB/s.</p>
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
         * <p>The capacity of the file system. Unit: GB.</p>
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
         * <p>The used space of the file system. Unit: GB.</p>
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

        public ListFileSystemsResponseBodyFileSystems setMeteringMode(String meteringMode) {
            this.meteringMode = meteringMode;
            return this;
        }
        public String getMeteringMode() {
            return this.meteringMode;
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
