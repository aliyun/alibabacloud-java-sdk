// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("Category")
    public String category;

    public static DescribeSnapshotMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataRequest self = new DescribeSnapshotMonitorDataRequest();
        return TeaModel.build(map, self);
    }

}
