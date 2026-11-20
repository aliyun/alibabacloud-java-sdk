// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerRequest extends TeaModel {
    /**
     * <p>The behavior during auto-scaling.</p>
     */
    @NameInMap("behavior")
    public CreateServiceAutoScalerRequestBehavior behavior;

    /**
     * <p>The maximum number of instances. The value must be greater than the minimum number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("max")
    public Integer max;

    /**
     * <p>The minimum number of instances. The value must be greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("min")
    public Integer min;

    /**
     * <p>The list of scaling policies.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("scaleStrategies")
    public java.util.List<CreateServiceAutoScalerRequestScaleStrategies> scaleStrategies;

    public static CreateServiceAutoScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAutoScalerRequest self = new CreateServiceAutoScalerRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceAutoScalerRequest setBehavior(CreateServiceAutoScalerRequestBehavior behavior) {
        this.behavior = behavior;
        return this;
    }
    public CreateServiceAutoScalerRequestBehavior getBehavior() {
        return this.behavior;
    }

    public CreateServiceAutoScalerRequest setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public CreateServiceAutoScalerRequest setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public CreateServiceAutoScalerRequest setScaleStrategies(java.util.List<CreateServiceAutoScalerRequestScaleStrategies> scaleStrategies) {
        this.scaleStrategies = scaleStrategies;
        return this;
    }
    public java.util.List<CreateServiceAutoScalerRequestScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    public static class CreateServiceAutoScalerRequestBehaviorOnZero extends TeaModel {
        /**
         * <p>The grace period before scaling in to zero. When the metrics meet the conditions for scaling in to zero, the scale-in to zero is executed after the grace period elapses. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("scaleDownGracePeriodSeconds")
        public Integer scaleDownGracePeriodSeconds;

        /**
         * <p>The number of instances created at a time when scaling out from zero. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scaleUpActivationReplicas")
        public Integer scaleUpActivationReplicas;

        public static CreateServiceAutoScalerRequestBehaviorOnZero build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestBehaviorOnZero self = new CreateServiceAutoScalerRequestBehaviorOnZero();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestBehaviorOnZero setScaleDownGracePeriodSeconds(Integer scaleDownGracePeriodSeconds) {
            this.scaleDownGracePeriodSeconds = scaleDownGracePeriodSeconds;
            return this;
        }
        public Integer getScaleDownGracePeriodSeconds() {
            return this.scaleDownGracePeriodSeconds;
        }

        public CreateServiceAutoScalerRequestBehaviorOnZero setScaleUpActivationReplicas(Integer scaleUpActivationReplicas) {
            this.scaleUpActivationReplicas = scaleUpActivationReplicas;
            return this;
        }
        public Integer getScaleUpActivationReplicas() {
            return this.scaleUpActivationReplicas;
        }

    }

    public static class CreateServiceAutoScalerRequestBehaviorScaleDown extends TeaModel {
        /**
         * <p>The stabilization window period for scale-in. Default value: 300. Scale-in is executed only when the metrics do not meet the specified conditions over the past period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("stabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static CreateServiceAutoScalerRequestBehaviorScaleDown build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestBehaviorScaleDown self = new CreateServiceAutoScalerRequestBehaviorScaleDown();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestBehaviorScaleDown setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class CreateServiceAutoScalerRequestBehaviorScaleUp extends TeaModel {
        /**
         * <p>The stabilization window period for scale-out. Default value: 0. Scale-out is executed only when the metrics meet the specified conditions over the past period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static CreateServiceAutoScalerRequestBehaviorScaleUp build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestBehaviorScaleUp self = new CreateServiceAutoScalerRequestBehaviorScaleUp();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestBehaviorScaleUp setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class CreateServiceAutoScalerRequestBehavior extends TeaModel {
        /**
         * <p>The behavior when scaling in to zero.</p>
         */
        @NameInMap("onZero")
        public CreateServiceAutoScalerRequestBehaviorOnZero onZero;

        /**
         * <p>The behavior during scale-in.</p>
         */
        @NameInMap("scaleDown")
        public CreateServiceAutoScalerRequestBehaviorScaleDown scaleDown;

        /**
         * <p>The behavior during scale-out.</p>
         */
        @NameInMap("scaleUp")
        public CreateServiceAutoScalerRequestBehaviorScaleUp scaleUp;

        public static CreateServiceAutoScalerRequestBehavior build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestBehavior self = new CreateServiceAutoScalerRequestBehavior();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestBehavior setOnZero(CreateServiceAutoScalerRequestBehaviorOnZero onZero) {
            this.onZero = onZero;
            return this;
        }
        public CreateServiceAutoScalerRequestBehaviorOnZero getOnZero() {
            return this.onZero;
        }

        public CreateServiceAutoScalerRequestBehavior setScaleDown(CreateServiceAutoScalerRequestBehaviorScaleDown scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }
        public CreateServiceAutoScalerRequestBehaviorScaleDown getScaleDown() {
            return this.scaleDown;
        }

        public CreateServiceAutoScalerRequestBehavior setScaleUp(CreateServiceAutoScalerRequestBehaviorScaleUp scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public CreateServiceAutoScalerRequestBehaviorScaleUp getScaleUp() {
            return this.scaleUp;
        }

    }

    public static class CreateServiceAutoScalerRequestScaleStrategies extends TeaModel {
        /**
         * <p>The name of the metric. Valid values:</p>
         * <ul>
         * <li>qps: the queries per second (QPS) threshold per instance</li>
         * <li>cpu: the CPU utilization threshold</li>
         * <li>gpu[util]: the GPU utilization threshold</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qps</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The service to which the metric belongs. If this parameter is not specified, the current service is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_svc</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>The threshold that triggers auto-scaling.</p>
         * <ul>
         * <li>If the metric name is set to qps, scale-out is triggered when the average QPS per instance exceeds this value.</li>
         * <li>If the metric name is set to cpu, scale-out is triggered when the average CPU utilization per instance exceeds this value.</li>
         * <li>If the metric name is set to gpu[util], scale-out is triggered when the average GPU utilization per instance exceeds this value.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        public static CreateServiceAutoScalerRequestScaleStrategies build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAutoScalerRequestScaleStrategies self = new CreateServiceAutoScalerRequestScaleStrategies();
            return TeaModel.build(map, self);
        }

        public CreateServiceAutoScalerRequestScaleStrategies setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateServiceAutoScalerRequestScaleStrategies setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public CreateServiceAutoScalerRequestScaleStrategies setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
