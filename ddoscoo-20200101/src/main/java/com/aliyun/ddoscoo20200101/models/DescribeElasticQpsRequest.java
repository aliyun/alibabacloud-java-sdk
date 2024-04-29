// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeElasticQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsRequest self = new DescribeElasticQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeElasticQpsRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeElasticQpsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeElasticQpsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeElasticQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
