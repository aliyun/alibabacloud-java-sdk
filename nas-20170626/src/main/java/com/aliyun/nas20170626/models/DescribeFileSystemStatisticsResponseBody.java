// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of file systems.</p>
     */
    @NameInMap("FileSystemStatistics")
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics;

    /**
     * <p>The queried file systems.</p>
     */
    @NameInMap("FileSystems")
    public DescribeFileSystemStatisticsResponseBodyFileSystems fileSystems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F088138-FD73-4B68-95CC-DFAD4D85****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of file system entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFileSystemStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemStatisticsResponseBody self = new DescribeFileSystemStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemStatisticsResponseBody setFileSystemStatistics(DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics) {
        this.fileSystemStatistics = fileSystemStatistics;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics getFileSystemStatistics() {
        return this.fileSystemStatistics;
    }

    public DescribeFileSystemStatisticsResponseBody setFileSystems(DescribeFileSystemStatisticsResponseBodyFileSystems fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBodyFileSystems getFileSystems() {
        return this.fileSystems;
    }

    public DescribeFileSystemStatisticsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic extends TeaModel {
        /**
         * <p>The number of expired file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        /**
         * <p>The number of expiring file systems.</p>
         * <p>File systems whose expiration time is less than or equal to seven days away from the current time are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiringCount")
        public Integer expiringCount;

        /**
         * <p>The type of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The storage usage of the file system.</p>
         * <p>The value of this parameter is the maximum storage usage of the file system over the last hour.</p>
         * <p>Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1611</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The number of file systems of the current type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic self = new DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiringCount(Integer expiringCount) {
            this.expiringCount = expiringCount;
            return this;
        }
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemStatistics extends TeaModel {
        @NameInMap("FileSystemStatistic")
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> fileSystemStatistic;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemStatistics self = new DescribeFileSystemStatisticsResponseBodyFileSystemStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics setFileSystemStatistic(java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> fileSystemStatistic) {
            this.fileSystemStatistic = fileSystemStatistic;
            return this;
        }
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic> getFileSystemStatistic() {
            return this.fileSystemStatistic;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage extends TeaModel {
        /**
         * <p>The end time of the validity period for the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>naspackage-0be9c4b624-37****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The capacity of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The start time of the validity period for the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-05T01:40:56Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage self = new DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages extends TeaModel {
        @NameInMap("Package")
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage> _package;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages self = new DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages set_package(java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage> get_package() {
            return this._package;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem extends TeaModel {
        /**
         * <p>The capacity of the file system.</p>
         * <p>Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Subscription: The subscription billing method is used.</li>
         * <li>PayAsYouGo: The pay-as-you-go billing method is used.</li>
         * <li>Package: A storage plan is attached to the file system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the NAS file system was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-05-27T15:43:06CST</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e48eda</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the file system expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-27T15:43:06CST</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>109c04****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: General-purpose NAS file system</li>
         * <li>extreme: Extreme NAS file system</li>
         * <li>cpfs: CPFS file system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The storage usage of the Infrequent Access (IA) storage medium.</p>
         * <p>Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>362832</p>
         */
        @NameInMap("MeteredIASize")
        public Long meteredIASize;

        /**
         * <p>The storage usage of the file system.</p>
         * <p>The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1611661312</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The information about storage plans.</p>
         */
        @NameInMap("Packages")
        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages packages;

        /**
         * <p>The protocol type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NFS: Network File System (NFS)</li>
         * <li>SMB: Server Message Block (SMB)</li>
         * <li>cpfs: the protocol type supported by the CPFS file system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the file system.</p>
         * <p>This parameter is returned for Extreme NAS file systems and Cloud Parallel File Storage (CPFS) file systems. Valid values:</p>
         * <ul>
         * <li>Pending: The file system is being created or modified.</li>
         * <li>Running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the Running state.</li>
         * <li>Stopped: The file system is unavailable.</li>
         * <li>Extending: The file system is being scaled out.</li>
         * <li>Stopping: The file system is being disabled.</li>
         * <li>Deleting: The file system is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Valid values for General-purpose NAS file systems: Capacity and Performance.</li>
         * <li>Valid values for Extreme NAS file systems: standard and advance.</li>
         * <li>Valid values for CPFS file systems: advance_100 (100 MB/s/TiB baseline) and advance_200 (200 MB/s/TiB baseline).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem self = new DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setMeteredIASize(Long meteredIASize) {
            this.meteredIASize = meteredIASize;
            return this;
        }
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setPackages(DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages packages) {
            this.packages = packages;
            return this;
        }
        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages getPackages() {
            return this.packages;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystems extends TeaModel {
        @NameInMap("FileSystem")
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem> fileSystem;

        public static DescribeFileSystemStatisticsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystems self = new DescribeFileSystemStatisticsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystems setFileSystem(java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public java.util.List<DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem> getFileSystem() {
            return this.fileSystem;
        }

    }

}
