// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricDataRequest extends TeaModel {
    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Express")
    public String express;

    @NameInMap("Length")
    public String length;

    public static DescribeMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataRequest self = new DescribeMetricDataRequest();
        return TeaModel.build(map, self);
    }

}
