// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerRequest extends TeaModel {
    @NameInMap("behavior")
    public UpdateServiceAutoScalerRequestBehavior behavior;

    @NameInMap("max")
    public Integer max;

    @NameInMap("min")
    public Integer min;

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
        @NameInMap("scaleDownGracePeriodSeconds")
        public Integer scaleDownGracePeriodSeconds;

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
        @NameInMap("onZero")
        public UpdateServiceAutoScalerRequestBehaviorOnZero onZero;

        @NameInMap("scaleDown")
        public UpdateServiceAutoScalerRequestBehaviorScaleDown scaleDown;

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
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("service")
        public String service;

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
