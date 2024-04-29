// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRecordRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeElasticQpsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsRecordRequest self = new DescribeElasticQpsRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsRecordRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeElasticQpsRecordRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeElasticQpsRecordRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
