// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    public static DescribeMetricRuleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountRequest self = new DescribeMetricRuleCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleCountRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricRuleCountRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

}
