// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SnapshotPackages")
    @Validation(required = true)
    public DescribeSnapshotPackageResponseSnapshotPackages snapshotPackages;

    public static DescribeSnapshotPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotPackageResponse self = new DescribeSnapshotPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotPackageResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSnapshotPackageResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotPackageResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotPackageResponse setSnapshotPackages(DescribeSnapshotPackageResponseSnapshotPackages snapshotPackages) {
        this.snapshotPackages = snapshotPackages;
        return this;
    }
    public DescribeSnapshotPackageResponseSnapshotPackages getSnapshotPackages() {
        return this.snapshotPackages;
    }

    public static class DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("InitCapacity")
        @Validation(required = true)
        public Long initCapacity;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        public static DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage self = new DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage setInitCapacity(Long initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class DescribeSnapshotPackageResponseSnapshotPackages extends TeaModel {
        @NameInMap("SnapshotPackage")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage> snapshotPackage;

        public static DescribeSnapshotPackageResponseSnapshotPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseSnapshotPackages self = new DescribeSnapshotPackageResponseSnapshotPackages();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotPackageResponseSnapshotPackages setSnapshotPackage(java.util.List<DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage> snapshotPackage) {
            this.snapshotPackage = snapshotPackage;
            return this;
        }
        public java.util.List<DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage> getSnapshotPackage() {
            return this.snapshotPackage;
        }

    }

}
