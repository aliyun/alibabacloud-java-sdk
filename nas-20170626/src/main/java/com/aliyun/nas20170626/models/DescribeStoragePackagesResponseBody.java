// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Packages")
    public DescribeStoragePackagesResponseBodyPackages packages;

    public static DescribeStoragePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesResponseBody self = new DescribeStoragePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStoragePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoragePackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoragePackagesResponseBody setPackages(DescribeStoragePackagesResponseBodyPackages packages) {
        this.packages = packages;
        return this;
    }
    public DescribeStoragePackagesResponseBodyPackages getPackages() {
        return this.packages;
    }

    public static class DescribeStoragePackagesResponseBodyPackagesPackage extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("PackageId")
        public String packageId;

        public static DescribeStoragePackagesResponseBodyPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePackagesResponseBodyPackagesPackage self = new DescribeStoragePackagesResponseBodyPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

    }

    public static class DescribeStoragePackagesResponseBodyPackages extends TeaModel {
        @NameInMap("Package")
        public java.util.List<DescribeStoragePackagesResponseBodyPackagesPackage> _package;

        public static DescribeStoragePackagesResponseBodyPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePackagesResponseBodyPackages self = new DescribeStoragePackagesResponseBodyPackages();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePackagesResponseBodyPackages set_package(java.util.List<DescribeStoragePackagesResponseBodyPackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<DescribeStoragePackagesResponseBodyPackagesPackage> get_package() {
            return this._package;
        }

    }

}
