// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerRequest extends TeaModel {
    @NameInMap("behavior")
    public CreateServiceAutoScalerRequestBehavior behavior;

    @NameInMap("max")
    public Integer max;

    @NameInMap("min")
    public Integer min;

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
        @NameInMap("scaleDownGracePeriodSeconds")
        public Integer scaleDownGracePeriodSeconds;

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
        @NameInMap("onZero")
        public CreateServiceAutoScalerRequestBehaviorOnZero onZero;

        @NameInMap("scaleDown")
        public CreateServiceAutoScalerRequestBehaviorScaleDown scaleDown;

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
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("service")
        public String service;

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
