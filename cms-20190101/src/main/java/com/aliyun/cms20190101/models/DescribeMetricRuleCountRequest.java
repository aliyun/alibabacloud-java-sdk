// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMetricRuleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountRequest self = new DescribeMetricRuleCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricRuleCountRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricRuleCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
