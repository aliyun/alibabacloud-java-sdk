// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    public static DescribeMetricRuleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountRequest self = new DescribeMetricRuleCountRequest();
        return TeaModel.build(map, self);
    }

}
