// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingMetricsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MetricList")
    public java.util.List<DescribeScalingMetricsResponseBodyMetricList> metricList;

    public static DescribeScalingMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingMetricsResponseBody self = new DescribeScalingMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingMetricsResponseBody setMetricList(java.util.List<DescribeScalingMetricsResponseBodyMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<DescribeScalingMetricsResponseBodyMetricList> getMetricList() {
        return this.metricList;
    }

    public static class DescribeScalingMetricsResponseBodyMetricList extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("MaxValue")
        public Long maxValue;

        public static DescribeScalingMetricsResponseBodyMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingMetricsResponseBodyMetricList self = new DescribeScalingMetricsResponseBodyMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeScalingMetricsResponseBodyMetricList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingMetricsResponseBodyMetricList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeScalingMetricsResponseBodyMetricList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeScalingMetricsResponseBodyMetricList setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeScalingMetricsResponseBodyMetricList setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

    }

}
