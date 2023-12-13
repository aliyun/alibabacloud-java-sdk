// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeRequest extends TeaModel {
    /**
     * <p>The name of the log monitoring metric. Exact match is supported.</p>
     * <br>
     * <p>For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeLogMonitorAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
