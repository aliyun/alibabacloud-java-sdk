// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotPackageResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotPackages")
    public DescribeSnapshotPackageResponseBodySnapshotPackages snapshotPackages;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnapshotPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotPackageResponseBody self = new DescribeSnapshotPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotPackageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotPackageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotPackageResponseBody setSnapshotPackages(DescribeSnapshotPackageResponseBodySnapshotPackages snapshotPackages) {
        this.snapshotPackages = snapshotPackages;
        return this;
    }
    public DescribeSnapshotPackageResponseBodySnapshotPackages getSnapshotPackages() {
        return this.snapshotPackages;
    }

    public DescribeSnapshotPackageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InitCapacity")
        public Long initCapacity;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage self = new DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage setInitCapacity(Long initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeSnapshotPackageResponseBodySnapshotPackages extends TeaModel {
        @NameInMap("SnapshotPackage")
        public java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage> snapshotPackage;

        public static DescribeSnapshotPackageResponseBodySnapshotPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseBodySnapshotPackages self = new DescribeSnapshotPackageResponseBodySnapshotPackages();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackages setSnapshotPackage(java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage> snapshotPackage) {
            this.snapshotPackage = snapshotPackage;
            return this;
        }
        public java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackagesSnapshotPackage> getSnapshotPackage() {
            return this.snapshotPackage;
        }

    }

}
