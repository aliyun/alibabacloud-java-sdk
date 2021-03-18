// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsUsageResponseBody extends TeaModel {
    @NameInMap("SnapshotCount")
    public Integer snapshotCount;

    @NameInMap("SnapshotSize")
    public Long snapshotSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSnapshotsUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsUsageResponseBody self = new DescribeSnapshotsUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsUsageResponseBody setSnapshotCount(Integer snapshotCount) {
        this.snapshotCount = snapshotCount;
        return this;
    }
    public Integer getSnapshotCount() {
        return this.snapshotCount;
    }

    public DescribeSnapshotsUsageResponseBody setSnapshotSize(Long snapshotSize) {
        this.snapshotSize = snapshotSize;
        return this;
    }
    public Long getSnapshotSize() {
        return this.snapshotSize;
    }

    public DescribeSnapshotsUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
