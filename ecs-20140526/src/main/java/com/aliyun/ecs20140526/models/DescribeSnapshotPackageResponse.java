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

    }

    public static class DescribeSnapshotPackageResponseSnapshotPackages extends TeaModel {
        @NameInMap("SnapshotPackage")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotPackageResponseSnapshotPackagesSnapshotPackage> snapshotPackage;

        public static DescribeSnapshotPackageResponseSnapshotPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotPackageResponseSnapshotPackages self = new DescribeSnapshotPackageResponseSnapshotPackages();
            return TeaModel.build(map, self);
        }

    }

}
