// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryMetricRequest extends TeaModel {
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

    public static QueryMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricRequest self = new QueryMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryMetricRequest setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public QueryMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public QueryMetricRequest setTimeArea(String timeArea) {
        this.timeArea = timeArea;
        return this;
    }
    public String getTimeArea() {
        return this.timeArea;
    }

}
