// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotPackageResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SnapshotPackages")
    public java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackages> snapshotPackages;

    public static DescribeSnapshotPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotPackageResponseBody self = new DescribeSnapshotPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotPackageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeSnapshotPackageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotPackageResponseBody setSnapshotPackages(java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackages> snapshotPackages) {
        this.snapshotPackages = snapshotPackages;
        return this;
    }
    public java.util.List<DescribeSnapshotPackageResponseBodySnapshotPackages> getSnapshotPackages() {
        return this.snapshotPackages;
    }

    public static class DescribeSnapshotPackageResponseBodySnapshotPackages extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("InitCapacity")
        public Long initCapacity;

        public static DescribeSnapshotPackageResponseBodySnapshotPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseBodySnapshotPackages self = new DescribeSnapshotPackageResponseBodySnapshotPackages();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackages setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackages setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackages setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSnapshotPackageResponseBodySnapshotPackages setInitCapacity(Long initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Long getInitCapacity() {
            return this.initCapacity;
        }

    }

}
