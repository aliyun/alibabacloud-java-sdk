// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    /**
     * <p>The additional information about the Autoscaler policy, such as the interval of triggering Autoscaler.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;behavior&quot;: {
     *     &quot;scaleDown&quot;: {
     *       &quot;stabilizationWindowSeconds&quot;: 150
     *     }
     *   }
     * }</p>
     */
    @NameInMap("Behavior")
    public java.util.Map<String, ?> behavior;

    /**
     * <p>The metrics.</p>
     */
    @NameInMap("CurrentMetrics")
    public java.util.List<DescribeServiceAutoScalerResponseBodyCurrentMetrics> currentMetrics;

    /**
     * <p>The maximum number of instances in the service.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MaxReplica")
    public Integer maxReplica;

    /**
     * <p>The minimum number of instances in the service.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinReplica")
    public Integer minReplica;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The auto scaling policies.</p>
     */
    @NameInMap("ScaleStrategies")
    public java.util.List<DescribeServiceAutoScalerResponseBodyScaleStrategies> scaleStrategies;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
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
        /**
         * <p>The metric name. Valid values:</p>
         * <ul>
         * <li>QPS</li>
         * <li>CPU</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qps</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The service for which the metric is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_svc</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The metric name. Valid values:</p>
         * <ul>
         * <li>QPS: the queries per second (QPS) for an individual instance.</li>
         * <li>CPU: the CPU utilization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QPS</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The service for which the metric is specified. If you do not set this parameter, the current service is specified by default.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_svc</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>The threshold of the metric that triggers auto scaling.</p>
         * <ul>
         * <li>If you set metricName to QPS, scale-out is triggered when the average QPS for a single instance is greater than this threshold.</li>
         * <li>If you set metricName to CPU, scale-out is triggered when the average CPU utilization for a single instance is greater than this threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
