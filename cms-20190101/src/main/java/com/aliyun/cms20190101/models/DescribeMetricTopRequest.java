// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    @NameInMap("Period")
    public String period;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Orderby")
    @Validation(required = true)
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

}
