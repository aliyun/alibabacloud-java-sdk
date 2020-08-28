// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Packages")
    @Validation(required = true)
    public DescribeStoragePackagesResponsePackages packages;

    public static DescribeStoragePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesResponse self = new DescribeStoragePackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoragePackagesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStoragePackagesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePackagesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoragePackagesResponse setPackages(DescribeStoragePackagesResponsePackages packages) {
        this.packages = packages;
        return this;
    }
    public DescribeStoragePackagesResponsePackages getPackages() {
        return this.packages;
    }

    public static class DescribeStoragePackagesResponsePackagesPackage extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FileSystemId")
        @Validation(required = true)
        public String fileSystemId;

        @NameInMap("PackageId")
        @Validation(required = true)
        public String packageId;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        public static DescribeStoragePackagesResponsePackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePackagesResponsePackagesPackage self = new DescribeStoragePackagesResponsePackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePackagesResponsePackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStoragePackagesResponsePackagesPackage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeStoragePackagesResponsePackagesPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStoragePackagesResponsePackagesPackage setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeStoragePackagesResponsePackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeStoragePackagesResponsePackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStoragePackagesResponsePackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeStoragePackagesResponsePackages extends TeaModel {
        @NameInMap("Package")
        @Validation(required = true)
        public java.util.List<DescribeStoragePackagesResponsePackagesPackage> _package;

        public static DescribeStoragePackagesResponsePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePackagesResponsePackages self = new DescribeStoragePackagesResponsePackages();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePackagesResponsePackages set_package(java.util.List<DescribeStoragePackagesResponsePackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<DescribeStoragePackagesResponsePackagesPackage> get_package() {
            return this._package;
        }

    }

}
