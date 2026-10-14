// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRecordRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1688140799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP address of the Anti-DDoS Proxy instance to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The beginning of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684252800000</p>
     */
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
