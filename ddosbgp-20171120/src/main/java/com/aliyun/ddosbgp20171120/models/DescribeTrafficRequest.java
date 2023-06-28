// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTrafficRequest extends TeaModel {
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficRequest self = new DescribeTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeTrafficRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeTrafficRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTrafficRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTrafficRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
