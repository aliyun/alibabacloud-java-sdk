// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesResponseBody extends TeaModel {
    /**
     * <p>The list of storage plans.</p>
     */
    @NameInMap("Packages")
    public DescribeStoragePackagesResponseBodyPackages packages;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of storage plans returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>035B3A3A-E514-4B41-B906-5D906CFB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of storage plans.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStoragePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesResponseBody self = new DescribeStoragePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesResponseBody setPackages(DescribeStoragePackagesResponseBodyPackages packages) {
        this.packages = packages;
        return this;
    }
    public DescribeStoragePackagesResponseBodyPackages getPackages() {
        return this.packages;
    }

    public DescribeStoragePackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoragePackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoragePackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStoragePackagesResponseBodyPackagesPackage extends TeaModel {
        /**
         * <p>The end time of the validity period for the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the file system that is bound to the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>109c****66</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The ID of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>naspackage-@string(\&quot;*****\&quot;, *)-@string(\&quot;*****\&quot;, *)</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The capacity of the storage plan.</p>
         * <p>Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

        /**
         * <p>The status of the storage plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>free: The storage plan is not bound to a file system. You can bind the storage plan to a file system of the same storage type.</li>
         * <li>bound: The storage plan is bound to a file system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the storage plan.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Performance</li>
         * <li>Capacity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Capacity</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeStoragePackagesResponseBodyPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePackagesResponseBodyPackagesPackage self = new DescribeStoragePackagesResponseBodyPackagesPackage();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStoragePackagesResponseBodyPackagesPackage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
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
