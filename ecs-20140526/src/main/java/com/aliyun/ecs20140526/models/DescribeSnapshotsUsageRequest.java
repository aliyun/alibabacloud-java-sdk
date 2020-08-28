// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsUsageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeSnapshotsUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsUsageRequest self = new DescribeSnapshotsUsageRequest();
        return TeaModel.build(map, self);
    }

}
