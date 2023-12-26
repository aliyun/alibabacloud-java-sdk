// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerRequest extends TeaModel {
    /**
     * <p>The Autoscaler operation.</p>
     */
    @NameInMap("behavior")
    public CreateServiceAutoScalerRequestBehavior behavior;

    /**
     * <p>The maximum number of instances. The value must be greater than that of the min parameter.</p>
     */
    @NameInMap("max")
    public Integer max;

    /**
     * <p>The minimum number of instances. The value must be greater than 0.</p>
     */
    @NameInMap("min")
    public Integer min;

    /**
     * <p>The Autoscaler strategies.</p>
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
         * <p>The time window that is required before the number of instances is reduced to 0. The number of instances can be reduced to 0 only if no request is available or no traffic exists in the specified time window. Default value: 600.</p>
         */
        @NameInMap("scaleDownGracePeriodSeconds")
        public Integer scaleDownGracePeriodSeconds;

        /**
         * <p>The number of instances that you want to create at a time if the number of instances is scaled out from 0. Default value: 1.</p>
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
         * <p>The time window that is required before the scale-in operation is performed. The scale-in operation can be performed only if the specified metric drops below the specified threshold in the specified time window. Default value: 300.</p>
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
         * <p>The time window that is required before the scale-out operation is performed. The scale-out operation can be performed only if the specified metric exceeds the specified threshold in the specified time window. Default value: 0.</p>
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
         * <p>The operation that reduces the number of instances to 0.</p>
         */
        @NameInMap("onZero")
        public CreateServiceAutoScalerRequestBehaviorOnZero onZero;

        /**
         * <p>The scale-in operation.</p>
         */
        @NameInMap("scaleDown")
        public CreateServiceAutoScalerRequestBehaviorScaleDown scaleDown;

        /**
         * <p>The scale-out operation.</p>
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
         * <p>The name of the metric for triggering auto scaling. Valid values:</p>
         * <br>
         * <p>*   QPS: the queries per second (QPS) for an individual instance.</p>
         * <p>*   CPU: the CPU utilization.</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The service for which the metric is specified. If you do not set this parameter, the current service is specified by default.</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>The threshold of the metric that triggers auto scaling.</p>
         * <br>
         * <p>*   If you set metricName to QPS, scale-out is triggered when the average QPS for a single instance is greater than this threshold.</p>
         * <p>*   If you set metricName to CPU, scale-out is triggered when the average CPU utilization for a single instance is greater than this threshold.</p>
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
