// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerRequest extends TeaModel {
    /**
     * <p>The Autoscaler operation.</p>
     */
    @NameInMap("behavior")
    public UpdateServiceAutoScalerRequestBehavior behavior;

    /**
     * <p>The maximum number of instances. The value must be greater than that of the min parameter.</p>
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
     * <p>The auto scaling policies.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("scaleStrategies")
    public java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> scaleStrategies;

    public static UpdateServiceAutoScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAutoScalerRequest self = new UpdateServiceAutoScalerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAutoScalerRequest setBehavior(UpdateServiceAutoScalerRequestBehavior behavior) {
        this.behavior = behavior;
        return this;
    }
    public UpdateServiceAutoScalerRequestBehavior getBehavior() {
        return this.behavior;
    }

    public UpdateServiceAutoScalerRequest setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public UpdateServiceAutoScalerRequest setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public UpdateServiceAutoScalerRequest setScaleStrategies(java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> scaleStrategies) {
        this.scaleStrategies = scaleStrategies;
        return this;
    }
    public java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    public static class UpdateServiceAutoScalerRequestBehaviorOnZero extends TeaModel {
        /**
         * <p>The time window that is required before the number of instances is reduced to 0. Default value: 600. The number of instances can be reduced to 0 only if no request is available or no traffic exists in the specified time window.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("scaleDownGracePeriodSeconds")
        public Integer scaleDownGracePeriodSeconds;

        /**
         * <p>The number of instances that you want to create at a time if the number of instances is scaled out from 0. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scaleUpActivationReplicas")
        public Integer scaleUpActivationReplicas;

        public static UpdateServiceAutoScalerRequestBehaviorOnZero build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestBehaviorOnZero self = new UpdateServiceAutoScalerRequestBehaviorOnZero();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestBehaviorOnZero setScaleDownGracePeriodSeconds(Integer scaleDownGracePeriodSeconds) {
            this.scaleDownGracePeriodSeconds = scaleDownGracePeriodSeconds;
            return this;
        }
        public Integer getScaleDownGracePeriodSeconds() {
            return this.scaleDownGracePeriodSeconds;
        }

        public UpdateServiceAutoScalerRequestBehaviorOnZero setScaleUpActivationReplicas(Integer scaleUpActivationReplicas) {
            this.scaleUpActivationReplicas = scaleUpActivationReplicas;
            return this;
        }
        public Integer getScaleUpActivationReplicas() {
            return this.scaleUpActivationReplicas;
        }

    }

    public static class UpdateServiceAutoScalerRequestBehaviorScaleDown extends TeaModel {
        /**
         * <p>The time window that is required before the scale-in operation is performed. Default value: 300. The scale-in operation can be performed only if the specified metric drops below the threshold in the specified time window.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("stabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static UpdateServiceAutoScalerRequestBehaviorScaleDown build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestBehaviorScaleDown self = new UpdateServiceAutoScalerRequestBehaviorScaleDown();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestBehaviorScaleDown setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class UpdateServiceAutoScalerRequestBehaviorScaleUp extends TeaModel {
        /**
         * <p>The time window that is required before the scale-out operation is performed. Default value: 0. The scale-out operation can be performed only if the specified metric exceeds the specified threshold in the specified time window.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static UpdateServiceAutoScalerRequestBehaviorScaleUp build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestBehaviorScaleUp self = new UpdateServiceAutoScalerRequestBehaviorScaleUp();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestBehaviorScaleUp setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class UpdateServiceAutoScalerRequestBehavior extends TeaModel {
        /**
         * <p>The operation that reduces the number of instances to 0.</p>
         */
        @NameInMap("onZero")
        public UpdateServiceAutoScalerRequestBehaviorOnZero onZero;

        /**
         * <p>The scale-in operation.</p>
         */
        @NameInMap("scaleDown")
        public UpdateServiceAutoScalerRequestBehaviorScaleDown scaleDown;

        /**
         * <p>The scale-out operation.</p>
         */
        @NameInMap("scaleUp")
        public UpdateServiceAutoScalerRequestBehaviorScaleUp scaleUp;

        public static UpdateServiceAutoScalerRequestBehavior build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestBehavior self = new UpdateServiceAutoScalerRequestBehavior();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestBehavior setOnZero(UpdateServiceAutoScalerRequestBehaviorOnZero onZero) {
            this.onZero = onZero;
            return this;
        }
        public UpdateServiceAutoScalerRequestBehaviorOnZero getOnZero() {
            return this.onZero;
        }

        public UpdateServiceAutoScalerRequestBehavior setScaleDown(UpdateServiceAutoScalerRequestBehaviorScaleDown scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }
        public UpdateServiceAutoScalerRequestBehaviorScaleDown getScaleDown() {
            return this.scaleDown;
        }

        public UpdateServiceAutoScalerRequestBehavior setScaleUp(UpdateServiceAutoScalerRequestBehaviorScaleUp scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public UpdateServiceAutoScalerRequestBehaviorScaleUp getScaleUp() {
            return this.scaleUp;
        }

    }

    public static class UpdateServiceAutoScalerRequestScaleStrategies extends TeaModel {
        /**
         * <p>The name of the metric for triggering auto scaling. Valid values:</p>
         * <ul>
         * <li>qps: the queries per second (QPS) for an individual instance.</li>
         * <li>cpu: the CPU utilization.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qps</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        public static UpdateServiceAutoScalerRequestScaleStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestScaleStrategies self = new UpdateServiceAutoScalerRequestScaleStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
