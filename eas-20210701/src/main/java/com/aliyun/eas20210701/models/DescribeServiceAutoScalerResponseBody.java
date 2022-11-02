// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @NameInMap("Behavior")
    public java.util.Map<String, ?> behavior;

    @NameInMap("CurrentMetrics")
    public java.util.List<DescribeServiceAutoScalerResponseBodyCurrentMetrics> currentMetrics;

    @NameInMap("MaxReplica")
    public Integer maxReplica;

    @NameInMap("MinReplica")
    public Integer minReplica;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleStrategies")
    public java.util.List<DescribeServiceAutoScalerResponseBodyScaleStrategies> scaleStrategies;

    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeServiceAutoScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAutoScalerResponseBody self = new DescribeServiceAutoScalerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAutoScalerResponseBody setBehavior(java.util.Map<String, ?> behavior) {
        this.behavior = behavior;
        return this;
    }
    public java.util.Map<String, ?> getBehavior() {
        return this.behavior;
    }

    public DescribeServiceAutoScalerResponseBody setCurrentMetrics(java.util.List<DescribeServiceAutoScalerResponseBodyCurrentMetrics> currentMetrics) {
        this.currentMetrics = currentMetrics;
        return this;
    }
    public java.util.List<DescribeServiceAutoScalerResponseBodyCurrentMetrics> getCurrentMetrics() {
        return this.currentMetrics;
    }

    public DescribeServiceAutoScalerResponseBody setMaxReplica(Integer maxReplica) {
        this.maxReplica = maxReplica;
        return this;
    }
    public Integer getMaxReplica() {
        return this.maxReplica;
    }

    public DescribeServiceAutoScalerResponseBody setMinReplica(Integer minReplica) {
        this.minReplica = minReplica;
        return this;
    }
    public Integer getMinReplica() {
        return this.minReplica;
    }

    public DescribeServiceAutoScalerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceAutoScalerResponseBody setScaleStrategies(java.util.List<DescribeServiceAutoScalerResponseBodyScaleStrategies> scaleStrategies) {
        this.scaleStrategies = scaleStrategies;
        return this;
    }
    public java.util.List<DescribeServiceAutoScalerResponseBodyScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    public DescribeServiceAutoScalerResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class DescribeServiceAutoScalerResponseBodyCurrentMetrics extends TeaModel {
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("service")
        public String service;

        @NameInMap("value")
        public Float value;

        public static DescribeServiceAutoScalerResponseBodyCurrentMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAutoScalerResponseBodyCurrentMetrics self = new DescribeServiceAutoScalerResponseBodyCurrentMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAutoScalerResponseBodyCurrentMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeServiceAutoScalerResponseBodyCurrentMetrics setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeServiceAutoScalerResponseBodyCurrentMetrics setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeServiceAutoScalerResponseBodyScaleStrategies extends TeaModel {
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("service")
        public String service;

        @NameInMap("threshold")
        public Float threshold;

        public static DescribeServiceAutoScalerResponseBodyScaleStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAutoScalerResponseBodyScaleStrategies self = new DescribeServiceAutoScalerResponseBodyScaleStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAutoScalerResponseBodyScaleStrategies setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeServiceAutoScalerResponseBodyScaleStrategies setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeServiceAutoScalerResponseBodyScaleStrategies setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
