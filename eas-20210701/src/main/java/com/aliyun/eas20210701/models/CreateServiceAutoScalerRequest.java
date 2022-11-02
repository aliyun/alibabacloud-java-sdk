// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerRequest extends TeaModel {
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
