// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    public static DescribeResourcePackUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageRequest self = new DescribeResourcePackUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeResourcePackUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeResourcePackUsageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
