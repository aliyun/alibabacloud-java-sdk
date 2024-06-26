// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMetricRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("InnerIp")
    public String innerIp;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Period")
    public String period;

    @NameInMap("Port")
    public String port;

    @NameInMap("TimeArea")
    public String timeArea;

    public static DescribeMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRequest self = new DescribeMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeMetricRequest setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public DescribeMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeMetricRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeMetricRequest setTimeArea(String timeArea) {
        this.timeArea = timeArea;
        return this;
    }
    public String getTimeArea() {
        return this.timeArea;
    }

}
