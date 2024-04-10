// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsUsageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of snapshots stored in the current region.</p>
     */
    @NameInMap("SnapshotCount")
    public Integer snapshotCount;

    /**
     * <p>The total size of snapshots stored in the current region. Unit: bytes.</p>
     */
    @NameInMap("SnapshotSize")
    public Long snapshotSize;

    public static DescribeSnapshotsUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsUsageResponseBody self = new DescribeSnapshotsUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
