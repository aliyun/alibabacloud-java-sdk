// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeResourceTimelineRequest extends TeaModel {
    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeResourceTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTimelineRequest self = new DescribeResourceTimelineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTimelineRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DescribeResourceTimelineRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeResourceTimelineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
