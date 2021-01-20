// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    @NameInMap("Period")
    public String period;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Orderby")
    public String orderby;

    @NameInMap("OrderDesc")
    public String orderDesc;

    @NameInMap("Length")
    public String length;

    @NameInMap("Express")
    public String express;

    public static DescribeMetricTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopRequest self = new DescribeMetricTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricTopRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricTopRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMetricTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricTopRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricTopRequest setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }
    public String getOrderby() {
        return this.orderby;
    }

    public DescribeMetricTopRequest setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public DescribeMetricTopRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricTopRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

}
