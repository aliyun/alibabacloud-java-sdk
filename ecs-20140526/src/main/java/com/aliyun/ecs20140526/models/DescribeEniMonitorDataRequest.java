// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataRequest extends TeaModel {
    @NameInMap("EniId")
    public String eniId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Period")
    public Integer period;

    public static DescribeEniMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataRequest self = new DescribeEniMonitorDataRequest();
        return TeaModel.build(map, self);
    }

}
