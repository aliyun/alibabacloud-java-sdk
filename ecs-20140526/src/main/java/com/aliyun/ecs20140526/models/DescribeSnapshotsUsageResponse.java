// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotCount")
    @Validation(required = true)
    public Integer snapshotCount;

    @NameInMap("SnapshotSize")
    @Validation(required = true)
    public Long snapshotSize;

    public static DescribeSnapshotsUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsUsageResponse self = new DescribeSnapshotsUsageResponse();
        return TeaModel.build(map, self);
    }

}
