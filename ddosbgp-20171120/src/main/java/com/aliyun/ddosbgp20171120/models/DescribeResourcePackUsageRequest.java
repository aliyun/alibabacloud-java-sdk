// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeResourcePackUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageRequest self = new DescribeResourcePackUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeResourcePackUsageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeResourcePackUsageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
