// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemStatisticsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    public DescribeFileSystemStatisticsResponseBodyFileSystems fileSystems;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemStatistics")
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics;

    public static DescribeFileSystemStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemStatisticsResponseBody self = new DescribeFileSystemStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemStatisticsResponseBody setFileSystems(DescribeFileSystemStatisticsResponseBodyFileSystems fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBodyFileSystems getFileSystems() {
        return this.fileSystems;
    }

    public DescribeFileSystemStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFileSystemStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemStatisticsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemStatisticsResponseBody setFileSystemStatistics(DescribeFileSystemStatisticsResponseBodyFileSystemStatistics fileSystemStatistics) {
        this.fileSystemStatistics = fileSystemStatistics;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBodyFileSystemStatistics getFileSystemStatistics() {
        return this.fileSystemStatistics;
    }

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("PackageId")
        public String packageId;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage self = new DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("MeteredIASize")
        public Long meteredIASize;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Packages")
        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystemPackages packages;

        @NameInMap("ProtocolType")
        public String protocolType;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem self = new DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setMeteredIASize(Long meteredIASize) {
            this.meteredIASize = meteredIASize;
            return this;
        }
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
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

        public DescribeFileSystemStatisticsResponseBodyFileSystemsFileSystem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

    public static class DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic extends TeaModel {
        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("ExpiringCount")
        public Integer expiringCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        public static DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic self = new DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic();
            return TeaModel.build(map, self);
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

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiringCount(Integer expiringCount) {
            this.expiringCount = expiringCount;
            return this;
        }
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeFileSystemStatisticsResponseBodyFileSystemStatisticsFileSystemStatistic setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
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

}
