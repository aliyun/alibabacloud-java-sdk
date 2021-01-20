// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeRequest extends TeaModel {
    @NameInMap("MetricName")
    public String metricName;

    public static DescribeLogMonitorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorAttributeRequest self = new DescribeLogMonitorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorAttributeRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

}
